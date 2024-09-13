package company.publishSapient;

//import java.util.Map;

public class ArrayManipulation {
    public static void main(String[] args) {
        int [] arr={19,20,30,31,49,50};

        int max= maxArray(arr);
        System.out.println("Min Second element of Array :"+max);

        int maxSecond= maxSecondArray(arr);
        System.out.println("maxSecond element of Array :"+maxSecond);

        int min=minArray(arr);
        System.out.println("Min Second element of Array :"+min);

        int minSecond= minSecondArray(arr);
        System.out.println("Min Second element of Array :"+minSecond);

    }
    public static int maxArray(int[] arr){
        int max=Integer.MIN_VALUE;
        for (int ss:arr){
            if(ss > max){
                max=ss;
            }
        }
        return max;
    }
    public static int minArray(int[] arr){
        int min=Integer.MAX_VALUE;
        for (int ss:arr){
            if(ss < min){
                min=ss;
            }
        }
        return min;
    }
    public static int maxSecondArray(int[] arr){
        int max=Integer.MIN_VALUE;
        int maxSecond=Integer.MIN_VALUE;
        if(arr.length<2){
            return Integer.MIN_VALUE;
        }
        for (int ss:arr){
            if(ss > max){
                maxSecond=max;
                max=ss;
            }
            else if (max !=maxSecond && ss<max){
                maxSecond=ss;
            }
        }
        return maxSecond;
    }
    public static int minSecondArray(int[] arr){
        int min=Integer.MAX_VALUE;
        int secondMin=Integer.MAX_VALUE;
        if(arr.length<2){
            return Integer.MAX_VALUE;
        }
        for (int ar:arr) {
            if (ar < min) {
                secondMin=min;
                min = ar;
            }
            else if (ar < secondMin && ar > min) {
                secondMin = ar;
            }
        }
        return secondMin;
    }
}
