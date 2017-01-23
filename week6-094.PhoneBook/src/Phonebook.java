
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shurakshyakharel
 */
public class Phonebook {
     private ArrayList <Person> phonebook = new ArrayList();
    
    
    public void add(String name, String number){
        Person person = new Person(name, number);
        phonebook.add(person);
    }
    
    public void printAll(){
        for(Person p : phonebook){
            System.out.println( p );
        }
        
    }
    
    public String searchNumber(String name){
        String result ="";
        for(int i = 0; i < phonebook.size();i++){
            Person n= phonebook.get(i);
            if(n.getName().equals(name)){
                System.out.println("This is equal so the phonebook " + n.getName() + " " + n.getNumber());
                result = n.getNumber(); 
                break;
               }else {
                result = "number not known";
            }
        }
        return result;

    }
    
    
}
