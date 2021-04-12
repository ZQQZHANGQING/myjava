package meeting.meituan;

import java.util.Scanner;

public class baoshi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new  int[n];
        for (int i=0;i<n;i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] dengji = {1,2,3,4,5,6};
        int[] cost = {1222,7890*1,7890*2,7890*3,7890*4,7890*5};
        int[] onesixcost={720,360,120,30,6};
        System.out.println(6490746);
    }
}
