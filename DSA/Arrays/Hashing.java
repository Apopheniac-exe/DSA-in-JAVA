package Arrays;
import java.util.Scanner;
public class Hashing {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Size of array");
        int n=in.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) {
            a[i] = in.nextInt();
        }
        int[] hash=new int[n+1];
        for(int i=0;i<n;i++) {
            hash[a[i]] += 1;
        }
        System.out.println("Enter a number to check its freqency");
        int num=in.nextInt();
        System.out.println(hash[num]);
    }
}

