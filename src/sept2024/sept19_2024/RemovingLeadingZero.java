package sept2024.sept19_2024;

public class RemovingLeadingZero {
    public static void main(String[] args) {
        //int num=;
         String s="000012340  ";
       // String s=new String(String.00012340)
        System.out.println(s);
        int i=0;
        int n=s.length();
        while(i<n && s.charAt(i)=='0'){
            i++;
        }
        String nonZero=s.substring(i).trim();
        String spaceZero=s.substring(s.trim().length());
       String spaceZero1=  s.substring(s.trim().length());
        String str=nonZero + spaceZero+spaceZero1;
        System.out.println(str);
        String strs="khillan123";
       String stss= strs.replaceAll("[^0-9]","");
       System.out.println(stss);
    }
}
