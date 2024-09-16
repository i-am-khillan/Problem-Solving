package csesFi;

import java.util.*;

import static java.lang.System.*;
public class LongestRepetitiveLength {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        out.println("Enter the string to calculate the longest repetitive  length");
        String str=s.next();
        longestRepetitiveLeng(str);

    }
    public static int longestRepetitiveLeng(String s){
        int count=0;
        Map<Character,Integer>map=new HashMap<>();

        for(char ch:s.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else {
                map.put(ch,1);
            }
        }
        int max=0;
        for (Map.Entry<Character,Integer>entry:map.entrySet()){
            count= entry.getValue();
            if(count>max){
                max=count;
                out.println(entry.getKey()+" --"+entry.getValue());
            }
        }
        out.println(max);
        return max;
    }

}
