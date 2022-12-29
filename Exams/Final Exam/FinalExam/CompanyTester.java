public class CompanyTester
{
    public static void main(String[] args)
    {
        Employee anna = new Employee("Anna Chen", 35000.0);
        Employee kob = new Employee("Kathleen OBrien", 44000.0);
        Employee cay = new Employee("Cay Horstmann", 64000.0);
        Employee carlos = new Employee("Carlos Chavez", 44000.0);
        Employee dev = new Employee("Dev Singh", 24000.0);
        
        Company company = new Company();
        company.add(anna);
        company.add(carlos);
        company.add(dev);
        company.add(kob);
        System.out.println(company.employeeCount());
        System.out.println("Expected: 4");
        System.out.println(company.highestPaid());
        System.out.println("Expected: Carlos Chavez");
             
        company.add(cay);
        System.out.println(company.employeeCount());
        System.out.println("Expected: 5");
        System.out.println(company.highestPaid());
        System.out.println("Expected: Cay Horstmann");
        
        Company empty = new Company();
        System.out.println(empty.employeeCount());
        System.out.println("Expected: 0");
        System.out.println(empty.highestPaid());
        System.out.println("Expected: ");
        
             
    }
}
