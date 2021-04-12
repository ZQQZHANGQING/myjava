package meeting.bianlifeng;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class bianlifengti1 {
    int ptr;
    public  String decodeString(String s){
        LinkedList<String> stk = new LinkedList<>();
        ptr=0;
        while (ptr<s.length()){
            char cur = s.charAt(ptr);
            if(cur=='{'){
                stk.addLast(String.valueOf(s.charAt(ptr++)));
            }
            if (Character.isDigit(cur)){
                String digits = getDigits(s);
                stk.addLast(digits);
            }else if (Character.isLetter(cur)){
                stk.addLast(String.valueOf(s.charAt(ptr++)));
            }
            if(cur=='}'){
                ++ptr;
                LinkedList<String> sub = new LinkedList<>();
                while (!"{".equals(stk.peekLast())){
                    sub.addLast(stk.removeLast());
                }
                Collections.reverse(sub);
                stk.removeLast();
                int repTime = Integer.parseInt(stk.removeLast());
                StringBuilder t = new StringBuilder();
                String o = getString(sub);
                while (repTime-->0){
                    t.append(o);
                }
                stk.addLast(t.toString());
            }else if(ptr==s.length()-1){
                stk.addLast(String.valueOf(s.charAt(ptr++)));
                LinkedList<String> sub = new LinkedList<>();
                LinkedList<String> curr = new LinkedList<>();
                LinkedList<String> stl = (LinkedList<String>) stk.clone();
                while (stl.size()>0){
                    while(!Character.isDigit(stl.peekLast().charAt(0))&&stl.size()>0){
                        sub.addLast(stl.removeLast());
                    }
                        Collections.reverse(sub);
                  //  stl.removeLast();
                    int repTime = Integer.parseInt(stl.removeLast());
                    StringBuilder t = new StringBuilder();
                    String o = getString(sub);
                    while (repTime-->0){
                        t.append(o);
                    }
                    curr.addLast(t.toString());
                }
                stk = curr;

            }

        }
        return getString(stk);
    }
    public String getDigits(String s){
        StringBuffer ret = new StringBuffer();
        while (Character.isDigit(s.charAt(ptr))){
            ret.append(s.charAt(ptr++));
        }
        return ret.toString();
    }
    public  String getString(LinkedList<String> v){
        StringBuffer ret = new StringBuffer();
        for (String s:v){
            ret.append(s);
        }
        return ret.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(new bianlifengti1().decodeString(str));

    }
}
