/**
 * The Demo class should ask the user to enter all necessary information, create a single instance of the Policy class      using the constructor that        
 * accepts arguments, and then display all the information about the policy using the appropriate methods of the Policy class. See the Sample Input and 
 * Output below for how to format the input and output of the Demo class (make sure to match the wording and formatting exactly).
 *
 * Sample Output:
 * Policy Number: 1234
 * Provider Name: State Farm
 * Policyholder’s First Name: John
 * Policyholder’s Last Name: Doe
 * Policyholder’s Age: 24
 * Policyholder’s Smoking Status: non-smoker
 * Policyholder’s Height: 62.0 inches
 * Policyholder’s Weight: 250.5 pounds
 * Policyholder’s BMI: 45.81
 * Policy Price: $816.24
 *
 *
 */


import java.util.*;



public class Project_Stephen_Johnson {

    public static void main(String args[]){


        Scanner scan = new Scanner(System.in);

        int policyNumber;

        String providerName;

        String holderFirst;

        String holderLast;

        int age;

        String smokerStatus;

        double height;

        double weight;
        // double bmi;
        // double policyPrice;

        System.out.print("Please enter the Policy Number: ");

        policyNumber = scan.nextInt();

        System.out.print("\n" + "Please enter the Provider Name: ");

        providerName = scan.next();
        scan.nextLine();

        System.out.print("\n" + "Please enter the Policyholder's First Name: ");


        holderFirst = scan.next();
        scan.nextLine();

        System.out.print("\n" + "Please enter the Policyholder's Last Name:");
        System.out.print(" ");

        holderLast = scan.next();
        scan.nextLine();

        System.out.print("\n" + "Please enter the Policyholder's Age: ");

        age = scan.nextInt();
        scan.nextLine();

        System.out.print("\n" + "Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");

        smokerStatus = scan.next();

        System.out.print("\n" + "Please enter the Policyholder's Height: ");

        height = scan.nextDouble();

        System.out.print("\n" + "Please enter the Policyholder's Weight: ");

        weight = scan.nextDouble();

        System.out.print("\n");

        //System.out.print("");


        Policy newPolicy = new Policy(policyNumber, providerName, holderFirst, holderLast, age, smokerStatus, height, weight);

        System.out.print("Policy Number: " + newPolicy.getPolicyNumber() + "\n");
        System.out.print("\n" + "Provider Name: " + newPolicy.getPoviderName() + "\n");
        System.out.print("\n" + "Policyholder's First Name: " + newPolicy.getHolderFirst()+ "\n");
        System.out.print("\n" + "Policyholder's Last Name: " + newPolicy.getHolderLast() + "\n");
        System.out.print("\n" + "Policyholder's Age: " + newPolicy.getHolderAge() + "\n");
        System.out.print("\n" + "Policyholder's Smoking Status: " + newPolicy.getSmokerStatus() + "\n");
        System.out.print("\n" + "Policyholder's Height: " + newPolicy.getHeight() + " inches" + "\n");
        System.out.print("\n" + "Policyholder's Weight: " + newPolicy.getWeight() + " pounds" + "\n");
        System.out.printf("\n" + "Policyholder's BMI: %, .2f", newPolicy.calculateBMI());
        System.out.print("\n");
        System.out.printf("\n" + "Policy Price: $%,.2f", newPolicy.policyPrice());
        System.out.print("\n");
    }


} 