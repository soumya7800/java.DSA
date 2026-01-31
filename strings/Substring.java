public class Substring {
    public static void main(String[] args) {
        
        String str = "Hello, welcome to the world of Java programming.";
        // Extract substring from index 7 to 14
        String substr1 = str.substring(7, 14);
        System.out.println("Substring from index 7 to 14: " + substr1);

        // Extract substring from index 22 to the end
        String substr2 = str.substring(22);
        System.out.println("Substring from index 22 to end: " + substr2);
    }
}


// The substring() method is used to extract a part of a string.
// It can take one or two parameters:
// 1. substring(int beginIndex): extracts the substring from beginIndex to the end of the string.
// 2. substring(int beginIndex, int endIndex): extracts the substring from beginIndex to endIndex-1.
