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
public class RSS_Lifeboxset implements Subject 
{
    private ArrayList observers;
    //private RSS information;
    private String information;
    
    public RSS_Lifeboxset()
    {
        observers = new ArrayList();
        //information = new RSS(); // class not implemented yet
        information = "";
    }
    /*
    public void setInformation(RSS info)
    {
        information = info;
        notifyObservers();
    }
    */
    public void setInformation(String info)
    {
        information = info;
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
            observer.update(information);
        }
    }
    
}
