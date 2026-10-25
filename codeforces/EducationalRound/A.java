import java.util.*;

public class A {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a <= b) {
                System.out.println(-1);
            } else {
                System.out.println(Math.min(b, a - b));

            }

        }

        sc.close();

    }
}