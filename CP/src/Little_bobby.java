import java.util.*;
public class Little_bobby {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int n, c, m;
        while (t-- > 0) {
            n = in.nextInt();
            c = in.nextInt();
            m = in.nextInt();
            System.out.println(chocolatefeast(n, c, m));
        }
    }

    public static int chocolatefeast(int n, int c, int m) {
        int bar = n / c;
        int wrapper = bar;
        if (wrapper < m)
            return(bar);
        else {
            while (wrapper >= m) {

                    bar += wrapper / m;
                    wrapper = wrapper / m + wrapper % m;
                }
            }
        return (bar);
    }
}

