package leetcode;

import java.util.HashMap;
import java.util.Map;

public class FindReplaceString {
    public static void main(String[] args) {

        Map<Character,Character> map1=new HashMap<>();
        Map<Character,Character> map2=new HashMap<>();

      String  words[] = {"abc","deq","mee","aqq","dkd","ccc"};
      String pattern = "abb";
       // Output: ["mee","aqq"]
        for(int i=0;i<words.length;i++){
            for (int j=0;j<words[i].length();j++){
                map1.get(pattern.charAt(j));
            }
        }


    }
}
