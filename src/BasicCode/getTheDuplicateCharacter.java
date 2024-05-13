package BasicCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class getTheDuplicateCharacter {

    public static void main(String[] args) {
    String input="advikSingh";
       //int count= getDuplicateCharacter(input);
      // System.out.println(count);
        duplicateCountMap(input);
    }
    public  static int getDuplicateCharacter(String s){
        int count=0;
        HashSet<Character>  characterSet=new HashSet<>();
        HashSet<Character> duplicateSet=new HashSet<>();
        for(Character c : s.toLowerCase().toCharArray()){
            if(!characterSet.add(c)){
                duplicateSet.add(c);
                count++;
            }
        }

        for(Character ch:duplicateSet){
            System.out.println(ch);
        }
        return count;
    }
    public static void duplicateCountMap(String in){
        Map<Character ,Integer> map=new HashMap<>();

        for(Character ch: in.toCharArray()){
            if(map.containsKey(ch)) {
                map.put(ch,map.get(ch)+1);
            }
            else {
                map.put(ch,1);
            }
        }
        System.out.println(map);


       // return 0;
    }
}
