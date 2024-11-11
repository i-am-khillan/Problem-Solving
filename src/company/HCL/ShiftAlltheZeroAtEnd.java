package company.HCL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ShiftAlltheZeroAtEnd {
    public static void main(String[] args) {
        int[] arrs = { 1, 0, 3, 0, 9, 4, 6, 8, 0, 0, 7, 5 };
        Arrays.sort(arrs);

        for(int ni:arrs ){
            System.out.println(ni +" ");
        }
        //List<Integer> item=new ArrayList<>();
       // shiftToZeroEnd(arrs);
//        for(int ni:arrs ){
//            System.out.println(ni +" ");
//        }
        //System.out.println(item);
    }
    public static void shiftToZeroEnd(int arrs[]){
        int j=0;
        for(int i=0;i<arrs.length;i++) {
            if (arrs[i] != 0) {
                arrs[j] = arrs[i];
                j++;
            }
        }
        while (j<arrs.length){
            arrs[j]=0;
            j++;
        }

    }
}
