package String_Methods;

public class modify_Charecter_in_string {
    public static void main(String[] args) {
        String s = "HelloWorld";

        // Convert the string to a character array

        s = s.substring(0,2) + "Goodbye" + s.substring(5);
        System.out.println(s);
    }
}


// string is immutable in java so we cannot modify the character directly
// we have to create a new string with the desired modifications
// we can use StringBuilder for more efficient modifications