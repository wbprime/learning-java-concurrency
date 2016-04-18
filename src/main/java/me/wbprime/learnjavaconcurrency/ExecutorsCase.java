package me.wbprime.learnjavaconcurrency;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Class: ExecutorsCase
 * Date: 2016/04/15 16:29
 *
 * @author Elvis Wang [bo.wang35@renren-inc.com]
 */
public final class ExecutorsCase {
    public static void main(String [] _args) {
        final ExecutorService executor = Executors.newCachedThreadPool();

        executor.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Executor service demo");
            }
        });

        executor.shutdown();
    }
}
