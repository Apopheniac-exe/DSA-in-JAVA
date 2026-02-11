package Recursion;

import java.util.Arrays;

public class reverse_array {
    static void rev(int l, int r, int[] a){
        if(l>=r)// l is left of an array, r is right of an array
            return;
        swap(l,r,a);
        rev(l+1,r-1, a);
    }

    static void one_pointer(int i,int[] a){
        if(i>=a.length/2)
            return;
        swap(i,a.length-i-1,a);
        one_pointer(i+1,a);
    }

    static void swap(int l, int r, int [] a){
        int temp;
        temp=a[l];
        a[l]=a[r];
        a[r]=temp;
    }

    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9};
        int[] b={9,3,4,5,6,7,2,1,0};
        int l=0;
        int r=a.length-1;
        rev(l,r,a);
        one_pointer(0,b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
