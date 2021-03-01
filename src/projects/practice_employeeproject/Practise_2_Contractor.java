package projects.practice_employeeproject;

public abstract class Practise_2_Contractor extends Practise_2_Employee {


    @Override
    public void test() {
        System.out.println("Coming from Employee");

    }

    @Override
    public void eat() {
        System.out.println("Eating Veggy");

    }

    @Override
    public void drink() {
        System.out.println("No fee drink");

    }

}
