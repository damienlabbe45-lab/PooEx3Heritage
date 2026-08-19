package fr.fms.entities;

public class Employee extends Person{
    /* classe des employés classique héritant de Person*/
    String entreprise;
    double salaries;
    private static double SALARIESMIN = 180.3;
    private static double SALARIESMAX = 4567843.01 ;
    
    public Employee(String name, String firstname, int age, String adress, String entreprise, double salaries) {
        /*
        @params name nom du salarié
        @params firstname prénom du salarié
        @params age age du salarié
        @params adress  l'addresse du salarié
        @params enterprise l'entreprise du salarié
        @params salaries le salaire du salarié */
        super(name, firstname, age, adress);
        this.entreprise = entreprise;
        setSalaries(salaries);
    }

    public Employee(String name, String firstname, int age, String adress, City city, String entreprise,
            double salaries) {
                 /*
        @params name nom du salarié
        @params firstname prénom du salarié
        @params age age du salarié
        @params adress  l'addresse du salarié
        @params city la ville de naissance du salarié
        @params enterprise l'entreprise du salarié
        @params salaries le salaire du salarié */
        super(name, firstname, age, adress, city);
        this.entreprise = entreprise;
        setSalaries(salaries);
    }

    @Override
    public String toString() {
        /*
        reurn un String */
        return super.toString() + ", Entreprise: " + entreprise + ", salaire :  " + salaries;
    }

    public void setSalaries(double salaries) {
        /* 
        @params salaries le salaire du salaire */
        if(salaries > SALARIESMIN && SALARIESMAX > salaries)this.salaries = salaries;
        else if(SALARIESMAX > salaries) System.out.println("Le salaire n'est pas assez élevé");
        else System.out.println("Le salaire est trop élevé");
        
    }

    @Override
    public String remuneration(){
        /*retourne un String.
        le salaire mensuel net est calculé à partir du salaire annuel brut */
        return "le salaire mensuel de " + lastName + " " + firstName + " est de " + ((1 - 0.2) * salaries/12 );
    }
    
}
