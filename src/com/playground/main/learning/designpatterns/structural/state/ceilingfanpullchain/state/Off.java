package com.playground.main.learning.designpatterns.structural.state.ceilingfanpullchain.state;

import com.playground.main.learning.designpatterns.structural.state.ceilingfanpullchain.CeilingFanPullChain;

public class Off implements State {
    public void pull(CeilingFanPullChain wrapper) {
        wrapper.set_state(new Low());
        System.out.println("low speed");
    }
}
