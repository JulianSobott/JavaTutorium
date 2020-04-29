public class Giraffe extends Tier{
    int halsLaenge;

    public void makeNoise(){
        System.out.println("Ihhaha");
    }

    @Override
    public void move() {
        System.out.println("gehen");
    }

    @Override
    public void zeichnen() {
        System.out.println("|--|/-");
    }
}
