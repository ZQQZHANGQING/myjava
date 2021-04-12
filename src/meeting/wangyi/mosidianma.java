package meeting.wangyi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mosidianma {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str = br.readLine().toCharArray();
        int n = str.length;
        int[] dp = new int[n + 1];
        dp[n] = 1;         // 最后一个字符肯定只能是一种翻译
        // 从后往前遍历字符
        for(int i = n - 1; i >= 0; i--){
            dp[i] = dp[i + 1];     // 单字符码的情况
            if(str[i] == '1'){      // 对于"1"，还有双字符码和三字符码的情况
                if(i + 2 <= n) dp[i] += dp[i + 2];
                if(i + 3 <= n) dp[i] += dp[i + 3];
            }
        }
        System.out.println(dp[0]);
    }
}
