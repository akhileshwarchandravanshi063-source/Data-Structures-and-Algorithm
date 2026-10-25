import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            char c = sc.next().charAt(0);
            String s = sc.next();

            int count = 0;

            for (int i = 0; i < n / 2; i++) {

                if (s.charAt(i) == s.charAt(n - i - 1)) {
                    continue;
                } else {
                    if (s.charAt(i) != c && s.charAt(n - i - 1) != c) {
                        count = count + 2;
                    } else if (s.charAt(i) != c || s.charAt(n - i - 1) != c) {
                        count = count + 1;
                    }

                }

            }
            System.out.println(count);
        }
        sc.close();

    }
}
