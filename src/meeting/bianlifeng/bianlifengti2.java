package meeting.bianlifeng;

import java.util.ArrayList;
import java.util.Scanner;
//3-5,4-8,18-22,20-24,28-30
//100,300,50,30,500,103,605,720
public class bianlifengti2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strs = sc.nextLine();
        String[] str = strs.split(",");

        String[][] a = new String[str.length][2];
        for(int i=0;i<str.length;i++){
            a[i] = str[i].split("-");
        }
        int[][] aa = new int[str.length][2];
        for(int i=0;i<str.length;i++){
            for (int j=0;j<2;j++){
                aa[i][j] = Integer.parseInt(a[i][j]);
            }
        }

        ArrayList<String> res = new ArrayList<>();
        int l=Integer.MIN_VALUE;
        int r=Integer.MIN_VALUE;
        for (int i=0;i<aa.length;i++){
            if(aa[i][0]>r){
                if(l!=Integer.MIN_VALUE){
                    String ans = Integer.toString(l)+"-"+Integer.toString(r);
                    res.add(ans);
                }
                l=aa[i][0];
                r=aa[i][1];
            }else{
                r = Math.max(r,aa[i][1]);
            }
        }
        if(l!=Integer.MIN_VALUE){
            String ans = Integer.toString(l)+"-"+Integer.toString(r);
            res.add(ans);
        }
        for(int i=0;i<res.size();i++){
            System.out.println(res.get(i));
        }


    }
}
