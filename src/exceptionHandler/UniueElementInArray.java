package exceptionHandler;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniueElementInArray {

    public static boolean uniqueElemnt(int arr[]){
        List<Integer> ls=new ArrayList<>();
       // ls.stream().
        Set<Integer> set=new HashSet<>();
        for (int ars:arr) {
            if (!set.add(ars)) {
                return false;
            }
        }
        return  true;
    }

    public static void main(String[] args) {

        int arr[]={1,3,4,5,7,9};
        int arr1[]={1,9,9,3,1,9};
        boolean a=uniqueElemnt(arr);
        boolean a1=uniqueElemnt(arr1);

        System.out.println("unique element in java :"+a);
        System.out.println("duplicate elemntt :"+a1);
    }
}
