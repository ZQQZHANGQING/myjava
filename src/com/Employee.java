package com;
import java.io.*;
public class Employee {
   public String name;
   int age;
   String designation;
   private static double salary;
   public static  final  String DER = "开发人员";
   //构造器
    public Employee(String name){
        this.name = name;
    }

    //设置age的值

    public void setAge(int age) {
        this.age = age;
    }
    //设置des的值
    public void setDesignation(String designation){
        this.designation = designation;
    }
    //设置salary的值
 //   public void setsalary(double salary){
 //       this.salary = salary;
 //   }
    /*打印信息*/
    public void put(){
        System.out.println("名字"+name);
        System.out.println("年龄"+age);
        System.out.println("职位"+designation);
   //     System.out.println("薪水"+salary);
    }
    public String toString(){
        return "3333";
    }

    public static void main(String[] args) {
        salary = 500;
        System.out.println(DER+"平均工资"+salary);

        Employee m1 = new Employee("ZQQ");
        Employee m2 = new Employee("DZZ");

        m1.setAge(18);
      //  m1.setsalary(20000);
        m1.setDesignation("开发工程师");

        m2.setAge(10);
    //    m2.setsalary(10000);
        m2.setDesignation("菜鸟工程师");
        m1.put();
        m2.put();

        System.out.println(m1.toString());

    }
}
