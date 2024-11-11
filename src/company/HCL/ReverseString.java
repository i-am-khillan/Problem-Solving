package company.HCL;

public class ReverseString {
    public static void main(String[] args) {

       System.out.println(reverseWords("my name khillan"));

        String s="khillan";
        System.out.println(reverseStringHcl(s.toCharArray(),0,s.toCharArray().length-1));
    }
    public static String reverseStringHcl(char[] ch,int start,int end){
        //char ch[]=s.toCharArray();

        while (start <end){
            char c=ch[start];
            ch[start]=ch[end];
            ch[end]=c;

            start++;
            end--;
        }
        return new String(ch);
    }
    public static String reverseWords(String s){
        //my name khillan op//ym emna like this
        //Approach 1
//        String rev="";
//       String arr[]= s.split(" ");
//       for (String str:arr){
//           rev=rev+ reverseStringHcl(str.toCharArray(),0,str.length()-1)+" ";
//       }
//       return rev;
        //Approach 2

        StringBuilder sb=new StringBuilder();
       String rev= sb.append(new StringBuilder(s).reverse().append(" ")).toString();
        return rev;
    }
}
