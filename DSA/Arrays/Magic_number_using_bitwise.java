package Arrays;

import java.util.*;
public class Magic_number_using_bitwise {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();
        int last, power = 5;
        int ans=0;
        while (n > 0) {
            last = n & 1;
            ans = power * last;
            n = n >> 1;
            power *= 5;
        }
        System.out.println("The magic number is = " + ans);
    }
}