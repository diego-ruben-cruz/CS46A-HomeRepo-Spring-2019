public class ManagerTester
{
    public static void main(String[] args)
    {
        Manager manager = new Manager("Wilson Lee", 75000, 10000);
        Employee e = manager;
        
        System.out.println(manager.getBonus());
        System.out.println("Expected: 10000.0");
        System.out.println(manager.getName());
        System.out.println("Expected: Wilson Lee");
        System.out.println(manager.getSalary());
        System.out.println("Expected: 75000.0");
        System.out.println(manager.getInfo());
        System.out.println("Expected: name: Wilson Lee baseSalary: 75000.0 bonus: 10000.0");
        
        manager.setBonus(1000);
        manager.setName("Maria Lopez");
        manager.setBaseSalary(25000);
        System.out.println(manager.getBonus());
        System.out.println("Expected: 1000.0");
        System.out.println(manager.getName());
        System.out.println("Expected: Maria Lopez");
        System.out.println(manager.getSalary());
        System.out.println("Expected: 25000.0");
        
        System.out.println(manager.getInfo());
        System.out.println("Expected: name: Maria Lopez baseSalary: 25000.0 bonus: 1000.0");
        
        
        
    }
}