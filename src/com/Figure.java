package com;

public class Figure {
    //在该类中首先定义存储二维对象的尺寸，然后定义有两个参数的构造方法，最后添加 area() 方法，该方法计算对象的面积。
    double dim1;
    double dim2;
    Figure(double dim1,double dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    double area(){
        // 用于计算对象的面积
        System.out.println("父类中计算对象面积的方法，没有实际意义，需要在子类中重写。");
        return 0;
    }

}
