package Recursion;
import java.util.Scanner;
public class Palindrome {
    String s1;
    static boolean pal(int i,String s){
        if(i>=s.length()/2)
            return true;
        if(s.charAt(i)!=s.charAt(s.length()-i-1))
            return false;
        return pal(i+1,s);
    }

    static char[] pal2(int i, char[] s) {
        if (i >= s.length/ 2)
            return s;
        swap(i,s.length-i-1,s);
        return pal2(i+1,s);
    }
    static void swap(int i, int l, char[] s){
        char temp;
        temp=s[i];
        s[i]=s[l];
        s[l]=temp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String");
        String s=in.next();
        System.out.println(pal(0,s));
        System.out.println(pal2(0,s.toCharArray()));
    }
}
