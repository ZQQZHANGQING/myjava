package meeting.bianlifeng;

import java.util.Scanner;

//AAAABCCDAA会被编码成4A1B2C1D2A。
public class zifuchuanbianma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ss=input.next();
        String a = new String(ss);
        String result = "";
        int count  = 1;
        for(int i = 0; i< a.length()-1; i++){
            if(a.charAt(i) == a.charAt(i+1))
            {
                count++;
            }
            else
            {
                result += String.valueOf(count)+a.charAt(i);
                count = 1;
            }

        }
        result += String.valueOf(count)+a.charAt(a.length()-1);
      //  return result;
       // String result = tansf(ss);
        System.out.println(result);


    }

    public static String tansf(String a){

        String result = "";
        int count  = 1;
        for(int i = 0; i< a.length()-1; i++){
            if(a.charAt(i) == a.charAt(i+1))
            {
                count++;
            }
            else
            {
                result += String.valueOf(count)+a.charAt(i);
                count = 1;
            }

        }
        result += String.valueOf(count)+a.charAt(a.length()-1);
        return result;
    }

}
