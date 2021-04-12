package com;
import java.util.Scanner;

/**
 * @projectName: cainiao
 * @package: com
 */
public class MemberTest {
    //实现修改密码的功能，即当用户输入的密码与原来密码相同时方可进行修改密码操作，否则提示用户输入的密码不正确。
    public static void main(String[] args) {
        Member member = new Member("张三","123456");
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入原密码：");
        String newpassword = sc.next();

        if(newpassword.equals(member.getPassword())){
            //输入新密码
            System.out.print("请输入新密码：");
            member.setPassword(sc.next());
        }else{
            System.out.println("输入的密码错误，无法进行修改");
        }
        System.out.println("---------用户信息："+member);
    }
}

