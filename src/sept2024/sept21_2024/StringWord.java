package sept2024.sept21_2024;

public class StringWord {
    public static void main(String[] args) {
        String s="khillan verma";
        String arr[]=s.split(" ");
        String rev="";
        for (int i=arr.length-1;i>=0;i--){
            rev=rev+arr[i];
        }
        System.out.println(rev);
    }
}
