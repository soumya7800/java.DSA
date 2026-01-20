import java.util.Scanner;

public class fivedigit {
     public static void main(String[] args) {
        System.out.println("Enter the Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n >= 10000 && n <= 99999){
            System.out.println("Mine Five Digit Number - " + n);
        } else {
            System.out.println("It's Not Five Digit");
        }
    }
}
