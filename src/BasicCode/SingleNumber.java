package BasicCode;

import java.util.HashSet;

public class SingleNumber {
    public static void main(String[] args) {
 int arr[]={2,2,1};
  int singleNum=singleNumber(arr);
  System.out.println((singleNum));
    }
    public static int singleNumber(int[] arr){
        int ans=0;
        for( int num: arr){
            ans ^= num;
        }
        return ans;
    }
}
