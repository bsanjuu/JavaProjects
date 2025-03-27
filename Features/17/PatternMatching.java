class PatternMatching {
    static String getType(Object obj) {
        return switch (obj) {
            case Integer i -> "Integer: " + i;
            case String s -> "String: " + s;
            case null -> "Null value";
            default -> "Unknown type";
        };
    }
    public static void main(String[] args) {
        System.out.println(getType(10));      // Integer: 10
        System.out.println(getType("Java"));  // String: Java
        System.out.println(getType(null));

    }
}