package BasicCode;
import  static  java.lang.System.*;
public class TwoStringRotated {
    public static void main(String[] args) {

        String s="abcd"; String rotated="cabd";
        boolean check=rotationsOfEach(s,rotated);
        out.println(check);
    }
    static boolean rotationsOfEach(String s,String rotatedString){
        if(s==null || rotatedString==null){
            return false;
        } else if(s.length()!=rotatedString.length()) {
            return  false;
        }
        else
        {
            String ConcatedRotatedStrings=s+s;
            return ConcatedRotatedStrings.contains(rotatedString);
        }
    }
}
