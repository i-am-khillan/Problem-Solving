package csesFi;

public class IncreasingArray {
    public static void main(String[] args) {
        int a[]={3,2,5,1,4};
        //
        int count=increasingArray(a);
        System.out.println(count);
    }
    public static int increasingArray(int arr[]){
        int count=0;
       // int i=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                count+=arr[i-1]-arr[i];
                arr[i]=arr[i-1];
            }
            else {

            }
        }
        return count;
    }
    public static void swap(int []ch,int start,int end){
        int c=ch[start];
        ch[start]=ch[end];
        ch[end]=c;

    }
}
