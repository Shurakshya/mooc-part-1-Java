
public class NumberStatistics {

    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {
        this.amountOfNumbers = 0;

    }

    public void addNumber(int number) {
        int addedNumber = number;
        sum = sum + addedNumber;
        this.amountOfNumbers++;

    }

    public int amountOfNumbers() {

        return amountOfNumbers;
    }

    public int sum() {
        if (amountOfNumbers == 0) {
            return sum = 0;
        } else {
            return sum;
        }

    }

    public double average() {

        double average = (double) sum / amountOfNumbers;
        if (amountOfNumbers == 0) {
            return average = 0;

        } else {
            return average;
        }

    }
}
