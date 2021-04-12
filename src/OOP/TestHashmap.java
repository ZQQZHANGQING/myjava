package OOP;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class TestHashmap {
    public static void main(String[] args) {
        HashMap users = new HashMap();
        users.put("11","帐号太");
        users.put("12","liusicheng");
        users.put("13","王强问");
        System.out.println("****学生列表****");
        Iterator it = users.keySet().iterator();
        while(it.hasNext()){
            Object key = it.next();
            Object name = users.get(key);
            System.out.println("学号："+key+" 姓名："+name);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查询的学号：");
        int num = sc.nextInt();
        if(users.containsKey(String.valueOf(num))){
            users.remove(String.valueOf(num));
        }else {
            System.out.println("该学生不存在！");
        }
        System.out.println("****新的学生列表****");
        it = users.keySet().iterator();
        while (it.hasNext()){
            Object key = it.next();
            Object name = users.get(key);
            System.out.println("学号："+key+" 姓名："+name);
        }
    }
}
