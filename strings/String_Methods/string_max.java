package String_Methods;

public class string_max {
    public static void main(String[] args) {
        
        String [] arrr = {"apple" , "banana" , "grape" , "orange" , "kiwi"};
        String max = arrr[0];
        for(String s : arrr) {
            int compareResult = max.compareTo(s);
            if(compareResult < 0) {
                max = s;
            }
        }
        System.out.println("Maximum string in the array is: " + max);
    }
}
