package BasicCode;

import java.util.Arrays;
import java.util.Comparator;

import static java.lang.System.out;

public class SortGoogle3 {
    public static void main(String[] args) {
        Integer [] num={9,81,17,56,28,98};
        Arrays.sort(num, new Comparator<Integer>(){
            public int compare(Integer a,Integer b){
            String s1= a.toString() +b.toString();
            String s2=b.toString()+a.toString();
            return s2.compareTo(s1);
            }
        });
// if largest number is 0 than 0;
        if(num[0]==0){
            out.println("0");
            return;
        }
        StringBuilder sb=new StringBuilder();
        for (int nums: num){
            sb.append(nums);
        }
        out.println(sb.toString());
    }
}
