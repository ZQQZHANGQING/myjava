package OOP;

public class StaticVar {
    public static String str1 = "Hello";

    public static int count = 0;

    public void printinfo(String...names){
        int count = names.length;
        System.out.println("共有"+count+"个用户，分别为");
        for (int i=0;i<count;i++){
            System.out.println(names[i]);
        }
    }
    {
        count++;
        System.out.println("非静态代码块count："+count);
    }
    static {
        count++;
        System.out.println("静态代码块1 count："+count);
    }
    static {
        count++;
        System.out.println("静态代码块2 count："+count);
    }
    public static void main(String[] args) {
        String str2 = "World";
        String acces = str2 + str1;
        StaticVar str11 = new StaticVar();
        StaticVar str12 = new StaticVar();
        System.out.println(str11.str1);

        int n = args.length;
        System.out.println("一共有"+n+"个参数");
        str11.printinfo("张三","李四");
        str11.printinfo("张三","李四","王五");
    }
}
