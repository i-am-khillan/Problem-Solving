package BasicCode;



public class partitionFunctions {
    public static void main(String[] args) {
        int arr[]={0,4,0,1,0,2};
        int low=0;int high=arr.length-1;
       int ar[]= partitionfun(arr,low,high);
       for (int a:ar){
           System.out.println(a);
       }
    }

    private static int[] partitionfun(int[] arr, int low, int high) {

        int i=low-1;
        for(int a=low;a<high;a++){
            if(arr[a] !=0){
                i +=1;
                int temp=arr[a];
                arr[a]=arr[i];
                arr[i]=temp;
            }
            int temp=arr[i+1];
            arr[i+1]=arr[high];
            arr[high]=temp;
        }
        return arr;

    }
}
