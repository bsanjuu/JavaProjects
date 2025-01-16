enum Status{
	Running, Failed, Pending, Success;
}

public class EnumSwitchEg {
    public static void main(String[] args) {
        Status s=Status.Running;
        
        switch (s) {
            case Running -> System.out.println("All Good");
            case Failed -> System.out.println("Try Again");
            case Pending -> System.out.println("Please Wait");
            default -> System.out.println("Done");
        }
    	
    
        }
    
    
    
    }

