package fr.fms.entities;
import java.util.List;
import java.util.Arrays;

public class TestEntities {
    public static void main(String[] args) {
        if( args.length > 0) throw new IllegalArgumentException(" pas d'arguments");
        Employee emmanuel = new Employee("Emmanuel", "Macron", 43, "habitant L'Elysée à Paris", 
        new City("Amiens", "France"), "etat Français", 345768.89);
        System.out.println(emmanuel);
        SalesPerson sarkozy = new SalesPerson("Nicolas", "Sarkozy",66, "habitant Paris", 
        new City("Paris", "France", 2000000), "etat français", 4.7);
        SalesPerson johnson = new SalesPerson("Johnson", "Boris", 56, "habitant Dominique Street à London", 
        new City("New York", "Etats-unis"), "Studio gfhje", 5.7);
        Employee depardieu = new Employee("Depardieu", "Gerard", 72, "habitant Moscou", 
        new City("Châteauroux", "France"), "Studio Lamars", 456098.67);
        Employee kravitz = new Employee("Kravitz", "Lenny", 56, "Hotel particulier à Paris",
            new City("New York", "USA"), "agence de voyange Mme Irma", 56789.09);
        SalesPerson lawrence = new SalesPerson("Lawrence", "Jennifer", 30, "habitant Louisville", 
        new City("New York", "USA"), "Alphabet",12.9);
        Person[] personality = {emmanuel,sarkozy,johnson, depardieu, kravitz, lawrence};
        for(Person residents:personality)System.out.println(residents.renumeration());
        List<Person> pepol = Arrays.asList(sarkozy,emmanuel,depardieu,johnson,lawrence,kravitz);
        for(Person residents:pepol)System.out.println(residents.renumeration());

    }
}
