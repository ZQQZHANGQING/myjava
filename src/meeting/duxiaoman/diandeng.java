package meeting.duxiaoman;

import java.util.Scanner;

public class diandeng {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m];
        for (int i=0;i<m;i++){
            arr[i] = sc.nextInt();
        }
        int[] narr = new int[n];
        for (int i=0;i<n;i++){
            narr[i]=1;
        }
        int[] res = new int[n];
        res[0] = m;
        for(int i=0;i<m-1;i++){
            for(int j=arr[i]-1;j<n;j++){
                if(narr[j]==1){
                    narr[j] = 0;
                }else{
                    narr[j] = 1;
                }

                if(narr[j]==0){
                    res[j] = i+1;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(res[i]);
            System.out.print(" ");
        }

    }
}
