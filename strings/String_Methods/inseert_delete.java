package String_Methods;

import java.util.Scanner;

public class inseert_delete {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:"  );
        StringBuilder str = new StringBuilder(sc.nextLine());
        str.deleteCharAt(2);
        System.out.println("After deleting character at index 2: " + str);
        str.insert(2, 'X');
        System.out.println("After inserting 'X' at index 2: " + str);
        System.out.println("Length of the final string: " + str.length());

    }
}


// Output:
// Enter a string:HelloWorld
// After deleting character at index 2: HeloWorld   
// After inserting 'X' at index 2: HeXloWorld
// Length of the final string: 10
// understood