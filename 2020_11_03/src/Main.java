public class Main {

    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.EUCLID_OLD(12, 7));

        Konto k = new Konto("Hahaha");
        k.einzahlen(10);
    }

    int EUCLID_OLD(int a, int b) {
        int ERGEBNIS;
        if (a == 0) {
            ERGEBNIS = b;
        } else {
            while (b != 0) {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
            }
            ERGEBNIS = a;
            // h = a % b;
        }
        return ERGEBNIS;
    }

    int EUCLID_OLD_RECURSIVE(int a, int b) {
        return 0;
    }
}
