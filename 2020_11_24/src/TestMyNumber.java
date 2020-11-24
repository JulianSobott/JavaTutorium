import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestMyNumber {

    @Test
    public void testMe() {
        MyNumber x = new MyNumber(10);
        MyNumber y = new MyNumber(10);

        assertTrue(x.equals(y));
    }

    @Test
    public void testMe2() {
        MyNumber x = new MyNumber(20);
        MyNumber y = new MyNumber(10);
        String t = x.blb();
    }
}
