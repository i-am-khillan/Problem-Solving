package leetcode;

import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
    String s= "{}";//"[][][]()]{" ;//"(){}[]"; //()[]{}
    boolean valid=validParan(s);
    System.out.println(valid);
    }
    public static boolean validParan(String s){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            if(isOpening(curr)){
                st.push(curr);
            }
            else {
                if(st.empty()) return  false;
                else if (!isMatching(st.peek(),curr)){
                    return  false;
                }
                else st.pop();
            }
        }
        return st.empty();
    }

    private static boolean isMatching(char peek, char curr) {

        return  peek=='(' && curr==')' ||peek=='[' && curr==']' || peek=='{' && curr=='}';
    }

    private static boolean isOpening(char c) {
        return  c=='(' || c=='[' ||c=='{';
    }
}
