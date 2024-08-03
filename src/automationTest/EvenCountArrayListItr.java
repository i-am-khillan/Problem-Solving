package automationTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class EvenCountArrayListItr {
    public static void main(String[] args) {

        ArrayList<Integer> al=new ArrayList<>();
        int num=0;
        for(int i=1;i<10;i++){
            al.add(i);
        }
      System.out.println(al);
       Iterator i= al.iterator();
        while (i.hasNext()){
            Integer  count=(Integer) i.next();
            if(count %2==0){
                num++;
            }
        }
        System.out.println(num);
    }
    public static void evenCount(){};
}
