package leetcode;

import java.util.*;

public class StringMapOccurrence {
    public static void main(String[] args) {

        String s="khillan verma";
        Map<Character,Integer> map=stringMapOccurrenance(s);
        System.out.println(map);
//        List<Integer> list=new ArrayList<>();
//        for(int i=0;i<8;i++){
//            list.add(i);
//        }
        //System.out.println(list);
       int count= elementAccount();
       System.out.println(count);
    }
    public static Map<Character,Integer> stringMapOccurrenance(String s){

        String []arr=s.split(" ");
        Map<Character,Integer> map=new HashMap<>();

        for(String word:arr){
            for(int i=0;i<word.length();i++){
                char ch=word.charAt(i);
                if(map.containsKey(ch)){
                    map.put(ch,map.get(ch)+1);
                }
                else {
                    map.put(ch,1);
                }
            }
        }
        return map;
    }
    public static int elementAccount(){
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(9);
        list.add(10);
        list.add(8);
        list.add(19);
        Iterator<Integer> itr=list.iterator();
        int count=0;
        while(itr.hasNext()){
            int i=itr.next();
            count++;
           // System.out.println(i);
        }
        return count;
    }
}
