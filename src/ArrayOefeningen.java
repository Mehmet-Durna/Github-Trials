import java.util.Random;

/**
 * class ArrayOefeningen - geef hier een beschrijving van deze class
 *
 * @author (jouw naam)
 * @version (versie nummer of datum)
 */
public class ArrayOefeningen
{
    private boolean groterDanNul(int getal) {
        if (getal<=0) {
            System.out.println("Het ingevoerde getal moet groter dan 0 zijn!");
            return false;
        }
        return true;
    }

    public void kwadraten(int max) {
        if (groterDanNul(max)) {
            int[] getallen = new int[max];
            for (int i=0; i<max; i++) {
                getallen[i] =  i+1;
            }
            for (int i=0; i<max; i++) {
                System.out.println("Het kwadraat van " + getallen[i] + " is " + getallen[i]*getallen[i]);
            }
        }
    }

    public void vierkantswortels(int max) {
        if (groterDanNul(max)) {
            int[] getallen = new int[max];
            for (int i=0; i<max; i++) {
                getallen[i] =  i+1;
            }
            for (int i=getallen.length-1; i>=0; i--) {
                System.out.println("De vierkantswortel van " + getallen[i] + " is " + Math.sqrt(getallen[i]));
            }
        }
    }

    public void tafels(int max) {
        if (groterDanNul(max)) {
            int[] getallen = new int[10];
            for (int i=0; i<10; i++) {
                getallen[i] = i+1;
            }
            for (int i=1; i<=max; i++) {
                for (int j=0; j<10; j++) {
                    System.out.println(i + " * " + (j+1) + " = " + (i*(j+1)));
                }
            }
        }
    }

    public void randomGemiddeld() {
        Random rand = new Random();
        int[] getallen = new int[10];
        System.out.print("Het gemiddelde van ");
        double gemiddelde = 0;
        for (int i=0; i<10; i++) {
            getallen[i] = rand.nextInt(100) + 1;
            gemiddelde += getallen[i];
            System.out.print(getallen[i]);
            if (i==9) {
                System.out.print(" is ");
            } else if(i==8) {
                System.out.print(" en ");
            } else {
                System.out.print(", ");
            }
        }
        System.out.print(gemiddelde/10);
    }
}
