
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students{
    String name;
    int age;
    String grade;

    public Students(int age, String grade, String name) {
        this.age = age;
        this.grade = grade;
        this.name = name;
    }

    @Override
    public String toString() {
        return "students [name=" + name + ", age=" + age + ", grade=" + grade + "]";
    }
    
}
public class SortingStudent {
    
    public static void main(String[] args) {
    
    
        Comparator<Students> comparator=(s1,s2)->
                s1.grade.compareTo(s2.grade);
    
        List<Students> students=new ArrayList<Students>();
        students.add(new Students(23,"D", "Rohit"));
        students.add(new Students(20,"C","Sanju"));
        students.add(new Students(20,"A", "Rahul"));
        students.add(new Students(21,"B", "Rohan"));
        


        Collections.sort(students,comparator);
        for(Students s:students)
        {
            System.out.println(s);
        }

    }
}
