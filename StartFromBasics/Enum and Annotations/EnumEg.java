enum Status{
	Running, Failed, Pending, Success,Stopped;
}

public class EnumEg {
    
    public static void main(String[] args) {
    
        Status[] ss=Status.values();
    	//System.out.println(ss);
    	
    	for(Status s:ss)
    	{
    		System.out.println(s+" : "+s.ordinal());
    	}



    }
}
