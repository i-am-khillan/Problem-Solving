package testPackage;

import java.util.HashMap;
import java.util.Map;

public class OccurranceString {
    public static void main(String[] args) {

        String s="automation";
        //output : a---2, u--1,t--2
        Map<Character,Integer> map=new HashMap<>();
        int count=0;
        for(char a:s.toCharArray()){
            if(map.containsKey(a)){
                 //count++;
                 map.put(a,map.get(a)+1);
            }
            else {
                map.put(a, 1);
            }
        }
        System.out.println(map);
    }
}
