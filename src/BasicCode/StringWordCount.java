package BasicCode;

import java.util.HashMap;
import java.util.Map;

public class StringWordCount {
    public static void main(String[] args) {
        String s="khillan verma lived in noida";
        String word[]=s.split(" ");
        int count=0;
        for( String w:word){
            count++;
        }
        System.out.println(count);
        int cs=wordCount(s);
        System.out.println(cs);
        int countMap=wordCountMap(s);
        System.out.println(countMap);
    }
    static int wordCount(String s) {

        int count = 0;
        if (s.charAt(0) != ' ') {
            count++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
                count++;
            }
        }
        return count;
    }
     public static int wordCountMap(String s){
         String words[]=s.trim().split(" ");
         Map<String,Integer> map=new HashMap<>();
         for (String word: words) {
                 if(!word.isEmpty()){
                     map.put(word,map.getOrDefault(word,0)+1);
                 }
             }
             return map.size();
     }
}
