package Players;

import Players.Player;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class PlayerHuman extends Player{
    
    public PlayerHuman(){};
    public PlayerHuman(String name){super(name);};
    
    @Override
    public int guess(){
    Scanner we = new Scanner(System.in);
    int x = we.nextInt();
    return x;}
}
