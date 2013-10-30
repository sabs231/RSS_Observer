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
    public void print(){
        for(int i = 0; i < this.entradas.size(); i++){
            System.out.println("["+i+"]"+" "+this.entradas.get(i));
        }
    }
}
