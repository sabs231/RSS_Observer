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
public class RSS 
{
    private ArrayList entradas;
    public RSS(){
        this.entradas = new ArrayList();
    }
    public void addInfo(String info){
        this.entradas.add(info);
    }
}
