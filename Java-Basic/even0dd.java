import java.util.Scanner;

public class even0dd {
  public static void main(String[] args) {
    System.out.println("Enter a Number As Your Required");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
if(num %2==0)
    {
      System.out.println("even number");
    }
    else
    {
      System.out.println("odd number");
    }
}
}