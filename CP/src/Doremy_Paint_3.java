import java.util.*;
public class Doremy_Paint_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }

            int[] distinct = new int[2];
            distinct[0] = a[0];
            int c = 1;
            boolean flag = false;
            int c1 = 1, c2 = 0;

            for (int i = 1; i < a.length; i++) {
                if (c == 1 && distinct[0] != a[i]) {
                    distinct[1] = a[i];
                    c++;
                } else if (c == 2 && a[i] != distinct[0] && a[i] != distinct[1]) {
                    c++;
                } else if (a[i] == distinct[0]) {
                    c1++;
                } else if (c >= 2 && a[i] == distinct[1]) {
                    c2++;
                }
            }

            if (c <= 2)
                flag = true;

            if (flag) {
                if ((c1 == 1 && c2 == 1) || (c1 == 1 && c2 == 0))
                    System.out.println("YES");
                else if ((c1 % 2 == 0 && c2 % 2 == 0) ||
                        (c1 % 2 == 0 && c2 % 2 != 0) ||
                        (c2 % 2 == 0 && c1 % 2 != 0))
                    System.out.println("YES");
                else
                    System.out.println("NO");
            } else
                System.out.println("NO");
        }
    }
}
