package automationTest;

import java.util.HashMap;
import java.util.Map;

public class WordCountinGivenString {
    public static void main(String[] args) {
        String s="I love my india";
        int count=countWord(s);
        System.out.println(count);
    }

    public static int countWord(String str){

        Map map=new HashMap<>();
        for(String strs:str.split(" ")){
            map.put(strs," ");
        }

        return map.size();
    }
}
