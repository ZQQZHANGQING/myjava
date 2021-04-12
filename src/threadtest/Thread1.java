package threadtest;

public class Thread1 extends Thread{
    private String name;
    public Thread1(String name){
        super(name);
        this.name = name;
    }
    public void run(){
        System.out.println(Thread.currentThread().getName()+"线程开始运行");
        for(int i=0;i<5;i++){
            System.out.println("子线程"+name+i+"运行");
            try{
                sleep((int)Math.random()*10);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            if(i==2){
                this.yield();
            }
        }
        System.out.println(Thread.currentThread().getName()+ " 线程运行结束!");
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+"主线程开始运行");
        Thread1 t1 = new Thread1("小红");
        Thread1 t2 = new Thread1("小亮");
        t1.start();
        t2.start();
        try{
            t1.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        try{
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName()+"主线程运行结束");
    }
}
