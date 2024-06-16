package leetcode;

public class StringShuffle {

    public static void main(String[] args) {
        String s = "RockLife";
        int indices[] = {4, 5, 6, 7, 0, 2, 1, 3};
        String suffleStrings = suffleString(s,indices);
        System.out.println(suffleStrings);
    }
    private static String suffleString(String s,int indices[]) {

        char arr[]=new char[s.length()];
        String can="";
        for(int i=0;i<s.length();i++){
            arr[indices[i]]=s.charAt(i);
        }
        for(char ss:arr) {
            can=can+ss+"";
        }
        return can;
        //return ch;
    }
}
