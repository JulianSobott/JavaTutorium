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
        int idxCurrentPlayer = 0;
        Player currentPlayer;
        while (true) {
            currentPlayer = players.get(idxCurrentPlayer);
            System.out.printf("%nNext player is: %s%n", currentPlayer.getName());
            int guess = currentPlayer.getNumber();
            System.out.println(currentPlayer.getName() + " guessed: " + guess);
            if (game.checkNumber(guess)) {
                System.out.println(currentPlayer.getName() + " won");
                break;
            } else {
                System.out.println(currentPlayer.getName() + " guessed wrong");
            }
            idxCurrentPlayer = (idxCurrentPlayer+1) % 2;
        }
        currentPlayer.createCertificate();
    }

    private void generateNumber() {
        this.number = (int) (Math.random() * 10);
    }

    private boolean checkNumber(int in) {
        return in == this.number;
    }
}
