package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArrays {
    public static void main(String[] args) {
        int nums1 []= {1,2,2,1};int nums2[] = {2,2};
        int arr[]=intersectionOfArray(nums1,nums2);
        for(int a:arr){
            System.out.println(a);
        }
        int num=1903; //Convert number to String
            String s=String.valueOf(num);
            System.out.println(s);

            String str="19";
           int nums= Integer.valueOf(str);
           System.out.println(nums);
    }
    public static int[] intersectionOfArray(int[] nums1, int[] nums2)
    {
        Set<Integer> set=new HashSet<>();
        Set<Integer> intersection= new HashSet<>();
        // linear TC O(n) and SC (n)
        // Add all the element into hash set one
        for(int a:nums1){
            set.add(a);
        }
        // find the common element in the another set.
        for(int a:nums2){
            if(set.contains(a)){
                intersection.add(a);
            }
        }
        //Convert HashSet into Arrays.
       //////////////Integer arr1[]= intersection.toArray();
        int arr[]=new int[intersection.size()];
        int i=0;
        for(int a:intersection){
            arr[i++]=a;

        }
        return arr;
    }

}

