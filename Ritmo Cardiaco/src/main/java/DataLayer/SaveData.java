/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataLayer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Estudiantes
 */
public class SaveData {
    
    private void save(String data) throws IOException{
        String fichero = "/Files/Log.txt";
        File f = new File(fichero);
        if(!f.exists()){
            try{
                f.createNewFile();
            }
            catch(Exception e){
                new Exception (e.toString());
            }
        }
        FileWriter fw = new FileWriter("/Files/Log.txt");
        PrintWriter pw = new PrintWriter(fw);
        pw.println(data);
    }
}
