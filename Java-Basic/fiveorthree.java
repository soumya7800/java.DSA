import java.util.Scanner;

public class fiveorthree {
    public static void main(String[] args) {
        System.out.println("Enter the Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n%5==0 || n%3==0)
            System.out.println("Divisible By 5 or 3");
        else
            System.out.println("Not Divisible By Any");
    }
}

// | is called bit wise or
// || is logical or
// & is Bit wise AND
// && is logical And