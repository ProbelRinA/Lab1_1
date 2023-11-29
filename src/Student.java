public class Student
{
    private String name;
    private String surname;
    private String specialization;
    private int ID;
    private int year;

    public Student (String name, String surname, String specialization, int ID, int year)
    {
        this.name=name;
        this.surname=surname;
        this.specialization=specialization;
        this.ID=ID;
        this.year=year;
    }

    public void print()
    {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Specialization: " + specialization);
        System.out.println("ID: " + ID);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args)
    {
        Student s1=new Student("Julia", "Gloris", "Engineering", 78193, 3);
        s1.print();
    }
}
