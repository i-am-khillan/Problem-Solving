package leetcode;

public class ReverseStringLeet {
    public static void main(String[] args) {

      String  s = "Let's take LeetCode contest";
        //System.out.println(reverseStringBuilder(s));
        System.out.println(reverseString(s));
    }


    public static String reverseWords(String s) {

        String str[]=s.split(" ");
        String rev="";
        for(int j=0;j<str.length;j++){
            //reverses(str.c);
            if(j!=str.length-1){
                rev=rev+" ";
            }
            System.out.println(rev);
        }
        return rev;
    }
   static String reverses(String str,int left,int right){
        String rev="";
        left=0;
        right=str.length()-1;

        char st[]=  str.toCharArray();
        while(left <=right){
            int tem=st[left];
            left++;
            right++;
        }
       for(int i=str.length()-1;i>=0;i--){
           rev =rev+str.charAt(i);
       }
       return rev;
    }
    static String reverseStringBuilder(String s){

        String str[]=s.split(" ");
        //String rev="";
        StringBuilder rev=new StringBuilder();
        for(int i=0;i<str.length;i++){
            StringBuilder sk=new StringBuilder(str[i]);
            rev.append(sk.reverse());
            if(i<str.length-1){
                rev.append(" ");
            }
        }
        return  rev.toString();
    }
    // Using swap , reverse , concernt:
    static String reverseString(String s){
        char [] arr=s.toCharArray();
        int n=arr.length;
        int start=0;
        for (int i=0;i<n;i++){
            if(i==n || arr[i]==' '){
                capitalizedFirstLetter(arr,start,i);
                reveses(arr,start,i-1);

                start=i+1;
            }
        }
        return new String(arr);
    }
    static void swap(char ch[],int start,int end){
        char temp=ch[start];
        ch[start]=ch[end];
        ch[end]=temp;
    }
   static void reveses(char []ch, int start, int end){
        while (start <end){
            swap(ch,start,end);
            start++;
            end--;
        }
    }
    static void capitalizedFirstLetter(char ch[],int start,int end){
        if(start<=end && Character.isLowerCase(ch[start])){
           ch[start]= Character.toUpperCase(ch[start]);
        }

        }

}