package com;

import javax.net.ssl.SSLContext;

public class Student {
    String name;
    private String idnumber;
    protected String no;
    public String email;
    public String info(){
        return "姓名："+name+"身份证号： "+idnumber+"学号："+no+"邮箱："+email;
    }
}
