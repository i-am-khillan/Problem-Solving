package company.publishSapient;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicate {
    public static void main(String[] args) {
        String s="khillan";
        System.out.println(removeDuplicateString(s));

        Set<Character> set=new LinkedHashSet<>();
        for(char ch:s.toCharArray()){
            set.add(ch);
        }
        StringBuilder sb=new StringBuilder();
        for(char c: set){
            sb.append(c);
        }
        String st=sb.toString();
        System.out.println(st);
    }
    public static String removeDuplicateString(String s){
        Set<Character> set=new LinkedHashSet<>();
        for(char c: s.toCharArray()){
            set.add(c);
        }
        char c=' ';
      Iterator<Character> itr= set.iterator();
        while(itr.hasNext()){
            c=(char)itr.next();
        }
        return  new String(String.valueOf(c));
    }
}
