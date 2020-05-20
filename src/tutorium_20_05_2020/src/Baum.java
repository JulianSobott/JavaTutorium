public class Baum {

    private int alter = 10;

    public Baum() {
        System.out.println("Hello Baum");
    }

    public Baum t1() {
        Baum baum1 = new Baum();
        return baum1;
    }

    public void t(Object o) {
        if (o instanceof Baum) {
            Baum temp = (Baum) o;
            temp.t1();
        }
    }

    void altern() {
        this.alter++;
    }
}
