import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Number");
        int a = sc.nextInt();
        System.out.println("Enter The Second Number");
        int b = sc.nextInt();
        System.out.println("Enter The Thrd Number");
        int c = sc.nextInt();

        if(a>b && a>c)
            System.out.println("A is Greater");
            else if(b>a && b>c)
                System.out.println("B is Greater");
            else
                System.out.println("C is Greater");
        
    }
}
