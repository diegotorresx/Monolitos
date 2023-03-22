/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BussinessLogic;


import DataObject.RangoTemp;
import DataObject.TempAdulto;
import DataObject.TempLactante;
import DataObject.TempNacido;
import DataObject.TempNiño;
import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;

/**
 *
 * @author admin2
 */
public class GenerateThread extends Thread{
    
    JProgressBar termometro;
    Random rand;
    RangoTemp rango;
    ArrayList<Double> registro;
    
    public GenerateThread(JProgressBar progress, String tipoPaciente, boolean enfermo){
        rango = definirRangos(tipoPaciente,enfermo);
        rango.setEnfermo(enfermo);
        rango.definirTemp();
        this.termometro=progress;
        this.rand=new Random();
        this.registro=new ArrayList<Double>();
    }
    
    
    public RangoTemp definirRangos(String tipoPaciente, boolean enfermo){
        switch(tipoPaciente){
            case "Adulto":
                return new TempAdulto();
            
            case "Lactante":
                return new TempLactante();
            
            case "RecienNacido":
                return new TempNacido();
            
            case "Niño":
                return new TempNiño();
            
            default:
                return new TempAdulto();
            
        }
    }

    public ArrayList<Double> getRegistro() {
        return registro;
    }
    
    
    
    @Override
	public void run() {
            while(true){
                try {
                    
                    Thread.sleep(2 * 1000);
                    
                   double random = rand.nextDouble();
                   double temp = rango.getTempMax() + (random * (rango.getTempMin() - rango.getTempMax()));
                   registro.add(temp);
                    System.out.println((int)(temp*1000));
                   this.termometro.setValue((int)(temp*1000));
                    
                } catch (InterruptedException ex) {
                    Logger.getLogger(GenerateThread.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
		
	}
        
        
        

}
