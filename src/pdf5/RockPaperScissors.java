package pdf5;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public enum Move {
        ROCK, PAPER, SCISSORS
    }
    public enum Outcome {
        WIN, LOSE, DRAW
    }

    public static Move getUserInput(Scanner sc) throws IllegalArgumentException {
        System.out.println("Wybierz ruch: rock/paper/scissors:");
        Move move = switch (sc.nextLine().toLowerCase()) {
            case "rock" -> Move.ROCK;
            case "paper" -> Move.PAPER;
            case "scissors" -> Move.SCISSORS;
            default -> throw new IllegalArgumentException("Invalid move");
        };
        System.out.println("Wybrałeś " + move);

        return move;
    }

    public static Move getComputerMove(Random rng) {
        int pick = rng.nextInt(Move.values().length);
        return Move.values()[pick];
    }

    public static Outcome winner(Move user, Move computer) {
        if (user == computer) {
            return Outcome.DRAW;
        }
        if (user == Move.ROCK && computer == Move.SCISSORS ||
                user == Move.PAPER && computer == Move.ROCK ||
                user == Move.SCISSORS && computer == Move.PAPER) {
            return Outcome.WIN;
        }
        return Outcome.LOSE;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rng = new Random();
        Move computer = getComputerMove(rng);
        Move user = getUserInput(sc);
        System.out.println("Komputer wybrał " + computer);
        Outcome outcome = winner(user, computer);
        switch (outcome) {
            case WIN -> System.out.println("Wygrałeś!");
            case LOSE -> System.out.println("Przegrałeś!");
            case DRAW -> System.out.println("Remis!");
        }


    }
}

