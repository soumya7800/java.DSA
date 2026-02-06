package String_Methods;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to reverse:");
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println("Reversed string: " + str.reverse());
        int start = 0 , end = 0;
        int n = str.length();
        while(end<n)
        {
            if(str.charAt(end)!=' ')
            {
                end++;
            }
            else
            {
                reverse(str, start, end-1);
                start = end + 1;
                end++;
            }
        }
        reverse(str, start, end-1);
        System.out.println("Reversed words in the string: " + str.toString());
    }

    public static void reverse(StringBuilder str, int start, int end) {
        while (start < end) {
            char temp = str.charAt(start);
            str.setCharAt(start, str.charAt(end));
            str.setCharAt(end, temp);
            start++;
            end--;
        }
    }
}
