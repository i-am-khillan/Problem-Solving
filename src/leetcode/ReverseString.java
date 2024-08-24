package leetcode;

public class ReverseString {

        public static void main(String[] args) {
            String s = "khillan verma";
            System.out.println(reverseWords(s));
        }

        static String reverseWords(String s) {
            char[] arr = s.toCharArray();
            int n = arr.length;
            int start = 0;

            // Traverse the array to capitalize the first letter of each word and reverse the word
            for (int i = 0; i <= n; i++) {
                if (i == n || arr[i] == ' ') {
                    capitalizeFirstLetter(arr, start, i - 1);  // Capitalize the first letter of the word
                    reverse(arr, start + 1, i - 1);  // Reverse the rest of the word after capitalizing the first letter
                    start = i + 1;  // Move to the start of the next word
                }
            }

            return new String(arr);
        }

        // Helper method to swap characters in the array
        static void swap(char[] ch, int start, int end) {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
        }

        // Helper method to reverse the characters of a word (except the first character)
        static void reverse(char[] ch, int start, int end) {
            while (start < end) {
                swap(ch, start, end);
                start++;
                end--;
            }
        }

        // Helper method to capitalize the first letter of a word
        static void capitalizeFirstLetter(char[] ch, int start, int end) {
            if (start <= end && Character.isLowerCase(ch[start])) {
                ch[start] = Character.toUpperCase(ch[start]);
            }
        }
    }
