import java.util.*;

public class A155 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int tillmax = arr[0];
        int tillmin = arr[0];

        int count = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > tillmax) {
                count++;
                tillmax = arr[i];
            } else if (arr[i] < tillmin) {
                count++;
                tillmin = arr[i];
            }
        }

        System.out.println(count);
    }

}
