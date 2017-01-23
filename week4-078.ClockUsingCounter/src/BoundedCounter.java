/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shurakshyakharel
 */
public class BoundedCounter {

    private int value;
    private int upperLimit;
    

    public BoundedCounter(int upperLimit) {
        this.value = 0;
        this.upperLimit = upperLimit;
       

    }
    
    // method for changing the time
    public void next() {
        if (value == upperLimit) {  
            value = 0;
        } else {
            value++;
        }

    }

    public String toString() {
        if (value < 10) {
            return ("0" + value);
        } else {
            return ("" + value);
        }

    }

    public int getValue() {

        return this.value;

    }
    
    
    public void setValue(int count){
        
     if(count < 0 || count > upperLimit){
         return;
     } 
     this.value = count;
    }

}
