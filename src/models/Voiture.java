package models;

public class Voiture {
    public static enum Carburant { ESSENCE, DIESEL, ELECTRIQUE, HYBRIDE }

    private String marque;
    private String modele;
    private Carburant carburant;

    public Voiture(String marque, String modele, Carburant carburant) {
        this.marque = marque;
        this.modele = modele;
        this.carburant = carburant;
    }

    public String getMarque() {
        return marque;
    }
    public void setMarque(String marque) {
        this.marque = marque;
    }
    public String getModele() {
        return modele;
    }
    public void setModele(String modele) {
        this.modele = modele;
    }
    public Carburant getCarburant() {
        return carburant;
    }
    public void setCarburant(Carburant carburant) {
        this.carburant = carburant;
    }

    public String getDescription() {
        String nomVoiture = marque.toUpperCase() + " " + modele;

        String carbuVoiture;
        switch (this.carburant) {
            case DIESEL:
                carbuVoiture = "moteur diesel";
                break;
            case ESSENCE:
                carbuVoiture = "moteur essence E98";
                break;
            case ELECTRIQUE:
                carbuVoiture = "moteur electrique (600km)";
                break;
            case HYBRIDE:
                carbuVoiture = "moteur essence & moteur electrique";
                break;
            default:
                carbuVoiture = "moteur non défini";
                break;
        }

        return nomVoiture + " - " + carbuVoiture;
    }
}
