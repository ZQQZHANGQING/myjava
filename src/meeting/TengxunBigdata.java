package meeting;

import java.math.BigInteger;

public class TengxunBigdata {
    public static void main(String[] args) {
        String str1 = "111111119111111111";
        String str2 = "12";
        System.out.println(new TengxunBigdata().add(str1, str2));
        System.out.println(new BigInteger(str1).add(new BigInteger(str2)));

        String str3 = "999928";
        String str4 = "72";
        System.out.println(new TengxunBigdata().add(str3, str4));
        System.out.println(new BigInteger(str3).add(new BigInteger(str4)));

    }
    public String add(String str1, String str2) {
        // 一个字符串为空 直接返回另外一个
        if (str1 == null || "".equals(str1)) {
            return str2;
        }
        if (str2 == null || "".equals(str2)) {
            return str1;
        }

        StringBuilder sb = new StringBuilder();

        // 字符串都不为空时
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        int idx1 = arr1.length - 1;
        int idx2 = arr2.length - 1;

        // 缓存是否需要进位
        boolean carry = false;
        // 遍历两个字符串 处理元素相加
        while (idx1>=0 && idx2 >=0) {
            char cur1 = arr1[idx1];
            char cur2 = arr2[idx2];
            // 相加
            int sum = cur1 - '0' + cur2 - '0';
            // 上一次运算是否有进位
            sum = carry ? sum+1: sum;
            // 是否需要进位
            carry = sum >= 10 ? true : false;
            // 相加结果 取个位数->字符类型
            sb.append((char)((sum%10) + '0'));
            // 索引递减
            idx1--;
            idx2--;
        }

        // 处理剩余的元素
        while (carry || idx1 >= 0 || idx2 >= 0) {
            if (idx1 >= 0) {
                // 当前元素处理
                int sum = arr1[idx1] - '0' + (carry ? 1 : 0);
                // 下次是否需要进位
                carry = sum >= 10 ? true : false;
                // 添加到结果
                sb.append((char)((sum%10) + '0'));
                idx1--;
            } else if (idx2 >= 0) {
                // 当前元素处理
                int sum = arr2[idx2] - '0' + (carry ? 1 : 0);
                // 下次是否需要进位
                carry = sum >= 10 ? true : false;
                // 添加到结果
                sb.append((char)((sum%10) + '0'));
                idx2--;
            } else {
                sb.append('1');
                carry = false;
            }
        }

        // 反转sb 后返回
        return sb.reverse().toString();
    }

}
