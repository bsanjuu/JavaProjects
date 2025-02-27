class University
{
    private String name;
    private int year;
    private String location;
    public University(String name, int year, String location)
    {
        this.name=name;
        this.year=year;
        this.location=location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}

public class AccessModifiers {
    public static void main(String[] args) {
        University u=new University("AUM", 1967, "Montgomery");
        University u2=new University("UCM", 1867, "Missouri");

        System.out.println("First University");
        System.out.println(" Name: "+u.getName());
        System.out.println(" Year: "+u.getYear());
        System.out.println(" Location: "+u.getLocation());
        

        System.out.println("Second University");
        System.out.println(" Name: "+u2.getName());
        System.out.println(" Year: "+u2.getYear());
        System.out.println(" Location: "+u2.getLocation());
    }
}
