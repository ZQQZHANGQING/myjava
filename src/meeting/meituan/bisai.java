package meeting.meituan;

import java.util.Scanner;
public class bisai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
        String[] arry1 = s1.split(" ");
        String[] arry2 = s2.split(" ");
        String[] arry3 = s3.split(" ");
        int n = Integer.parseInt(arry1[0]);
        int m = Integer.parseInt(arry1[1]);
        int[] narry = new int[n];
        int[] marry = new int[m];
        for(int i=0;i<n;i++){
            narry[i] = Integer.parseInt(arry2[i]);
        }
        for(int i=0;i<m;i++){
            marry[i] = Integer.parseInt(arry3[i]);
        }
        int nmax = maxnum(narry);
        int count = 0;
        for(int i=0;i<marry.length;i++){
            if(marry[i]>nmax){
                count++;
            }
        }
        int res = count*2+(marry.length-count)-narry.length;
        System.out.println(res);
    }
    public static int maxnum(int[] arr){
        int max = 0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max) max = arr[i];
        }
        return max;
    }

}
