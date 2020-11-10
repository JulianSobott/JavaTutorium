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

    public void createCertificate() {
        System.out.printf("Player %s successfully participated in a guessing game.", this.name);
    }
}
