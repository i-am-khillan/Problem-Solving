package leetcode;

public class PalindromicStringArray {

    public static void main(String[] args) {
    //
       String words []= {"abc","car","ada","racecar","cool"};
       boolean flag=false;

       for (String word:words){
           int start=0;
           int end=word.length()-1;
           String org=word;
           String rev=reverseString(word.toCharArray(),start,end);
           if(org.equals(rev)){
               flag=true;
               break;
           }

       }

       if(flag){
           System.out.println("Provided String is palindromic String");
       }

       /* step 1 - reverse the given String  step 2
       * */
    }

    static String reverseString(char ch[],int start, int end){
        while (start <=end){
            swap(ch,start,end);
            start++;
            end--;
        }
       return  new String(ch);
    }
    static void swap(char ch[] ,int start,int end){
        char tem=ch[start];
        ch[start]=ch[end];
        ch[end]=tem;
    }

}
