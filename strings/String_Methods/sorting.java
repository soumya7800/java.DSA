package String_Methods;

public class sorting {
    public static void main(String[] args) 
    {

        String str = "soumya";
        System.out.println("Original string: " + str);
        char[] chars = str.toCharArray();
        java.util.Arrays.sort(chars);
        for (char c : chars) {
            System.out.print(c);
    }

    System.out.println();
    StringBuilder sb = new StringBuilder("soumya");
    char [] arrr = sb.toString().toCharArray();
    java.util.Arrays.sort(arrr);
}
}