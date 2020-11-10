package guessing_game;

public abstract class Player {

    private String name;

    public Player(String name) {
        this.name = name;
    }

    public abstract int getNumber();

    public String getName() {
        return name;
    }
}
