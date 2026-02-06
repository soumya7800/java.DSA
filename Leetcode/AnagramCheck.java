import java.util.*;

public class AnagramCheck {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        if (isAnagram(s1, s2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }

    static boolean isAnagram(String a, String b) {

        if (a.length() != b.length())
            return false;

        int[] count = new int[256];   // ASCII characters

        for (int i = 0; i < a.length(); i++) {
            count[a.charAt(i)]++;
            count[b.charAt(i)]--;
        }

        for (int c : count) {
            if (c != 0) return false;
        }

        return true;
    }
}
