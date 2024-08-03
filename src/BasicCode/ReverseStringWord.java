package BasicCode;

public class ReverseStringWord {

    public static void main(String[] args) {
        printEvenLetterWord("khillan verma lal me trrs");
        String s="khillan verma lal,me,hrai";
        String rev="";
        for(String str: s.split(" ")) {
            for (int j = str.length() - 1; j >= 0; j--) {
                rev +=str.charAt(j);
            }
            rev=rev+" ";

           // System.out.println(" "+rev);
        }
       System.out.println(rev);
    }
    public static void printEvenLetterWord(String s) {
        for (String str : s.split(" ")) {
            if (str.length()%2 == 0) {
                System.out.println(str);
            }
        }
    }

}
