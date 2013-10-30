/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rssobservermain;

import java.util.ArrayList;

/**
 *
 * @author sabs231
 */
public class RSS_Subject implements Subject 
{
    private ArrayList observers;
    private String url;
    private RSS information;
    
    public RSS_Subject(String iurl)
    {
        this.observers   = new ArrayList();
        this.information = new RSS();
        this.url         = iurl;
    }
    
    public void setInformation(String info)
    {
        this.information.addInfo(info);
        notifyObservers();
    }
    
    @Override
    public void registerObserver(Observer o) 
    {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) 
    {
        int i = observers.indexOf(o);
        if (i >= 0)
            observers.remove(i);
    }

    @Override
    public void notifyObservers() 
    {
        Observer observer;
        
        for (int i = 0; i < observers.size(); i++)
        {
            observer = (Observer)observers.get(i);
            observer.update(this.information);
        }
    }
    
}
