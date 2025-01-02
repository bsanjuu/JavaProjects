class Student{

    String name;
    int roll;
    double marks;


}

public class ArrayStudent {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Sanju";
        s1.roll=1;
        s1.marks=90.0;
        
        Student s2=new Student();
        s2.name="John";
        s2.roll=2;
        s2.marks=80.0;

        Student s3=new Student();
        s3.name="Rahul";
        s3.roll=3;
        s3.marks=70.0;

        //Array of objects
        Student students[]=new Student[3];
		students[0]=s1;
		students[1]=s2;
		students[2]=s3;

        //Printing with for loop
        for(int i=0;i<students.length;i++)
		{
			System.out.println(students[i].name+":"+students[i].marks);
		}
		
        //Printing with foreach
        System.out.println("\nPrinting with foreach\n");
        for(Student s:students)
        {
            System.out.println(s.name+" :"+s.marks);
        }




    }
}
