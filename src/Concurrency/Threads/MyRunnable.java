package Concurrency.Threads;

import static Concurrency.Threads.ThreadColor.ANSI_RED;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from MyRunneble's implementation of run()");
    }
}
