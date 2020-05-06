public class Main {

    public static void main(String[] args) {
        Person p1 = new Person();

        // Standard werte
        System.out.println(p1.alter);
        System.out.println(p1.name);
        System.out.println(p1.adresse);

        // Werte ändern
        p1.neuesAlter(10);
        p1.neueAdresse("Aalen");
        System.out.println(p1.getBeschreibung());
        p1.neueAdresse("Essen");
        System.out.println(p1.getBeschreibung());
    }
}
