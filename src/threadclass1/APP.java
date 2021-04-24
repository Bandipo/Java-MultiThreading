package threadclass1;

import com.paulbaogjava.ThreadColor;

public class APP {
    public static void main(String[] args) {

        Thread threadA = new newThread("threadA");
        threadA.start();


       // Lamda Thread implementing the runnable method
        Thread newLambdaThread1 = new Thread(()-> {
            System.out.println(ThreadColor.ANSI_RED+ Thread.currentThread().getName()+" has started");
            try {
                System.out.println(ThreadColor.ANSI_RED+ Thread.currentThread().getName()+": I am joining " + threadA.getName());
                threadA.join();
                System.out.println((ThreadColor.ANSI_RED+ Thread.currentThread().getName()+ " "+ threadA.getName()+ "  is terminated, so I am running again"));
            } catch (InterruptedException e) {
                System.out.println(ThreadColor.ANSI_RED+
                        Thread.currentThread().getName()+ " : I cant wait any longer"+
                        " . I have been interrupted");
            }
            System.out.println((ThreadColor.ANSI_RED+ Thread.currentThread().getName()+  ": I am terminated too"));

        });
     newLambdaThread1.start();
     // let us interrupt thread a;
//        threadA.interrupt();



    }


}
