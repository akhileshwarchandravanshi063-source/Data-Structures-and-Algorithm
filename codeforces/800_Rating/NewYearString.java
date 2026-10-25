import java.util.*;

public class NewYearString {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            boolean has2026 = false;
            boolean has2025 = false;

            for(int i = 0; i < n - 3 ; i++){
                if(s.charAt(i) == '2' && s.charAt(i+1) == '0' && s.charAt(i+2) == '2' && s.charAt(i+3) == '6'){
                    has2026 = true;
                    break;
                }else if(s.charAt(i) == '2' && s.charAt(i+1) == '0' && s.charAt(i+2) == '2' && s.charAt(i+3) == '5'){
                    has2025 = true;
                    continue;
                }
            }
            if(has2026 && has2025){
                System.out.println(0); 
            }else if(has2025){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }
    }
    
}
