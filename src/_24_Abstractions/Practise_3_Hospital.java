package _24_Abstractions;

public class Practise_3_Hospital extends Practise_3_Data{


    Practise_3_Doctor doctor = new Practise_3_Doctor();
    Practise_3_Patient patient = new Practise_3_Patient();

    public Practise_3_Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Practise_3_Doctor doctor) {
        this.doctor = doctor;
    }

    public Practise_3_Patient getPatient() {
        return patient;
    }

    public void setPatient(Practise_3_Patient patient) {
        this.patient = patient;
    }

}
