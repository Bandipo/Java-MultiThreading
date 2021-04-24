package threadclass1;

import com.paulbaogjava.ThreadColor;

public class newThread extends Thread implements Runnable{

    public newThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(ThreadColor.ANSI_BLUE+ Thread.currentThread().getName()+ " has started");
        // putting this thread to sleep
        System.out.println(ThreadColor.ANSI_BLUE+ Thread.currentThread().getName()+ " is sleeping");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(ThreadColor.ANSI_BLUE+ Thread.currentThread().getName()+ " : My sleep has been interrupted");
        }
        System.out.println(ThreadColor.ANSI_BLUE+  Thread.currentThread().getName() + "Task is completed" );
    }
}
