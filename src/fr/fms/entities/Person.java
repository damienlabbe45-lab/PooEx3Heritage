package fr.fms.entities;
public class Person {
    protected String lastName;
    protected String firstName;
    protected int age;
    protected String adress;
    protected City cityBirth;

    public Person(String name, String firstname, int age, String adress){
        this.lastName = name;
        this.firstName = firstname;
        this.age = age;
        this.adress = adress;
    }

    public Person(String name, String firstname, int age, String adress, City city){
        this.lastName = name;
        this.firstName = firstname;
        this.age = age;
        this.adress = adress;
        cityBirth = city;
    }

    @Override
    public String toString() {
        if(cityBirth != null)return lastName +" "+ firstName + " "  + age + " ans " + adress + ", ville de naissance :" + cityBirth.city();
        else return "Person [lastName=" + lastName + ", firstName=" + firstName + ", age=" + age + ", adress=" + adress
                +  "]";
    }

    public String getAdress() {
        return adress;
    }

    public City getCityBirth() {
        return cityBirth;
    }

    
    
}
