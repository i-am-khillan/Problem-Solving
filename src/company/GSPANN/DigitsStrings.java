package company.GSPANN;

public class DigitsStrings {
    public static void main(String[] args) {
        //Approach 1
        String s="67890oiuj7890hgfhjk";
        String digits=s.replaceAll("[^\\d]","");
        System.out.println(digits);//only digit
// Approach 2
        String digit=s.replaceAll("[^0-9]","");
        System.out.println(digit);//only digit


        String ss="67890oiuj7890hgfhjk";
        String characters=ss.replaceAll("[\\d]","");
        System.out.println(characters);//only alphabetes

        String sas="67890oiuj7890hgfhjk";
        String character=sas.replaceAll("[0-9]","");
        System.out.println(character);// only alphabets


        String ssSpecial="67890oiu#@*j7890h!gfhjk";
        String charScp=ssSpecial.replaceAll("[a-z0-9A-Z]","");
        System.out.println(charScp);//only spacial character

        //[^a-zA-Z0-9]
    }
}
