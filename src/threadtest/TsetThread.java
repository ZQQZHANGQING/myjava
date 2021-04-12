package threadtest;
/*
JAVA提供了三种创建线程的方法：
通过实现Runnable接口
通过继承Thread类本身
通过Callable 和 Future 创建线程
 */

class RunnableDemo implements Runnable{
    private Thread t;
    private String threadName;
    RunnableDemo(String name){
        threadName = name;
        System.out.println("Creating"+ threadName);
    }
    public void run(){
        System.out.println("Running"+threadName);
        try {
            for (int i=4;i>0;i--){
                System.out.println("Thread:"+threadName+","+i);
                //让线程睡眠一会
                Thread.sleep(190);
            }
        }catch (InterruptedException e){
            System.out.println("Thread:"+threadName+"interrupted.");
        }
        System.out.println("Thread:"+threadName+"exiting.");
    }
    public void start(){
        System.out.println("Starting"+threadName);
        if (t==null){
            t = new Thread(this,threadName);
            t.start();
        }
    }
}
public class TsetThread {
    public static void main(String[] args) {
        RunnableDemo R1 = new RunnableDemo("Thread-1");
        R1.start();

        RunnableDemo R2 = new RunnableDemo("Thread-2");
        R2.start();

    }

}
