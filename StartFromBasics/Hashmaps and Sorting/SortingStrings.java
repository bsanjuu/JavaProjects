
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingStrings {
    
    public static void main(String[] args) {


        Comparator<String> comparator=new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
            
                if(s1.length()>s2.length())
                {
                    return 1;
                }
                else
                    return -1;

            }

            
            
        };
        
        List<String> list = new ArrayList<String>();
        list.add("Zebra");
        list.add("Apple");
        list.add("Dog");
        list.add("Elephant");
        list.add("Giraffe");
        list.add("Fish");
        list.add("Horse");
        list.add("Cat");

        


        Collections.sort(list,comparator);

        System.out.println(list);


    }
}
