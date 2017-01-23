import java.util.Random;

public class PasswordRandomizer {
    private int numberOfCharacters;
    private Random random;

    public PasswordRandomizer(int length) {
        this.numberOfCharacters = length;
        this.random = new Random();
    }

    public String createPassword() {
        String range = "abcdefghijklmnopqrstuvwxyz";
        String password = "";
        for(int i=0; i < numberOfCharacters; i++){
            char symbol = range.charAt(random.nextInt(25));
            password = password + symbol ;
        }
        return password;
    }
}
