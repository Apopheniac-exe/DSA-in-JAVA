public class seive_of_erasthosthenes {
    public static void main(String[] args) {
        int n=40;
        boolean[] prime= new boolean[n+1];// using n+1 because o and 1 are already not prime and we are suing the index as the number itself.
        for(int i=2;i<n;i++) {
            prime[i] = true;
        }
        sieve(n,prime);
        sieve_optimized(n,prime);

    }
    static void sieve(int n, boolean[] prime) {
        int i, j=0,c=0;
        for (i = 2; i <= n; i++) {
            for (j = i*2; j <= n; j += i) {
                prime[j] = false;
                c++;
            }
        }
        System.out.println("Times of i and j are " + i + " " + c);
        for (i = 2; i <= n; i++) {
            if (prime[i])
                System.out.print(i + " ");
        }
    }
    static void sieve_optimized(int n, boolean[] prime) {
        int i, j=0,c=0;
        for (i = 2; i*i <= n; i++) {
            for (j = i * i; j <= n; j += i) {
                prime[j] = false;
                c++;
            }
        }
        System.out.println("\nTimes of i and j are " + i + " " + c);
        for (i = 2; i <= n; i++) {
            if (prime[i])
                System.out.print(i + " ");
        }
    }

}
