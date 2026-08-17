public class Testperson {
    public static void main(String[] args) {
        if( args.length > 0) throw new IllegalArgumentException(" pas d'arguments");
        Person emmanuel = new Person("Emmanuel", "Macron", 46, "Elisee à Paris");
        Person hariken = new Person("Harikeñ", "Von Nohr", 13, "Chateau d'Emeraude");
        Person corren = new Person("Corren", "Kou", 29, "Morthal");
        System.out.println(emmanuel);
        System.out.println(hariken);
        System.out.println(corren);
    }
}
