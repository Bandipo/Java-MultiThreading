package com.paulbaogjava;

import java.util.TreeMap;

public class AnotherThread extends Thread{

    public AnotherThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(ThreadColor.ANSI_BLUE+ "Hello from another thread "
                + Thread.currentThread().getName());
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            System.out.println( Thread.currentThread().getName()+  ": some thread has disturbed my sleep");
            return;
        }
       System.out.println(Thread.currentThread().getName()+ " is finally awoke");
    }
}
