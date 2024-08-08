public class SwitchExample {
    public static void main(String[] args) {
        String role="admin";
        switch (role)
        {
            case "admin":
                System.out.println("you are admin");
                break;
            case "user":
                System.out.println("you are user");
                break;
            case "moderator":
                System.out.println("you are moderator");
                break;

            default:
                System.out.println("you are a guest");
        }

    }
}
