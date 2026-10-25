import java.util.*;

public class D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            int[] a = new int[n];

            Map<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                map.put(a[i], i);
            }
            // sort the map with the key in ascending order
            TreeMap<Integer, Integer> sortedMap = new TreeMap<>(map);

            int l = 0;
            int r = n - 1;

            boolean isHill = true;

            while (!sortedMap.isEmpty()) {

                int key = sortedMap.firstKey();
                int value = sortedMap.get(key);

                if (value % 2 == l % 2) {
                    l++;
                } else if (value % 2 == r % 2) {
                    r--;
                } else {
                    isHill = false;
                    break;
                }

                sortedMap.remove(key);
            }
            System.out.println(isHill ? "YES" : "NO");
        }

        sc.close();

    }

}
