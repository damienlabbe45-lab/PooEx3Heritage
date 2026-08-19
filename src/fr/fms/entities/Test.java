package fr.fms.entities;

public class Test {
    public static void main(String[] args) {
        if( args.length > 0) throw new IllegalArgumentException(" pas d'arguments");
        City paris = new Capital("France","Paris", 2000000, "Tour Eiffel");
        City londres = new Capital("GB","Londres", 940000, "BigBen");
        City barcelone = new City("Espagne","Barcelone", 890000);
        System.out.println(paris);
        System.out.println(londres);
        System.out.println(barcelone);
        Employee roger = new Employee("Roger", "Croissant", 89, "habite à Brest", paris, " boulangerie de Brest",
            23456.78);
        Employee gate = new  Employee("Gate", "Bill", 65, "habite aux USA", londres, 
        "Fondation B&M", 1200000000086.54);
        Employee diego = new Employee("La vegas", "Diego", 34, "habite au mexique", barcelone, 
        "tortillas", 5677.98);
        System.out.println(roger);
        System.out.println(gate);
        System.out.println(diego);
        SalesPerson musk = new SalesPerson("Elon", "Musk", 49, "habitant à la Silicon Valley",paris,
         "SpaceX", 16.8);

        System.out.println(musk);
     }
    
}
