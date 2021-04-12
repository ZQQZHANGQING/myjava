package meeting.wangyi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dianyingyuan {

    public static void main(String[] args) throws IOException {
        BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
        String[] s=r.readLine().split("\\s+");
        int[] left=new int[s.length];
        int[] right=new int[s.length];
        boolean flag=true;    //false 前一个为1,true 前left[i-1]个为0


        for(int i=1;i<s.length;i++) {
            if(s[i].equals("0")) {
                if(!flag) {
                    flag=true;
                    left[i]=1;
                }
                else {
                    left[i]=left[i-1]+1;
                }
            }
            else {
                flag=false;
            }
        }
        if(s[0].equals("0"))
            left[0]=Integer.MAX_VALUE;


        flag=true;    //false 后一个为1,true 后right[i-1]个为0
        for(int i=s.length-2;i>=0;i--) {
            if(s[i].equals("0")) {
                if(!flag) {
                    flag=true;
                    right[i]=1;
                }
                else {
                    right[i]=right[i+1]+1;
                }
            }
            else {
                flag=false;
            }
        }
        if(s[s.length-1].equals("0"))
            right[s.length-1]=Integer.MAX_VALUE;

        int[] min=new int[s.length];
        for(int i=0;i<s.length;i++) {
            min[i]=Math.min(left[i], right[i]);
        }
        int maxlength=0;
        for(int i=0;i<s.length;i++) {
            if(min[i]>maxlength)
                maxlength=min[i];
        }
        System.out.print(maxlength);
    }
}
