import java.util.*;

public class United_stand {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }

            Arrays.sort(a);
            ArrayList<Integer> b = new ArrayList<>();
            ArrayList<Integer> c = new ArrayList<>();

            int max = a[n-1];
            for (int i = 0; i < n; i++) {
                if (a[i] == max) {
                    c.add(a[i]);
                } else {
                    b.add(a[i]);
                }
            }
            if (b.isEmpty() || c.isEmpty()) {
                System.out.println("-1");
            } else {
                System.out.println(b.size() + " " + c.size());
                for (int x : b) System.out.print(x + " ");
                System.out.println();
                for (int x : c) System.out.print(x + " ");
                System.out.println();
            }
        }
    }
}
