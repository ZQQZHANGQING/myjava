package com;

public class xunhuan {
    public static void main(String[] args) {
        int x = 10;
        switch (x){
            case 0:
                System.out.println(0);
                break;
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            default:
                System.out.println("dault");
        }
        double[] nums = {-1.4,1.5,0.6,-1.7};
        for(int i=0;i<nums.length;i++){
            ttest(nums[i]);
        }
        System.out.println("访问\"菜鸟教程!\"”");
        char[] ch = {'r','b','n','s'};
        String str = new String(ch);
        System.out.println(str);
    }
    public static void ttest(double a){
        System.out.println("Math.floor "+Math.floor(a));
        System.out.println("Math round "+Math.round(a));
        System.out.println("Math ceil "+Math.ceil(a));
    }
}
