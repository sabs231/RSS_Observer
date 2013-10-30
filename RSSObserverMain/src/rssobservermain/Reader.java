/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rssobservermain;

/**
 *
 * @author sabs231
 */
public class Reader implements Observer, DisplayElement {
   
    RSS lastUpdatedObject;
    
    public Reader(){
        lastUpdatedObject = new RSS();
    }

    @Override
    public void update (RSS newInfo)
    {
        this.lastUpdatedObject = newInfo;
        display();
    }
    
    @Override
    public void display() 
    {
        System.out.println("Andrés Implementa lo de pintar el RSS");
    }
    
}
