package leetcode;

public class ReversePreFixOfWord {
    public static void main(String[] args) {
       String word = "abcdefd";char ch = 'd';
       System.out.println(reversePrefix(word,ch));
    }
    public static String reversePrefix(String word, char ch) {
        int index= word.indexOf(ch);
        char ch2[]=new char [word.length()];
        for(int i=0;i<=index;i++)
        {
            ch2[i]= word.charAt(index-i);
        }
        for(int i=index+1;i<word.length();i++)
        {
            ch2[i]= word.charAt(i);
        }
        return new String(ch2);

    }
}
