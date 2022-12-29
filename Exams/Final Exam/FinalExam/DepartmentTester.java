public class DepartmentTester
{
    public static void main(String[] args)
    {
        Employee anna = new Employee("Anna Chen", 35000.0);
        Employee kob = new Employee("Kathleen OBrien", 44000.0);
        Employee cay = new Employee("Cay Horstmann", 64000.0);
        Employee carlos = new Employee("Carlos Chavez", 44000.0);
        Employee dev = new Employee("Dev Singh", 24000.0);
        Employee bob = new Employee("Bob Nguyen", 35000.0);
        
        Employee[] employees1 = {anna, kob, cay, carlos};       
        Department department1 = new Department(employees1);
        System.out.println(department1.getAverageSalary());
        System.out.println("Expected: 46750.0");
        System.out.println(department1.nameList().toString());
        System.out.println("Expected: [Anna Chen, Cay Horstmann, Carlos Chavez]");
        
        Employee[] employees2 = {anna, kob, cay, carlos, dev, bob};      
        Department department2 = new Department(employees2);
        System.out.println(department2.getAverageSalary());
        System.out.println("Expected: 41000.0");
        System.out.println(department2.nameList().toString());
        System.out.println("Expected: [Anna Chen, Cay Horstmann, Carlos Chavez, Bob Nguyen]");
        
        Employee[] none = new Employee[0];      
        Department empty = new Department(none);
        System.out.println(empty.getAverageSalary());
        System.out.println("Expected: 0.0");
        System.out.println(empty.nameList().toString());
        System.out.println("Expected: []");
    }
}