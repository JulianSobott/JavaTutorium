package tutorium_29_04_2020;

public abstract class Tier implements Lebewesen, Zeichenbar {
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void makeNoise();
}
