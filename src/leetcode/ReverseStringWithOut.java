package leetcode;

public class ReverseStringWithOut {
    public static void main(String[] args) {

        String str="khillan";
        int start=0;
        int end=str.length();
       String s= reverseString(str.toCharArray(),start,end);
       System.out.println(s);
    }
    public static String reverseString(char ch[],int start, int end){
        while (start <end) {
            swap(ch,start,end);
            start--;
            end++;
        }
        return new String(ch);
    }
    public static void  swap(char []ch,int start,int end){
        char a = ch[start];
        ch[start] = ch[end];
        ch[end] = a;
    }
}
