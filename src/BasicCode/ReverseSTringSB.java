package BasicCode;
import  static java.lang.System.*;
public class ReverseSTringSB {

    public static void main(String[] args) {
        String s="khillan";
        StringBuilder stringBuilder=new StringBuilder();
       String rev= stringBuilder.append(s).reverse().toString();
       out.println(rev);
    }
}
