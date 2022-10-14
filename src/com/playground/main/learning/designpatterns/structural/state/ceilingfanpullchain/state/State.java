package com.playground.main.learning.designpatterns.structural.state.ceilingfanpullchain.state;

import com.playground.main.learning.designpatterns.structural.state.ceilingfanpullchain.CeilingFanPullChain;

public interface State {
    void pull(CeilingFanPullChain wrapper);
}
