public class City {
    private String nameCity;
    private String nameCountry;
    private int numberResidents;

    public City(String country, String city, int number){
        setNameCoutry(country);
        setNameCity(city);
        setNumberResidents(number);
    }

    public City(String city, int number){
        setNameCity(city);
        setNumberResidents(number);
        setNameCountry("unknow");
    }

    public void setNameCountryUser(String country){
        if(nameCountry.equals("unkonw")) setNameCountry(country);
    }

    private void setNameCoutry(String country){
        nameCountry = country;
    }

    private void setNameCity(String city){
        nameCity = city;
    }

    private void setNumberResidents(int number){
        if(number > 20000) numberResidents = number;
        else System.out.println("Une ville a au moins 20 000 habitants");
    }

    public String getnameCountry(){
        return nameCountry;
    }

    public String getnameCity(){
        return nameCity;
    }

    public int getnumberResidents(){
        return numberResidents;
    }

    public String toString(){
        return nameCity + " est en " + nameCountry + " et a " + numberResidents + " habitants.";
    }
    
}
