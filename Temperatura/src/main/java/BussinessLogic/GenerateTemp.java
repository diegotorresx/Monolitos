/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BussinessLogic;

/**
 *
 * @author admin2
 */
public class GenerateTemp  {
      private GenerateThread generar;
      
      public GenerateTemp(){
          generar=new GenerateThread();
      }
      
      public void iniciarSimulacion(){
          generar.run();
      }
      
      public void pararsimulación(){
          generar.stop();
      }
}
