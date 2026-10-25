import java.util.*;

public class B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Integer[] a = new Integer[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            TreeMap<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());
            // Store frequencies
            for (int x : a) {
                map.put(x, map.getOrDefault(x, 0) + 1);
            }

            ArrayList<Integer> newArray = new ArrayList<>();

            while (true) {

                boolean found = false;

                for (int key : map.keySet()) {

                    if (map.get(key) > 0) {

                        newArray.add(key);

                        map.put(key, map.get(key) - 1);

                        found = true;
                    }
                }

                if (!found) {
                    break;
                }
            }

            for (int i = 0; i < newArray.size(); i++) {
                System.out.print(newArray.get(i) + " ");
            }

            System.out.println();

        }
    }

}
