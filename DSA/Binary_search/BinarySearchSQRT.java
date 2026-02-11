package Binary_search;

public class BinarySearchSQRT {
    public static void main(String[] args) {
           int n=250;
           int p=3;
        System.out.printf("The square root is %.3f", BS_sqrt(n,p));
    }

    private static double BS_sqrt(int n, int p) {
        int start=0, end=n, m;
        double root =0.0;
        while(start<=end) {
            m = (start + end) / 2;
            if (m * m == n) {
                return m;
            } else if (m * m > n) {
                end = m - 1;
            } else {
                start = m + 1;
            }
        }
        root =end;
        double d= 0.1;
        for(int i=0;i<p;i++) {
            while (root * root <= n) {
                root += d;
            }
            root -= d;
            d /= 10;
        }
        return root;

    }
}
