/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BussinessLogic;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin2
 */
public class GenerateThread extends Thread{
    @Override
	public void run() {
            while(true){
                try {
                    Thread.sleep(4 * 1000);
                    System.out.println("holi");
                } catch (InterruptedException ex) {
                    Logger.getLogger(GenerateThread.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
		
	}

}
