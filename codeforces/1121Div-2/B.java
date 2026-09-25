import java.util.*;

public class B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());

            long sum = 0;
            long ans = Long.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                if (pq.size() == m - 1) {
                    long score = m * a[i] - sum;
                    ans = Math.max(ans, score);
                }

                pq.add(a[i]);
                sum += a[i];

                if (pq.size() > m - 1) {
                    sum -= pq.poll();
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
