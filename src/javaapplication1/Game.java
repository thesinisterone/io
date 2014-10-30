/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import Players.Player;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Student
 */
public class Game {
    
   // private Player Player;
    private List <Player> players = new ArrayList<Player>();
    
    
  public void addPlayer(Player Player){players.add(Player);}
    
    
   public void start()
   {
       int a,b;
       Random rand= new Random();
       String nazwa=Player.getName();
       do
      {
          a=rand.nextInt(6)+1;
          b=Player.guess();
          System.out.println("Wylosowana "+a);
          System.out.println(nazwa+": "+b);
          if(a==b)System.out.println("Strzał w dziesiątke!");
          else System.out.println("pudlo");
          System.out.println("------------");
          
          
      }while(a!=b);
   }
    
}
