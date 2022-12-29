
public class InterfaceTester2
{
    public static void main(String[] args)
    {
        System.out.println("Testing Students");
        Qualifiable student = new Student("Sam", 2.5);
        Qualifiable student1 = new Student("Amy", 3.54);
        Qualifiable student2 = new Student("Aruna", 3.56);
        Qualifiable[] students = {student, student1, student2};
        
        System.out.println(student.qualifies());
        System.out.println("Expected: false");
        System.out.println(student1.qualifies());
        System.out.println("Expected: true");
        System.out.println(student2.qualifies());
        System.out.println("Expected: true");
        System.out.println();
        
        for(Qualifiable p : students)
        {
            System.out.println("Actual: " + p.qualifies());
        }
        
        System.out.println("Expected: false");
        System.out.println("Expected: true");
        System.out.println("Expected: true");
    }
}