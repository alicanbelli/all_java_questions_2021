package projects.mentoring_carproject;

public class Mentoring_2_MyCar extends Mentoring_2_Vehicle{
    //Vehicle = Parent of MyCar class. MyCar is child class
    //Why do we need inheritance in Java?
    //Reusability: Whatever inside Vehicle is inside MyCar
    //Attention: We cannot reach the objects in the child class using the parent class

    int maxSpeed;
    public void doUber() {
        System.out.println("Doing Uber after java classes");
    }


    public static void main(String[] args) {
        //Creating my car object
        Mentoring_2_MyCar myCar=new Mentoring_2_MyCar();
        //assigning car speed
        myCar.maxSpeed=120;
        //calling doUber method
        myCar.doUber();
        //assigning car model
        myCar.model="Honda Accord";
        //assigning car year
        myCar.year=2004;
        //assigning car mileage
        myCar.mileage=130000;
        //printing the car information
        System.out.println("Max Speed : "+myCar.maxSpeed
                +"\nMy Car Model : "+myCar.model
                +"\nMy Car Year : "+myCar.year
                +"\nMy Car Mileage : "+myCar.mileage);

    }


}
