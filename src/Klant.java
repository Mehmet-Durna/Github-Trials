import java.util.ArrayList;

/**
 * class Klant - geef hier een beschrijving van deze class
 *
 * @author (jouw naam)
 * @version (versie nummer of datum)
 */
public class Klant
{
    private String naam;
    private int postcode;
    private ArrayList<Artikel> artikels;

    public Klant(String naam, int postcode) {
        this.naam = naam;
        this.postcode = postcode;
        artikels = new ArrayList<>();
    }

    public void koop(Artikel artikel) {
        artikels.add(artikel);
    }

    public String toString() {
        String ret = naam + " woonachtig te " + postcode + " heeft de volgende artikels gekocht:\n";
        double incl = 0;
        double excl = 0;
        for (Artikel artikel : artikels) {
            ret += "  " + artikel.toString() + "\n";
            incl += artikel.getPrijs();
            excl += artikel.getNettoPrijs();
        }
        ret += "te betalen inclusief BTW: " + incl + "\n";
        ret += "te betalen exclusief BTW: " + excl;
        return ret;
    }


    public Artikel bepaalGoedkoopste() {
        if (artikels.isEmpty()) return null;
        Artikel goedkoopste = artikels.get(0);
        for (Artikel artikel : artikels) {
            if (goedkoopste.getPrijs() > artikel.getPrijs()) {
                goedkoopste = artikel;
            }
        }
        return goedkoopste;
    }

    public ArrayList<Artikel> bepaalDuurste() {
        if (artikels.isEmpty()) return null;
        Artikel metHoogstePrijs = artikels.get(0);
        for (Artikel artikel : artikels) {
            if (metHoogstePrijs.getPrijs() < artikel.getPrijs()) {
                metHoogstePrijs = artikel;
            }
        }
        ArrayList<Artikel> duurste = new ArrayList<>();
        for (Artikel artikel : artikels) {
            if (artikel.getPrijs()==metHoogstePrijs.getPrijs()) {
                duurste.add(artikel);
            }
        }
        return duurste;
    }
}
