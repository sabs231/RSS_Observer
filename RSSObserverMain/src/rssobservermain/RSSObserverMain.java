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
    public static void main(String[] args){
        RSS_Subject lifeData    = new RSS_Subject("http://nethives.com/");
        RSS_Subject nuevegag   = new RSS_Subject("http://9gag.com/");
        Reader netvibes         = new Reader("Netvibes");
        Reader googleReader     = new Reader("Google Reader");
        
        // Me suscribo a diferentes fuentes
        lifeData.registerObserver(netvibes);
        nuevegag.registerObserver(netvibes);
        nuevegag.registerObserver(googleReader);
        
        nuevegag.setInformation("Actualización 9gag 1");
        lifeData.setInformation("Actualización LifeData 1");
        nuevegag.setInformation("Actualización 9gag 2");
        lifeData.setInformation("Actualización LifeData 2");
    }
}
