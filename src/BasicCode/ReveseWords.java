package BasicCode;

public class ReveseWords {
    public static void main(String[] args) {

        String s="khillan verma";
        //output amrev nallihk
        String []arr=s.split(" ");
        String res="";
//        for(int i=arr.length-1;i>=0;i--) {
//            String word=arr[i];
        String word="khillan";
             char [] arrs=word.toCharArray();
        int start=0;
        int end=arrs.length;
            for(int j=0;j<=end;j++){
                if(j==end || arrs[j]==' ') {
                    res =revserWords(arrs, start+1, j-1);
                    start=j+1;
                }
            }
        System.out.println(res);

    }
    static String revserWords (char [] arr,int start,int end){
        while (start <=end){
            swap(arr,start,end);
            start++;
            end++;
        }
       return new String(arr);
    }
    static void swap(char [] arr,int start,int end){
        char a=arr[start];
        arr[start]=arr[end];
        arr[end]=a;
    }
}
