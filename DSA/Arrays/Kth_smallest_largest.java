package Arrays;

import java.util.Arrays;

public class Kth_smallest_largest {
    static int smallest(int[] a, int[] skip,int c){
        int s=a[skip[c]],index=-1;
        for(int i=0;i<a.length;i++) {
            if(skip[c]==i)
                continue;

            else if (s >a[i]) {
                s = a[i];
                index=i;
            }
        }
        return index;
    }
    static int largest(int[] a, int[] skip,int c){
        int l=a[skip[c]],index=-1;
        for(int i=0;i<a.length;i++) {
            if(skip[c]==i)
                continue;

            else if (l < a[i]) {
                l = a[i];
                index=i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 8, 7, 5};
        int k = 2, c = 0, si = -1, li = -1;
        int[] skip = new int[(k) * 2];
        // FIX: avoid accidental skipping of index 0
        Arrays.fill(skip, -1);

        for (int i = 1; i <= k; i++) {
            si = smallest(a, skip, c);
            li = largest(a, skip, k - 1 + c);
            skip[c] = si;
            skip[(k - 1) + c] = li;
            c++;
        }
        System.out.println(si);
        System.out.println(li);
    }

}
