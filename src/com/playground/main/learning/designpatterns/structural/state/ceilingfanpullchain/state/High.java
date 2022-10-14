package com.playground.main.learning.designpatterns.structural.state.ceilingfanpullchain.state;

import com.playground.main.learning.designpatterns.structural.state.ceilingfanpullchain.CeilingFanPullChain;

public class High implements State {
    public void pull(CeilingFanPullChain wrapper) {
        wrapper.set_state(new Off());
        System.out.println("turning off");
    }
}
