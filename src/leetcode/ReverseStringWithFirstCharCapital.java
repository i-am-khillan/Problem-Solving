package leetcode;

public class ReverseStringWithFirstCharCapital {
    public static void main(String[] args) {
        String str="khillan verma";
        String s=reverseString(str);
        System.out.println(s);
    }
    static String reverseString(String str){

        String words[]=str.split(" ");
        String rev="";
        for(String word: words){
          rev= reverseStringWord(word);
        }
        return rev;
    }
    static String reverseStringWord(String word){
       String rev=" ";
        for(int i=word.length()-1;i>=0;i++){
           rev=rev + word.charAt(i);
        }
        return rev;
    }
}
