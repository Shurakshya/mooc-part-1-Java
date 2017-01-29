/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shurakshyakharel
 */
public class Bird {
    private String name;
    private String latinName;
    private int count;
    
   public Bird(String newName, String newLatinName){
       name = newName;
       latinName = newLatinName;      
    }
   
   public String getName(){
       return this.name;
    }
   
   public String getLatinName(){
       return this.latinName;
    }
   
   public void increaseCount() {
        count++;
    }

   
   public String toString(){
       return this.name + "( " + this.latinName + " ) : " + this.count + " observations" ;
    }
    
}
