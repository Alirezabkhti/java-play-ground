package com.playground.main.learning.designpatterns.structural.templatemethod;

public abstract class Generalization {
    void findSolution() {
        stepOne();
        stepTwo();
        stepThr();
        stepFor();
    }

    private void stepOne() {
        System.out.println("Generalization.stepOne");
    }

    abstract void stepTwo();

    abstract void stepThr();

    void stepFor() {
        System.out.println("Generalization.stepFor");
    }
}
