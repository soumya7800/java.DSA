import java.util.Scanner;

public class ascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character to find its ASCII value:");
        char ch = sc.next().charAt(0);
        int ascii = (int) ch;
        System.out.println("The ASCII value of " + ch + " is: " + ascii);
    }
}


//ASCII value of a character is obtained by type casting the character to an integer.