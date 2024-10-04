import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Comparator;

public class Person
{
    private String name;
    private String surname;
    private int age;

    public ArrayList<Field> getAllFields()
    {
        ArrayList<Field> fieldArray = new ArrayList<>();
        Class givenClass = this.getClass();
        while(givenClass != null)
        {
            Field[] fields = givenClass.getDeclaredFields();
            for (Field field : fields)
            {
                field.setAccessible(true);
                fieldArray.add(field);
                //System.out.println(field.getName());
            }
            givenClass = givenClass.getSuperclass();
        }
        fieldArray.sort(Comparator.comparing(Field::getName));
        return fieldArray;
    }

    public Person(String name, String surname, int age)
    {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}