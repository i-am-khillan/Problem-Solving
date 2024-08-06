package automationTest;

public class QuickSortCode {

    public static void main(String[] args) {
String s=new String();
        int arr[]={90,1,2,5,3,8,10};
        int high=arr.length-1;
        int low=0;
       int arrs[]= quicksort(arr,low,high);
       for (int arr1:arrs){
           System.out.println(arr1);
       }
    }
    public  static int[] quicksort(int arr[],int low ,int high){

        if(low<high){
            int pindex=partion(arr,low,high);
            quicksort(arr,low,pindex-1);
            quicksort(arr,pindex+1,high);
        }
        return arr;
    }
    public static int partion(int arr[],int low,int high){
        int i=0,j=0;
        int pindex=arr[high];
        low=i-1;
        for (j=low;j<high;j++){
            if(arr[j]<pindex){
                i +=1;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return  i+1;
    }
}
