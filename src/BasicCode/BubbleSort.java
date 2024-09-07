package BasicCode;

public class BubbleSort {
    public static void main(String[] args) {

        int []arr={1,4,2,6,8,9};
        int n=arr.length;
       //print
       int bArr[]= bubbleSort(arr);
        System.out.println("Array After Bubble Sort");
        for(int i=0; i < bArr.length; i++){
            System.out.print(bArr[i] + " ");
        }
    }
    static int[] bubbleSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for (int j=1;j<n-i-1;i++){
                if(arr[j]>arr[j+1]){
                    int ia=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=ia;

                }
            }

        }
        return  arr;
    }
}
