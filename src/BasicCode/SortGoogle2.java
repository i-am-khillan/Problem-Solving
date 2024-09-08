package BasicCode;

import java.util.Arrays;
import java.util.Comparator;

import static java.lang.System.out;

public class SortGoogle2 {
    public static void main(String[] args) {
        String s="I am khillan and working as software development engineer in test";
        String str[]=s.split(" ");
        Arrays.sort(str,Comparator.comparingInt(String::length));
        String result=String.join(" ",str);
        out.println(result);
    }
}
