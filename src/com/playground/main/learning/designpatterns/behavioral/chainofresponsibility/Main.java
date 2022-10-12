package com.playground.main.learning.designpatterns.behavioral.chainofresponsibility;

import com.playground.main.learning.designpatterns.behavioral.chainofresponsibility.cashdispenser.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DispenseChain c1 = new FiftyDollarDispenser();
        DispenseChain c2 = new TwentyDollarDispenser();
        DispenseChain c3 = new TenDollarDispenser();
        c1.setNextChain(c2);
        c2.setNextChain(c3);
        while (true) {
            int amount = 0;
            System.out.println("Enter amount to dispense");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            if (amount % 10 != 0) {
                System.out.println("Amount should be in multiple of 10s.");
                return;
            }
            c1.dispense(new Currency(amount));
        }
    }
}
