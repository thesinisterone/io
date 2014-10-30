package Players;


import Players.Player;
import java.util.Random;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class PlayerBot extends Player{
    
    public PlayerBot(){};
    public PlayerBot(String name){super(name);};
    
    @Override
    public int guess(){
        Random rand = new Random();
        int x=rand.nextInt(6)+1;
        return x;
    }
    
}
