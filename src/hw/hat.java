package hw;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,Integer> map = new HashMap<>();
        String book = "";
        do{
             book = sc.nextLine();
          //  int count = sc.nextInt();
            map.put(book,1111);
        }while(book.length()!=0);
        for (Map.Entry<String,Integer> ele:map.entrySet()){
          //  System.out.println(ele.getKey()+" ");
          //  System.out.println(ele.getValue());
        }
        for(Integer value:map.values()){
            System.out.println(value);
        }


    }
}
