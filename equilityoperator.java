import java.util.Scanner;

public class equilityoperator {
    public static void main(String[] args) {
        System.out.println("Enter The First Number");
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        System.out.println("Enter The Second Number");
        int second = sc.nextInt();
        if(first==second){
            System.out.println("The Number is positve");
        }
        else{
            System.out.println("The Number Is Negetive");
        }
    }
}
