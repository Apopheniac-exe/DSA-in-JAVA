import java.util.*;
public class gcd_subarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int n=in.nextInt();
            long [] a=new long[n];
            for(int i=0;i<n;i++)
                a[i]=in.nextInt();
            boolean flag=false;
            for(int i=0;i<n;i++) {
                for (int j = i+1; j < n; j++) {
                    if (GCD(a[i], a[j]) <= 2) {
                        flag = true;

                    }
                }
            }
            if(!flag)
                System.out.println("NO");
            else
                System.out.println("YES");

        }
    }
    static long GCD(long a, long b)
    {
        if(a==0)
            return b;
        return GCD(b%a,a);
    }
}
