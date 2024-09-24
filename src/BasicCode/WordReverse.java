package BasicCode;
import  static java.lang.System.*;
public class WordReverse {
    public static void main(String[] args) {
        String s="Reverse the words in this sentence";
        String rev="";
        String []arr=s.split(" ");
        for (String str:arr){
            rev=rev+reverString(str.toCharArray(),0,str.length()-1)+" ";
        }
        out.println(rev);
    }
    public static String reverString(char [] s,int start,int end){
        while (start<=end){
            swapCharacter(s,start,end);
            start++;
            end--;
        }
        return  new String(s);
    }
    public static void swapCharacter(char arr[],int start,int end){
        char in=arr[start];
        arr[start]=arr[end];
        arr[end]=in;
    }
}
