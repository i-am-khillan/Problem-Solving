package BasicCode;

import java.util.LinkedHashSet;
import java.util.Set;

public class LongestSubStringNotRepeat {
    public static void main(String[] args) {

        String s="abcdab";
        //output abcd
        Set<Character> set=new LinkedHashSet<>();
        String longestSubtillNow="";
        String longestSubstringOverall="";
        for(char c: s.toCharArray()){
            if(set.contains(c)){
                longestSubtillNow="";
                set.clear();
            }longestSubtillNow +=c;
            set.add(c);
            if(longestSubtillNow.length()>longestSubstringOverall.length()){
                longestSubstringOverall=longestSubtillNow;
            }
        }
        System.out.println(longestSubstringOverall);

    }
}
