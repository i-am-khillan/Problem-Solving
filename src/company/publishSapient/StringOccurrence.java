package company.publishSapient;

import sun.rmi.transport.proxy.CGIHandler;

import java.util.*;

public class StringOccurrence {
    public static void main(String[] args) {
        String s="KhillanVermaProgrammming";
        occurrenceString(s);

        removeDuplicateCharacter(s);
    }
    public  static void removeDuplicateCharacter(String s){
        Set<Character> set=new LinkedHashSet<>();
        for(char ch: s.toCharArray()){
               set.add(ch);
        }
        StringBuilder sb=new StringBuilder();
        for (char ch: set){
            sb.append(ch);
        }
        String sStr=sb.toString();

        System.out.println(sStr);
    }
    public static void occurrenceString(String s){

        Map<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else {
                map.put(ch,1);
            }
        }
        for (Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue() >1){
                System.out.println(entry.getKey()+"==="+entry.getValue());
            }
        }
    }
}
