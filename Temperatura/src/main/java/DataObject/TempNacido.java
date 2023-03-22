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
public class TempNacido extends RangoTemp{
    

    @Override
    public void definirTemp(){
        if(!enfermo){
            tempMax=37.7;
            tempMin=36.1;
        }else{
            tempMax=38;
            tempMin=35.5;
        }
        
    
    }
    
}
