import java.util.*;
public class Array_colouring {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int n= in.nextInt();
            int[]a =new int[n];
            int s=0;
            for(int i=0;i<n;i++) {
                a[i] = in.nextInt();
                s = s + a[i];
            }
            if(s%2==0)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
