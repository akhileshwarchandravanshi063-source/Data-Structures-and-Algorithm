import java.util.*;

public class Solve1 {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int[][] chess = {
                { 2, 3, 4, 4, 4, 4, 3, 2 },
                { 3, 4, 6, 6, 6, 6, 4, 3 },
                { 4, 6, 8, 8, 8, 8, 6, 4 },
                { 4, 6, 8, 8, 8, 8, 6, 4 },
                { 4, 6, 8, 8, 8, 8, 6, 4 },
                { 4, 6, 8, 8, 8, 8, 6, 4 },
                { 3, 3, 6, 6, 6, 6, 3, 3 },
                { 2, 3, 4, 4, 4, 4, 3, 2 }

        };

        String rook = sc.nextLine();
        String knight = sc.nextLine();

        int possiblePos = 49;
        possiblePos = possiblePos - chess[knight.charAt(0) - 'a' + 1][knight.charAt(1) - '1'] - 1;
        System.out.println(possiblePos);

        sc.close();

     

    }

}
