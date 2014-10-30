/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import Players.Player;
import Players.PlayerBot;
import Players.PlayerHuman;
import java.util.Random;
import java.util.Scanner;

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
      Random rand= new Random();
      int a,b;
      Player p1 = new PlayerBot("eee") {};
      try {
        p1.setName("");}
      catch (IllegalArgumentException e){
          System.out.println("imie nie moze byc puste");
      }
      String nazwa=p1.getName();
      
      do
      {
          a=rand.nextInt(6)+1;
          b=p1.guess();
          System.out.println("Wylosowana "+a);
          System.out.println(nazwa+": "+b);
          if(a==b)System.out.println("Strzał w dziesiątke!");
          else System.out.println("pudlo");
          System.out.println("------------");
          
          
      }while(a!=b);
           
    }
}
