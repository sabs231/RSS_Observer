/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rssobservermain;


/**
 *
 * @author sabs231
 */
public interface Subject 
{
    public abstract void registerObserver(Observer o);
    public abstract void removeObserver(Observer o);
    public abstract void notifyObservers();
}
