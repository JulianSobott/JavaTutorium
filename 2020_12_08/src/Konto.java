/**
 * Musterlösung Übung 1: Klasse Konto.
 *
 * @author Carsten Lecon
 * @version 1
 */
public class Konto
{
    private static int KNR = 1000;

    private int kontonummer;
    private String inhaberIn;
    private double kontostand;

    /**
     * Konstruktor für Objekte der Klasse Konto
     */
    public Konto(String inh)
    {
        kontonummer = KNR++;
        inhaberIn = inh;
        kontostand = 500.0;
    }

    /**
     * Methode, um auf dem Konto einen Betrag einzuzahlen
     *
     * @param  betrag   Der Betrag, der auf das Konto eingezahlt werden soll
     */
    public void einzahlen(double betrag)
    {
        kontostand += betrag;
    }

    /**
     * Methode, um von dem Konto einen Betrag auszuzahlen
     *
     * @param  betrag   Der Betrag, der von dem Konto ausgezahlt werden soll
     */
    public void auszahlen(double betrag)
    {
        if ((kontostand - betrag) >= 0) {
            kontostand -= betrag;
        } else {
            System.out.println("Konto ist nicht gedeckt!");
        }
    }

    /**
     * Methode, um die Kontodaten am Bildschirm auszugeben
     */
    public void ausgabe()
    {
        System.out.print("Kontonummer: " + kontonummer);
        System.out.print(", Inhaber/in: " + inhaberIn);
        System.out.println(", Kontostand: " + kontostand + "\n");
    }

    /**
     * Methode, um einen Betrag vom aktuellen Konto auf ein anderes zu überweisen
     *
     * @param  betrag       Der Betrag, der transferiert werden soll
     * @param  zielkonto    Das Konto, auf das der Betrag transferiert werden soll
     *
     * @return true, wenn Transfervoraussetzungen erfüllt sind (siehe Übungsblatt), andernfalls false
     */
    public boolean ueberweisen(double betrag, Konto zielkonto) {
        if ( (zielkonto == null) || (zielkonto == this)) {
            System.out.println("Kein/ gleiches Konto!");
            return false;
        }
        if ((kontostand - betrag) >= 0) {
            kontostand -= betrag;
            zielkonto.einzahlen(betrag);
            return true;
        } else {
            System.out.println("Konto ist nicht gedeckt!");
            return false;
        }

    }
}