package hw;

import java.util.HashMap;
import java.util.Scanner;

public class scannertest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        String str;
        do{
             str = sc.nextLine();
             if(str.length()>0){

            char s1 = str.charAt(0);
            int num1 = Integer.parseInt(str.substring(4,5));
            char s2 = str.charAt(2);
            int num2 = Integer.parseInt(str.substring(6,7));
            if(num1>num2){
                if(map.containsKey(s1)){
                    map.put(s1,map.get(s1)+3);
                }else{
                    map.put(s1,3);
                }
                if(map.containsKey(s2)){
                    map.put(s1,map.get(s2));
                }else{
                    map.put(s2,0);
                }

            }else if(num1==num2){
                if(map.containsKey(s1)){
                    map.put(s1,map.get(s1)+1);
                }else{
                    map.put(s1,1);
                }
                if(map.containsKey(s2)){
                    map.put(s1,map.get(s2)+1);
                }else{
                    map.put(s2,1);
                }
            }else{
                if(map.containsKey(s1)){
                    map.put(s1,map.get(s1));
                }else{
                    map.put(s1,0);
                }
                if(map.containsKey(s2)){
                    map.put(s1,map.get(s2)+3);
                }else{
                    map.put(s2,3);
                }
            }
             }

        }while(str.length()!=0);

        /*for(Character i:map.keySet()){
            System.out.println(i+" "+map.get(i));
        }*/

        int max = -1;
        char index = ' ';
        while(!map.isEmpty()){


            for(Character i:map.keySet()){
                if(map.get(i)>max){
                    max = map.get(i);
                    index = i;
                }
            }
            if(map.size()==1){
                System.out.print(index + " "+max);
            }else{
                System.out.print(index + " "+max+",");

            }
            map.remove(index);
            index = ' ';
            max = -1;

        }
    }
}
