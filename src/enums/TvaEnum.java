package enums;

// En Belgique, il en existe trois différents : le taux standard à 21 %, le taux intermédiaire à 12 %,
// et le taux réduit à 6 %. Un taux zéro peut même s’appliquer dans certains cas exceptionnels.
public enum TvaEnum {

    STANDARD(21, "Taux standard"),
    INTERMEDIAIRE(12, "Taux intermédiaire"),
    REDUIT(6, "Taux réduit"),
    ZERO(0, "Taux zéro");

    private final double taux;
    private final String desc;

    private TvaEnum(double taux, String desc) {
        // ↑ Constructeur privé !!!
        this.taux = taux;
        this.desc = desc;
    }

    public double getTaux() {
        return taux;
    }

    public double AppliquerTVA(double prix) {

        return prix + ((prix * taux) / 100);
    }
}
