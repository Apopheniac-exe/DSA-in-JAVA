import java.util.*;
public class Make_it_beautiful {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int[] a = new int[n];
            int temp;
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            Arrays.sort(a);
            int max=a[n-1];
            int min=a[0];
            if(max==min)
                System.out.println("NO");
            else {
                System.out.println("YES");
                System.out.print(max+" ");
                for(int i=0;i<n-1;i++) {
                    System.out.print(a[i] + " ");
                }
                System.out.println();
            }

        }
    }
}

