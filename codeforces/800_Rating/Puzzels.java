import java.util.*;

public class Puzzels {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < m - 3; i++) {
            ans = Math.min(arr[i + 3] - arr[i], ans);
        }
        System.out.println(ans);
        sc.close();

    }
}
