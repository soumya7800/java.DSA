package String_Methods;

public class StringBuilderDemo {

    public static void main(String[] args) {
        String str1 = "Hello";
        StringBuilder str2 = new StringBuilder(str1);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str2.length());

        StringBuilder str3 = new StringBuilder();
        System.out.println(str3.capacity());
        System.out.println(str3.reverse());
        System.out.println(str3.compareTo(str2));
    }
}