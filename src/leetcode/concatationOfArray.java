package leetcode;

public class concatationOfArray {
    public static void main(String[] args) {
        int arr[]={1,2,1};
        int []a=getConcatation(arr);
        for(int aa:a){
            System.out.println(aa);
        }
    }
    public static int[] getConcatation(int []arr){
        int n=arr.length;
        int ans[]=new int[2 * n];
        for(int i=0;i<n;i++){
            ans[i]=ans[i+n]=arr[i];
        }
        return ans;
    }
}
