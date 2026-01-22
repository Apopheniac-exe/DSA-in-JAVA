import java.util.*;

public class Gareeb_ki_roti {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int roti = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] % 2 != 0) {
                a[i]++;
                a[i + 1]++;
                roti += 2;
            }
        }
        boolean flag=true;
        for(int i=0;i<n;i++){
            if(a[i]%2!=0) {
                flag=false;
                break;
            }
        }
        if(flag)
        System.out.println(roti);
        else
            System.out.println("NO");
    }
}
