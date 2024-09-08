package BasicCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import static java.lang.System.*;
public class SortGoogle {
    public static void main(String[] args) {
      List<String> words=Arrays.asList("apple", "maple", "ample", "google", "sample", "fast", "last", "berry", "cherry", "marry");

        Collections.sort(words, new Comparator<String>(){
            public int compare(String s1,String s2){
             return new StringBuilder(s1).reverse().toString().compareTo(new StringBuilder(s2).reverse().toString());
            }
        });
        out.println(words);
    }
}
