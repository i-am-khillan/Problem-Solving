package BasicCode;

public class LongestSubstrWithoutRepeatingChar {
    public static void main(String[] args) {
        String s=   "khillan";
        int count=longestSubStrWithOutRepeatingCharacter(s);
        System.out.println(count);
    }
    public static int longestSubStrWithOutRepeatingCharacter(String s){

        //two Pointers
        int left=0;int right=0;
        int res=0;
        int chars[]=new int[128];//counts
        while (right<s.length()){
            char r=s.charAt(right);
            chars[r]++;
            while (chars[r]>1){
                char l=s.charAt(left);
                chars[l]--;
                left++;
            }
            res=Math.max(res,right-left+1);
            right++;
        }

        return res;
    }
}
