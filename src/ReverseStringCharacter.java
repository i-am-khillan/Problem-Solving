public class ReverseStringCharacter {

    public static void main(String[] args) {

        String s="khillan";
        char arr[]=s.toCharArray();
        char arrs[]=reverseStringCharacter(arr,arr.length);
        for(char c: arrs){
            System.out.println(c);
        }
    }
    public static char[] reverseStringCharacter(char []arr,int len){
       //char arr[]=s.toCharArray();
        for(int i=0;i<len/2;i++){
            char temp=arr[i];
            arr[i]=arr[len-i-1];
            arr[len-i-1]=temp;
        }
        return arr;
    }
}
