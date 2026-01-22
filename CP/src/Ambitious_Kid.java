import java.util.*;
public class Ambitious_Kid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N=in.nextInt();
        int[] A=new int[N];
        for(int i=0;i<N;i++) {
            A[i] = in.nextInt();
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<N;i++) {
            if (Math.abs(A[i]) < min)
                min = Math.abs(A[i]);
        }
        System.out.println(min);
    }
}
