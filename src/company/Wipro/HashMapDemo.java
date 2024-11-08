package company.Wipro;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
      //  Given String String =”khillan verma is lived in noida”; get find the word count using hashMap

        Map<String ,Integer> map=new HashMap<>();
        String s="khillan verma is lived in noida";
        String arr[]=s.split(" ");
        for(String ar:arr){
            if(map.containsKey(ar)){
            map.put(ar, map.get(ar)+1);
            }
            else {
                map.put(ar,1);
            }
        }
        System.out.println(map);
        //Charactor counts
           System.out.println(characterCount(s));
    }
    public static Map<Character,Integer> characterCount(String s){
        Map<Character ,Integer> map=new HashMap<>();
        //String arr[]=s.split(" ");
            for(char ch:s.toCharArray()){
                if(map.containsKey(ch)){
                    map.put(ch, map.get(ch)+1);
                }
                else {
                    map.put(ch,1);
                }
            }
            for(Map.Entry<Character,Integer> entry:map.entrySet()){
                if(entry.getValue()!=1 || entry.getKey()==' '){
                   // System.out.println(entry.getKey() +"=="+entry.getValue());
                    map.put(entry.getKey(),entry.getValue());
            }
        }
        //System.out.println(map);
    return map;
    }
}
