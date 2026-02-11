import java.sql.SQLOutput;
import java.util.*;
public class Vasilije_in_Cacak {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while (t-->0) {
            long n = in.nextLong();
            long k = in.nextLong();
            long x = in.nextLong();
            long s = (k * (k + 1)) / 2;
            long l = (n * (n + 1)) / 2 - ((n - k) * (n - k + 1)) / 2;
            if (x >= s && x <= l)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
