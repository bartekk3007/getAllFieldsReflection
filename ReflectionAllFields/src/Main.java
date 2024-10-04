import java.lang.reflect.Field;

public class Main
{
    public static void main(String[] args)
    {
        Person p1 = new Person("Bartek", "Kołakowski", 30);
        Student s1 = new Student("Andrzej", "Kowalski", 40, "gaming");
        for (Field field : p1.getAllFields())
        {
            System.out.println(field.getName());
        }
        for (Field field : s1.getAllFields())
        {
            System.out.println(field.getName());
        }
    }
}