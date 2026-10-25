import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            long count = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {

                    int a = arr[i];
                    int b = arr[j];

                    for (int k = 0; k < 20; k++) {
                        a = SquareSum(a);
                        b = SquareSum(b);

                        if (a == b) {
                            count++;
                            break; // Move to the next pair
                        }
                    }
                }
            }
            System.out.println(count);
        }

        sc.close();
    }

    private static int SquareSum(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;

    }
}