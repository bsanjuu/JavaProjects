
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting {
public static void main(String[] args) {
    
    Comparator<Integer> comparator=new Comparator<Integer>() {
        
        public int compare(Integer i, Integer j) {
            
            if(i%10>j%10)
            {
                return 1;
            }
            else
            return -1;
        }
    };


    List<Integer> nums=new ArrayList<>();
    nums.add(25);
    nums.add(22);
    nums.add(38);
    nums.add(41);
    nums.add(9);

    Collections.sort(nums,comparator);
    System.out.println("Sorted array: "+nums);





}    
}
