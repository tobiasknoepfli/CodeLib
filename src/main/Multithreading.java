package main;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Multithreading {
    private static List<Integer> NumbersUpTo1000 = new ArrayList<>();
    private static List<Character> NumbersDownFrom1000 = new ArrayList<>();
    private static final Object lock = new Object();

    public static void main(String[] args) {
        ThreadMaker threadMaker = new ThreadMaker();

//        OPEN A THREAD AND RUN A TASK
        threadMaker.runInBackground(() -> {
            for (int i = 3; i > 0; i--) {
                System.out.println(i);
                /* sleep for a second */
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        threadJoiner(ThreadMaker.threadList);

        threadMaker.runInBackground(() -> {
            for (int i = 0; i < 1000; i++) {
                NumbersUpTo1000.add(i);
                System.out.println(i);
            }
        });

        threadMaker.runInBackground(() -> {
            for (int i = 1000; i > 0; i--) {
                NumbersDownFrom1000.add((char) i);
                System.out.println((char) i);
            }
        });

//        OPEN THREADS FROM POOL
        threadMaker.runInBackground2(() -> {
            for (int i = 0; i < 100; i++) {
                /* synchronize, so no other thread can use this method */
                synchronized (lock) {
                    outputStuff("A");
                }
            }
        });

        threadMaker.runInBackground2(() -> {
            for (int i = 0; i < 100; i++) {
                synchronized (lock) {
                    outputStuff("B");
                }
            }
        });

        threadMaker.shutdown();

        threadJoiner(ThreadMaker.threadList);

        ThreadMaker.runInBackground(() -> System.out.println("Finished"));
    }

    //    MAKE MAIN WAIT UNTIL ALL ONGOING THREADS ARE CLOSED
    public static void threadJoiner(List<Thread> threadList) {
        for (Thread t : ThreadMaker.threadList) {
            try {
                t.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void outputStuff(String s) {
        for (int i = 0; i < 100; i++) {
            System.out.print(s);
        }
    }


    //    CLASS TO GENERATE THREADS AUTOMATICALLY
    public static class ThreadMaker {
        static List<Thread> threadList = new ArrayList<>();
        /* use a pool to keep 2 threads alive */
        static ExecutorService executorService = Executors.newFixedThreadPool(2);

        public static void runInBackground2(Runnable runnable) {
            executorService.submit(runnable);
        }

        public static void runInBackground(Runnable runnable) {
            /* implement runnable interface */
            Thread thread = new Thread(runnable);
            /* start thread */
            thread.start();
            threadList.add(thread);
        }

        public void shutdown() {
            executorService.shutdown();
            try {
                executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
