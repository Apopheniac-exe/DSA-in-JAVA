import java.util.*;
public class walking_master {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            int b= in.nextInt();
            int c= in.nextInt();
            int d= in.nextInt();
            int m1=0;
            if(d<b)
                m1=-1;
            else {
                m1 = d - b;
                a = a + m1;
                b = b + m1;
                if (a < c) {
                    m1 = -1;
                }
                else
                    m1 =m1+ (a - c);
            }
            System.out.println(m1);

            }
        }
    }

