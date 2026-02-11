package Recursion;

import java.util.Scanner;
public class Solution {
    static int p=0;
    static boolean isPalindrome(String s){
        if(p>=s.length()/2)
            return true;
        if(s.charAt(p)!=s.charAt(s.length()-p-1))
            return false;
        p++;
        return isPalindrome(s);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s=in.nextLine();
        String s1="";
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i)))
            {
                s1+=s.charAt(i);
            }
        }
        s1=s1.toLowerCase();
        System.out.println(s1);
        System.out.println(isPalindrome(s1));

    }
}
