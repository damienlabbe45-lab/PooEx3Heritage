public class TestPerson {
    public static void main(String[] args) {
        if( args.length > 0) throw new IllegalArgumentException(" pas d'arguments");
        Person emmanuel = new Person("Emmanuel", "Macron", 43, "habitant L'Elysée à Paris", 
        new City("Amiens", "France"));
        Person hariken = new Person("Harikeñ", "Von Nohr", 13, "Chateau d'Emeraude");
        Person corren = new Person("Corren", "Kou", 29, "Morthal");
        System.out.println(emmanuel);
        System.out.println(hariken);
        System.out.println(corren);
        Person sarkozy = new Person("Nicolas", "Sarkozy",66, "habitant Paris", 
        new City("Paris", "France", 2000000));
        Person johnson = new Person("Johnson", "Boris", 56, "habitant Dominique Street à London", 
        new City("New York", "Etats-unis"));
        Person depardieu = new Person("Depardieu", "Gerard", 72, "habitant Moscou", 
        new City("Châteauroux", "France"));
        Person kravitz = new Person("Kravitz", "Lenny", 56, "Hotel particulier à Paris",
            new City("New York", "USA"));
        Person lawrence = new Person("Lawrence", "Jennifer", 30, "habitant Louisville", 
        new City("New York", "USA"));
        Person[] personality = {emmanuel,sarkozy,johnson, depardieu, kravitz, lawrence};
        System.out.println("Liste des personalités");
        for(Person perso:personality)System.out.println(perso);
        System.out.println(".....................................................................................................\n Liste après notre filtre");
        for(Person perso:personality){
            if(perso.getCityBirth().getNameCountry().equals("France") || perso.getAdress().contains("Paris"))System.out.println(perso);
        }
    }
}
