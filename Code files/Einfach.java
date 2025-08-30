import java.util.*;

public class Einfach {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] out = new int[t];

        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = in.nextInt();
            }
            out[i] = minOps(arr, k);
        }

        for (int i = 0; i < t; i++) {
            System.out.println(out[i]);
        }
    }

    static int minOps(int[] arr, int k) {
        int prodMod = 1;
        for (int val : arr) {
            prodMod = (prodMod * val) % k;
        }

        if (prodMod == 0) return 0;

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int newProdMod = (prodMod * modInverse(arr[i], k) % k * (arr[i] + 1) % k) % k;
            if (newProdMod == 0) {
                min = 1;
                break;
            }
        }

        return min == Integer.MAX_VALUE ? k : min;
    }

    // Modular inverse for small k (1 to 5)
    static int modInverse(int a, int k) {
        for (int i = 1; i < k; i++) {
            if ((a * i) % k == 1) return i;
        }
        return 1; // fallback
    }
}
