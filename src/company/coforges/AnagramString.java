package company.coforges;

import BasicCode.StringAnaGrams;

public class AnagramString {
    public static void main(String[] args) {
        String s="abba";
        String s1="abbb";
        boolean b= StringAnaGramss(s,s1);
        System.out.println(b);
    }

    private static boolean StringAnaGramss(String s, String s1) {
        int []count=new int[256];

        for(int i=0;i<s.length();i++){
            count[s.charAt(i)]++;
            count[s1.charAt(i)]--;
        }
        for (int i=0;i<count.length;i++){
            if(count[i]!=0){
                return false;
            }
        }
        return true;
    }
}
