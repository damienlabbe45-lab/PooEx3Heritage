package fr.fms.entities;

public class TestCapital {

    public static void main(String[] args) {
        if( args.length > 0) throw new IllegalArgumentException(" pas d'arguments");
        System.out.println(City.counter);
        City paris = new Capital("France","Paris", 2000000, "Tour Eiffel");
        City londres = new Capital("GB","Londres", 940000, "BigBen");
        System.out.println(paris);
        System.out.println(londres);
     }
}
