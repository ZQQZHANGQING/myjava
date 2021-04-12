package meeting.meituan;

import java.util.Scanner;

public class xiaochu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int m = Integer.parseInt(n);
        String s = sc.nextLine();
        int[] res = new int[m];
        for (int i=0;i<s.length();i++){
            res[i]=s.charAt(i)-'0';
        }
        int ans = max(res,m);
        System.out.println(ans);
    }
    public static int max(int[] res,int n){
        int ans =0,zero=0,one=0;
        for (int i=0;i<n;i++){
            if (res[i]==0) zero++;
            else one++;
        }
        ans = Math.abs(zero-one);
        return ans;
    }
}
