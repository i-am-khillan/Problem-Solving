package leetcode;

import java.util.*;
import java.util.HashSet;

public class WordCounts {
    public static void main(String[] args) {
        String s="khillan";
        int count=wordCount(s);
        System.out.println(count);
       Map map= characterCountOccurence(s);
       System.out.println(map);
    }
    static int wordCount(String s){
        int count=0;
        String []str=s.split(" ");
        for(String ss:str){
            count++;
        }
     return count;
    }
    static Map<Character,Integer> characterCountOccurence(String s){
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else {
                map.put(ch,1);
            }
        }
        return  map;
    }

}
