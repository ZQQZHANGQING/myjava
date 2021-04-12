package meeting;

import java.util.HashSet;
import java.util.Set;

public class MeetingTest {
    //abac  输出所有的回文子串
    public static void main(String[] args) {
        String str = "abac";
        //用于存放字符
        Set<String> hashSet = new HashSet<>();
        char[] chars = str.toCharArray();
        for(int i=0;i<chars.length;i++){
            for (int j=chars.length-1;j>=i;j--){
                if(ishuiwen(chars,i,j)){
                    String ans = str.substring(i,j+1);
                    if(!hashSet.contains(ans)){
                        hashSet.add(ans);
                        System.out.println(ans);
                    }

                }
            }
        }
    }
    public static boolean ishuiwen(char[] arr,int i,int j){
        while (i<j){
            if (arr[i]!=arr[j]){
                return  false;
            }
            i++;
            j--;
        }
        return  true;
    }
}
