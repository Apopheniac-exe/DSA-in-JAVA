import java.util.*;
public class twin_permutation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            int[] copy_a = Arrays.copyOf(a, n);
            Arrays.sort(copy_a);
            int mid = n / 2;
            int s;
            if (n % 2 != 0)
                s = copy_a[mid] * 2;
            else s = copy_a[mid] + copy_a[mid - 1];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (a[i] + a[j] == s) {
                        System.out.print(a[j] + " ");
                        break;
                    }
                }
            }
            System.out.println();
        }
    }
}
