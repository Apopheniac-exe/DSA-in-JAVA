import java.util.*;
public class Halloumi_Boxes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int j=0;j<t;j++) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            int[] Copy_a = Arrays.copyOf(a, n);
            Arrays.sort(a);
            if (Arrays.equals(Copy_a, a) || k > 1)
                System.out.println("YES");
            else if (k == 1)
                System.out.println("NO");

        }
    }

}