public class Lower_case_Concat {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        
        // Convert both strings to lowercase
        String lowerStr1 = str1.toLowerCase();
        String lowerStr2 = str2.toLowerCase();
        
        // Concatenate the lowercase strings
        String result = lowerStr1 + lowerStr2;
        
        // Print the result
        System.out.println("Concatenated Lowercase String: " + result);

        String str3 = "JAVA programming";
        String upperStr3 = str3.toUpperCase();
        System.out.println("Uppercase String: " + upperStr3);
    }
}
