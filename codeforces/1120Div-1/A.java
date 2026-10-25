import java.util.*;

public class A {
    public static class Pair {
        int x;
        int y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Set<Pair> set = new HashSet<>();
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                set.add(new Pair(i, i));
            }
            int k = 1;
            for (int i = 0; i < n; i++) {
                for (Pair st : set) {
                    st.y = st.x / k;
                }
                Iterator<Pair> it = set.iterator();
                while (it.hasNext()) {
                    Pair st = it.next();
                    if (arr[i] == st.y) {
                        it.remove();
                    }
                }
                k++;
            }
            System.out.println(set.size());

            while (set.size() > 0) {
                System.out.print(set.iterator().next().x + " ");
                set.remove(set.iterator().next());
            }
            System.out.println();

        }
        sc.close();

    }

}
