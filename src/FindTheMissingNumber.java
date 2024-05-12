public class FindTheMissingNumber {
    public static void main(String[] args) {
        int arr[]={1,3,2,5};// if element don't have zero
       int missingNum= missNumberInArray(arr,arr.length);
       System.out.println(missingNum);
    }
    public static int missNumberInArray(int []arr,int n){
        int sum=0;int i;
        sum= (n+1) *(n+2) /2;
    for( i=0;i<n; i++){
            //sum = sum+ i;
            sum -=arr[i];
        }
        return sum;
    }
}
