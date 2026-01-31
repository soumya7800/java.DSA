public class digits {
    public static void main(String[] args) {
        String str = "Hello123World456";
        StringBuilder digits = new StringBuilder();
        
        // Extract digits from the string
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                digits.append(ch);
            }
        }
        
        // Print the extracted digits
        System.out.println("Extracted digits: " + digits.toString());
    }
}
