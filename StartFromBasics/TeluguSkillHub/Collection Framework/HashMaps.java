import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args)
    {
        HashMap<String, Integer> map = new HashMap<>();
        // Adding key-value pairs to the HashMap

        map.put("Sanju", 2500);
        map.put("Riskthem", 3000);
        map.put("Riskthem", 2000);

        map.put("Ravi", 4000);
        map.put("Rahul", 3500);
        map.put("Rohan", 4500);

        System.out.println(map);
        // Accessing values using keys
        for(String s:map.keySet())
        {
            System.out.println(s+"'s Salary is "+map.get(s));
        
        }
    }
}
