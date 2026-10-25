import java.util.*;

public class A {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int R = sc.nextInt();

           

            System.out.println(x + R + " " + y);
        }
        sc.close();

    }
}