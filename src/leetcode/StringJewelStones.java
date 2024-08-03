package leetcode;
import java.util.*;
public class StringJewelStones {
    public static void main(String[] args) {

        String jewels = "aA", stones = "aAAbbbb";
        //Output: 3
       int count= numJewelsInStones(jewels,stones);
       System.out.println(count);
    }
    public static int numJewelsInStones(String jewels, String stones) {
        int count=0;
        Set set=new HashSet();
        Set stone=new HashSet();
        
        for(int i=0;i<jewels.length();i++){
            char c=jewels.charAt(i);
            set.add(c);
        }

        for(int i=0;i<stones.length();i++){
            char c1= stones.charAt(i);
            if(set.contains(c1)){
                count++;
            }
            else return 0;
        }
        return count;
    }
}
