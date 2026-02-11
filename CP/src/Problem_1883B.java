import java.util.*;
public class Problem_1883B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int k = in.nextInt();
            String s = in.next();
            int c = 0, i = 0,count=0;
            char ch = 'a';
            while (ch <= 'z') {
                for (i = 0; i < n; i++) {
                    if (ch == s.charAt(i)) {
                        c++;
                    }
                }
                    if(c%2!=0)
                        count++;
                    c=0;
                ch++;
            }
            if(count>k+1)
                System.out.println("No");
            else
                System.out.println("Yes");
            }
        }
    }

