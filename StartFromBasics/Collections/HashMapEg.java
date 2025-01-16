
import java.util.HashMap;
import java.util.Map;

public class HashMapEg {
    
    public static void main(String[] args) {
        

        Map<String,Integer> students=new HashMap<>();
        students.put("Sanju", 26);
        students.put("Rahul", 17);
        students.put("Rohan", 18);
        students.put("Nithin", 21);
        students.put("Hermana", 30);



        System.out.println("People who are above 21");
        for (String name : students.keySet()) {
            
            
            if (students.get(name) >= 21) 
            {
                System.out.println(name + ":" + students.get(name));
            }
        }

        


    }
}
