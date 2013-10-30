/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rssobservermain;

/**
 *
 * @author sabs231
 */
public class RSSObserverMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        RSS_Lifeboxset lifeData = new RSS_Lifeboxset();
        RSS_Slashdot slashData = new RSS_Slashdot();
        Netvibes reader = new Netvibes(lifeData);
        GoogleReader r = new GoogleReader(slashData, lifeData);
        
        lifeData.setInformation("Hey appple!!!");
        slashData.setInformation("Hey Pear!!!");
    }
}
