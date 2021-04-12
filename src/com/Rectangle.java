package com;

public class Rectangle extends Figure{
     Rectangle(double dim1,double dim2){
         super(dim1,dim2);
     }
     double area(){
         System.out.println("长方形面积");
         return super.dim1*super.dim2;
     }
}
