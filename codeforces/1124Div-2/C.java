import java.util.*;

public class C {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());
            }
            long score = 0;

            while (list.size() >= k) {

                long Ak = list.get(k - 1);

                long Am = list.get(list.size() - k);

                if (Ak > Am) {
                    score += Ak;
                    list.remove(k - 1);
                } else if(Ak < Am) {
                    score += Am;
                    list.remove(list.size() - k);
                }else if(Ak == Am) {
                    score += Ak;
                    list.remove(k - 1);
    
                }
            }

            System.out.println(score);
        }
        sc.close();
    }
}
