package BasicCode;

import java.util.Stack;

public class ParathesisStringBalanaced {
    public static void main(String[] args) {

        String s="{}";//"{{{(([}))}}}}";

        boolean b=parathesisBalance(s);
        System.out.println(b);
    }
    public static Boolean parathesisBalance(String s){
        Stack stack=new Stack();
        for(char ch:s.toCharArray()){
            if (ch == '(' || ch == '[' || ch =='{') {
                stack.push(ch);
            }
            else {
                if(stack.isEmpty()) {return false;}
                char top =(char) stack.pop();
                if((ch==')' && top!='(') ||(ch==')' && top!='(') ||(ch==')' && top!='('))
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
