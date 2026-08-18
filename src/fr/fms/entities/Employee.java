package fr.fms.entities;

public class Employee extends Person{
    String entreprise;
    double salaries;
    
    public Employee(String name, String firstname, int age, String adress, String entreprise, double salaries) {
        super(name, firstname, age, adress);
        this.entreprise = entreprise;
        this.salaries = salaries;
    }

    public Employee(String name, String firstname, int age, String adress, City city, String entreprise,
            double salaries) {
        super(name, firstname, age, adress, city);
        this.entreprise = entreprise;
        this.salaries = salaries;
    }

    @Override
    public String toString() {
        return super.toString() + ", Entreprise: " + entreprise + ", salaire :  " + salaries;
    }

    

    
}
