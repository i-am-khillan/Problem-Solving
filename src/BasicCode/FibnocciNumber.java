package BasicCode;

import java.util.Scanner;
import  static java.lang.System.*;
public class FibnocciNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        out.println("Enter number to calculate the fibonacci number");

        int term=s.nextInt();
       int fib= fibonacciSeriesRecussive(term);
       // Print fibonacci series :
        for(int i=0;i<term;i++){
            out.println(fibonacciSeriesRecussive(i ));
        }
       out.println(fib);
       int n1=0;
       int n2=1;

      for (int i=0;i<=term;i++){
          out.println(n1);
        int nexTerm=n1+n2;
        n1=n2;
        n2=nexTerm;
          //out.println(nexTerm);
       }
    }
    public static int fibonacciSeriesRecussive(int n){
        //fibonacciSeriesRecussive(n)=fibonacciSeriesRecussive((n-1)+fibonacciSeriesRecussive(n-2));
        if(n<=1){return n;}
        else {
            int a=fibonacciSeriesRecussive(n-1);
            int b=fibonacciSeriesRecussive(n-2);
            int ans=a+b;
            return ans;
        }
       // return ans;
    }
}
