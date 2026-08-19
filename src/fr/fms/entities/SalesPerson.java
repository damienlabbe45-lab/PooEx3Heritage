package fr.fms.entities;

class SalesPerson extends Person{

    String entreprise;
    double revenue;
    private static double REVENUMIN = 0.1;
    private static double REVENUMAX = 15.0;

    public SalesPerson(String name, String firstname, int age, String adress, String entreprise, double revenue) {
        super(name, firstname, age, adress);
        this.entreprise = entreprise;
        setRevenue(revenue);
    }

    public SalesPerson(String name, String firstname, int age, String adress, City city, String entreprise,
            double revenue) {
        super(name, firstname, age, adress, city);
        this.entreprise = entreprise;
        setRevenue(revenue);
    }

    @Override
    public String toString() {
        return super.toString() + ", Entreprise : " + entreprise + ", % CA :" + revenue;
    }

    public void setRevenue(double revenue) {
        if(revenue < REVENUMAX && REVENUMIN > revenue)this.revenue = revenue;
        else if(REVENUMAX > revenue) System.out.println("Le revenu n'est pas assez élevé");
        else System.out.println("Le revenu est trop élevé, l'entreprise va faire faillite");
    }
    
    
}
