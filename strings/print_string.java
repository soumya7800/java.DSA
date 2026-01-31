// input a string and print all the substring of that string

import java.util.Scanner;

public class print_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        System.out.println("All substrings of the given string are:");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j <= length; j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }
}
