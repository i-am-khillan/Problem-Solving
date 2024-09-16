package company.publishSapient;

import java.util.HashMap;

import java.util.*;

import static java.lang.System.*;

public class DuplicateCharacter {

    public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
        out.println("Enter the text for reverse or occurence ---:");
        String input=sc.nextLine();
        out.println(duplicateCharacter(input));
    // reverse the String
        out.println(reverseStringPublicis(input));
        // Palindrome
        out.println( reverseStringPublicisPalindrom(input));
    }
    public static String duplicateCharacter(String input){
        Map<Character,Integer> map=new HashMap<>();
        String s="";
        int duplicateCount =0;
        for (char ch: input.toCharArray()){
                map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for (Map.Entry<Character,Integer>entry: map.entrySet()){
            if(entry.getValue() >1) {
                 //System.out.println("duplicate character:"+entry.getKey()+"=="+entry.getValue());
                s = entry.getKey() + "==" + entry.getValue();
                duplicateCount++;
            }
            System.out.println(entry.getKey()+"=="+entry.getValue());
        }
        out.println(duplicateCount);
    return s;
    }
    public static String reverseStringPublicis(String s){
        int start=0;
        int end=s.length()-1;
      return  reverseString(s.toCharArray(),start,end);
    }
    public static String reverseString(char ch[],int start,int end){
        while (start<end){
            swap(ch,start,end);
            start++;
            end--;
        }
        return new String(ch);
    }
   public static void swap(char ch[],int start,int end){
        char temp=ch[start];
        ch[start]=ch[end];
        ch[end]=temp;
    }
    public static boolean reverseStringPublicisPalindrom(String s){
        int start=0;
        int end=s.length()-1;
        String org=s;
        out.println("Palindrome number"+org);
        out.println(org);
        String rev= reverseString(s.toCharArray(),start,end);
        out.println(rev);
        if(org.equals(rev))return true;
        else return false;
    }


}
