
import java.util.ArrayList;
import java.util.Scanner;

public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;
    Scanner reader = new Scanner(System.in);

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        // program here the functionality for making a guess
        for (int i = 1; i < 20; i++) {

            System.out.println("Guess a letter: ");
            String name = reader.nextLine();

            if (!(word.contains(name))) {
                this.numberOfFaults++;
                if (!(guessedLetters.contains(name))) {
                    guessedLetters = guessedLetters + name;
                }

            } else {

            }

        }
    }

    public String hiddenWord() {
        String hiddenword = "";
        int i = 0;

        ArrayList<Character> letters = new ArrayList<Character>();
        for (char c : word.toCharArray()) {
            letters.add(c);
        }
        while (i < letters.size()) {
            char x = letters.get(i);
            String y = "";
            y = x + y;

            if (guessedLetters.contains(y)) {
                hiddenword = hiddenword + x;

            } else {
                hiddenword = hiddenword + "_";

            }
            i++;
        }
        return hiddenword;

    }

}
