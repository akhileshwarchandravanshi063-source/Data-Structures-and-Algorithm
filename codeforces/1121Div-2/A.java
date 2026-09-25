import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int[] copyarr = Arrays.copyOf(arr, arr.length);
            Arrays.sort(copyarr);

            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < copyarr.length; i++) {
                if (copyarr[i] != arr[i]) {
                    list.add(arr[i]);
                }
            }

            boolean valid = true;

            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) < list.get(i + 1)) {
                    valid = false;
                    break;
                }
            }

            System.out.println(valid ? "YES" : "NO");
        }

        sc.close();
    }
}