package company.nagarro;

import company.publishSapient.InputOperations;

import java.util.Iterator;
import java.util.LinkedList;

public class Child extends Parent{
//    Parent display(int i){
//        System.out.println("child");
//        return null;
//    }

void printList1(LinkedList<Integer> r){
    for (int i=0;i<r.size();i++){
        System.out.println(r.get(i));
    }
    System.out.println("List1");
}
    void printList2(LinkedList<Integer> r){

        Iterator iterator=r.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("List2");
    }
    void printList3(LinkedList<Integer> r){
        for (Integer i:r){
            System.out.println(i);
        }
        System.out.println("List3");
    }


    public static void main(String... args) {
        Child ch=new  Child();
        LinkedList s=new LinkedList();
        s.add(1);
        s.add(3);
        s.add(4);
        s.add(7);

        ch.printList3(s);
        ch.printList1(s);
        ch.printList2(s);
    }
}
