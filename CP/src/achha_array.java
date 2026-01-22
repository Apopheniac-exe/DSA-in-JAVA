import java.util.*;
public class achha_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int[] a = new int[n];
            int c1 = 0, c2 = 0;
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
                if (a[i] == -1) c1++;
                else c2++;
            }
            int flip = 0;
           while(c2<c1 || c1%2!=0) {
               flip++;
               c2++;
               c1--;
           }
            System.out.println(flip);
        }
    }
}

