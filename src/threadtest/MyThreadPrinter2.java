package threadtest;

public class MyThreadPrinter2 implements Runnable{
    private String name;
    private Object prev;
    private Object self;
    private MyThreadPrinter2(String name, Object prev, Object self){
        this.name = name;
        this.prev = prev;
        this.self = self;
    }
    public void run(){
        int count = 10;
        for (int i=0;i<count;i++){
            synchronized (prev){    // C     A     B
                synchronized (self){  //    B     C
                    System.out.println(Thread.currentThread().getName()+" "+count+"在运行");
                    System.out.print(name);
                   // count--;
                    self.notify();  //A.notify   B.notify   C.notify
                  //  System.out.println(Thread.currentThread().getName()+" "+count+"在notify");
                }
                try {
                    if(i<count-1){
                        prev.wait();  //pa   pb   pc           C.wait    A.wait
                //        System.out.println(Thread.currentThread().getName()+" "+count+"在wait");
                    }


                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Object a = new Object();
        Object b = new Object();
        Object c = new Object();

        MyThreadPrinter2 pa = new MyThreadPrinter2("A",c,a);
        MyThreadPrinter2 pb = new MyThreadPrinter2("B",a,b);
        MyThreadPrinter2 pc = new MyThreadPrinter2("C",b,c);

        new Thread(pa).start();
       // Thread.sleep(10);
        new Thread(pb).start();
      //  Thread.sleep(10);
        new Thread(pc).start();
      //  Thread.sleep(10);


    }
}
