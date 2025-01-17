
import java.util.Arrays;
import java.util.List;

public class StreamApiEg {
    public static void main(String[] args) {
        
        List<Integer>  nums=Arrays.asList(4,5,6,3);

        // Consumer<Integer> consumer=new Consumer<Integer>() {
            
        //     public void accept(Integer n) {
                
        //         System.out.println(n);

        //     }
        // };

        // nums.forEach(consumer);


        int result=nums.stream()
    					.filter(n-> n%2==0)
    					.map(n->n*2)
    					.reduce(0, (c,e)-> c+e);
    	System.out.println(result);
        
    }  
    
}



 // for(int i=0;i<nums.size();i++)
        // {
        //     System.out.println(nums.get(i));
        // }

        // for(int n:nums)
        // {
        //     System.out.println(n);
        // }




        //int sum=0;
        // for(int n:nums)
        // {
        //     if(n%2==0)
        //     {
        //         n=n*2;
        //         sum=sum+n;
        //     }

        // }
        // System.out.println(sum);