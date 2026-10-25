import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int amount = 0;
            amount = 2 * (k - 1);
            int x = 1;
            for (int i = 0; i < (n - (k - 1)); i++) {
                x = x * 2;
            }
            System.out.println(x + amount);

        }

    }

}
