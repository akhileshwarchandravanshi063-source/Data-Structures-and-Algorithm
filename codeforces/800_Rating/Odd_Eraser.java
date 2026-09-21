import java.math.BigInteger;
import java.util.Scanner;
public class Odd_Eraser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            BigInteger x = BigInteger.valueOf(a[0]);
            BigInteger y = BigInteger.valueOf(a[n-1]);

            int gcd = x.gcd(y).intValue(); 
            System.out.println(gcd);
                
        }
        scanner.close();
    }
}