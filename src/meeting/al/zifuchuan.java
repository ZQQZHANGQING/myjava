package meeting.al;

import java.util.Scanner;

public class zifuchuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            String str = sc.next();
            int k = sc.nextInt();
            char[] ch = str.toCharArray();
            int count = 0;
            int j=0;
            while (j<ch.length){
                int y=j;
                for (y=j;y<ch.length;y++){
                    if(idhiwen(ch,j,y)){
                        count++;
                    }
                }
                j=++y;
            }
         //   System.out.println("count"+count);
            if (count==2){
                System.out.println(0);
            }else {
                System.out.println(k-count);
            }
        }

    }
    public static boolean idhiwen(char[] ch,int i,int j){
        while (i<j){
            if (ch[i]!=ch[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
