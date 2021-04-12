package com.test;

import com.dao.*;
import com.dao.Student;

public class Test {
    public static void main(String[] args) {
        for(int i=0;i<Student.getall().length;i++){
            System.out.println(Student.getall()[i]);
        }


    }
}
