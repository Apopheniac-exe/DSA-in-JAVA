import java.util.*;
public class Sequence_of_game {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int[] b = new int[n];
            ArrayList<Integer> a = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                b[i] = in.nextInt();
            }
            a.add(b[0]);
            for (int i = 1; i < n; i++) {
                if(b[i]<b[i-1])
                    a.add(b[i]);
                a.add(b[i]);
            }
            System.out.println(a.size());
            for (int i = 0; i < a.size(); i++) {
                System.out.print(a.get(i));
                if (i < a.size() - 1)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
