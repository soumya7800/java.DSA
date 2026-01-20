import java.util.Scanner;

public class typecasting {
    public static void main(String[] args) {
        System.out.println("print a number that changed from int to double:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double d = (double)x; // implicit typecasting (automatic widening)
        System.out.println("Double value: " + d/2);
    }
}


// typecasting in java in type casting the java program where one data type will be cast to another data type.