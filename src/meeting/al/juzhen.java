package meeting.al;

import java.util.Scanner;

public class juzhen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] res = fill(n);
        for (int i=0;i<res.length;i++){
            for (int j=0;j<res[0].length;j++){
                System.out.print(res[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }


    }
    public static int[][] fill(int n){
        if (n==1){
            int[][] res = new int[2][2];

            res[0][0] = 0;
            res[0][1]=1;
            res[1][0]=1;
            res[1][1]=1;
            return res;
        }
        int m = (int) Math.pow(2,n);
        int[][] temp = fill(n-1);
        int[][] res = new int[m][m];
        for (int i=0;i<m/2;i++){
            for (int j=0;j<m/2;j++){
                res[i][j] = 0;
            }
        }
        for (int i=m/2;i<m;i++){
            for (int j=0;j<m/2;j++){
                res[i][j] = temp[i-m/2][j];
            }
        }
        for (int i=0;i<m/2;i++){
            for (int j=m/2;j<m;j++){
                res[i][j]=temp[i][j-m/2];
            }
        }
        for (int i=m/2;i<m;i++){
            for (int j=m/2;j<m;j++){
                res[i][j]=temp[i-m/2][j-m/2];
            }
        }
        return res;

    }
}
