package meeting.duxiaoman;

import java.util.Scanner;

public class xiaoxiaole {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String str = sc.next();
        int count = max(str,k);
        System.out.println(count);
    }
    public static int max(String s,int k){
        int res = 1;
        int maxnum = 0;
        char[] arr=s.toCharArray();
        for(int i=1;i<s.length();i++){
            char c1 = arr[i];
            char c2 = arr[i-1];
            if(c1!=c2){
                if(k>0){
                    k--;
                    arr[i]=arr[i-1];
                    res++;
                }else{
                    res =1;
                }

            }else{
                res++;
            }
            if (maxnum<res) maxnum=res;
        }
        return maxnum;
    }
}
