package JavaLatestFeatures;

public class ReverseWords {
    public static void main(String[] args) {


        String word = "khillan verma is great person in the word";

        String str=reverseWord(word);
        System.out.println(str);
    }
   static String reverseWord(String word){
      String words[]=  word.split(" ");

      int left=0,right=words.length-1;
      while (left <=right){
          String temp=words[left];
          words[left]=words[right];
          words[right]=temp;

          left++;
          right--;
      }
      String ans=String.join(" ",words);
    return  ans;
    }
    static String reverseWord(String word,int right,int left){
       char ch[]= word.toCharArray();
        while (left <=right){
            char temp= ch[left];
            ch[left]=ch[right];
            ch[right]=temp;

            right--;
            left++;
        }
        String  ans=String.join(" ",word);
        return ans;
    }
}
