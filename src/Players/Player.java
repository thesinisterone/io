package Players;

import java.util.jar.Attributes;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public abstract class Player {
    
    public Player(){this.name="gal anonim";};
    public Player(String name){this.name=name;};
    
    private String name;
    
    public abstract int guess();
    
    public void setName(String name){
        if( name != null && !name.isEmpty())
           this.name=name;
        else {
            throw new IllegalArgumentException();
        }
              }
    
    public String getName(){
    return this.name;}
}
