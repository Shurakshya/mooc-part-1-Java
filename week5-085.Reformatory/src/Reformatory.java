public class Reformatory {
    private int counter ;
    public int weight(Person person) {
        // return the weight of the person
        int newWeight = person.getWeight();
        counter++;
        return newWeight;
    }
    
    public void feed(Person person){
     int weight =person.getWeight() +1;
     person.setWeight(weight);
     
    }
    
     public int totalWeightsMeasured(){
        
         return counter; 
         
     }

}
