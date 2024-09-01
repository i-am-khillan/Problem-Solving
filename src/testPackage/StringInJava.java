package testPackage;

import static java.lang.System.*;
public class StringInJava {
    public static void main(String[] args) {
//Case 1
//        String s=new String("khillan"); // Not changeable behavior called immutability in java.
//        s.concat("verma");
//        out.println(s);
//
//        StringBuilder sb=new StringBuilder("khillan");
//        sb.append("verma");
//        out.println(sb);
////Case 2
//        String s1=new String("khillan");
//        String s2=new String("khillan");
//        out.println(s1==s2); //false reference comparision -== OR object equals methods
//        out.println(s1.equals(s2));//String equals method maint for contents comparasion
//
//        StringBuilder sb1=new StringBuilder("khillan");
//        StringBuilder sb2=new StringBuilder("khillan");
//        out.println(sb1==sb2);//false reference comparision -== OR object equals methods
//        out.println(sb1.equals(sb2));//false reference comparision -== OR object equals methodd
////Case 3
//        String s3=new String("khillan");

        StringBuilder sbr=new StringBuilder();
        sbr.append("khillan").append("verma").append("software").insert(2,"xyz").reverse().delete(2,10);
        out.println(sbr);
    }
}
