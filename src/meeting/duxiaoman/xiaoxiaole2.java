package meeting.duxiaoman;

import java.util.Scanner;

public class xiaoxiaole2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String str = sc.next();
        int count = max(str,k);
        System.out.println(count);
    }
    public static int max(String s,int kk){
        int res = 1;
        int maxnum = 0;

        int j=1;
        while(j<s.length()){
            int k = kk;
            char[] arr=s.toCharArray();
            res = 1;
            int ss=j;
            for(int i=j;i<s.length();i++){
                char c1 = arr[i];
                char c2 = arr[i-1];
                if(c1!=c2){
                    if(k>0){
                        k--;
                        arr[i]=arr[i-1];
                        res++;
                        j=i;
                    }else{
                        res =1;
                    }

                }else{
                    res++;
                }
                if (maxnum<res) maxnum=res;
                if(j==ss) j++;

            }

        }

        return maxnum;
    }
}
