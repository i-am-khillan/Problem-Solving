package leetcode;

import  java.util.*;
public class CountConsistentStrings {
    public static void main(String[] args) {
        String allowed = "ab", words[] = {"ad", "bd", "aaab", "baa", "badab"};
        //output 4
        //Input: nums = [1,3], k = 3
        // Output: 0|Input: nums = [1,3], k = 3
        //Output: 0
        int counts = countConsistentStrings(allowed, words);
        System.out.println(counts);

    }

    public static int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        Set<Character> set = new HashSet<>();
        Set<Character> common = new HashSet<>();
        for(int i=0;i<allowed.length();i++){
            set.add(allowed.charAt(i));
            System.out.println(set);
        }
        for (String str : words) {
            for (int i = 0; i < str.length(); i++) {
                if (set.contains(str.charAt(i))) {
                    count++;
                }
            }

        }
        return count;
    }
}
