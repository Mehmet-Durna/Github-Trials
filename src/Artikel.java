
/**
 * class Artikel - geef hier een beschrijving van deze class
 *
 * @author (jouw naam)
 * @version (versie nummer of datum)
 */
public class Artikel
{
    private String omschrijving;
    private double nettoPrijs;
    private double btwPercentage;

    public Artikel(double btwPercentage, double nettoPrijs, String omschrijving) {
        this.omschrijving = omschrijving;
        this.nettoPrijs = nettoPrijs;
        this.btwPercentage = btwPercentage;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public double getNettoPrijs() {
        return nettoPrijs;
    }

    public double getBtwPercentage() {
        return btwPercentage;
    }

    public double getPrijs() {
        return nettoPrijs * (1 + btwPercentage/100);
    }

    public String toString() {
        return omschrijving + ": " + getPrijs();
    }
}
