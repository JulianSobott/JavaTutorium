package guessing_game;

import java.util.Scanner;

public class HumanPlayer extends Player{

    public HumanPlayer(String name) {
        super(name);
    }

    @Override
    public int getNumber() {
        System.out.print("Your number: ");
        Scanner t = new Scanner(System.in);
        int number = t.nextInt();
        return number;
    }
}
