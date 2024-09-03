package leetcode;

public class StringHalveAreAlike {

    //true;
    /*You are given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.

Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.

Return true if a and b are alike. Otherwise, return false.
    * */
    public static void main(String arg[]) {
        String s = "Uo";//""book";
        boolean ba = stringHalveAlike(s);
        System.out.println(ba);
    }
    public  static boolean stringHalveAlike(String s) {
    String a = "";
    String b = "";

        int mid=s.length()/2;
        a=s.substring(0,mid);
        b=s.substring(mid,s.length());

    int countA = 0;
    int countB = 0;
    for (char ca : a.toCharArray()) {
        if (ca == 'a' || ca == 'e' || ca == 'o' || ca == 'u' || ca == 'i' || ca == 'A' || ca == 'E' || ca == 'O' || ca == 'U' || ca == 'I') {
            countA++;
        }
    }
    for (char ca : b.toCharArray()) {
        if (ca == 'a' || ca == 'e' || ca == 'o' || ca == 'u' || ca == 'i' || ca == 'A' || ca == 'E' || ca == 'O' || ca == 'U' || ca == 'I') {
            countB++;
        }
    }
    if (countA==countB){ return true;}
    else {return false;}

    }
}
