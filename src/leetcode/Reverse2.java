package leetcode;

//import static leetcode;

public class Reverse2 {
    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 4;
        System.out.println(reverseStr(s, k));
        int ab='a';
        System.out.println(ab);
    }

    public static String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int n = s.length();

        for (int i = 0; i < n; i += 2 * k) {
            // Reverse the first k characters in the current block
            int start = i;
            int end = Math.min(i + k - 1, n - 1);
            while (start < end) {
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        return new String(arr);
    }

}
