package com.paulbaogjava;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(ThreadColor.ANSI_RESET+ "This is a thread from" +Thread.currentThread().getName());
    }




}
