import java.util.*;
public class Goals_of_Victory {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int t= in.nextInt();
        while(t-->0) {
            int n = in.nextInt();
            int[] a = new int[n - 1];
            int s = 0;
            for (int i = 0; i < n - 1; i++) {
                a[i] = in.nextInt();
                s = s + a[i];
            }
            System.out.println(-1 * s);
        }
    }
}
