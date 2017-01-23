
public class BoundedCounter {

    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {

        this.upperLimit = upperLimit;
        this.value = 0;

    }

    // method for changing the time
    public void next() {
        if (this.value == this.upperLimit) {
            this.value = 0;
        } else {
            this.value++;
        }

    }

    public int getValue() {

        return this.value;

    }

    public void setValue(int count) {

        if (count < 0 || count > this.upperLimit) {
            return;
        }
        this.value = count;
    }

    public String toString() {
        if (value < 10) {
            return ("0" + value);
        } else {
            return ("" + value);
        }

    }

}
