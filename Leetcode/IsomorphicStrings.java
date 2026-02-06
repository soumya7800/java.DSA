import java.util.*;

public class IsomorphicStrings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        int[] m1 = new int[256];
        int[] m2 = new int[256];
        System.out.println("Length of s: " + s.length() + ", Length of t: " + t.length());
        for (int i = 0; i < s.length(); i++) {
            if (m1[s.charAt(i)] != m2[t.charAt(i)]) {
                System.out.println("Not Isomorphic");
                return;
            }
            m1[s.charAt(i)] = i + 1;
            m2[t.charAt(i)] = i + 1;
        }

        System.out.println("Isomorphic");
    }
}
