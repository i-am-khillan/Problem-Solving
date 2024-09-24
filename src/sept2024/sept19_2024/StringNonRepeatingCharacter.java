package sept2024.sept19_2024;

import java.util.LinkedHashMap;
import java.util.Map;

import  static  java.lang.System.*;
public class StringNonRepeatingCharacter {
    //How do you find the first non-repeating character in a String?
    public static void main(String[] args) {
        String s="khillan";
        Map<Character,Integer> map=new LinkedHashMap<>();
        for (char ch: s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer>entry:map.entrySet()){
            if(entry.getValue()==1){
                out.println(entry.getKey());
            }
        }
    }
}
