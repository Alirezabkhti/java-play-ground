package com.playground.main.learning.designpatterns.structural.state.ceilingfanpullchain;

import com.playground.main.learning.designpatterns.structural.state.ceilingfanpullchain.state.Off;
import com.playground.main.learning.designpatterns.structural.state.ceilingfanpullchain.state.State;

public class CeilingFanPullChain {
    private State currentState;

    public CeilingFanPullChain() {
        currentState = new Off();
    }

    public void set_state(State s) {
        currentState = s;
    }

    public void pull() {
        currentState.pull(this);
    }
}