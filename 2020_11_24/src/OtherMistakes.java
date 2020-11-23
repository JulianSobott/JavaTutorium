import java.math.BigDecimal;

public class OtherMistakes {

    void strings() {
        String s1 = "Hello";
        String s2 = "world";
        String s3; // Hello, world

        int i = 10;
        BigDecimal b = new BigDecimal("100");
        BigDecimal result = b.add(new BigDecimal("" + 10));
        String s4; // 10 + 100 = 110

        String s5; // A grave mistake
        String s6;  // OtherMistakes@XXX
    }

    @Override
    public String toString() {
        return "A grave mistake";
    }
}
