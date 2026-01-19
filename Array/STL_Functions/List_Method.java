package Array.STL_Functions;

import java.util.List;

public class List_Method {
    public static void main(String[] args) {
        // Implementation of List methods can be added here
        List<Integer> list = new java.util.ArrayList<>();
        list.add(10);
        list.add(20);
        List<Integer> b = new java.util.ArrayList<>();
        b.add(30);
        b.add(40);
        List<Integer> d = new java.util.ArrayList<>();
        d.addAll(b);
        List<Integer> l = new java.util.ArrayList<>();
        l.addAll(list);
        l.addAll(d);

        System.out.println("List elements: " + l);
        
        // for(int i=0; i<l.size(); i++)
        // {
        //     System.out.println(l.get(i));
        // }

        for(int i = 0; i < l.size(); i++) {
            for(int j = i + 1; j < l.size(); j++) {
                if(l.get(i).equals(l.get(j))) {
                    l.remove(j);
                    j--; // Adjust index after removal
                }
            }
        }
        l.clear();
        System.out.println("List after removing duplicates and clearing: " + l);

    }
}
