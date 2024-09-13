package company.publishSapient;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.System.out;

public class ReverseWordbyWord {
    public static void main(String[] args) {
        String sk0= "prem";
        String sk00="prem";
        out.println(sk0==sk0);//true
        out.println(sk0.equals(sk00));//true

        String sk2=new String("prem");
        String sk1=new String("prem");
        out.println(sk1==sk2);//true
        out.println(sk1.equals(sk2));//true

        StringBuilder sb1=new StringBuilder(("prem"));
        StringBuilder sb2=new StringBuilder(("prem"));
        out.println(sb1==sb2);//true
        out.println(sb1.equals(sb2));//true

        String in="khillan verma";
        //outPut : verma khillan;
       String reverseWordIndi= reverseWord(in);
       out.println(reverseWordIndi);
       String ss= reverseWordOnly(in);
       out.println(ss);

       String orderSame= reverseWordIndividaulOrdersame(in);
        out.println(orderSame);
        String sb=occurrenceOfCharacter(in);
        out.println(sb);
    }
    public static String reverseWord(String s){
        //Reverse the String each word & indivisually
        //input : khillan verma
        //output; amrev nallihk
        String verWord="";
        for (int i=s.length()-1;i>=0;i--){
            verWord=verWord + s.charAt(i)+"";
        }
        return verWord;
    }
    public  static  String reverseWordOnly(String s){
        // Reverse String the word by word
        // input : khillan verma
        // OutPut : verma khillan
        String [] arr=s.split(" ");
        String word="";
        for(int i=arr.length-1;i>=0;i--){
            word=word+arr[i]+" ";
        }
        return word;
    }

    public  static  String reverseWordIndividaulOrdersame(String s){
        // Reverse String the word by word
        // input : khillan verma
        // OutPut : nallihk amrev

        String [] arr=s.split(" ");
       // char word=' ';
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<arr.length;i++){
            sb.append(new StringBuilder(arr[i]).reverse());
            sb.append(" ");
        }
       // String =;
       // out.println(list);//.get(i).toString();
        return sb.toString().trim();
    }
    public static String  occurrenceOfCharacter(String s){
        //input khillan
        //output:k=1,h=1,i=1,l=2,a=1,n=1
        Map<Character,Integer> map=new HashMap<>();
        for (char ch: s.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else {
                map.put(ch,1);
            }
        }
        String st="";
        for (Map.Entry<Character ,Integer> entry:map.entrySet())
        {
            if(entry.getKey()!=' '){
                 st=st+entry.getKey() +"=="+entry.getValue()+" ";
            }
        }
        return st.trim();
    }
}
