package leetcode;

public class bubbleSort1 {
    public static void main(String[] args) {
        int arr[]={2,5,3,9,11};
        int n=arr.length;
        for (int aa:arr){
            System.out.println(aa);
        }
        System.out.println("Before sorting the array");
        for(int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int a:arr){
            System.out.println(a);
        }
    }
}
