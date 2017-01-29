
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
public class DatabaseObservation {
    ArrayList<Bird> database;
    private Bird bird;
    
    public DatabaseObservation(){
        this.database = new ArrayList<Bird>();
    }
    
    public void Add(String name, String latinName){
        bird = new Bird(name, latinName);
        database.add(bird);      
    }
    
    public ArrayList<Bird> getBirds(){
        return this.database;
        
    }
    
    public void statistics() {
        for (Bird b : database) {
            System.out.println(b);
        }
    }
    
    
    
    
    
}
