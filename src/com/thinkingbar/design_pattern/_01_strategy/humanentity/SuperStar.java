package com.thinkingbar.design_pattern._01_strategy.humanentity;

import com.thinkingbar.design_pattern._01_strategy.codestrategy.WhatISTheFuckCode;
import com.thinkingbar.design_pattern._01_strategy.displaystrategy.FashionMan;

public class SuperStar extends Human {

    public SuperStar() {
        System.out.println("大家好，我是崔始源~\n");
        this.codeSkill = new WhatISTheFuckCode();
        this.display = new FashionMan();
    }

    @Override
    public void eat() {
        System.out.println("意大利那家的甜品店不错，改天飞过去尝一下");
    }

    @Override
    public void drink() {
        System.out.println("法国路易斯酒庄的葡萄酒很好喝，好想再品尝一次");
    }

}
