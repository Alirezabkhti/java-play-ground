package com.playground.main.learning.designpatterns.structural.state;

import com.playground.main.learning.designpatterns.structural.state.ceilingfanpullchain.CeilingFanPullChain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Allow an object to alter its behavior when its internal state changes. The object will appear to change its class.
 * An object-oriented state machine
 * wrapper + polymorphic wrappee + collaboration
 */
public class Main {
    public static void main(String[] args) {
        CeilingFanPullChain chain = new CeilingFanPullChain();
        while (true) {
            System.out.print("Press ENTER");
            getLine();
            chain.pull();
        }
    }

    static String getLine() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        try {
            line = in.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return line;
    }
}
