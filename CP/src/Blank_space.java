import java.util.*;
public class Blank_space {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = in.nextInt();
           int c=0,max=0;
            for (int i = 0; i < n; i++) {
                if (a[i] == 0) {
                    c++;
                } else c = 0;
                max = Math.max(max, c);
            }

                    System.out.println(max);
        }
    }
}

