record Student(String firstName, String lastName, int age) {

    Student{
        if(age < 18) {
            throw new IllegalArgumentException("Invalid age");
        }
    }
}
class RecordExample {
    public static void main(String[] args) {

        RecordExample recordExample = new RecordExample();
        Student student = new Student("John", "Doe", 16);
        System.out.println(student);
    }
}