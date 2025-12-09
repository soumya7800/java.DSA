import java.util.Scanner;

public class inputsquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to square:");
        double n = sc.nextDouble();
        System.out.println(n*n);
    }
}