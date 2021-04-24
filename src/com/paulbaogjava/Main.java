package com.paulbaogjava;

public class Main {

    public static void main(String[] args) {
        System.out.println(ThreadColor.ANSI_RED+ "This is the Main Thread");
        Thread anotherThread = new AnotherThread("AnotherThread1");

        anotherThread.start();// Running another thread apart from the main thread
        System.out.println("Back to the Main Thread");
//        anotherThread.start();// you cannot start a thread again.

        // Starting a thread by using the creating a Thread anonymous class
        Thread thread = new Thread(){
            @Override
            public void run() {
                System.out.println("Starting Thread from Anonymous class"+Thread.currentThread().getName());
                try {
                    anotherThread.join();
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName() +": I could not wait for "+ anotherThread.getName() +
                            " for i have been interrupted");
                }
            }
        };
        Thread  threadLambda = new Thread(()-> System.out.println(ThreadColor.ANSI_CYAN+ "starting Thread from " + Thread.currentThread().getName())) ;

//         thread.start();
        threadLambda.setName("LamdaThread");
        //threadLambda.start();
        thread.setName("Anonymous Thread");
//        thread.start();
        thread.start();
        thread.interrupt();

      Thread anotherThread2 = new AnotherThread("AnotherThread2");

      anotherThread2.start();

        threadLambda.start();
        anotherThread2.interrupt();// Lamda don interrupted anotherThread2



//        System.out.println("-".repeat(50));
//        System.out.println(ThreadColor.ANSI_RESET+ "Creating thread from implementation of Runnable");
//        Thread newThread = new Thread(new MyRunnable());
//        newThread.start();

    }
}
