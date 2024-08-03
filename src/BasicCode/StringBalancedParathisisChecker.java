package BasicCode;

import java.util.Stack;

public class StringBalancedParathisisChecker {

    public static void main(String[] args) {

        String s="";//"{}[]({[";


        Stack<Character> stk=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            //For push the element if stack is empty
            if(stk.empty()){
                stk.push(ch);
            } // For opening bracket push in to the stack
                else if (ch=='(' || ch=='[' ||ch=='{') {
                stk.push(ch);
            } else if ((ch==')' && stk.peek()=='(')||(ch==']' && stk.peek()=='[')||(ch=='}' && stk.peek()=='{')) {
                stk.pop();
            }
        }
        if(stk.empty())
        {
            System.out.println("String is balanced");
        }else {
            System.out.println("String is not balanced");
        }

    }
}
