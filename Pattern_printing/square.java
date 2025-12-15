package Pattern_printing;
import java.util.Scanner;
public class square {

    public static void main(String[] args) {
        System.out.println("Enter the number of stars-");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            System.out.println("****");
        }
    }
}

