package String_Methods;

import java.util.Scanner;

public class append {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string:");

        StringBuilder str1 = new StringBuilder(sc.nextLine());
        System.out.println("Enter second string to append:");
        String str2 = sc.nextLine();
        str1.append(str2);
        System.out.println("After appending: " + str1.toString());

        StringBuffer strBuffer = new StringBuffer("Welcome");
        System.out.println(strBuffer);
        strBuffer.append(35);
        System.out.println("After appending 35: " + strBuffer.toString());
        strBuffer.append('S');
        System.out.println("After appending 'S': " + strBuffer.toString());

        char [] charArray = {'J', 'a', 'v', 'a'};
        strBuffer.append(charArray);
        System.out.println("After appending char array: " + strBuffer.toString());
        int [] intArray = {1, 2, 3, 4, 5};
        strBuffer.append(intArray);
        System.out.println("After appending int array: " + strBuffer.toString());
    }
}
