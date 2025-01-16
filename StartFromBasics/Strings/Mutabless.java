public class Mutabless {
    public static void main(String[] args) {
        String name="Sanju";
		name=name+" Java";
		System.out.println("Hello "+name);
		
		String s1="Sanju";
		String s2="Sanju";
		
		System.out.println(s1==s2);	
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
