public class Girokonto extends Konto{

    int dispo;

    public Girokonto(String inh, int x) {
        super(inh);
        this.dispo = x;
    }

    public void einzahlen(double betrag) {
        //
        super.einzahlen(betrag);
        //
    }
}
