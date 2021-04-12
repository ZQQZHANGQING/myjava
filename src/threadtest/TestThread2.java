package threadtest;

class ThreadDemo2 extends Thread{
    private Thread t;
    private String threadname;
    ThreadDemo2(String name){
        threadname = name;
        System.out.println("Creating:"+threadname);
    }
    public void run(){
        System.out.println("Running:"+threadname);
        try {
            for (int i=4;i>0;i--){
                System.out.println("Thread:"+threadname+","+i);
                //让线程睡眠一会
                Thread.sleep(190);
            }
        }catch (InterruptedException e){
            System.out.println("Thread:"+threadname+"interrupted.");
        }
        System.out.println("Thread:"+threadname+"exiting.");
    }
    public void start(){
        System.out.println("Starting:"+threadname);
        if(t==null){
            t = new Thread(this,threadname);
            t.start();
        }
    }

}

public class TestThread2 {
    public static void main(String[] args) {
        ThreadDemo2 t = new ThreadDemo2("Thread-1");
        t.start();

        ThreadDemo2 t2 = new ThreadDemo2("Thread-2");
        t2.start();
    }


}
