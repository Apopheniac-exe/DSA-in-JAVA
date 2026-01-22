import java.util.*;
public class Forbidden_integer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int k = in.nextInt();
            int x = in.nextInt();
            ArrayList<Integer> a = new ArrayList<Integer>();
            int s = 0;
            boolean flag=false;
            while (k != 0) {
                if (k == x || k >= n) {
                    k--;
                    continue;
                }

                a.add(k);
                    s += k;
                    if (s > n) {
                        s -= k;
                        a.remove(Integer.valueOf(k));
                        k--;
                    } else if (s == n) {
                        flag = true;
                        break;
                    }

            }
            if (flag) {
                System.out.println("YES");
                System.out.println(a.size());
                for (int i : a)
                    System.out.print(i + " ");
                System.out.println();
            } else
                System.out.println("NO");

        }
    }
}
