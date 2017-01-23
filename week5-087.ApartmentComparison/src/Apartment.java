
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
  
    public boolean larger(Apartment otherApartment){
        if(this.squareMeters > otherApartment.squareMeters){
          return true; 
        }
        return false; 
    }
    
    public int priceDifference(Apartment otherApartment){
        //price of the appartment object called for method 
        int price = this.squareMeters * this.pricePerSquareMeter ; 
        // price of the object appartment given in parameter.
        int objectPrice = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
        
        return Math.abs(price - objectPrice) ;    
    }
    
    public boolean moreExpensiveThan(Apartment otherApartment){
        //price of the appartment object called for method 
        int price = this.squareMeters * this.pricePerSquareMeter ; 
        // price of the object appartment given in parameter.
        int objectPrice = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
        if(price > objectPrice){
            return true;
        }
        return false;
        
    }
}
