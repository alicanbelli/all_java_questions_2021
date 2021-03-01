package projects.practice_gettersettersproject;

public class Practise_2_Patient {

    /*Create a class: Patient
     *Create 3 instance variables String firstName; String lastName;
     *Case caseOptions; using encapsulation
     *And create getters and setters
     *Go to CaseRunner class
     *Set your first and last name
     *And print your current case using the Case class objects
     */

    //Encapsulation : data hiding, securing the data, protect the data
    private String firstName;
    private String lastName;
    private Practise_2_Case caseOptions;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Practise_2_Case getCaseOptions() {
        return caseOptions;
    }

    public void setCaseOptions(Practise_2_Case caseOptions) {
        this.caseOptions = caseOptions;
    }



}
