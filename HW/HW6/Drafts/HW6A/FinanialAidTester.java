/**
 * Test FinanialAidApplicant class
 */
public class FinanialAidTester
{
   public static void main(String[] args)
   {
       FinanialAidApplicant applicant =
          new FinanialAidApplicant("Joe Programmer",19999, 1);
       System.out.println(applicant.getName() + " " 
          + applicant.getNumberOfPeopleInHousehold());
       System.out.println("Expected: Joe Programmer 1");
       System.out.println(applicant.qualifies());
       System.out.println("Expected: false");
       
       applicant.setHouseholdIncome(50000);
       applicant.setNumberOfPeopleInHousehold(4);
       System.out.println(applicant.getNumberOfPeopleInHousehold());
       System.out.println("Expected: 4");
       System.out.println(applicant.qualifies());
       System.out.println("Expected: false");
       
       applicant =
          new FinanialAidApplicant("Suzie Programmer",200000, 5);
       System.out.println(applicant.getName() + " " 
          + applicant.getNumberOfPeopleInHousehold());
       System.out.println("Expected: Suzie Programmer 5");
       System.out.println(applicant.qualifies());
       System.out.println("Expected: false");
   }
}