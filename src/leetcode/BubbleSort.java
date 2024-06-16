package leetcode;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={4,9,2,4,3,8};
        bubbleSort(arr);
        for(int a:arr){
            System.out.println(a);
        }
    }
    private static void bubbleSort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
       // return 1;
    }

}
