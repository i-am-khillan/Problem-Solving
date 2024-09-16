package csesFi;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {

    Scanner s= new Scanner(System.in);
    System.out.println("enter number n ");
    int n=s.nextInt();
    int expectedSum=n* (n+1) /2;

    int sum=0;
        for(int i=0;i<n-1;i++){
            sum+=s.nextInt();
        }
     int missingNum=expectedSum-sum;
        System.out.println(missingNum);
    }

}
