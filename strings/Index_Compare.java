import java.util.Scanner;

public class Index_Compare {
    public static void main(String[] args) {
       String str = "Soumyadeep";

       System.out.println(str.indexOf('a'));  // first occurrence of 'a'
       System.out.println(str.indexOf('e'));  // first occurrence of 'e'
         System.out.println(str.lastIndexOf('e')); // last occurrence of 'e'
         System.out.println();
        

         String str1 = "Apple";
         String str2 = "Apple";
            System.out.println(str1.compareTo(str2)); // 0 because both are equal
            String  str3 = "Banana";
            System.out.println(str1.compareTo(str3)); // negative because "Apple" is less than "Banana"
            System.out.println(str3.compareTo(str1)); // positive because "Banana" is greater than "Apple"  
            System.out.println(str1.contains(str3));
            // false because "Apple" does not contain "Banana"
            System.out.println();
            String str4 = "Hello, welcome to the world of Java programming.";
            System.out.println(str4.contains("Java")); // true because "Java" is present in str4
            

        

    } 
}


// compare to is use to compare two strings lexicographically
// it returns 0 if both strings are equal
// it returns a positive number if the first string is greater than the second string
// it returns a negative number if the first string is less than the second string
