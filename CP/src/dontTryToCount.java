import java.util.*;
public class dontTryToCount {

    static boolean check(String s, String x) {

        if (x.length() < s.length()) {
            return false;
        }

        for (int i = 0; i <= x.length() - s.length(); i++) { // n - m + 1
            // Check if the substring of x starting at i with length of s is equal to s
            if (x.substring(i, i + s.length()).equals(s)) { // m
                return true; // s is a substring of x
            }
        }
        return false; // s is not a substring of x
    } // O(n*m)

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); // Number of test cases
        while (t-- > 0) {
            int n = in.nextInt(); // Length of string x
            int m = in.nextInt(); // Length of string s
            String x = in.next(); // String x
            String s = in.next(); // String s
            // inputs

            // Create strings representing x after 0 to 5 operations
            String x0 = x; // 0 operations
            String x1 = x0 + x0; // 1 operation
            String x2 = x1 + x1; // 2 operations
            String x3 = x2 + x2; // 3 operations
            String x4 = x3 + x3; // 4 operations
            String x5 = x4 + x4; // 5 operations

            int ans = -1; // Initialize answer as -1 (not possible)
            // Check if s is a substring of x after 0 to 5 operations
            if (check(s, x0))
                ans = 0;
            else if (check(s, x1))
                ans = 1;
            else if (check(s, x2))
                ans = 2;
            else if (check(s, x3))
                ans = 3;
            else if (check(s, x4))
                ans = 4;
            else if (check(s, x5))
                ans = 5;
            System.out.println(ans); // Output the minimum number of operations
        }
    }
}

/*
Time Complexity (TC): O(2^5*n*m) = O(32*n*m)
Space Complexity (SC): O(2^5*n) = O(32*n)
*/