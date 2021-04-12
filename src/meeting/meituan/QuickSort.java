package meeting.meituan;

import java.util.HashSet;
import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a=new int[n];
        int pos = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]==0){
                set.add(i);
            }
        }
        int min = Integer.MAX_VALUE;
        int res=0;
        for (int i=0;i<n;i++){
            int total=0;
            if (!set.contains(i)&&a[i]<=k){
                for (int val:set){
                    total=total+Math.abs(val-i);
                }
                if (total<min){
                    min = total;
                    res = i;
                }
            }
        }
        System.out.println(res+1);
    }
}
