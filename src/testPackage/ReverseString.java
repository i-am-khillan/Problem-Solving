package testPackage;

public class ReverseString {
    public static void main(String[] args) {
        String s="automation";
        //reverse the string .
        String ss=reverseString(s.toCharArray(),0, s.length()-1);
        System.out.println(ss);
    }
    public  static String reverseString(char [] s,int start , int end){
        while (start <=end){
            char tem=s[start];
            s[start]=s[end];
            s[end]=tem;
            start++;
            end--;
        }
        return new String(s);
    }
}
