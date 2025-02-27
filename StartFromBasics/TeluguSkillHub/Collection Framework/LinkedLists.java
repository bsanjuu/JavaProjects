import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
        
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");
        System.out.println("LinkedList: " + list);
        for(String s:list)
        {
            System.out.println(s);
        }
        
        list.remove(1);
        list.addFirst("Mango");
        System.out.println("LinkedList after removal: " + list);

    }    

}
