public class TestCity {
     public static void main(String[] args) {
        if( args.length > 0) throw new IllegalArgumentException(" pas d'arguments");
        City toulouse = new City("Toulouse", 45000);
        City paris = new City("France","Paris", 8900000);
        City barcelone = new City("Espagne","Barcelone", 890000);
        System.out.println(toulouse.getnumberResidents());
        System.out.println(paris.getnameCountry());
        System.out.println(barcelone.getnameCountry());
        //toulouse.numberResidents = 3566987;
        toulouse.setNameCountryUser("France");
        System.out.println(toulouse.getnameCountry());
     }
    
}
