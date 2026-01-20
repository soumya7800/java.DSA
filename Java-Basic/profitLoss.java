import java.util.Scanner;

public class profitLoss {
    public static void main(String[] args) {
        System.out.println("Enter the Cost Number");
        Scanner sc = new Scanner(System.in);
        int cp = sc.nextInt();
        System.out.println("Enter the Selling Price");
        int sp = sc.nextInt();

        if(cp<sp)
            System.out.println("we made a profit"+(cp-sp));
        else if (sp<cp)
            System.out.println("its a loss"+(sp-cp));
        else
            System.out.println("Business Thuffffff,,,,,,,,,,,,");
        }
}
