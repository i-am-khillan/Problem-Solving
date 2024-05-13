package BasicCode;

public class ReverseArrayElement {

    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        //int arr[]={2,3,4,5,6,7,8,9};
        int arr[]={7,6,5,4,3,9,2,1};
        //System.out.println("Before reversal");
//        for(int a:arr){
//            System.out.println(a);
//        }
       // reverseArray(arr,arr.length);
       int arrs[]= reverseArray2Pointer(arr,arr.length);
        System.out.println("After reversal");
        for(int a:arrs){
            System.out.println(a);
        }
    }
    public static void reverseArray(int arr[],int len){
//  int arr[]={2,3,4,5,6,7,8,9};
        /*
         * Start traversal from start and end
         * */

        for(int i=0;i<len/2;i++){
            // swap(arr[i],arr[len-i-1]);;
            int temp =arr[i];
            arr[i]=arr[len-i-1];
            arr[len-i-1]=temp;
        }
    }
    public  static int[] reverseArray2Pointer(int arr[],int len){
        int left=0;
        int right=len-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left +=1;
            right -=1;
        }
        return arr;
    }
}