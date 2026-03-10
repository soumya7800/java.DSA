package Recursion;

public class fuction_call {
    public static void apple() {
        System.out.println("I am an apple");
    }

    public static void orange() {
        System.out.println("I am an orange");
    }
    public static void banana() {
        System.out.println("I am a banana");
        orange();
    }

    public static void main(String[] args) {
        
        apple();
        System.out.println("Hello");
        banana();
        
    }
}
