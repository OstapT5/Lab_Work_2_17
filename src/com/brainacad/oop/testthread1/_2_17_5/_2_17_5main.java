package com.brainacad.oop.testthread1._2_17_5;

public class _2_17_5main {

    public static void main(String[] args) {

        Storage storage = new Storage();
        final int NUMBER_OF_ITERATIONS = 1000000;
        Counter counter = new Counter(storage, NUMBER_OF_ITERATIONS);
        Printer printer = new Printer(storage, NUMBER_OF_ITERATIONS);
        printer.start();
        counter.start();
    }
}
