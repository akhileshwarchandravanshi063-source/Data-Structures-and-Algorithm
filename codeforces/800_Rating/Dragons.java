import java.util.*;

public class Dragons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int n = sc.nextInt();

        int[][] dragon = new int[n][2];

        for (int i = 0; i < n; i++) {
            dragon[i][0] = sc.nextInt();
            dragon[i][1] = sc.nextInt();
        }

        Arrays.sort(dragon, 
            (a, b) -> Integer.compare(a[0] , b[0]));

        boolean canDefeat = true;

        for (int i = 0; i < n; i++) {
            if (dragon[i][0] > s) {
                canDefeat = false;
                break;
            } else {
                s += dragon[i][1];
            }

        }

        System.out.println(canDefeat ? "YES" : "NO");

        sc.close();
    }
}
