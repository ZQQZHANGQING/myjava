package meeting.bianlifeng;

import java.util.Scanner;

public class zijishuixianhua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int m = sc.nextInt();
            int n = sc.nextInt();
            if(m>=100 && n<=999 && m<=n){
                int j=0;
                for(int i=m;i<=n;i++){
                    int bai = i/100;
                    int shi = (i%100)/10;
                    int ge = i%10;
                    if(i==bai*bai*bai+shi*shi*shi+ge*ge*ge){
                        j = j+1;
                        if(j>1){
                            System.out.print(" "+i);
                        }else{
                            System.out.print(i);
                        }
                    }
                }
                if(j==0) System.out.print("no");
            }
        }
    }
}
