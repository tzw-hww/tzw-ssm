package com.mark.java.xiancheng.threadPool;

        import java.util.concurrent.ExecutionException;
        import java.util.concurrent.ExecutorService;
        import java.util.concurrent.Executors;
        import java.util.concurrent.Future;

public class FixedThreadPoolDemo {


    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i <5 ; i++) {

            Future<?> future = executorService.submit(new Task());
            try {
                Object o = future.get();
                System.out.println(o);
                System.out.println(future.isDone());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }


        }
        executorService.shutdown();
    }
}
