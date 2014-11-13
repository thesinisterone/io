/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import Players.Player;
import Players.PlayerBot;
import Players.PlayerHuman;

/**
 *
 * @author Student
 */

public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Scanner we = new Scanner(System.in);
      
      Player Player = new PlayerBot("Maurice Bot");
      Game g = new Game();
      g.addPlayer(Player);
      g.addPlayer(new PlayerBot("Człek"));
      g.addPlayer(new PlayerBot("Człek"));
      g.addPlayer(new PlayerBot("Człek"));
      g.addPlayer(new PlayerBot("Człek"));
      g.start();
      
      
           
    }
}
