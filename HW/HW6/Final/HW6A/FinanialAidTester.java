/**
 * Test FinanialAidApplicant class
 */
public class FinanialAidTester
{
   public static void main(String[] args)
   {
       FinanialAidApplicant applicant =
          new FinanialAidApplicant("Joe Programmer",19999, 1);
       System.out.println(applicant.qualifies());
       System.out.println("Expected: true");
       
       applicant.setHouseholdIncome(20000);
       applicant.setNumberOfPeopleInHousehold(2);
       System.out.println(applicant.qualifies());
       System.out.println("Expected: false");
       
       applicant.setHouseholdIncome(60000);
       applicant.setNumberOfPeopleInHousehold(4);
       System.out.println(applicant.qualifies());
       System.out.println("Expected: true");
       
       applicant.setNumberOfPeopleInHousehold(3);
       System.out.println(applicant.qualifies());
       System.out.println("Expected: false");
       
       applicant.setHouseholdIncome(60001);
       applicant.setNumberOfPeopleInHousehold(6);
       System.out.println(applicant.qualifies());
       System.out.println("Expected: true");
       
       applicant.setNumberOfPeopleInHousehold(5);
       System.out.println(applicant.qualifies());
       System.out.println("Expected: false");
       
       applicant.setHouseholdIncome(150000);
       applicant.setNumberOfPeopleInHousehold(6);
       System.out.println(applicant.qualifies());
       System.out.println("Expected: true");
       
       applicant =
          new FinanialAidApplicant("Suzie Programmer",200000, 10);
       System.out.println(applicant.qualifies());
       System.out.println("Expected: false");
   }
}