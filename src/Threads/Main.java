package Threads;

import static Threads.ThreadColor.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello from the main thread.");
        Thread anotherThread = new AnotherThread();
        anotherThread.setName("== Another Thread ==");
        anotherThread.start();
        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN + "Hello from the anonymus class thread");
            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable() {
            @Override
            public void run() {
                //super.run();
                System.out.println(ANSI_RED +"Hello from the anonymus class's implementation of run()");
            }
        });
        myRunnableThread.start();
        System.out.println(ANSI_PURPLE+"Hello again from the main thread");

    }
}
