package fr.fms.entities;

/**
 * Représente une ville avec son nom, son pays et son nombre d'habitants.
 * Maintient également un compteur global du nombre d'instances de villes créées.
 */
public class City {

    /** Nom de la ville. */
    protected String nameCity;

    /** Nom du pays. */
    protected String nameCountry;

    /** Nombre d'habitants de la ville. */
    protected int numberResidents;

    /** Compteur global d'instances créées de la classe City. */
    public static int counter = 0;

    /**
     * Constructeur complet initialisant le pays, la ville et le nombre d'habitants.
     *
     * @param country Nom du pays
     * @param city Nom de la ville
     * @param number Nombre d'habitants
     */
    public City(String country, String city, int number){
        setNameCountry(country);
        setNameCity(city);
        setNumberResidents(number);
        counter++;
    }

    /**
     * Constructeur initialisant le nom de la ville et le nombre d'habitants.
     * Le pays est défini par défaut à "unknow".
     *
     * @param city Nom de la ville
     * @param number Nombre d'habitants
     */
    public City(String city, int number){
        setNameCity(city);
        setNumberResidents(number);
        setNameCountry("unknow");
        counter++;
    }

    /**
     * Constructeur initialisant le nom de la ville et le nom du pays.
     * Le nombre d'habitants est initialisé à 0.
     *
     * @param city Nom de la ville
     * @param country Nom du pays
     */
    public City(String city, String country){
        setNameCity(city);
        setNameCountry(country);
        numberResidents = 0;
        counter++;
    }

    /**
     * Met à jour le nom du pays si la valeur actuelle est "unknow".
     *
     * @param country Le nouveau nom du pays à attribuer
     */
    protected void setNameCountryUser(String country){
        if(this.nameCountry.equals("unknow")) setNameCountry(country);
    }

    /**
     * Définit le nom du pays.
     *
     * @param country Le nom du pays
     */
    protected void setNameCountry(String country){
        nameCountry = country;
    }

    /**
     * Définit le nom de la ville.
     *
     * @param city Le nom de la ville
     */
    protected void setNameCity(String city){
        nameCity = city;
    }

    /**
     * Définit le nombre d'habitants de la ville.
     * Affiche un message d'avertissement si la population est inférieure ou égale à 20 000.
     *
     * @param number Le nombre d'habitants
     */
    protected void setNumberResidents(int number){
        if(number > 20000) numberResidents = number;
        else System.out.println("Une ville a au moins 20 000 habitants");
    }

    /**
     * Obtient le nom du pays.
     *
     * @return Le nom du pays
     */
    public String getNameCountry(){
        return nameCountry;
    }

    /**
     * Obtient le nom de la ville.
     *
     * @return Le nom de la ville
     */
    public String getNameCity(){
        return nameCity;
    }

    /**
     * Obtient le nombre d'habitants.
     *
     * @return Le nombre d'habitants
     */
    public int getNumberResidents(){
        return numberResidents;
    }

    /**
     * Génère une représentation textuelle de la ville sous forme de bloc de données.
     *
     * @return Une chaîne décrivant l'objet City
     */
    public String city() {
        if(numberResidents != 0) return "City [nameCity=" + nameCity + ", nameCountry=" + nameCountry + ", numberResidents=" + numberResidents
                + "]";
        else return "City [nameCity=" + nameCity + ", nameCountry=" + nameCountry + "]";
    }

    /**
     * Retourne une description lisible de la ville.
     *
     * @return Une chaîne indiquant la ville, le pays et le nombre d'habitants
     */
    @Override
    public String toString(){
        return "ville de " + nameCity + " en " + nameCountry + " ayant " + numberResidents + " habitants.";
    }

    /**
     * Affiche une valeur de test fixe dans la console.
     */
    public void display(){
        System.out.println("Ville de Toulouse en France ayant 45000");
    }

    /**
     * Affiche les informations de l'instance courante dans la console.
     */
    public void print(){
        System.out.println("La ville de " + nameCity + " en " + nameCountry + " ayant " + numberResidents + " habitants");
    }

    /**
     * Retourne une chaîne contenant le nom de la ville et du pays.
     *
     * @return Une chaîne au format "NomVille, NomPays"
     */
    public String residents(){
        return nameCity + ", " + nameCountry;
    }
}