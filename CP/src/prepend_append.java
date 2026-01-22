import java.util.*;
public class prepend_append {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int n=in.nextInt();
            String s=in.next();
            int l=n;
            int i=0;
                while((s.charAt(i)=='1' && s.charAt(n-i-1)=='0') ||(s.charAt(i)=='0' && s.charAt(n-i-1)=='1')){
                    if(l<=0) {
                        break;
                    }
                    l-=2;
                    i++;


            }
                if(l<0)
                    System.out.println(0);
            System.out.println(l);
        }
    }
}
