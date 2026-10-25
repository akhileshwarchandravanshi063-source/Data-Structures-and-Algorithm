
import java.util.*;

public class AgainTwentyFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        System.out.println(25);
        
        sc.close();

        /*
         * 
         * using bitwise operators
         * 
         * int a , n ;
         * a^n
         * 
         * while(n > 0){
         * 
         * 
         * int last_bit = n & 1 ;
         * if(last_bit > 0){
         * ans = ans * a;
         * }
         * 
         * a = a * a;
         * 
         * n = n >> 1 ;
         * 
         * 
         * }
         * 
         * 
         * 
         */

    }
}
