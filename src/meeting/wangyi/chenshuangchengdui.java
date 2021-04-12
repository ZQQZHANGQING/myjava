package meeting.wangyi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class chenshuangchengdui {


    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        System.out.println(findTheLongestSubstring(next));

    }

    private static int findTheLongestSubstring(String s) {
        Map<Integer, Integer> map = new HashMap<>();

        int state = 0;
        int maxlen = 0;

        // 初始化
        map.put(0, -1);

        // a b c x y z 分别在第123456个bit，来表示出现次数的奇偶性
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') state ^= 0x000001;
            if (s.charAt(i) == 'b') state ^= 0x000010;
            if (s.charAt(i) == 'c') state ^= 0x000100;
            if (s.charAt(i) == 'x') state ^= 0x001000;
            if (s.charAt(i) == 'y') state ^= 0x010000;
            if (s.charAt(i) == 'z') state ^= 0x100000;
            if (map.containsKey(state)) {
                maxlen = Math.max(maxlen, i - map.get(state));
            } else {
                map.put(state, i);
            }
        }
        return maxlen;
    }
}
