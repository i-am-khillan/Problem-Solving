package leetcode;
import java.util.*;

import  static java.lang.System.*;
public class FrequencySort {
    public static void main(String[] args) {
       String s ="raaeaedere";// "tree";
        //op: eert ,    "eeeeaaarrd"
       String ss= reverseStringFre(s.toCharArray(),0,s.length()-1);
     out.println(ss);
      Map<Character,Integer>map=  occurranceOfCharacter(s);
      out.println(map);
        sortCharArrayBaseOfFrequency(s);
    }
        public static String sortCharArrayBaseOfFrequency(String s){
            Map<Character,Integer> map=new HashMap<>();
            for(char c:s.toCharArray()){
                map.put(c,map.getOrDefault(c,0)+1);
            }
            List<Map.Entry<Character,Integer>> listchar= new ArrayList<>(map.entrySet());
            listchar.sort(Map.Entry.comparingByValue());
            StringBuilder sb=new StringBuilder();
            for(int i=listchar.size()-1;i>0;i--) {
                Map.Entry<Character, Integer> entry = listchar.get(i);
                char c = entry.getKey();
                int frenquency = entry.getValue();
                for (int j = 0; j < frenquency; j++) {
                    sb.append(c);
                }
            }
            return sb.toString();
        }
   public static String charOccurrence(String s){
            String text = "khillan";

            // Create an array of size 256 to store the count of each character
            int[] charCount = new int[256];

            // Convert the string to a char array and iterate through it
            for (char c : text.toCharArray()) {
                // Increment the count of the character at the corresponding index
                charCount[c]++;
            }
            Character chars[]=new Character[256];
            for(int i=0;i<256;i++){
                chars[i]=(char)(i);
            }

            Arrays.sort(chars,(a,b)->charCount[a]-charCount[b]);
            String rev="";
            // Display the occurrences of each character
            for (int i = 0; i < charCount.length; i++) {
                if (charCount[chars[i]] > 0) {
                   // System.out.println("Character '" + (char) i + "' occurs " + charCount[i] + " times.");
                 //  rev= reverseStringFre(String.valueOf((char)i).toCharArray(),0,charCount.length-1);
                }
            }
            return rev;
        }

    public static Map<Character,Integer> occurranceOfCharacter(String s){
        Map<Character,Integer> map =new HashMap<>();
        for(char ch:s.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else {
                map.put(ch,1);
            }
        }
       /* int a=0;Map.Entry<Character,Integer> entry=null;
        for( entry:map.entrySet()){
           // entry.getKey();
             a=entry.getValue();
            out.println(entry.getKey().charValue());
        }
        if(entry.getValue() >a){
            a=entry.getValue();
        }*/
        int max=0;
        /*for(int i=0;i<map.size();i++){
           if( max >map.get(i).intValue()){
              max= map.get(i).intValue();
               out.println(max);
           }
        }*/

return map;
    }
    public static String reverseStringFre(char[]ch,int start,int end){
        while (end>=start){
            swap(ch, start,end);
            start++;
            end --;
        }
      return  new String(ch);
    }
    public  static void swap(char[]ch ,int start,int end){
        char a=ch[start];
        ch[start]=ch[end];
        ch[end]=a;
    }

}
