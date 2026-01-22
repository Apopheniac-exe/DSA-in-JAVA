import java.util.*;
public class Jagged_Swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            if(a[0]==1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
// This was a lenghty method with O(n^3) complexity
    /*static void jaggedswap(int[] a) {
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 1; i < a.length - 1; i++) {
                if (a[i - 1] < a[i] && a[i] > a[i + 1]) {
                    // Perform the allowed swap
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    flag = true;
                }
            }
        }
        int[] copy_of_a = Arrays.copyOf(a, a.length);
        Arrays.sort(copy_of_a);
        if (Arrays.equals(a, copy_of_a))
            System.out.println("YES");
        else
            System.out.println("NO");
    } */
}
