import java.util.HashSet;
import java.util.Iterator;
public class HashSets {
    public static void main(String[] args) 
    {
        // Creating a HashSetx
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); 

        System.out.println(set);

        for(String s:set)
        {
            System.out.println(s);
        }   

        Iterator<String> iterator = set.iterator();
        System.out.println("Using Iterator:");
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }


    
    }
}
