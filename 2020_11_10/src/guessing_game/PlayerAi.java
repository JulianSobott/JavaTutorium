package guessing_game;

public class PlayerAi extends Player{
    public PlayerAi(String name) {
        super(name);
    }

    @Override
    public int getNumber() {
        return (int) (Math.random() * 10);
    }
}
