
import java.util.*;

public class Infoedge {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String [] arr = s.split(" ");

        StringBuilder sb = new StringBuilder(s.join(" ",""));
        sb.reverse();
        System.out.println(sb.toString());
    }
    
}
