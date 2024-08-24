package leetcode;

public class ArrayMaxMIn {
    public static void main(String[] args) {
       int nums []= {2,5,6,9,10};
       int min= minArray(nums);
       System.out.println(min);

        int max=maxArray(nums);
        System.out.println(max);
    }
    static int minArray(int []nums){
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        return min;
    }
   static int maxArray(int []nums){
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        return max;
    }
}
