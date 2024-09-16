package company.publishSapient;
//import com.sun.org.apache.xpath.internal.operations.String;

import  java.lang.System.*;
import java.util.Arrays;

import static java.lang.System.out;

public class AnaGramString {

    public static void main(String[] args) {
        //String a="aabcb";
       // String b="baa";
        String a="lestins";
        String b="silents";
        out.println(isAnagram(a,b));
        out.println(isAnagram1(a,b));

    }
    public static boolean isAnagram(String s1,String s2){
        int []count=new int[256];
        if(s1.length()!=s2.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for (int i=0;i<count.length;i++){
            if(count[i]!=0){
                return false;
            }

        }
        return  true;
    }
    public static boolean isAnagram1(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        char[] arr1=s1.toCharArray();
        char[] arr2=s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);
    }

}
