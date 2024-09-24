package sept2024.sept23_2024;

public class LongestCommonPrefix {
    public static void main(String[] args) {

        String [] str={"flower","flow","flight"};
       String strs= longestCommonPrefix(str);
        System.out.println(strs);
    }
    public  static String longestCommonPrefix(String []arr){
        if(arr==null || arr.length==0){
            return "";
        }
        String prefix=arr[0];
        for (int i=1;i<arr.length;i++){
            while (arr[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }

}
