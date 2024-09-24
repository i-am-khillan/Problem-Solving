package sept2024.sept19_2024;

import java.util.Scanner;

public class AnaGramChecker {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter string to validate: s1 ");
        String s1=s.nextLine();
        System.out.println("enter string to validate :s2");

        String s2=s.nextLine();
       System.out.println(anagramChecker(s1,s2));
    }
    public static boolean anagramChecker(String s1,String s2){

        if(s1.length()!=s2.length())
            return false;
        int[] count =new int[256];
        for (int i=0;i<s1.length();i++){
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for (int i=0;i<count.length;i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
