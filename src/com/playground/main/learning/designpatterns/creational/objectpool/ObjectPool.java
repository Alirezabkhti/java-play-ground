package com.playground.main.learning.designpatterns.creational.objectpool;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Intent
 * Object pooling can offer a significant performance boost;
 * it is most effective in situations where the cost of initializing a class instance is high,
 * the rate of instantiation of a class is high, and the number of instantiations in use at any one time is low.
 */

public abstract class ObjectPool<T> {

    private long expirationTime;
    private Hashtable<T, Long> locked;
    private Hashtable<T, Long> unlocked;

    public ObjectPool() {
        expirationTime = 30000;
        locked = new Hashtable<>();
        unlocked = new Hashtable<>();
    }

    protected abstract T create();

    public abstract boolean validate(T o);

    public abstract void expire(T o);

    public synchronized T checkOut() {
        long now = System.currentTimeMillis();
        T t;
        if (unlocked.size() > 0) {
            Enumeration<T> e = unlocked.keys();
            while (e.hasMoreElements()) {
                t = e.nextElement();
                if ((now - unlocked.get(t)) > expirationTime) {
                    // object has expired
                    unlocked.remove(t);
                    expire(t);
                    t = null;
                } else {
                    if (validate(t)) {
                        unlocked.remove(t);
                        locked.put(t, now);
                        return (t);
                    } else {
                        // object failed validation
                        unlocked.remove(t);
                        expire(t);
                        t = null;
                    }
                }
            }
        }
        // no objects available, create a new one
        t = create();
        locked.put(t, now);
        return (t);
    }

    public synchronized void checkIn(T t) {
        locked.remove(t);
        unlocked.put(t, System.currentTimeMillis());
    }
}