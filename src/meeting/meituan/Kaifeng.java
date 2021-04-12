package meeting.meituan;

import java.util.Scanner;

public class Kaifeng {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] value = new int[n+1];
        value[0] = k+1;
        for (int i=1;i<=n;i++){
            value[i] = sc.nextInt();
        }
        int d = 0;
        for (int i=1;i<=n;i++){
            if (value[i]==0){
                d=i;
                break;
            }
        }
        int m = n+1;
        for (int i=d+1;i<=n;i++){
            if(value[i]<=k){
                m = i;
                break;
            }
        }
        int m2 = n+1;
        for (int j=d-1;j>=0;j++){
            if (value[j]<=k){
                m2=j;
                break;
            }
        }
        int res = Math.min(m,m2);
        System.out.println(res);
    }
}
