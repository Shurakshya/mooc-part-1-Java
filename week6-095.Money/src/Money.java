
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    public Money plus(Money added){
        int a=0;
        int totalCents = added.cents + this.cents ;
        if(totalCents > 99){
            a= totalCents/100;
            totalCents %= 100;
        }
        int totalEuros = added.euros + this.euros + a ; 
        Money totalMoney = new Money(totalEuros, totalCents);
        
        return totalMoney;     
    }
    
    public boolean less(Money compared){
        if(this.euros < compared.euros){
            return true;
        }
        if(this.euros == compared.euros && this.cents < compared.cents){
            return true;
        }
        return false;
    }
    
    public Money minus(Money decremented){
        int euroDiff = 0 , centDiff = 0;
        double totalMoney;
        Money original = new Money(this.euros, this.cents);
        if(decremented.less(original)){
            if(original.cents < decremented.cents){
                centDiff = 100 + original.cents - decremented.cents;
                euroDiff = original.euros - decremented.euros - 1; 
            }else{
                centDiff = original.cents - decremented.cents;
                euroDiff = original.euros - decremented.euros;    
            }
        }else{
            euroDiff = 0;
            centDiff = 0;
        }   
        Money newMoney = new Money(euroDiff, centDiff);
        return newMoney;
    }

}
