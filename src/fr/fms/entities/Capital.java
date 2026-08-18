package fr.fms.entities;

public class Capital extends City{
    String landmark;

    public Capital(String country, String city, int number, String landmark) {
        super(country, city, number);
        this.landmark = landmark;
    }

    public Capital(String city, int number, String landmark) {
        super(city, number);
        this.landmark = landmark;
    }

    public Capital(String city, String country, String landmark) {
        super(city, country);
        this.landmark = landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getLandmark() {
        return landmark;
    }

    @Override
    public String toString() {
        return super.toString() + ", monument: " + landmark ;
    }

    @Override
    public String city() {
        return super.city() + ", monument: " + landmark ;
    }
    
}
