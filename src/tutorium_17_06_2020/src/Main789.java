public class Main789 {

    public static void main(String[] args) {
        Animal a = new Lion();
        a.eat();

        Renderable r = new Lion();
        r.draw();


        Renderable[] objects = new Renderable[100];
        objects[0] = new Lion();
        objects[1] = new Table();

        // Render loop
        System.out.println("___________________ Render all object__________________");
        for (Renderable object : objects) {
            if (object != null) {
                object.draw();
            }
        }

        for (int i = 0; i < objects.length; i++) {
            if(objects[i] != null) {
                objects[i].draw();
            }
        }
    }

}
