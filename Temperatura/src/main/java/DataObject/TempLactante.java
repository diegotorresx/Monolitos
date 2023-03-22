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
public class TempLactante extends RangoTemp{
    

    @Override
    public void definirTemp(){
           if(!enfermo){
            tempMax=37.20;
            tempMin=37.29;
        }else{
            tempMax=37;
            tempMin=36;
        }
    }
    
}
