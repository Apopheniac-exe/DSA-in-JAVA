import java.util.*;
public class A_Cover_in_Water {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t, n, i;
        t = in.nextInt();
        while (t-- > 0) {
            int c = 0;
            n = in.nextInt();
            String str = in.next();
            char[] s = str.toCharArray();
            boolean flag = false;
            for (i = 0; i < n; i++) {
                if ((i + 2 < n) && s[i] == '.' && s[i + 1] == '.' && s[i + 2] == '.') {
                    flag = true;
                    break;
                }
                if (s[i] == '.') {
                    c++;
                }
            }
            if (flag) {
                System.out.println(2);
            } else
                System.out.println(c);
        }
    }
}
