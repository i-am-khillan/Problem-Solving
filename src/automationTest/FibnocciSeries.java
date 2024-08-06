package automationTest;

public class FibnocciSeries {

    public static void main(String[] args) {
        int arr[]=new int[5];
        int n1 = 0, n2 = 1;
        int n = 5;
        int sum=0;
        if(n1==0 || n2==1){
            arr[0]=n1;
            arr[1]=n2;
        }
        for(int i=2;i<5;i++) {
            arr[i]=n1;

            sum=n1+n2;
            arr[i]=sum;
            n1=n2;
            n2=sum;
        }
        for(int a:arr){
            System.out.println(a);
        }
    }
}
