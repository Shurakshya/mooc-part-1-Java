
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        // at start the register has 1000 euros 
        this.cashInRegister = 1000.00 ; 
        this.economicalSold = 0;
        this.gourmetSold = 0;
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        double lunchPrice = 2.50;
        if(cashGiven >= lunchPrice ){
            cashInRegister += lunchPrice;
            economicalSold++;
            return cashGiven - lunchPrice;
        }
        return cashGiven;
       }
        
    

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
       double lunchPrice = 4.00;
        if(cashGiven >= lunchPrice ){
            cashInRegister += lunchPrice;
            gourmetSold++;
            return cashGiven - lunchPrice;
        }
        return cashGiven;
      
    
    }
    
    public boolean payEconomical(LyyraCard card) {
        double lunchPrice = 2.50;
        if(card.pay(lunchPrice)){
            economicalSold++;
            return true;
        }
        return false;
    }
    
    public boolean payGourmet(LyyraCard card) {
        double lunchPrice = 4.00;
        if(card.pay(lunchPrice)){
            gourmetSold++;
            return true;
        }
        return false;
    }
    
    public void loadMoneyToCard(LyyraCard card, double sum) {
        if(sum > 0){
            card.loadMoney(sum);
            cashInRegister += sum;
            
        }
        
    }


    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}