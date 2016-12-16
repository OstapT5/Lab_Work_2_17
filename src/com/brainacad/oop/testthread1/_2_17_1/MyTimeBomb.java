package com.brainacad.oop.testthread1._2_17_1;

public class MyTimeBomb extends Thread {

    @Override
    public void run() {
        for(int i = 10; i >= 0; --i) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Exception: " + e.getMessage());
            }
            System.out.println(i == 0 ? "BOOM!" : i);
        }

    }
}
