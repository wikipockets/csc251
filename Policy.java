/**
Create a Policy class that will model an insurance policy for one person.  
Use the following guidelines to create the Policy class:
An insurance policy has the following attributes:
Policy Number
Provider Name
Policyholder’s First Name
Policyholder’s Last Name
Policyholder’s Age
Policyholder’s Smoking Status (will be “smoker” or “non-smoker”)
Policyholder’s Height (in inches)
Policyholder’s Weight (in pounds)
Include a no-arg constructor (set default values for all fields).
Include a constructor that accepts arguments (it must accept all necessary arguments to fully initialize the Policy object).
Include appropriate setters and getters (i.e., mutator and accessor methods) for each field.
Include a method that calculates and returns the BMI of the policyholder.*
BMI = (Policyholder’s Weight * 703 ) / (Policyholder’s Height2 ).
Include a method that calculates and returns the price of the insurance policy*
The Insurance Policy has a base fee of $600
If the Policyholder is over 50 years old, there is an additional fee of $75
If the Policyholder is a smoker, there is an additional fee of $100
If the Policyholder has a BMI of over 35, there is an additional fee calculated as follows:
Additional Fee = ( BMI – 35 ) * 20
*/


public class Policy {

    private int policyNum;
    private String provName;
    private String holdFirst;
    private String holdLast;
    private int holdAge;
    private String smokerStatus;
    private double height;
    private double weight;
    

    private Policy(){
        policyNum = 00000;
        provName = "provider";
        holdFirst = "peter";
        holdLast = "parker";
        holdAge = 18;
        smokerStatus = "non-smoker";
        height = 72;
        weight = 165;
    }
    
    /*
     * Constructor with arguments for building policy holder
     *  
     * @param policyNumber provided policy number for individual
     * @param providerName Name of insurance provider for individual
     * @param holderFirst First name of individual policy holder
     * @param holderLast Last name of individual policy holder
     * @param age Policy holder current age
     * @param smokerStatus Whether or not the policy holder is a smoker (yes/no)
     * @param height Listed height for policy holder
     * @param weight Listed weight for policy holder
     * 
     */

    Policy(int policyNumber, String providerName, String holderFirst, String holderLast, int age, String smokerStatus, double height, double weight) {
        this.policyNum = policyNumber;
        this.provName = providerName;
        this.holdFirst = holderFirst;
        this.holdLast = holderLast;
        this.holdAge = age;
        this.smokerStatus = smokerStatus;
        this.height = height;
        this.weight = weight;

    }
    /*
     * @return policyNum returns instance policy number 
     */
    public int getPolicyNumber(){
        return policyNum;
    }
    
    /*
     * @return provName returns instance provider name
     */
    public String getPoviderName(){
        return provName;
    }

    /*
     * @return holdFirst returns first name of policy holder
     */
    public String getHolderFirst(){
        return holdFirst;
    }

    /*
     * @return holdLast returns last name of policy holder for getter
     * 
     */
    public String getHolderLast(){
        return holdLast;
    }

    /*
     * @return holdAge returns age of policy holder for getter 
     * 
     */
    public int getHolderAge(){
        return holdAge;
    }

    /*
     * @return smokerStatus returns smoker status of policy holder for getter
     */
    public String getSmokerStatus(){
        return smokerStatus;
    }

    /*
     * @return height returns height of policy holder for getter 
     */
    public double getHeight(){
        return height;
    }
    /*
     * @return weight returns weight of policy holder for getter
     */
    public double getWeight(){
        return weight;
    }

    public void setPolicyNumber(int newPolicyNum){
        this.policyNum = newPolicyNum;
    }
    
    public void setHolderFirst(String newHoldFirst){
        this.holdFirst = newHoldFirst;
    }

    public void setHolderLast(String newHoldLast){
        this.holdLast = newHoldLast;
    }

    public void setHolderAge(int newHoldAge){
        this.holdAge = newHoldAge;
    }

    public void setSmokerStatus(String newSmokerStatus){
        this.smokerStatus = newSmokerStatus;
    }

    public void setHeight(int newHeight){
        this.height = newHeight;
    }

    public void setWeight(int newWeight){
        this.weight = newWeight;
    }
    /*
     * @return bmi returns bmi as calculated from height and weight of policy holder
     */
    public double calculateBMI(){
        double bmi = (weight * 703) / (height*height);

        return bmi;
    }    
    /*
     * @return policyPrice returns the calculated price of the policy based on input 
     */
    public double policyPrice(){
        double policyPrice = 600;
        
        if (holdAge > 50){
            policyPrice += 75;

        }
        if (smokerStatus == "smoker"){
            policyPrice += 100;
        }
        if (calculateBMI() > 35){
            policyPrice += ((calculateBMI() - 35) * 20);
        }

        return policyPrice;
    }

    

}
