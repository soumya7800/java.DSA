import java.util.Scanner;

public class axis {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = sc.nextInt();

        System.out.print("Enter y: ");
        int y = sc.nextInt();

        if (x == 0 && y == 0) {
            System.out.println("Point is at the Origin");
        }
        else if (x > 0 && y > 0) {
            System.out.println("Quadrant 1");
        }
        else if (x < 0 && y > 0) {
            System.out.println("Quadrant 2");
        }
        else if (x < 0 && y < 0) {
            System.out.println("Quadrant 3");
        }
        else if (x > 0 && y < 0) {
            System.out.println("Quadrant 4");
        }
        else if (x == 0) {
            System.out.println("Point lies on the Y-axis");
        }
        else {
            System.out.println("Point lies on the X-axis");
        }
    }
}
