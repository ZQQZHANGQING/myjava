package threadtest;
import java.io.*;
import java.util.*;
public class sr {
    public static void main(String[] args) throws  IOException{
        Scanner sc = new Scanner(System.in);

        ArrayList<String> res = new ArrayList<>();
        String s = "";
        while(sc.hasNext()){
            s = sc.nextLine();
            System.out.println("s= "+s);
            if(s.length()==0){
                break;
            }
            res.add(s);
            s = "";
        }
        score(res);
    }
    public static  void score(ArrayList<String> res){
        Map<String,Integer> hm = new HashMap<>();
        int len = res.size();

        for(int i=0;i<len;i++){
            String[] sTemp = res.get(i).split(" ");
            String[] part = res.get(i).split("-");
            String[] sScore = res.get(i).split(":");
            int[] score = new int[2];
            for(int j=0;j<2;j++){
                score[j] =  Integer.parseInt(sScore[j]);
            }
            if(!hm.containsKey(part[0])){
                hm.put(part[0],0);
            }
            if(!hm.containsKey(part[1])){
                hm.put(part[1],0);
            }
            if(score[0]>score[1]){
                hm.put(part[0],hm.get(part[0])+3);
            }else if(score[0]==score[1]){
                hm.put(part[0],hm.get(part[0])+1);
                hm.put(part[1],hm.get(part[1])+1);
            }else{
                hm.put(part[1],hm.get(part[1])+3);
            }

        }
        Set<String> keySet=hm.keySet();
        ArrayList<int[]> scores = new ArrayList<>();
        for(String ele:keySet){
            scores.add(new int[]{ele.charAt(0)-'a',hm.get(ele)});
        }
        scores.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1]-o1[1];
            }
        });

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<scores.size();i++){
            char c = (char)(scores.get(i)[0]+'a');
            sb.append(c);
            sb.append(" ");
            sb.append(scores.get(i)[1]);
            if(i!=scores.size()-1){
                sb.append(",");
            }
        }
        System.out.println(sb.toString());

    }
}
