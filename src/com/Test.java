package com;

public class Test {
    public static void main(String[] args) {
        Figure figure,a1;
        figure = new Rectangle(9,9);
        a1=new Rectangle(9,9);
        System.out.println(figure.equals(a1));
        System.out.println(figure.area());
        figure = new Triangle(9,9);
        System.out.println(figure.area());
        figure = new Figure(9,9);
        System.out.println(figure.area());

    }
}
