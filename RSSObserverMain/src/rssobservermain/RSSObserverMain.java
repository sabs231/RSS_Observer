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
        RSS_Subject slashData   = new RSS_Subject("http://slashdot.com/");
        Reader netvibes         = new Reader();
        Reader googleReader     = new Reader();
        
        // Me suscribo a diferentes fuentes
        lifeData.registerObserver(netvibes);
        slashData.registerObserver(netvibes);
        slashData.registerObserver(googleReader);
        
        slashData.setInformation("Actualización slashData 1");
        lifeData.setInformation("Actualización LifeData 1");
        slashData.setInformation("Actualización slashData 2");
    }
}
