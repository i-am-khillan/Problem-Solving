package company.Wipro;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        for (int i=0;i<=10;i++){
            list.add(i);
        }
        int count=0;
      Iterator<Integer> itr= list.iterator();
        while (itr.hasNext()){
            if(itr.next() %2!=0){
                count++;
                System.out.println(itr.next());
            }
        }

        System.out.println(count);
    }
}
