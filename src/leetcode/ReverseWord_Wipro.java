package leetcode;

import java.time.temporal.ChronoField;

public class ReverseWord_Wipro {
    public static void main(String[] args) {
        //System.out.println("Try programiz.pro");

        String s="khillan verma";
        int start=0;
        int end=s.length();
        String sp=reverseStringWords(s);
        System.out.println(sp);

    }
    static String reverseStringWords(String s){
        String rev="";
String cap="";
String str[]=s.split(" ");
        for(int i=str.length-1;i>=0;i--){
            String word=str[i];
            int start =0; int end=word.toCharArray().length;
            cap=capitalizedFirstLetter(word.toCharArray(),start,end);
            rev=rev+reverse(cap.toCharArray(),start,end-1)+" ";

        }
        return rev;
    }
    static String reverse(char []ch,int start, int end){
        while(start<=end){
            swap(ch,start,end);
            start++;
            end--;
        }
        return new String(ch);
    }
    static void swap(char[] ch,int start,int end){
        char a=ch[start];
        ch[start]=ch[end];
        ch[end]=a;
    }
    static String capitalizedFirstLetter(char []ch,int start,int end){

        if(start <=end && Character.isLetter(ch[start])){
            ch[start]= Character.toUpperCase(ch[start]);
        }
        if(start <=end && Character.isLetter(ch[end-1])){
            ch[end-1]= Character.toUpperCase(ch[end-1]);
        }


        return new String(ch);
    }
}
