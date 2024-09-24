package sept2024.sept19_2024;

import static java.lang.System.*;
public class CheckStringPalindrome {
    public static void main(String[] args) {
        String s1="aba";
        String org=s1;

        String rev=new StringBuilder(s1).reverse().toString();
        if(org.equals(rev)){
            out.println("String is palidrome");
        }
        else {
            out.println("String is not a palindrom");
        }
    }
}
