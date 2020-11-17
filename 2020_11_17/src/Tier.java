import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class Tier {

    protected String name;
    protected int age;

    public static void main(String[] args) {
        // Array
        Tier[] tiere = new Tier[4];
        for(int i = 0; i < tiere.length; i++) {
            tiere[i] = new Giraffe();
        }

        // Copy
        Tier[] newTiere = new Tier[tiere.length + 1];
        for(int i = 0; i < tiere.length; i++) {
            newTiere[i] = tiere[i];
        }

        // Add new value
        newTiere[newTiere.length - 1] = new Schwein();

        // Lunchtime
        for(int i = 0; i < newTiere.length; i++) {
            System.out.print(newTiere[i].whatsyourname() + ": ");
            newTiere[i].essen();
        }

        // Alternative mit List
        List<Tier> tierList = new ArrayList<>();

        for(int i = 0; i < tiere.length; i++) {
            tierList.add(new Giraffe());
        }
        tierList.add(new Schwein());
    }

    public String whatsyourname() {
        return "my name is: " + name;
    }

    public abstract void essen();

}
