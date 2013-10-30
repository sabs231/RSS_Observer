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
   
    String nombre;
    RSS lastUpdatedObject;
    
    public Reader(String name){
        this.nombre = name;
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
        System.out.println("Nueva información de "+this.nombre);
        this.lastUpdatedObject.print();
    }
    
}
