package company.publishSapient;

public class SecondHigestArray {
    public static void main(String[] args) {
        int [] arr={10,20,4,3,1,9};
        int ss=secondHigest(arr);
        System.out.println(ss);
    }
    public static int secondHigest(int []nums){
        int first=Integer.MIN_VALUE;

        int second=Integer.MIN_VALUE;
        for(int num : nums){
            if(num>first){

                second=first;
                first=num;
            }
            else if(num >second && num!=first){
                second =num;
            }
        }
        return second;
    }
}
