
import java.util.*;

public class TPrime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int limit = 1000000;
        boolean[] prime = new boolean[limit + 1];

        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;

        // Sieve of Eratosthenes
        for (int i = 2; i * i <= limit; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    prime[j] = false;
                }
            }
        }

        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();

            long root = (long) Math.sqrt(n);

            if (root * root == n && prime[(int) root]) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}