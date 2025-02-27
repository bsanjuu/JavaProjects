import java.util.ArrayList;

public class ArrayLists {
public static void main(String[] args) {
    // Create an ArrayList
    ArrayList<String> list = new ArrayList<>();
    // Add elements to the ArrayList
    list.add("Apple");
    list.add("Banana");
    list.add("Cherry");
    // Print the ArrayList
    System.out.println("ArrayList: " + list);

    for(String s:list)
    {
        System.out.println(s);
    }

    // Access elements from the ArrayList
    String firstElement = list.get(0);
    System.out.println("First element: " + firstElement);
    // Remove an element from the ArrayList
    list.remove("Banana");
    // Print the ArrayList after removal
    System.out.println("ArrayList after removal: " + list);
    list.set(1,"Mango");
    System.out.println("ArrayList after Addition: " + list);



    
}    

}
