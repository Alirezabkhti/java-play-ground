package com.playground.main.learning.designpatterns.structural.observer;


import com.playground.main.learning.designpatterns.structural.observer.numberobserver.HexObserver;
import com.playground.main.learning.designpatterns.structural.observer.numberobserver.OctObserver;
import com.playground.main.learning.designpatterns.structural.observer.numberobserver.Subject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Subject sub = new Subject();
        new HexObserver(sub);
        new OctObserver(sub);
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("\nEnter a number: ");
            sub.setState(scan.nextInt());
        }
    }
}
