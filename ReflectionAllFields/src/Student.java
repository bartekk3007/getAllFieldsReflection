public class Student extends Person
{
    private String hobby;

    public Student(String name, String surname, int age, String hobby)
    {
        super(name, surname, age);
        this.hobby = hobby;
    }
}