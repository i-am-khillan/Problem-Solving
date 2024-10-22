package company.coforges;

public class FibnocciSeries {

        // Method to find Fibonacci number using recursion
        public static int fibonacci(int n) {
            // Base cases: if n is 0 or 1
            if (n == 0) {
                return 0;
            }
            if (n == 1) {
                return 1;
            }

            // Recursive case: Sum of previous two Fibonacci numbers
            return fibonacci(n - 1) + fibonacci(n - 2);
        }

        public static void main(String[] args) {
            int n = 10; // Find the first 10 Fibonacci numbers

            System.out.println("Fibonacci Series up to " + n + " terms:");
            for (int i = 0; i < n; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        }
    }