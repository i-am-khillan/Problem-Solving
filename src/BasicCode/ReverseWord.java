package BasicCode;

public class ReverseWord {  

    public static void main(String[] args) {
        String rev=reverseWord("my name khillan verma");
        System.out.println(rev);
    }
    public static String reverseWord(String are){
        String rev="";
        String arr[]=are.split(" ");
        for(int i=arr.length-1;i>=0;i--){
            rev=rev+arr[i]+" ";
        }
        return rev;
    }
}
