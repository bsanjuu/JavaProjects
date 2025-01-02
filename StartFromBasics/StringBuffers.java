public class StringBuffers {
    
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Sanju ");
        System.out.println("Length before append :"+sb.length());
        sb.append("Hello, ");
        sb.append("World!");
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println("Length after append :"+sb.length());

        String str=sb.toString();
        System.out.println(sb.charAt(3));
        sb.insert(6,"Sanju");
        sb.setCharAt(0, 's');
        
        System.out.println(sb);

    }
}
