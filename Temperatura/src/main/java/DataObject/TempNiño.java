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
public class TempNiño extends RangoTemp {
    
    public TempNiño(){
        
        
    }
    
    @Override
    public void definirTemp(){
         if(!enfermo){
           tempMax=37.01;
            tempMin=37.1;
        }else{
            tempMax=37;
            tempMin=36;
        }
    }
    
}
