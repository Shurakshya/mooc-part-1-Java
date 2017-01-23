
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
public class Team {
    
    private String name;
    private int maxno;
    private ArrayList<Player> list;

    public Team(String newName) {
        this.name = newName;
        this.list = new ArrayList<Player>();
        this.maxno = 16;

    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player nameOfPlayer) {
        
        if(list.size() < maxno ){
            list.add(nameOfPlayer);
        }else{
            return ; 
        }
    }

    public void printPlayers() {
        for (Player players : list) {
            System.out.println(players);
        }
    }

    public void setMaxSize(int maxSize) {

       maxno = maxSize;

    }
    
    public int size(){
        return list.size();
    }
    
    public int goals(){
        int totalGoals=0;
        for(Player players: list){
           totalGoals= players.goals()+totalGoals;
        }
        
        return totalGoals; 
    }
    
}
