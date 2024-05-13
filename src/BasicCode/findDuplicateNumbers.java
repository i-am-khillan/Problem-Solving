package BasicCode;

public class findDuplicateNumbers {
    public static void main(String[] args) {
        //int arr[]={1,3,4,2,2};
        int arr[]={2,5,9,6,9,3,8,9,7,1};
        int duplicate=findDuplicateNum(arr);
        System.out.println((duplicate));
    }
    public static int findDuplicateNum(int nums[]){
        //Declare 2 variable with zero index
                int slow =nums[0]; //
                int fast =nums[0];

                // slow move -- 1 step & fast move --2 steps & colision happened than move slow -- 1 step & fast --1 steps.
                do{
                    slow=nums[slow];
                    fast=nums[nums[fast]];
                }
                while(slow !=fast);
                fast=nums[0];
                while(slow !=fast){
                    slow =nums[slow];
                    fast=nums[fast];
                }
                return slow;

            }
}
