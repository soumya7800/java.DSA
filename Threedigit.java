import java.util.Scanner;

public class Threedigit {
    public static void main(String[] args) {
        System.out.println("Enter the Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n >= 100 && n <= 999){
            System.out.println("Mine Three Digit Number - " + n);
        } else {
            System.out.println("It's Not Three Digit");
        }
    }
}
