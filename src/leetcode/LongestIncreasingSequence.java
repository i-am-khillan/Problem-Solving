package leetcode;

import java.util.Arrays;

public class LongestIncreasingSequence {
    public static void main(String[] args) {

    }
    static int[] longestIncreaseSequence(int arr[]){
        int arr_new[]=new int[2501];
        int x=arr[0];
       // Arrays.sort();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>x){
                x=arr[i];
            }
            arr_new[i]=x;

        }

        return  arr_new;
    }
}
