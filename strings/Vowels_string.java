import java.util.Scanner;

public class Vowels_string {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");

        String input = sc.nextLine();
        int vowelCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (isVowel(ch)) {
                vowelCount++;
            }
        }

        // ✅ MUST be inside main
        System.out.println("Number of vowels: " + vowelCount);

        sc.close();
    }

    // method to check vowel
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
