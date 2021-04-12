package meeting.meituan;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class guanjianchuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int count = important(str);
        System.out.println(count);
    }
    public static int important(String s){
        int count = 0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(iszichuan(s.substring(i,j+1))){
                    count++;
                }
            }
        }
        return count ;
    }
    public static boolean iszichuan(String s){
        int len = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i=0;i<len;i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        int flag = 0;
        for(Character key : map.keySet()){
            if(map.get(key)>len/2){
                flag = 1;
            }
        }
        if (flag==1) return true;
        else return false;
    }
}
