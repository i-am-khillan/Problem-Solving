package sept2024.sept19_2024;
import java.util.LinkedHashSet;
import java.util.Set;

import static java.lang.System.*;
public class RemoveDuplicate {
    public static void main(String[] args) {
        String s="khillan";

        Set<Character> set=new LinkedHashSet<>();
        StringBuilder sb=new StringBuilder();
        for (char ch:s.toCharArray()){
            if(!set.contains(ch)){
                set.add(ch);
                sb.append(ch);
            }
        }
        out.println(sb);
    }
}
