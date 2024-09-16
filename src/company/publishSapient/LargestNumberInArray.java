package company.publishSapient;

import java.util.Scanner;
import static java.lang.System.*;

public class LargestNumberInArray {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int input=sc.nextInt();
        int arr[]={10,20,8,9,12,90,67};
         out. println(secondLargest(arr));
    }
    public static int secondLargest(int arr[]){
        int max=Integer.MIN_VALUE;
        int max_second=Integer.MIN_VALUE;
        for(int arrs:arr) {
            if (arrs > max) {
                max_second = max;
                max = arrs;
            } else if (arrs < max && max_second != max) {
                max_second = arrs;
            }
        }
        return max_second;
    }

}
