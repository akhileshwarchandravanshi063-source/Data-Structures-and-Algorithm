import java.util.*;

public class Yes {

    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next().toLowerCase();

            if (s.equals("yes")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();

    }

}
