import java.util.Scanner;

public class ReadingInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        System.out.println("Hello "+name+" you are "+age+" years old.");
    }
}


/*ooutput
/Users/bug/Library/Java/JavaVirtualMachines/openjdk-22.0.1/Contents/Home/bin/java -javaagent:/Users/bug/Applications/IntelliJ IDEA Ultimate.app/Contents/lib/idea_rt.jar=59090:/Users/bug/Applications/IntelliJ IDEA Ultimate.app/Contents/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/bug/JavaProjects/YT_Practices/Array_Practices/out/production/Array_Practices ReadingInputs
Name: Sanju
Age: 26
Hello Sanju you are 26 years old.

Process finished with exit code 0


 */