public class SortsTheElement0s1s2s {
    public static void main(String[] args) {
        int arr[]={0,0,1,1,1,0,2,1,2,2,0};
        int a[]=sortColors(arr);
        for(int aa:a){
            System.out.println(aa);
        }
    }

    // Sorts the 0s , 1s , 2s the order without using inbuilt fuction.s
    public static int[] sortColors(int[] nums) {
        int low =0;
        int mid=0;
        int high=nums.length-1;
        int temp;
        while(mid<=high){
            switch(nums[mid]){

                case 0:{
                    temp=nums[mid];
                    nums[mid]=nums[low];
                    nums[low]=temp;
                    low++;
                    mid++;
                    break;
                }
                case 1:{
                    mid++;
                    break;
                }
                case 2: {
                    temp=nums[mid];
                    nums[mid]=nums[high];
                    nums[high]=temp;
                    high--;
                    break;
                }
            }
        }
        return nums;
    }

}
