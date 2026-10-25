import java.util.*;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            List<Integer> list = new ArrayList<>();

            for (int i = 2; i <= x; i++) {

                boolean isPrime = true;

                for (int j = 2; j * j <= i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    list.add(i);
                }
            }
            long ans = 0;

            for (int i = 0; i < list.size(); i++) {
                long count = 0;

                for (int j : a) {
                    if (j % list.get(i) == 0) {
                        count += j;
                    }
                }

                ans = Math.max(ans, count);
            }
            System.out.println(ans);
        }
        sc.close();
    }

}
