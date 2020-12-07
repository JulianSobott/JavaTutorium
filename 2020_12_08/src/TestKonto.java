import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestKonto {

    @Test
    void testUeberweisenSuccess() {
        // Initial kontostand = 500.0

        Konto k1 = new Konto("Tom");
        Konto k2 = new Konto("Anna");
        boolean res = k1.ueberweisen(500, k2);
        assertTrue(res);
    }

    @Test
    void testUeberweisenNullKonto() {
        Konto k1 = new Konto("Tom");
        boolean res = k1.ueberweisen(100, null);
        assertFalse(res);
    }

    @Test
    void testUeberweisenSameKonto() {
        Konto k1 = new Konto("Tom");
        boolean res = k1.ueberweisen(100, k1);
        assertFalse(res);
    }

    @Test
    void testUeberweisenNotEnoughMoney() {
        Konto k1 = new Konto("Tom");
        boolean res = k1.ueberweisen(501, k1);
        assertFalse(res);
    }
}
