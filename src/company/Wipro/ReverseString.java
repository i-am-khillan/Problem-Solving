package company.Wipro;

public class ReverseString {

    public static void main(String[] args) {
        String s="khillan verma"; // o/p nallihk amrev

        String[] arr=s.split(" ");
        String rev="";
        for(String string:arr){
          rev=rev+reverseStringforWipro(string.toCharArray(),0,string.toCharArray().length-1)+" ";
        }
        System.out.println(rev);
    }
    public static String reverseStringforWipro(char ch[],int start, int end){
        while (start <=end){
            char c=ch[start];
            ch[start]=ch[end];
            ch[end]=c;
            start++;
            end--;
        }
     return new String(ch);
    }
}
