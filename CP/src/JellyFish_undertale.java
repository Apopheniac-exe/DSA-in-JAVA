import java.util.*;
public class JellyFish_undertale {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            long a = in.nextLong();
            long b = in.nextLong();
            int n = in.nextInt();
            int[] x = new int[n];
            for (int i = 0; i < n; i++) {
                x[i] = in.nextInt();
            }
            Arrays.sort(x);
            long max=b;
               for(int i=0;i<n;i++){
                    max += Math.min(x[i], a-1);
               }


            System.out.println(max);
        }
    }
}