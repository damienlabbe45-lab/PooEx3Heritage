package fr.fms.entities;

class SalesPerson extends Person{
    /* classe des commerciaux héritant de Person*/

    String entreprise;
    double revenue;
    private static double REVENUMIN = 0.1;
    private static double REVENUMAX = 15.0;

    public SalesPerson(String name, String firstname, int age, String adress, String entreprise, double revenue) {
        /*
        @params name nom du commercial
        @params firstname prénom du commercial
        @params age age du commercial
        @params adress  l'addresse du commercial
        @params enterprise l'entreprise du commercial
        @params salaries le salaire du commercial */
        super(name, firstname, age, adress);
        this.entreprise = entreprise;
        setRevenue(revenue);
    }

    public SalesPerson(String name, String firstname, int age, String adress, City city, String entreprise,
            double revenue) {
                /*
        @params name nom du commercial
        @params firstname prénom du commercial
        @params age age du commercial
        @params adress  l'addresse du commercial
        @params city la ville de naissance du commercial
        @params enterprise l'entreprise des commercials
        @params salaries le salaire du commercial */
        super(name, firstname, age, adress, city);
        this.entreprise = entreprise;
        setRevenue(revenue);
    }

    @Override
    public String toString() {
        /*
        reurn un String */
        return super.toString() + ", Entreprise : " + entreprise + ", % CA :" + revenue;
    }

    public void setRevenue(double revenue) {
        /* 
        @params salaries le salaire du salaire */
        if(revenue < REVENUMAX && revenue > REVENUMIN)this.revenue = revenue;
        else if(REVENUMAX > revenue) System.out.println("Le revenu n'est pas assez élevé");
        else System.out.println("Le revenu est trop élevé, l'entreprise va faire faillite");
    }
    
    @Override
    public String remuneration(){
        /*retourne un String.
        le salaire mensuel net est calculé à partir du chiffre d'affaire. Par décision arbitraire ce chiffre d'affaire a été fixé
        à un montant énorme */
        return "le salaire mensuel de " + lastName + " " + firstName + " est de " + ((8900065.98 * revenue)/12);
    }
}
