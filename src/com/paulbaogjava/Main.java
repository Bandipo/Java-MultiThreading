package com.paulbaogjava;

public class Main {

    public static void main(String[] args) {
        System.out.println(ThreadColor.ANSI_RED+ "This is the Main Thread");
        Thread anotherThread = new AnotherThread();
        anotherThread.start();// Running another thread apart from the main thread
        System.out.println("Back to the Main Thread");
//        anotherThread.start();// you cannot start a thread again.

        // Starting a thread by using the creating a Thread anonymous class
        Thread thread = new Thread(){
            @Override
            public void run() {
                System.out.println("Starting Thread from Anonymous class");
            }
        };
        Thread  threadLambda = new Thread(()-> System.out.println(ThreadColor.ANSI_CYAN+ "starting Thread from lamda")) ;

         thread.start();
        threadLambda.run();

    }
}
