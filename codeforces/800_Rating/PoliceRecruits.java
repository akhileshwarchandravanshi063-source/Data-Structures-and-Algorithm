import java.util.*;

public class PoliceRecruits {
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int hired = 0;
        int crime = 0;
        
        for(int i = 0; i < n ; i++){
            int x = sc.nextInt();

            if( x > 0){
                hired+= x;
            }else if( x < 0 && hired > 0){
                hired--;
            }else if (x < 0 && hired == 0){
                crime++;
            }
        }
        System.out.println(crime);
    }
    
}
