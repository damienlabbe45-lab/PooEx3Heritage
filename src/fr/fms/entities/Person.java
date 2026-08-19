package fr.fms.entities;
public  abstract class Person {
    /* classe abstraite Person qui au départ était une classe normale mais suite à la méthode abstraite remuneration ,
    elle a du devenir une classe abstraite */
    protected String lastName;
    protected String firstName;
    protected int age;
    protected String adress;
    protected City cityBirth;

    protected Person(String name, String firstname, int age, String adress){
        /*
        @params name nom du salarié
        @params firstname prénom du salarié
        @params age age du salarié
        @params adress  l'addresse du salarié
        */
        this.lastName = name;
        this.firstName = firstname;
        this.age = age;
        this.adress = adress;
    }

    protected Person(String name, String firstname, int age, String adress, City city){
        /*
        @params name nom du salarié
        @params firstname prénom du salarié
        @params age age du salarié
        @params adress  l'addresse du salarié
        @params city la ville de naissance du salarié
        */
        this.lastName = name;
        this.firstName = firstname;
        this.age = age;
        this.adress = adress;
        cityBirth = city;
    }

    @Override
    public String toString() {
        /*
        return un String */
        if(cityBirth != null)return lastName +" "+ firstName + " "  + age + " ans " + adress + ", ville de naissance :" + cityBirth.residents();
        else return "Person [lastName=" + lastName + ", firstName=" + firstName + ", age=" + age + ", adress=" + adress
                +  "]";
    }

    public String getAdress() {
        /* donne l'addresse de la personne */
        return adress;
    }

    public City getCityBirth() {
        /*donne la ville de naissance de la personne */
        return cityBirth;
    }

    public abstract String remuneration();
    /* méthode abstraite de la rénumération de la personne */
    
}
