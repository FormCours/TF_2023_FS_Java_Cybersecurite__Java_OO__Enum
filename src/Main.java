import enums.TvaEnum;

public class Main {
    public static void main(String[] args) {

        double prixProduit = 42;

        TvaEnum tva = TvaEnum.STANDARD;

        double prixTTC = tva.AppliquerTVA(prixProduit);

    }
}