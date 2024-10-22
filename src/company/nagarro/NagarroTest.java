package company.nagarro;

import java.io.FilterOutputStream;

public class NagarroTest {
     void display(Object o){
        System.out.println("object");
    }
     void display(String str){
        System.out.println("String");
    }
    public static void main(String[] args) {
        new NagarroTest().display(null);


//        String s1="XYZ";
//        String s2="INDIA";
//        String s3=s1+s2;
//        String s4="XYZINDIA";
//System.out.println(s3==s4);
//

//        int a=0;
//        NagarroTest test=new NagarroTest();
//        for(int j=0;j<2;j++){
//            for (int i=0;i<4;i++){
//                a=j;
//            }
//            System.out.println(a);
//        }
//
//
//        float f0[]=new float[5];
//        Object object=f0;
//        System.out.println(f0[0]);
//
//
//        boolean f1=false;
//        boolean f2=false;
//        boolean f=f2 !=f1;
//        if(f==!f2){
//            System.out.println("true");
//        }
//        else {
//            System.out.println("false");
//        }
    }
}
