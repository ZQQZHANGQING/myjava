package com;

/**
 *
 */
public class Member {
    //包含用户名和密码两个属性。
    /**
     * 用户名和密码
     */
    String username;
    String password;
    public Member(String username,String password){
       this.username = username;
       this.password = password;
    }

    /**
     *
     * @param password: password
     */
    public void setPassword(String password) {
        this.password = password;
    }
    public void setUsername(String username){
        this.username = username;
    }

    /**
     *
     * @return  username
     */
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public String toString(){
        return "用户名："+username+" 密码:" + password;
    }
}
