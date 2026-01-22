import java.util.*;
public class One_Two {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int n=in.nextInt();
            int[] a= new int[n];
            int c=0;
            int ans=-1;
            for(int i=0;i<n;i++)
            {
                a[i]=in.nextInt();
                if(a[i]==2)
                    c++;
            }
            if(c%2!=0)
                System.out.println(ans);
            else {

                int c1 = 0;
                for (int i = 0; i < n; i++) {
                    if (a[i] == 2)
                        c1++;
                    if (c1 == c / 2) {
                        ans = i + 1;
                        break;
                    }
                }
                System.out.println(ans);
            }
            /*boolean flag=false;
            int k=1;

            while(!flag){
                int p1=1;
                int p2=1;
                for(int i=0;i<k;i++)
                    p1=p1*a[i];
                for(int i=k;i<n;i++)
                    p2=p2*a[i];
                if(p1==p2){
                    flag=true;
                }
                else{
                    k++;
                }
                if(k>n-1){
                    k=-1;
                    break;
                }

            }
                System.out.println(k); */
        }
    }
}
