package sept2024.sept19_2024;

public class OnlySingleDigit {
    public static void main(String[] args) {
        String s="a";
       boolean is= isNumeric(s);
       System.out.println(is);
        for(char ch: s.toCharArray()){
            if(Character.isDigit(ch)){
                System.out.println("single digit");
               // return ;
            }else {
                System.out.println("Not single digit");
            }
        }
    }
    public static  boolean isNumeric(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
