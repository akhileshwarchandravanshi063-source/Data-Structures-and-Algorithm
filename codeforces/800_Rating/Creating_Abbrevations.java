import java.util.Scanner;

public class Creating_Abbrevations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {

            int n = scanner.nextInt();
            int m = scanner.nextInt();



            String[] words = new String[n];
            for(int i = 0; i < n ; i++){
                words[i] = scanner.next();
            }
            String [] abbreviations = new String[m];
            for(int i = 0; i < m ; i++){
                abbreviations[i] = scanner.next();
            }

            for(int j = 0; j < m ; j++){



            }


        }
        scanner.close();
    }
}
