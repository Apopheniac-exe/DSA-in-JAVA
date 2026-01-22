import java.util.Scanner;

public class ForbiddenInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Read the number of test cases
        while (t-- > 0) {
            long n = scanner.nextLong(); // Read the value of n
            long k = scanner.nextLong(); // Read the value of k
            long x = scanner.nextLong(); // Read the value of x

            // Check if x is not equal to 1
            if (x != 1) {
                System.out.println("YES"); // Output YES since we can form n using 1s
                System.out.println(n); // The number of integers used is n
                for (int i = 1; i <= n; i++) {
                    System.out.print(1 + " "); // Output n number of 1s
                }
                System.out.println();
            } else {
                // If x is 1, check if k is 1 or if k is 2 and n is odd
                if (k == 1 || (k == 2 && n % 2 == 1)) {
                    System.out.println("NO"); // Output NO since it's not possible to form n
                } else {
                    System.out.println("YES"); // Output YES since it's possible to form n
                    if (n % 2 == 0) {
                        System.out.println(n / 2); // Output the number of integers used
                        for (int i = 1; i <= n / 2; i++) {
                            System.out.print(2 + " "); // Output n/2 number of 2s
                        }
                        System.out.println();
                    } else {
                        System.out.println((n - 3) / 2 + 1); // Output the number of integers used
                        for (int i = 1; i <= (n - 3) / 2; i++) {
                            System.out.print(2 + " "); // Output (n-3)/2 number of 2s
                        }
                        System.out.println(3); // Output a 3 to make the sum n
                    }
                }
            }
        }
        scanner.close();
    }

    // Time Complexity (TC): O(n) = O(100)
    // Space Complexity (SC): O(1)
}