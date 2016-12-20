package com.brainacad.oop.testthread1._2_17_5;

public class Counter extends Thread {

    private Storage storage;
    private int iterations;


    public Counter(Storage storage, int iterations) {
        this.storage = storage;
        this.iterations =iterations;
    }

    @Override
    public void run() {
        for (int i = 0; i < iterations; ++i) {
        synchronized (storage) {
            while (storage.isPrintable()) {
                try {
                    storage.wait();
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
                storage.setI(storage.getI() + 1);
                storage.setPrintable(true);
                storage.notifyAll();
            }
        }
    }
}
