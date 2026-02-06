package String_Methods;

public class maximum_value {
    
    public static void main(String[] args) {
        
        String [] str = {"123", "456", "789", "2345", "6789"};
        int max = Integer.MIN_VALUE;
        for(String s : str) {
            int val = Integer.parseInt(s);
            if(val > max) {
                max = val;
            }
        }
        System.out.println("Maximum value of the string is: " + max);

        
    }
}
