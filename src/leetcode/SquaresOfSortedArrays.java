package leetcode;
import  java.util.*;
public class SquaresOfSortedArrays {

    public static void main(String[] args) {
        //Input:
        int []nums = {-4,-1,0,3,10};
        //Out0put: [0,1,9,16,100]

        int[]s=sortedSquares(nums);
        for (int aa:s){
            System.out.println(aa);
        }
    }
   static public int[] sortedSquares(int[] nums) {

        int arr[]=new int[nums.length];
        for(int a=0;a<nums.length;a++){
            arr[a] =Math.abs(nums[a]) * Math.abs(nums[a]); // o(n)
        }
        Arrays.sort(arr); // (n logn)
        return arr;
    }
}
