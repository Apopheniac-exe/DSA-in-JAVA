import java.util.*;
public class Daytona_cost {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            boolean flag = false;
            int n = in.nextInt();
            int k = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            Arrays.sort(a);
            int start =0, end=n-1;
            while(start<=end) {
                int mid = (start + end) / 2;
                if (a[mid] == k) {
                    flag = true;
                    break;
                } else if (k > a[mid]) {
                    start = mid + 1;
                } else
                    end = mid - 1;
            }

            /*for (int i=0;i<n;i++) {
                if (k == a[i]) {
                    flag = true;
                    break;
                }
            }*/
            if (flag)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }

}

