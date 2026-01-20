import java.util.Scanner;

public class absolutenumbers {
    public static void main(String[] args) {
        System.out.println("Enter The Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n < 0)
            System.out.println("Its The Absolute Value: " + (-n));
         else 
            System.out.println("Its The Absolute Value: " + n);
    }
}
