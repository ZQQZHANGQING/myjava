package threadtest.how2j;

import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestThreadPool {
    public static void main(String[] args) throws InterruptedException {
        ThreadPool pool = new ThreadPool();
         Thread.sleep(100);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 10, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(100));
        Executors.newCachedThreadPool();
        int sleep = 1000;
         while (true){
             pool.add(new Runnable() {
                 @Override
                 public void run() {
                     System.out.println("执行任务中");
                     try{
                         Thread.sleep(1000);
                     }catch(InterruptedException e){
                         e.printStackTrace();
                     }
                 }

             });
             try {
                 Thread.sleep(sleep);
                 sleep = sleep>100?sleep-100:sleep;
             }catch (InterruptedException e){
                 e.printStackTrace();
             }
         }


/*
        for (int i = 0; i < 10; i++) {
            Runnable task = new Runnable() {
                @Override
                public void run() {
                    //System.out.println("执行任务");
                    //任务可能是打印一句话
                    //可能是访问文件
                    //可能是做排序
                }
            };

            pool.add(task);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }*/

    }
}
