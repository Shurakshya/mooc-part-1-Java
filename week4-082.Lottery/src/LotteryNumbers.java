
import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {

    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {

        return this.numbers;
    }

    public void drawNumbers() {
        this.numbers = new ArrayList<Integer>();
        Random random = new Random();
        while (numbers.size() < 7) {
            int newnumber = 1 + random.nextInt(39);

            if (!(containsNumber(newnumber))) {
                numbers.add(newnumber);
            }

        }

    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers

        if ((numbers.contains(number))) {
            return true;
        }
        return false;
    }
}
