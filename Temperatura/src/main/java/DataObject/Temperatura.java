/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataObject;

/**
 *
 * @author admin2
 */
public abstract class Temperatura {
    
    double temp;
    double tempMax;
    double tempMin;
    boolean enfermo=false;

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }
    
    
  
    
}
