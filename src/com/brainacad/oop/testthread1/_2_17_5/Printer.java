package com.brainacad.oop.testthread1._2_17_5;

public class Printer extends Thread {

    private Storage storage;
    private int iterations;

    public Printer(Storage storage, int iterations) {
        this.storage = storage;
        this.iterations = iterations;
    }

    @Override
    public void run() {
        for (int i = 0; i < iterations; ++i) {
            synchronized (storage) {
                while (!storage.isPrintable()) {
                    try {
                        storage.wait();
                    }catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.format("Printer: %d%n", storage.getI());
                storage.setPrintable(false);
                storage.notifyAll();
            }
        }
    }
}
