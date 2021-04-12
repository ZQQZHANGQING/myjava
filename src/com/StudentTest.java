package com;

public class StudentTest {
    public static void main(String[] args) {
        Student m1 = new Student();
        System.out.println(m1.info());

        m1.email="1916@qq.com";
        m1.no="2019110118";
        m1.name="小明";
        System.out.println(m1.info());

    }
}
