/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shurakshyakharel
 */
public class Player {
    private String playerName;
    private int noOfGoals;
    
    
    public Player(String newPlayerName){
        this.playerName = newPlayerName;
        this.noOfGoals = 0;
        
    }
    
    public Player(String newPlayerName , int newAmount){
        this.playerName = newPlayerName;
        this.noOfGoals = newAmount;
    }
    
    public String getName(){
        return playerName;
    }
    
    public int goals(){
        return noOfGoals ; 
    }
    
    public String toString(){
        return this.playerName +", goals " + this.noOfGoals ; 
    }
}
