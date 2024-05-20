package leetcode;
import java.util.*;
public class MaxCandies {
    public static void main(String[] args) {
       int arr[]= {2,3,5,1,3};
        kidsWithCandies1(arr, 3);
    }
    // first logic 1
    public static List<Boolean> kidsWithCandies1(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        //Find the maxium of in the given arrays' element
        int max = -1;
        for (int a : candies) {
            if (a > max) {
                max = a;
            }
        }
        for(int i:candies){
            if(i+extraCandies >max){
                list.add(true);
            }
            else list.add(false);
        }
        System.out.println(max);
        return list;
    }
        public List<Boolean> kidsWithCandies ( int[] candies, int extraCandies) {
            List<Boolean> list = new ArrayList<>();
            int max_can = Integer.MIN_VALUE;
            for (int candy : candies) {
                max_can = Math.max(max_can, candy);
            }
            for (int candy : candies) {
                list.add(candy + extraCandies >= max_can);
            }
            return list;
        }
}

