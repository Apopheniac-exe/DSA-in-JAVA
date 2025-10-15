import java.util.*;
public class Line_Trip {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, x, i, t;
        t = in.nextInt();
        while (t -->0) {
            n = in.nextInt();
            x = in.nextInt();
            int[] a = new int[n + 2];
            a[0]=0;
            for (i = 1; i < n+1; i++) {
                a[i] = in.nextInt();
            }
            a[n+1] = x;
            int max = Integer.MIN_VALUE;
            for (i = 1; i < n + 2; i++) {

                   int distance=a[i]-a[i-1];
                   if(a[i]==x) {
                       distance*=2;
                   }
                   max=Math.max(max,distance);

            }
            System.out.println(max);
        }
    }
}
