package java30DaysChallenge31Oct;

public class ReverseString {

    public static void main(String[] args) {
        String s="khillan";

    }
    public char convertStringToChar(String s){
       return ' ';//s.toCharArray();
    }
    public String reverseString(char ch[],int start,int end){
    while (start<end){
        swap(ch,start,end);
        start++;
        end--;
        }
        return new String(ch);
    }
    public void swap(char []ch,int start,int end){
        char ct=ch[start];
        ch[start]=ch[end];
        ch[end]=ct;
    }


}
