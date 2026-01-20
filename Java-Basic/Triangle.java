import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter First side");
        int a = sc.nextInt();
        System.out.println("Enter The Second Side");
        int b = sc.nextInt();
        System.out.println("Enter The THird Side");
        int c = sc.nextInt();
        if(a+b>c && c+a>b && a+b>c){
            System.out.println("Valid Triangle");
        }
        else
            System.out.println("Not A triangle");
    }
}
