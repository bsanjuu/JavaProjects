public class PersonName {

    private String firstName;
    private String lastName;
    private int age=18;

    public PersonName(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (age < this.age) {
            System.out.println("You can't make a person younger! New age  not set for "+this.firstName); ;
          } else {
            this.age = age;
          }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < this.age) {
            System.out.println("You can't make a person younger! New age  not set");
          } else {
            this.age = age;
          }
    }

    public void introduceYourself() {
        System.out.println("Hi, my name is " + getFirstName() + " " +
            getLastName() + " and I'm " + getAge());
      }
    
      public static void main(String[] args) {
        
        PersonName p1 = new PersonName("Ron", "Freeman", 37);
        PersonName p2 = new PersonName("Taylor", "Warren", 29);
        PersonName p3 = new PersonName("Sarah", "Ford", 52);
        PersonName p4 = new PersonName("John", "Doe", 15);
        
        p1.introduceYourself();
        p2.introduceYourself();
        p3.introduceYourself();
        p4.introduceYourself();

      }
    
}
