package BasicCode;

public class SecondHigestUnorderElement {
    public static void main(String[] args) {
        int arr[]={10,20,45,90,192,23,91};
        int max=Integer.MIN_VALUE;
        int max_Second=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max_Second=max;
                max=arr[i];
            }
            else if(arr[i]>max_Second && arr[i]!=max){
                max_Second=arr[i];
            }
        }
    System.out.println(max_Second);
    }
}
