package _24_Abstractions;

public abstract class Advance_2_Car {


//	protected String make;
//	protected String model;
//	protected int year;
//	protected double price;

    public Advance_2_Car() {

    }

    public Advance_2_Car(String model, int year, double price) {
//
//		this.model = model;
//		this.year = year;
//		this.price = price;
    }


    abstract String carMake();
    abstract String carModel();
    abstract String carYear();
    abstract String carPrice();







}
