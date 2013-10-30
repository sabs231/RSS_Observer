/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rssobservermain;

/**
 *
 * @author sabs231
 */
public class Netvibes implements Observer, DisplayElement 
{
    //private RSS information;
    private String information;
    private Subject lifeboxsetData;
    
    public Netvibes(Subject lData)
    {
        lifeboxsetData = lData;
        lifeboxsetData.registerObserver(this);
    }
    /*
    @Override
    public void update(RSS information) 
    {
        this.information = information;
        display();
    }*/
    
    @Override
    public void update(String information) 
    {
        this.information = information;
        display();
    }

    @Override
    public void display() 
    {
        System.out.println("I'm Netvibes and this is how I display the RSS: " + information);
    }
    
}
