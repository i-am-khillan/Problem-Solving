package leetcode;

import java.util.Stack;

public class LongestValidParentheses {
    public static void main(String[] args) {
    String ss=")())";
       int count =longestValidParen(ss);
        System.out.println(count);
    }
    public static int longestValidParen(String s){
        Stack<Integer> st=new Stack<>();
        st.push(-1);
        int ans=0;
        for(int i=0;i<s.length();i++) {
            if (s.charAt(i)=='('){
                st.push(i);
            }
            else {
                st.pop();
                if(st.empty()){ st.push(i);}
                else{
                    ans= Math.max(ans,i-st.peek());
                }
            }

        }
        return ans;
    }
}
