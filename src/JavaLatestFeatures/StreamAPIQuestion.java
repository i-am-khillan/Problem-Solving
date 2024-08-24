package JavaLatestFeatures;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class StreamAPIQuestion {
    public static void main(String[] args) {
        Date d=new Date();
        System.out.println(d.toString());
        SimpleDateFormat txt=new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(txt.format(d));
        SimpleDateFormat txt1=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        System.out.println(txt1.format(d));
        System.out.println(txt.format(d));

        Addable as=(int a,int b)-> (a*b);
        System.out.println(as.add(10,12));
        // return key words in expression
        Addable aa=(int a,int b)-> {return a+b;};
        System.out.println(aa.add(10,12));

        //for each loop in lamda Expression
        List list=new ArrayList();
        list.add("khiillan");
        list.add("Pres");
        list.add("bhawana");
        list.add("shivani");

        list.forEach( (n)->System.out.println(n));
    }
}
