package String_Methods;

public class digit_max {
    public static void main(String[] args) {
        
        String [] arrr = {"681681" , "9876543210" , "1234567890" , "4567891230" , "546"};
        int max = Integer.MIN_VALUE;
        for(String s : arrr) {
            int val = Integer.parseInt(s);
            if(val > max) {
                max = val;
            }
        }
        System.out.println("Maximum value in the array is: " + max);
    }
}
