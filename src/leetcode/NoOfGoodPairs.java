package leetcode;

import java.util.HashMap;
import java.util.Map;

public class NoOfGoodPairs {
    //https://leetcode.com/problems/number-of-good-pairs/

    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
       // int nums[] = {1,1,1,1};
        int counts=numIdenticalPairsBF(nums);
        System.out.println(counts);
        int num=numIdenticalPairs(nums);
        System.out.println(num);
    }
    public static int numIdenticalPairsBF(int []nums){
    int count =0;
    for(int i=0;i<nums.length;i++) {
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] == nums[j]&& i<j)
                count++;
        }
    }
    return count;

    }

        public static int numIdenticalPairs(int []nums){
        Map<Integer,Integer> map=new HashMap<>();

        int count=0;
      for (int num:nums) {
          int nic=map.getOrDefault(num,0);
          count +=nic;
          map.put(num,nic+1);
      }
    return count;
    }
}
