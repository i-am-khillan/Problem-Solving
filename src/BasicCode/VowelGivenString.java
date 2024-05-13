package BasicCode;

public class VowelGivenString {
    public static void main(String[] args) {

        String s="khillan";
        int vowelCount=getVowel(s,s.length());
        System.out.println("Vowel Count :"+vowelCount);
    }

    public static int getVowel(String arr, int len){
        int count=0;
        for(char i=0;i<len-1;i++){

            char c=arr.toLowerCase().charAt(i);
            if(c=='a' || c=='e' ||c=='i'||c=='u'||c=='o'){
                System.out.println(c);
                count++;
            }
            else {

               // System.out.println("Consonent character  "+c);

            }
        }
        return count;
    }
}
