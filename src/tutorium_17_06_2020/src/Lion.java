public class Lion extends Vierbeiner implements Renderable {
    @Override
    public void eat() {
        super.eat();
        System.out.println(" a zebra");
    }

    @Override
    public void draw() {
        System.out.println("I am a lion");
    }
}
