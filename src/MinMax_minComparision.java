public class MinMax_minComparision {
    public static void main(String[] args) {
    int arr[]={2,6,9,3,5,8,1};
        minimumMax(arr,arr.length);
    }
    // find the min & max element from an Array using less numbers of comparisions.
    public static void minimumMax(int arr[],int n) {

        int i=0, min=0, max=0;
        if (n % 2 == 0) {// if array element is even
            if (arr[0] > arr[1]) {
                max = arr[0];
                min = arr[1];

            }
            else {
                max = arr[1];
                min = arr[0];
            }
            i=2;
        } else {// if array element is old
            min = arr[0];
            min = arr[0];
            i = 1;
        }
        while(i<n-1){
            if(arr[i] > arr[i+1]){
                if(arr[i]>max) max=arr[i];
                if(arr[i+1]<min) min=arr[i+1];
            }
            else{
                if(arr[i+1]>max) max=arr[i+1];
                if(arr[i]<min) min=arr[i];
            }
            i +=2;
        }
        System.out.println("---Max :"+max);
        System.out.println("---min :"+min);
    }

}


