import java.util.*;

public class C {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] arr = new int[n];
            int [] prefixSum = new int[n+ 1];

            prefixSum[0] = arr[0];
            int count = 0;


            for(int i = 1; i < n ; i++){
                prefixSum[i] = prefixSum[i-1] + arr[i];
                
            }

            for(int l = 0; l < n - k ; l++){
                for(int r = l + k; r < n ; r++){
                    if(l > 0){
                        if(prefixSum[r]- prefixSum[l-1]%k == 0){
                            count++;
                        }
                    }else{
                        if(prefixSum[r]%k == 0){
                            count++;
                        }
                    }
                }
            }





            
            

            System.out.println(count);

        }
        sc.close();

    }

}
