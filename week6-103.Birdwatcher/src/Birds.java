/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shurakshyakharel
 */
public class Birds {
    private String name;
    private String latinName;
    
   public Birds(String newName, String newLatinName){
       name = newName;
       latinName = newLatinName;      
   }
   
   public String getName(){
       return this.name;
   }
   
   public String getLatinName(){
       return this.latinName;
   }
   
   public String toString(){
       return this.name + "( " + this.latinName + " )" ;
   }
    
}
