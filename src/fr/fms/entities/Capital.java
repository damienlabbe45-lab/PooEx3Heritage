package fr.fms.entities;

/**
 * Représente une capitale, qui est une extension de {@link City} associée à un monument représentatif[span_43](start_span)[span_43](end_span).
 */
public class Capital extends City {

    /** Le monument emblématique de la capitale[span_44](start_span)[span_44](end_span). */
    String landmark;

    /**
     * Constructeur avec pays, ville, nombre d'habitants et monument[span_45](start_span)[span_45](end_span).
     *
     * @param country Nom du pays[span_46](start_span)[span_46](end_span)
     * @param city Nom de la ville[span_47](start_span)[span_47](end_span)
     * @param number Nombre d'habitants[span_48](start_span)[span_48](end_span)
     * @param landmark Monument représentatif[span_49](start_span)[span_49](end_span)
     */
    public Capital(String country, String city, int number, String landmark) {
        super(country, city, number);
        this.landmark = landmark;
    }

    /**
     * Constructeur avec ville, nombre d'habitants et monument[span_50](start_span)[span_50](end_span).
     *
     * @param city Nom de la ville[span_51](start_span)[span_51](end_span)
     * @param number Nombre d'habitants[span_52](start_span)[span_52](end_span)
     * @param landmark Monument représentatif[span_53](start_span)[span_53](end_span)
     */
    public Capital(String city, int number, String landmark) {
        super(city, number);
        this.landmark = landmark;
    }

    /**
     * Constructeur avec ville, pays et monument[span_54](start_span)[span_54](end_span).
     *
     * @param city Nom de la ville[span_55](start_span)[span_55](end_span)
     * @param country Nom du pays[span_56](start_span)[span_56](end_span)
     * @param landmark Monument représentatif[span_57](start_span)[span_57](end_span)
     */
    public Capital(String city, String country, String landmark) {
        super(city, country);
        this.landmark = landmark;
    }

    /**
     * Définit le monument emblématique[span_58](start_span)[span_58](end_span).
     *
     * @param landmark Le nom du monument[span_59](start_span)[span_59](end_span)
     */
    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    /**
     * Obtient le monument emblématique[span_60](start_span)[span_60](end_span).
     *
     * @return Le nom du monument[span_61](start_span)[span_61](end_span)
     */
    public String getLandmark() {
        return landmark;
    }

    /**
     * Retourne la description de la capitale en ajoutant le monument au texte hérité de {@link City}[span_62](start_span)[span_62](end_span).
     *
     * @return Une chaîne décrivant la capitale et son monument[span_63](start_span)[span_63](end_span)
     */
    @Override
    public String toString() {
        return super.toString() + ", monument: " + landmark;
    }

    /**
     * Retourne le nom de la ville et du pays en y ajoutant le monument[span_64](start_span)[span_64](end_span).
     *
     * @return Une chaîne décrivant la localisation et le monument[span_65](start_span)[span_65](end_span)
     */
    @Override
    public String residents() {
        return super.residents() + ", monument: " + landmark;
    }
}
