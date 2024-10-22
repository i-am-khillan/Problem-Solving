package BasicCode;

public class ReverseStringPairs {

    public static void main(String[] args) {
String s="khillan";
int k=2;
        String res=reverseMethod(s,k);
        System.out.println(res);
    }
    public  static  String reverseMethod(String s, int k){
        String result="";
        int n=s.length()%k +s.length()/k;
        for(int i=0;i<=n+1 ;i=i+k){
            String sub=s.substring(i,i+k);
            sub = new StringBuilder(sub).reverse().toString();
            result=result+sub;
        }
        if(result.length() !=s.length()){
            String temp=s.substring(n+k);
            result=result+temp;
        }
        return result;
    }

}
