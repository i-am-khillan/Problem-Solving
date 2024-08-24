package automationTest;

import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter the word");
        String str=s.nextLine();
        int count=0;
       // String str=" i a khillan a";
        boolean isword=false;

        //String sArray[]=str.split(" ");
        int lens=str.length();
        for(int i=0;i<lens;i++){
//            if((str.charAt(i)==' ') && (str.charAt(i+1)!=' ')){
//                count++;
//            }
            if(str.charAt(i)!=' '){
                if(!isword){
                    count++;
                    isword=true;
                }
            }
            else {
                isword=false;
            }
        }
        System.out.println(count);
        int counts=countWordString(str);
        System.out.println(counts);
    }
    public  static int countWordString(String s){
        int le=s.length();
        int count=0;
        if(s.charAt(0)!=' '){
            count++;
        }
        for(int i=0;i<le;i++){
            if(s.charAt(i)==' ' && s.charAt(i+1)!=' '){
                count++;
            }
        }
        return count;
    }
}
