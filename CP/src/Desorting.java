import java.util.*;
public class Desorting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            boolean flag = true;
            for (int i = 0; i < n - 1; i++) {
                if (a[i] > a[i + 1]) {
                    System.out.println(0);
                    flag = false;
                    break;
                }
            }
            if (flag) {
                int mdif = Integer.MAX_VALUE;
                int index = 0;
                for (int i = 0; i < n - 1; i++) {
                    int dif = a[i + 1] - a[i];
                    if (dif < mdif) {
                        mdif = dif;
                        index = i;
                    }
                }
                int op = (mdif/2)+1;
                System.out.println(op);
            }
        }
    }
}