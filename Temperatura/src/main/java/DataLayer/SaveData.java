/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author admin2
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
