package guessing_game;

import java.util.ArrayList;
import java.util.List;

public class GuessingGame {

    private int number;

    public static void main(String[] args) {
        GuessingGame game = new GuessingGame();
        Player pHuman = new HumanPlayer("Tom");
        Player pAi = new PlayerAi("Ai");
        List<Player> players = new ArrayList<>();
        players.add(pAi);
        players.add(pHuman);

        game.generateNumber();
        while (true) {
            int humanGuess = pHuman.getNumber();
            if (game.checkNumber(humanGuess)) {
                System.out.println(pHuman.getName() + " won");
                break;
            } else {
                System.out.println(pHuman.getName() + " guessed wrong");
            }

            int aiGuess = pAi.getNumber();
            System.out.println("Ai guessed: " + aiGuess);
            if (game.checkNumber(aiGuess)) {
                System.out.println(pAi.getName() + " won");
                break;
            } else {
                System.out.println(pAi.getName() + " guessed wrong");
            }
        }
    }

    private void generateNumber() {
        this.number = (int) (Math.random() * 10);
    }

    private boolean checkNumber(int in) {
        return in == this.number;
    }
}
