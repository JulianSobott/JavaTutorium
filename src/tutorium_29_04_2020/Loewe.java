package tutorium_29_04_2020;

public class Loewe extends Tier{
    String lieblingsFleisch;

    public void makeNoise() {
        System.out.println("Wrarar");
    }

    @Override
    public void move() {
        System.out.println("Rennen");
    }

    @Override
    public void zeichnen() {
        System.out.println("---|||----||>");
    }
}
