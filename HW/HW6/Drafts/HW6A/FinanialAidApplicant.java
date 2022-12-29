/**
 * Models whether a given financial aid applicant qualifies for aid.
 * 
 * DCruzin
 */
public class FinanialAidApplicant
{
    private String name;
    private int numOfPeopleInHouse;
    private double houseIncome;
    //other instance variables and constructor go here
    /**
     * Constructor for Financial Aid Applicant
     * 
     * @param   gName   The given name.
     * @param   gNum   The number of people in the household
     * @param   gIncome  The given house income
     * 
     */
    public FinanialAidApplicant(String gName,double gIncome, int gNum)
    {
        name = gName;
        numOfPeopleInHouse = gNum;
        houseIncome = gIncome;
    }

    /**
     * Gets the name of the FinanialAidApplicant
     * 
     * @return the name of the applicant
     */
    public String getName()
    {
        return name;
    }

    /**
     * Sets the number of people in the household.
     * @param   newNum  The new updated number of people.
     */
    public void setNumberOfPeopleInHousehold(int newNum)
    {
        numOfPeopleInHouse = newNum;
    }
    /**
     * Gets the number of people in the household.
     * 
     * @return  the current number of people in the household.
     * 
     */
    public int getNumberOfPeopleInHousehold()
    {
        return numOfPeopleInHouse;
    }
    /**
     * Gets the number of people in the household.
     * 
     * @param   newIncome   The new income of the household.
     * 
     */
    public void setHouseholdIncome(int newIncome)
    {
        
    }
    /**
     * Decides whether an applicant is eligible for financial aid.
     * 
     * @return  Whether the person qualifies for financial aid.
     */
    public boolean qualifies()
    {
        return false;
    }
}