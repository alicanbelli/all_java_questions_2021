package projects.advance_carproject;

public class Advance_2_Toyota extends Advance_2_Car {


    protected String make = "Toyota";
    protected String model = "Camry";
    protected int year = 2015;
    protected double price = 13000;

    public Advance_2_Toyota() {

    }

    public Advance_2_Toyota(String model, int year , double price) {

        this.model = model;
        this.year = year;
        this.price = price;
    }

    @Override
    String carMake() {

        return "Car make: "+make;
    }


    String carModel() {

        return "Car model: "+model;
    }


    String carYear() {

        return "Car year: " + year;
    }


    String carPrice() {

        return "Car price: $"+price;
    }












}
