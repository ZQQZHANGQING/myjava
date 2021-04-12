package com;

public class Puppy {
    int puppyAge;
    public Puppy(){
    }
    public Puppy(String name){
        System.out.println("小狗的名字是："+name);
    }
    public  void  setPuppyAge(int age){
        puppyAge = age;
    }
    public int getPuppyAge(){
        return  puppyAge;
    }
    public static void main(String[] args) {
       Puppy myPuppy = new Puppy("dzz");
       myPuppy.setPuppyAge(3);
       System.out.println("年龄"+myPuppy.getPuppyAge()+"岁");
       OuterClass out = new OuterClass();
       OuterClass.InnerClass iner = out.new InnerClass();
       System.out.println(iner.myinnermethod());

        Anony an = new Anony();
        an.creat();
    }
}
//内部类嵌套在外部类中
class OuterClass{
    int x = 10;
     class InnerClass{
        //int y=5;
        public int myinnermethod(){
            return x;
        }
    }
}
interface Polygon{
    public void display();
}
class Anony{
    public void creat(){
      Polygon p1 = new Polygon(){
        public void display(){
            System.out.println("在匿名类内部");
        }
      };
    p1.display();
    }
}
