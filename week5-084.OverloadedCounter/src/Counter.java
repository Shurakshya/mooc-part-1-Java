/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shurakshyakharel
 */
public class Counter {

    private int value;
    private boolean positive;

    public Counter(int startingValue, boolean check) {
        this.value = startingValue;
        if (check == true) {
            this.positive = check;
        } else {
            this.positive = false;
        }

    }

    public Counter(int startingValue) {
        this.value = startingValue;
        this.positive = false;
    }

    public Counter(boolean check) {
        this.value = 0;
        if (check == true) {
            this.positive = check;
        } else {
            this.positive = false;
        }

    }

    public Counter() {
        this.value = 0;
        this.positive = false;

    }

    public int value() {
        return this.value;
    }

    public void increase() {
        this.value++;
    }

    public void decrease() {
        if (positive == true) {
            if(value > 0){
             this.value--;   
            }
            
        } else {
            this.value --;
        }
    }

    public void increase(int increaseAmount) {
        if (increaseAmount < 0) {
            this.value = value;
        } else {
            this.value += increaseAmount;
        }

    }

    public void decrease(int decreaseAmount) {
        if (positive == true) {
            if((value < decreaseAmount)){
             this.value = 0;   
            }
            
        }else if(decreaseAmount < 0){
            this.value = value;
        } else {
            this.value -= decreaseAmount;
        }
        
        

    }

    @Override
    public String toString() {
        return "" + this.value;
    }
}
