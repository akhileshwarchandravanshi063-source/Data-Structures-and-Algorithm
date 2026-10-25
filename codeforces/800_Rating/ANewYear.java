import java.util.*;

public class ANewYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] arr = new int[101];
            int [] arr1 = new int[n];
            for(int i = 0; i < n ; i++){
                arr1[i] = sc.nextInt();
            }

            for(int i = 0; i < n ; i++){
                arr[arr1[i]]++;
            }
            int ele = -1;
            for(int i = 1 ; i < 101 ; i++){
                if(arr[i] == 1){
                    ele = i;
                }
            }

            for(int i = 0; i < n ; i++){
                if(arr1[i] == ele){
                    System.out.println(i+1);
                }
            }
        }
    }
}
