package BasicCode;

public class MissingNumberWithZero {
    public static void main(String[] args) {

        int arr[]={3,0,1};//input have zero.
        int miss=missingNumber(arr);
        System.out.println(miss);
    }
        public static int missingNumber(int[] nums) {
            int sum=0;int i;int n=nums.length;
            sum= (n) *(n+1)/2;
            for(i=0;i<n;i++){
                sum -= nums[i];
            }
            return sum;
        }

}
