package Recursion;
import java.util.*;
public class OneToN {
    static void f(int n) {
    if (n < 1)
        return;
    f(n - 1);
    System.out.println(n);
}
    static void f1(int n) {
        if (n < 1)
            return;
        System.out.println(n);
        f1(n - 1);

    }
    static void sum(int n,int sum) {
        if (n < 1) {
            System.out.println(sum);
            return;
        }
        sum(n - 1, sum + n);
    }

    public static void main(String[] args) {
    Scanner in= new Scanner(System.in);
        System.out.println("Enter N");
    int n=in.nextInt();
    f(n);
    f1(n);
    sum(n,0);
    }
}
