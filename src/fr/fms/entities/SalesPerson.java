package fr.fms.entities;

public class SalesPerson extends Person{

    String entreprise;
    double revenue;

    public SalesPerson(String name, String firstname, int age, String adress, String entreprise, double revenue) {
        super(name, firstname, age, adress);
        this.entreprise = entreprise;
        this.revenue = revenue;
    }

    public SalesPerson(String name, String firstname, int age, String adress, City city, String entreprise,
            double revenue) {
        super(name, firstname, age, adress, city);
        this.entreprise = entreprise;
        this.revenue = revenue;
    }

    @Override
    public String toString() {
        return super.toString() + ", Entreprise : " + entreprise + ", % CA :" + revenue;
    }
    
    
}
