package OOP;

public class Outer {
    public  int a=100;
    static  int b=100;
    final int c=100;
    private  int d = 100;
    int s = 30;
    class Inner1{
       int a2=a+1;
        int b2=b+1;
        int c2=c+1;
        int d2=d+1;
        int s=20;
        int ss=this.s;
        int sss=Outer.this.s;
        String str1 = method1();
        String str2 = method2();
    }
    Inner1 i = new Inner1();//不需要创建外部类实例；
    public String method1(){
      //  Inner1 i = new Inner1();//不需要创建外部类实例；
        return  "实例方法1";
    }
    public static String method2(){
      //  Inner1 i = new Outer().new Inner1();//需要创建外部实例
        return  "静态方法2";
    }

    static class Inner2{
        //Inner1 i = new Inner1();//不需要创建外部类实例；
    }

    public static void main(String[] args) {
        Inner1 i = new Outer().new Inner1();
        Inner2 st2 = new Outer.Inner2();
        System.out.println(i.a2);
        System.out.println(i.b2);
        System.out.println(i.c2);
        System.out.println(i.d2);
        System.out.println(i.str1);
        System.out.println(i.str2);
        System.out.println(i.s);
        System.out.println(i.ss);
        System.out.println(i.sss);

    }

}

