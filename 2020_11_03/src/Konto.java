public class Konto {

    private int kontonummer;
    private String inhaberIn;
    private int kontostand;

    private static int counter = 1000;

    public Konto(String inh) {

        this.kontostand += 500;
        this.inhaberIn = inh;
        this.kontonummer = Konto.counter++;
    }

    public void einzahlen(double betrag) {
        meth1();
    }

    private void meth1() {
        meth2();
        System.out.println("Meth1");
    }

    private void meth2() {
        System.out.println("Meth2");
    }

}
