package automationTest;

import javax.swing.tree.DefaultMutableTreeNode;

public class RevereString {
    public static void main(String[] args) {




        String s="Java is good programming language";
        // out = avaJ si doog gnimmargorp seguagnal
        //
        String rev="";
        String spt[]=s.split(" ");// java ,is good
        for(String word: spt){
         int start=0;
            rev=rev+reverseStringCos(word.toCharArray(),start,word.toCharArray().length-1)+" ";
        }
        System.out.println(rev);
    }
    public static String reverseStringCos(char ch[],int start,int end){
        while (start<end){
            char c=ch[start];
            ch[start]=ch[end];
            ch[end]=c;
            start++;
            end--;
        }
        return new String(ch);
    }

    //class a 3 emthod
    //class b 2 emthod
    //creating object of b calling the method of a
    //class {
    /* class A , m1 ,m2 ,m3
    *
    * class B  m5 , m6
    * */} ;

//A a =new B();
//a.m1();


//}
