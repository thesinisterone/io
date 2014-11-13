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
    private List<Player> players = new ArrayList<>();

    public void addPlayer(Player Player) {
        int i = 1;
        for (Player sprawdzany : players)
        {
            if (Player.getName().equals(sprawdzany.getName()))
            {
                Player.setName(Player.getName() + String.valueOf(i));              
            }        
        }
        players.add(Player);
    }

    public void start() {
        int a, b = 0;
        Random rand = new Random();
        boolean repeat = true;



        do {
            repeat = true;
            a = rand.nextInt(6) + 1;
            System.out.println("Wylosowana " + a);

            for (Player Player : players)
            {
                b = Player.guess();
                String nazwa = Player.getName();
                System.out.println(nazwa + ": " + b);
            }


            if (a == b)
            {
                System.out.println("Strzał w dziesiątke!");
                repeat = false;
            } else {
                System.out.println("pudlo");
            }
            System.out.println("------------");


        } while (repeat);
    }
}
