/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BussinessLogic;

import DataLayer.SaveData;
import View.MainView;
import java.io.IOException;
import javax.swing.JProgressBar;

/**
 *
 * @author admin2
 */
public class GenerateTemp  {
      private GenerateThread generar;
      private MainView vista;
      private SaveData log;
      
      public GenerateTemp(MainView vista){
          this.vista=vista;
          this.log=new SaveData();
          
      }
      
      public void iniciarSimulacion(String tipoUsuario){
          vista.getjButton1().setEnabled(false);
          generar=new GenerateThread(vista.getjProgressBar1(),tipoUsuario);
          generar.start();
      }
      
      public void pararsimulación(){
           vista.getjButton1().setEnabled(true);
          generar.stop();
          try{
               log.save(generar.getRegistro());
          }catch(IOException e){
              System.err.println("error "+ e);
          }
          
          generar=null;
         
      }
}
