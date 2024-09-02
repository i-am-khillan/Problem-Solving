package leetcode;

public class SplitStringIsBalance {
    public static void main(String[] args) {

        String  s = "RLRRLLRLRL";
        int count=splitStringIsBalance(s);
        System.out.println(count);
        int l=0;int ans=0;
        for(char c : s.toCharArray()){
            if(c=='L'){
                l++;
            }
            else{
                l--;
            }
            if(l==0 )ans++;
        }
        System.out.println(ans);
    }
    public static int splitStringIsBalance(String s){
        int a=0,res=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R'){
                a=a+1;
            }
            if(s.charAt(i)=='L'){
                a=a-1;
            }
            if(a==0) res=res+1;
        }
        return res;
    }
}
