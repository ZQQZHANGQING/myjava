package com;

public class InstanceCounter {
    private static int numcount = 0;
    public static int getcount(){
       return numcount;
    }
    public static void addcount(){
        numcount = numcount + 1;
    }
    //初始化
    InstanceCounter(){
        InstanceCounter.addcount();
    }

    public static void main(String[] args) {
        System.out.println("starting with "+InstanceCounter.getcount());
        for(int i=0;i<50;i++){
            new InstanceCounter();
        }
        System.out.println("new create with "+InstanceCounter.getcount());
    }
}
