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
import java.util.ArrayList;

/**
 *
 * @author admin2
 */
public class SaveData {
    private FileWriter fw;
    public void save(ArrayList<Double> data) throws IOException{
        String fichero = "src/main/java/Files/LogTemp.txt";
        File f = new File(fichero);
        if(!f.exists()){
            try{
                f.createNewFile();
                
            }
            catch(Exception e){
                new Exception (e.toString());
            }
        }
        fw = new FileWriter("src/main/java/Files/LogTemp.txt");
        saveData(data);
        
    }
    
    private void saveData(ArrayList<Double> data){
        PrintWriter pw = new PrintWriter(fw);
        for(int i=0; i<data.size();i++){
            pw.println(data.get(i));
        }
        pw.close();
        
    }
}
