package Array.Array_Operrations;

import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
        ArrayList <Integer> LIST = new ArrayList<Integer>(6);
        LIST.size();
        LIST.add(10);
        LIST.add(20);       
        LIST.add(30);
        LIST.add(40);
        LIST.add(50);   
        System.out.println("Size of ArrayList: " + LIST.size());
        System.out.println("ArrayList elements:");
        LIST.set(0, 55);
        LIST.add(33);   
        System.out.println("After updating first element and adding new element:" + LIST.size());
        for(int i=0; i<LIST.size(); i++)
        {
            System.out.println(LIST.get(i));
        }
    }
}
