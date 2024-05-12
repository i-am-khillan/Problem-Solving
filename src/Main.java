public class Main {

    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        //int arr[]={2,3,4,5,6,7,8,9};
        int arr[]={9,3,4,8,2,1,6,5};
        System.out.println("Before reversal");
        for(int a:arr){
            System.out.println(a);
        }
        reverseArray(arr,arr.length);
        System.out.println("After reversal");
        for(int a:arr){
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
}