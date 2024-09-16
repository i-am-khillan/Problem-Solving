package company.publishSapient;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import  static java.lang.System.*;
public class HigestSecondHigest {
    public static void main(String[] args) {
        int []arr={19,20,20,39,90,102,989};
        int []arr1={19,39,4,3,0,21,989};
        out.println(hiegestElemnt(arr));
        out.println(secondHiegestElemnt(arr));
        commonArraysElment(arr,arr1);

        Map<Character,Integer> map=new HashMap<>();
        map.put('a',10);
        map.put('b',13);
        map.put('d',12);
        map.put('h',19);
        map.put('e',132);

        fetchValuesMap(map);
    }


    //Fetch the values of the map using keys
    public static void fetchValuesMap(Map<Character ,Integer> map){
        for (Map.Entry<Character,Integer> entry:map.entrySet()){
           out.println(entry.getKey()+"--" +entry.getValue());
        }
    }

    public  static void commonArraysElment(int arr[], int arr1[]){

//        Set<Integer> set=new HashSet<>();
//
//        Set<Integer> common=new HashSet<>();
//        for( int a:arr){
//            set.add(a);
//        }
//        for (int b:arr1){
//            if(set.contains(b)){
//                common.add(b);
//            }
//        }
//        out.println(common);

        int arrs[]=new int [arr.length];
        int i=0;
        for(int a: arr){
            for(int b:arr1){
                if(a==b){
                    arrs[i]=a;
                    i++;
                }

            }
        }
        for( int c: arrs){
            if(c!=0) {
                out.println(c);
            }
        }
    }
    public static int hiegestElemnt(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int arrs: arr){
            if(arrs>max){
                max=arrs;
            }
        }
       return max;
    }
    public static int secondHiegestElemnt(int arr[]){
        int max=Integer.MIN_VALUE;
        int sec_max=Integer.MIN_VALUE;
        for(int arrs: arr){
            if(arrs>max){
                sec_max=max;
                max=arrs;
            }
            else if(arrs !=max && sec_max<max){
                sec_max=max;
            }
        }
        return sec_max;
    }
}
