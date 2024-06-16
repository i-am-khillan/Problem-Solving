package BasicCode;

public class SecondLagest {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        //find the second hightest in the provided arr
        int arr[] = {4,4,4};//{3, 4, 6, 2, 2};//{3,4,6,2,9,6};
        int sec = secondHigest(arr);
        System.out.println(sec);
    }
    public static int secondHigest(int arr[]){
        int max=0;
        int max_sec=0;

        for(int a:arr) {
            if (a > max) {
                max = a;
            }
        }
        for(int a:arr){
            if(a >max_sec && a<max){
                max_sec=a;
            }
            else{
                System.out.println("Element is not found");
            }
        }
        return max_sec;
    }
}
