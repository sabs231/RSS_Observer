/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rssobservermain;

/**
 *
 * @author sabs231
 */
public class GoogleReader implements Observer, DisplayElement 
{
    //private RSS information;
    private String information;
    private Subject slashdotData;
    private Subject lifeboxsetData;
   
    public GoogleReader(Subject sData, Subject lData)
    {
        slashdotData = sData;
        lifeboxsetData = lData;
        slashdotData.registerObserver(this);
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
    public void update (String information)
    {
        this.information = information;
        display();
    }
    
    @Override
    public void display() 
    {
        System.out.println("I'm Google reader and this is how I display the RSS: " + information);
    }
    
}
