package company.coforges;

public class ReverseString {

    public static void main(String[] args) {
        String s="khillan";
        int start=0;
        int end=s.length()-1;
        String rev=reverseStringCo(s.toCharArray(),start,end);
        System.out.println(rev);

    }

    private static String reverseStringCo(char[] ch,int start,int end) {
        while (start<=end){
            char c=ch[start];
            ch[start]=ch[end];
            ch[end]=c;

            start++;
            end--;
        }
        return new String(ch);
    }


}
