package company.HCL;

public class PalindromString {
    public static void main(String[] args) {

       // String s="madam";
        String s="ada";

        if(palindromString(s)){
            System.out.println("String is Palindrom String");
        }
        else {
            System.out.println("String is not PalindromString");
        }

    }
    public static boolean palindromString(String input){
        int start=0;
        int end=input.length()-1;
        while (start<end){
           if(input.charAt(start)!=input.charAt(end)){
               return false;
           }
            start++;
            end--;
        }
        return true;
    }
}
