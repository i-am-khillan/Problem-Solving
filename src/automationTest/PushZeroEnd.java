package automationTest;

public class PushZeroEnd {
    public static void main(String[] args) {
        int arr[]={9,2,9,0,1,4,0};
        int high=arr.length-1;
        int low=0;
        int a[]=partion(arr,low,high);
        for(int aa:a){
            System.out.println(aa);
        }
    }
    public static int [] partion(int arr[],int low ,int high){
        int i=0,j=0;
        i =low-1;
        for(j=low;j<high;j++){
            if(arr[j] !=0) {
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        int temp1=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp1;
    return  arr;
    }
}
