/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shurakshyakharel
 */
public class Person {
    private String name;
    private String number;
    
    
    public Person(String newName, String newNumber){
        this.name = newName;
        this.number=newNumber;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getNumber(){
        return this.number;
    }
    
    public void changeNumber(String num){
        this.number = num;   
    }
    
    @Override
    public String toString(){
        return this.name + " number: " + this.number;
    }
    
    
    
}
