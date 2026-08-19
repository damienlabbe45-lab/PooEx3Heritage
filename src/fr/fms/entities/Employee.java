package fr.fms.entities;

public class Employee extends Person{
    String entreprise;
    double salaries;
    private static double SALARIESMIN = 180.3;
    private static double SALARIESMAX = 4567843.01 ;
    
    public Employee(String name, String firstname, int age, String adress, String entreprise, double salaries) {
        super(name, firstname, age, adress);
        this.entreprise = entreprise;
        setSalaries(salaries);
    }

    public Employee(String name, String firstname, int age, String adress, City city, String entreprise,
            double salaries) {
        super(name, firstname, age, adress, city);
        this.entreprise = entreprise;
        setSalaries(salaries);
    }

    @Override
    public String toString() {
        return super.toString() + ", Entreprise: " + entreprise + ", salaire :  " + salaries;
    }

    public void setSalaries(double salaries) {
        if(salaries > SALARIESMIN && SALARIESMAX > salaries)this.salaries = salaries;
        else if(SALARIESMAX > salaries) System.out.println("Le salaire n'est pas assez élevé");
        else System.out.println("Le salaire est trop élevé");
        
    }

    @Override
    public String renumeration(){
        return "le salaire mensuelle de " + lastName + " " + firstName + " est de " + ((1 - 0.2) * salaries/12 );
    }
    
}
