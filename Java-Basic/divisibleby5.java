import java.util.Scanner;

public class divisibleby5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Positive Integer");
        int n = sc.nextInt();
        if(n % 5 == 0){
            System.out.println("The Integer Is Divisible By 5");
        }
        else{
            System.out.println("The Integer is Not Divisible By 5");
        }
    }
}
