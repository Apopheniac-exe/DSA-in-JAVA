import java.util.*;
public class Parity_adjacent_element {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = in.nextLong();
            int c = 0;
            boolean parity;
            for (int i = 0; i < n - 1; i++) {
                if (a[i] % 2 == a[i + 1] % 2)
                    c++;
            }
            System.out.println(c);


        }

    }
}

