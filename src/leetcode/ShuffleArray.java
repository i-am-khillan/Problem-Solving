package leetcode;

public class ShuffleArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 4, 3, 2, 1};
        int n = arr.length;
        for (int a : shuffle(arr, n)) {
            System.out.println(a);
        }
    }

    static public int[] shuffle(int[] nums, int n) {
        int arr[] = new int[2 * n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            arr[count] = nums[i];
            arr[count + 1] = nums[i];
            count +=2;
        }
        return  arr;
    }
}

//        int arr[]=new int[2*n];
//        int i=0,j=n;
//        for(int k=0;k<n;k++){
//            arr[i]=nums[k];
//            arr[j]=nums[n];
//            i+=1;
//            j+=1;
//        }
//        return arr;
//    }