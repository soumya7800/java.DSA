import java.util.Scanner;

public class print1to100 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");

        int n = sc.nextInt();  

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        sc.close();
    }
}


//  it take the user input and then check the code and print the sequence of the number from 1 to yhe given input complete sequence