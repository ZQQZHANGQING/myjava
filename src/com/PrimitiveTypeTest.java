package com;

public class PrimitiveTypeTest {
    static boolean bool;
    static char ch;
    static  byte b;
    static  short s;
    static  int in;
    static  long lon;
    static  float fl;
    static  double dou;
    static  String str;
    public static void main(String[] args) {
        System.out.println("基本数据类型：byte二进制数"+Byte.SIZE);
        System.out.println("包装类：java.lang.Byte");
        System.out.println("最小值：Byte.MIN_VALUE "+Byte.MIN_VALUE);
        System.out.println("最大值：Byte.MAX_VALUE "+Byte.MAX_VALUE);
        System.out.println();

        System.out.println("基本数据类型：short二进制数"+Short.SIZE);
        System.out.println("包装类：java.lang.Short");
        System.out.println("最小值：Short.MIN_VALUE "+Short.MIN_VALUE);
        System.out.println("最大值：Short.MAX_VALUE "+Short.MAX_VALUE);
        System.out.println();

        System.out.println("基本数据类型：Integer二进制数"+Integer.SIZE);
        System.out.println("包装类：java.lang.Integer");
        System.out.println("最小值：Integer.MIN_VALUE "+Integer.MIN_VALUE);
        System.out.println("最大值：Integer.MAX_VALUE "+Integer.MAX_VALUE);
        System.out.println();

        System.out.println("基本数据类型：Long二进制数"+Long.SIZE);
        System.out.println("包装类：java.lang.Long");
        System.out.println("最小值：Long.MIN_VALUE "+Long.MIN_VALUE);
        System.out.println("最大值：Long.MAX_VALUE "+Long.MAX_VALUE);
        System.out.println();

        System.out.println("基本数据类型：Float二进制数"+Float.SIZE);
        System.out.println("包装类：java.lang.Float");
        System.out.println("最小值：Float.MIN_VALUE "+Float.MIN_VALUE);
        System.out.println("最大值：Float.MAX_VALUE "+Float.MAX_VALUE);
        System.out.println();

        System.out.println("基本数据类型：Double二进制数"+Double.SIZE);
        System.out.println("包装类：java.lang.Double");
        System.out.println("最小值：Double.MIN_VALUE "+Double.MIN_VALUE);
        System.out.println("最大值：Double.MAX_VALUE "+Double.MAX_VALUE);
        System.out.println();

        System.out.println("基本数据类型：Character二进制数"+Character.SIZE);
        System.out.println("包装类：java.lang.Character");
        System.out.println("最小值：Byte.MIN_VALUE "+(int)Character.MIN_VALUE);
        System.out.println("最大值：Byte.MAX_VALUE "+(int)Character.MAX_VALUE);
        System.out.println();

        System.out.println("Bool "+bool);
        System.out.println("Byte "+b);
        System.out.println("Char "+ch);
        System.out.println("short "+s);
        System.out.println("int"+in);
        System.out.println("long"+lon);
        System.out.println("float"+fl);
        System.out.println("double"+dou);
        System.out.println("Strint "+str);
        PrimitiveTypeTest test = new PrimitiveTypeTest();
        test.pupage();
    }

    public void pupage() {
        int age=0;
        age = age + 7;
        System.out.println("小狗的年龄"+age);
    }
}
