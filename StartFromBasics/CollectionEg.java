
import java.util.ArrayList;
import java.util.List;

public class CollectionEg {
    public static void main(String[] args) {
        
        //Collections
        List<String> list = new ArrayList<String>();
        list.add("Elderberry");
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        
        // list.sort(Comparator.naturalOrder());

        for(String s:list)
        {
            System.out.println(s);
        }


    }
    
}
