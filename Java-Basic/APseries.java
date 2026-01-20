import java.util.Scanner;

public class APseries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit:");
        int n = sc.nextInt();

        for (int i = 4; i <= n; i+=3) {
            if (i % 2 != 0) {
                System.out.println("My AP Series term: " + (i));
            }
        }
    }
}
