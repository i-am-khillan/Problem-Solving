package company.publishSapient.SDET16Sec2024;

public class ReArrangeString {

    public static void main(String[] args) {
       String s="khillan";
       String op= reArrangeString(s);
                System.out.println(op);
            String s1="mumbai";
        String op1= reArrangeString(s1);
        System.out.println(op1);

    }

    public  static String reArrangeString(String s){
        StringBuilder sb=new StringBuilder();
        char ch[]=s.toCharArray();
        int left=0;
        int right=s.length()-1;
        while (left<=right){
            sb.append(ch[left++]);
            if(left<=right){
                sb.append(ch[right--]);
            }
        }
       return  sb.toString();
    }
    public static String rearrangeString(String input) {
        int length = input.length();

        // Divide the string into two parts: first half and second half
        String firstPart = input.substring(0, (length+1) / 2);
        String secondPart = input.substring((length+1) / 2);

        // Rearrange by interleaving characters from the two parts
        StringBuilder rearranged = new StringBuilder();
        for (int i = 0; i < secondPart.length(); i++) {
            rearranged.append(secondPart.charAt(i));
            if(i<firstPart.length()) {
                rearranged.append(firstPart.charAt(i));
            }
        }

        // If the string has an odd length, append the remaining character from the second part
        if (secondPart.length() > firstPart.length()) {
            rearranged.append(secondPart.charAt(secondPart.length() - 1));
        }

        return rearranged.toString();
    }
        public static String reAArrangeString(String s) {
            int length = s.length();

            // Divide the string into two parts: first half and second half
            String firstPart = s.substring(0, (length + 1) / 2);  // Include middle character if odd length
            String secondPart = s.substring((length + 1) / 2);

            // Rearrange by interleaving characters from the two parts
            StringBuilder rearranged = new StringBuilder();
            for (int i = 0; i < secondPart.length(); i++) {
                rearranged.append(secondPart.charAt(i));  // Char from the second part
                if (i < firstPart.length()) {
                    rearranged.append(firstPart.charAt(i));  // Char from the first part
                }
            }

            // If firstPart has one extra character (in case of odd-length input), append it
            if (firstPart.length() > secondPart.length()) {
                rearranged.append(firstPart.charAt(firstPart.length() - 1));
            }

            return rearranged.toString();
        }

}
