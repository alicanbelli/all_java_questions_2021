package projects.practice_gettersettersproject;

public class Practise_2_CaseRunner {

    public static void main(String[] args) {
        /*
         * Create CaseRunner class
         * actualCase=Covid 19
         * isTested=true
         * conclusion=Tested Negative
         *
         * if conclusion contains "negative" print "You can go to work"
         * otherwise print "15 days quarantine"
         */

        //I must use setter method to assign values

        Practise_2_Case caseObject = new Practise_2_Case();
        caseObject.setActualCase("Covid 19");
        caseObject.setTested(true);
        caseObject.setConclusion("Tested Negative");


        if (caseObject.getConclusion().toLowerCase().contains("negative")) {
            System.out.println("You can go work");
        } else System.out.println("15 days quarantine");

        // create patient object or use Patient class
        Practise_4_Patient patient = new Practise_4_Patient();

        patient.setFirstName("John");
        patient.setLastName("Cash");
        System.out.println("First name : " + patient.getFirstName());
        System.out.println("Last name : " +patient.getLastName());


        //setCaseOptions accepts case object
        patient.setCaseOptions(caseObject);


        //Step : used class object and getter to print the values
        System.out.println(patient.getCaseOptions().getActualCase());
        System.out.println(patient.getCaseOptions().getConclusion());
        System.out.println(patient.getCaseOptions().isTested());



    }


}
