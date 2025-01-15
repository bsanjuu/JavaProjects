
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionEg {
    public static void main(String[] args) {
        
        //Collections
        // List<String> list = new ArrayList<String>();
        // list.add("Elderberry");
        // list.add("Apple");
        // list.add("Banana");
        // list.add("Cherry");
        // list.add("Date");
        
        // list.sort(Comparator.naturalOrder());

        Set<Integer> set = new TreeSet<Integer>();
        set.add(40);
        set.add(30);
        set.add(10);
        set.add(20);
        set.add(50);
        set.add(10);

        

        for(int s:set)
        {
            System.out.println(s);
        }


    }
    
}
