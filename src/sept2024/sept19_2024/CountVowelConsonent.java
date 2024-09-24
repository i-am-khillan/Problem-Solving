package sept2024.sept19_2024;

import static java.lang.System.*;
public class CountVowelConsonent {
    public static void main(String[] args) {
        String s="khilalnan";
        int v=0;
        int c=0;
        for (char ch:s.toCharArray()){
            if((ch=='a' || ch=='A') ||
                    (ch=='i'|| ch=='I') ||
                    (ch=='o'|| ch=='O') ||
                    (ch=='e'|| ch=='E')||
                    (ch=='u' || ch=='U')){
                v++;
            }
            else c++;
        }
        out.println(v +"----- "+c);
    }
}
