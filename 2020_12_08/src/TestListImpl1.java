import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestListImpl1 {

    @Test
    void testPutGetValid1() {
        // preparation
        int expected = 10;
        ListImpl1 l = new ListImpl1();
        // execution
        l.put(expected);
        int x = l.get();
        // testing
        assertEquals(expected, x);
    }

    @Test
    void testPutGetValid2() {
        // preparation
        int expected = 10;
        ListImpl1 l = new ListImpl1();
        // execution
        l.put(expected);
        l.put(20);
        int x = l.get();
        // testing
        assertEquals(expected, x);
    }

    @Test
    void testPutGetInvalid() {
        // preparation
        ListImpl1 l = new ListImpl1();
        // execution
        int x = l.get();
        // testing
        assertEquals(-1, x);
    }

    @Test
    void testPutGetIValid() {
        // preparation
        ListImpl1 l = new ListImpl1();
        // execution
        int expected0 = 10;
        int expected1 = 20;
        l.put(expected0);
        l.put(expected1);
        // testing
        assertEquals(expected0, l.get(0));
        assertEquals(expected1, l.get(1));
    }

    @Test
    void testPutGetIInvalidEmpty() {
        // preparation
        ListImpl1 l = new ListImpl1();
        // execution

        // testing
        assertEquals(-1, l.get(0));
    }

    @Test
    void testPutGetIInvalidOutOfRange() {
        // preparation
        ListImpl1 l = new ListImpl1();
        // execution
        l.put(1);
        l.put(2);
        // testing
        assertEquals(-1, l.get(-1));
        assertEquals(-1, l.get(2));
    }

    // TODO: remove
}
