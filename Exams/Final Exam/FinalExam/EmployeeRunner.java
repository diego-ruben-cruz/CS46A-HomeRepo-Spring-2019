import java.util.Arrays;
public class EmployeeRunner
{
    public static void main (String[] args)
    {
        Employee anna = new Employee("Anna Chen", 35000.0);
        Employee carlos = new Employee("Carlos Chavez", 44000.0);
        Employee bob = new Employee("Bob Nguyen", 44000.0);
        Employee dev = new Employee("Dev Singh", 24000.0);

        Employee[] employees = {anna, carlos, bob, dev};
        Arrays.sort(employees);
        for (Employee e : employees)
        {
            System.out.println(e.getInfo());
        }
    }
}