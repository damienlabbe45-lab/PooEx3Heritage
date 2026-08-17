public class City {
    private String nameCity;
    private String nameCountry;
    private int numberResidents;

    public City(String country, String city, int number){
        setNameCountry(country);
        setNameCity(city);
        setNumberResidents(number);
    }

    public City(String city, int number){
        setNameCity(city);
        setNumberResidents(number);
        setNameCountry("unknow");
    }

    public void setNameCountryUser(String country){
        if(this.nameCountry.equals("unknow")) setNameCountry(country);
    }

    private void setNameCountry(String country){
        nameCountry = country;
    }

    private void setNameCity(String city){
        nameCity = city;
    }

    private void setNumberResidents(int number){
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

    public String toString(){
        return nameCity + " est en " + nameCountry + " et a " + numberResidents + " habitants.";
    }

    public void display(){
        System.out.println("Ville de Toulouse en france ayant 45000");
    }
    
}
