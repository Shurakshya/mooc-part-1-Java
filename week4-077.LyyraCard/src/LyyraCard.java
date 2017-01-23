/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shurakshyakharel
 */
public class LyyraCard {

    private double balance;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;

    }

    public String toString() {
        return "The card has " + this.balance + " euros";
    }

    public void payEconomical() {
        double payment = 2.50;
        if (payment > balance) {
            balance = this.balance;
        } else {
            balance -= payment;
        }

    }

    public void payGourmet() {
        double payment = 4.00;
        if (payment > balance) {
            balance = this.balance;

        } else {
            balance -= payment;

        }
    }

    public void loadMoney(double amount) {
        if ( amount > 0 && (balance+ amount)< 150.00){
            balance += amount;
        }else if(amount < 0){
            balance = this.balance;
            
        }else{
            balance = 150.00;
        }
        

    }

}
