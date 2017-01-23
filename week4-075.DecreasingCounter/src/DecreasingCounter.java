
public class DecreasingCounter {

    private int value; 
    private int initialValue;

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.initialValue = valueAtStart;
    }

    public void printValue() {
        // do not touch this!
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        // write here code to decrease counter value by one
        this.value--;

        if (this.value < 0) {
            this.value = 0;
        }
    }

    public void reset() {
        this.value = 0;
    }

    public void setInitial(){
        this.value = initialValue;
    }
}