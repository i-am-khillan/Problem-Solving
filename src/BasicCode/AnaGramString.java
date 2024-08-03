package BasicCode;

public class AnaGramString {
    public static void main(String[] args) {
        boolean s=isAnagram("aaa","baa");
        System.out.println(s);
    }

    private static boolean isAnagram(String aab, String baa) {
        int count []=new int[256];
        for (int i=0;i<aab.length();i++){
            (count[aab.charAt(i)])++;
            (count[baa.charAt(i)])--;
        }
        for (int i=0;i<count.length;i++){
            if(count[i]!=0)return false;
        }
        return true;
    }
}
