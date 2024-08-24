package leetcode;

public class ParityOrder {

    public static void main(String[] args) {
    int []arr={3,1,2,4};
        /**
         * Input: nums = [3,1,2,4]
         * Output: [2,4,3,1]
         * Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
         */
       int a[]= sortArrayByParity(arr);
        for (int aa:a){
            System.out.println(aa);
        }
    }
   static  public int[] sortArrayByParity(int[] nums) {
        int arr[]=new int[nums.length];
        int start =0;
        int end =arr.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){

                arr[start]=nums[i];
                start++;
            }
            else{
                arr[end-1]=nums[i];
                end--;
            }
        }
        return arr;
    }
}

