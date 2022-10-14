package com.playground.main.learning.designpatterns.structural.state.ceilingfanpullchain.state;

import com.playground.main.learning.designpatterns.structural.state.ceilingfanpullchain.CeilingFanPullChain;

public class Low implements State {
    public void pull(CeilingFanPullChain wrapper) {
        wrapper.set_state(new Medium());
        System.out.println("medium speed");
    }
}
