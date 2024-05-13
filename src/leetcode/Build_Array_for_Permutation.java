package leetcode;

public class Build_Array_for_Permutation {


    public static void main(String[] args) {
        int arr[] = //{5, 0, 1, 2, 3, 4};
        {0,2,1,5,3,4};
        int[]ss=buildArray(arr);
        for (int a : ss) {
            System.out.println(a);

        }
    }
    public static int[] buildArray(int nums[]){
        int []arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[nums[i]];
        }
        return arr;
    }
}