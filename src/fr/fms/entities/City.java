package fr.fms.entities;


public class City {
    protected String nameCity;
    protected String nameCountry;
    protected int numberResidents;
    public static int counter = 0;

    public City(String country, String city, int number){
        setNameCountry(country);
        setNameCity(city);
        setNumberResidents(number);
        counter++;
    }

    public City(String city, int number){
        setNameCity(city);
        setNumberResidents(number);
        setNameCountry("unknow");
        counter++;
    }

    public City(String city, String country){
        setNameCity(city);
        setNameCountry(country);
        numberResidents = 0;
        counter++;
    }

    protected void setNameCountryUser(String country){
        if(this.nameCountry.equals("unknow")) setNameCountry(country);
    }

    protected void setNameCountry(String country){
        nameCountry = country;
    }

    protected void setNameCity(String city){
        nameCity = city;
    }

    protected void setNumberResidents(int number){
        if(number > 20000) numberResidents = number;
        else System.out.println("Une ville a au moins 20 000 habitants");
    }

    public String getNameCountry(){
        return nameCountry;
    }

    public String getNameCity(){
        return nameCity;
    }

    public int getNumberResidents(){
        return numberResidents;
    }

    public String city() {
        if(numberResidents != 0) return "City [nameCity=" + nameCity + ", nameCountry=" + nameCountry + ", numberResidents=" + numberResidents
                + "]";
        else return "City [nameCity=" + nameCity + ", nameCountry=" + nameCountry + "]";
    }

    public String toString(){
        return "ville de " + nameCity + " en " + nameCountry + " ayant " + numberResidents + " habitants.";
    }

    public void display(){
        System.out.println("Ville de Toulouse en France ayant 45000");
    }

    public void print(){
        System.out.println("La ville de " + nameCity + " en " + nameCountry + " ayant "  + numberResidents + " habitants");
    }
    
    public String residents(){
        return nameCity + ", " + nameCountry ;
    }
}
