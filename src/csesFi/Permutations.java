package csesFi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import  static  java.lang.System.*;
public class Permutations {

    public static void main(String[] args) {

        //int n=5;
        Scanner s=new Scanner(in);
        out.println("Please enter the number for beautiful permutation");
        int n=s.nextInt();
        if(n==3 || n==2) {
            out.println("No Solution");
        }
        else {
            List<Integer> list=new ArrayList<>();

            for (int i=2;i<=n;i+=2){
                list.add(i);
            }
            for (int i=1;i<=n;i+=2){
                list.add(i);
            }
            for (int i: list){
                out.println(i);
            }
        }
    }
}
