import java.util.*;

public class AContest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                arr[i] = a;
            }

            Arrays.sort(arr);


            HashMap<Integer, Integer> Evenfreq = new HashMap<>();
            HashMap<Integer, Integer> Oddfreq = new HashMap<>();

            for (int i = 0; i < n; i++) {
                if(arr[i] % 2 == 0){
                    Evenfreq.put(arr[i], Evenfreq.getOrDefault(arr[i], 0) + 1);
                }else{
                    Oddfreq.put(arr[i], Oddfreq.getOrDefault(arr[i], 0) + 1);
                }
                
            }
            int maxFreqEven = 0;
            for (Map.Entry<Integer, Integer> entry : Evenfreq.entrySet()) {
                maxFreqEven+= entry.getValue();
            }
            int maxFreqOdd = 0;
            for (Map.Entry<Integer, Integer> entry : Oddfreq.entrySet()) {
                maxFreqOdd+= entry.getValue();
            }
            
            int ans = Math.max(maxFreqEven, maxFreqOdd);
            System.out.println(ans);

        }
        sc.close();
    }
}