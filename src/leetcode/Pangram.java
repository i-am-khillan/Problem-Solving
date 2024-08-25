package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pangram {
    public static void main(String[] args) {

        //Input:
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        boolean as=checkIfPangram(sentence);
        System.out.println(as);

    }
        static public boolean checkIfPangram(String sentence) {
            //boolean aa = false;
            char chars;
            List a = new ArrayList();
            Set b = new HashSet();
            for (chars = 'a'; chars < 'z'; chars++) {
                a.add(chars);
            }
            System.out.println(a);

            for (int i = 0; i < sentence.length(); i++) {
                b.add(sentence.charAt(i));
            }
            System.out.println(b);
           return compareTwoLista(a,b);
        }
        static boolean compareTwoLista(List a, Set b){
            if(b.containsAll(a)){
            return true;}
            else return false;

        }
}
