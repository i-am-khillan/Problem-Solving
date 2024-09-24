package sept2024.sept19_2024;

import java.util.LinkedHashSet;
import java.util.Set;

public class LongestSubstringwithoutRepeatingChar {
    public static void main(String[] args) {
        String s="abcdab";
        String longestStringtill="";
        String longestStringOverall="";
        Set set=new LinkedHashSet();
        for (char ch:s.toCharArray()){

            if(set.contains(ch)){
                longestStringtill="";
                set.clear();;
            }longestStringtill +=ch;
            set.add(ch);
            if(longestStringtill.length()>longestStringOverall.length()){
                longestStringOverall=longestStringtill;
        }
        }
        System.out.println(longestStringOverall);

    }
}
