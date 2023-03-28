/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BussinessLogic;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Image;
import java.awt.Component;
/**
 *
 * @author Estudiantes
 */
public class GenerateTime {
    
    private double ritmoCardiacoD = 0;
    private int ritmoCardiaco = 0;
    public int GenerateData(Boolean Sick, String typeUser){
        if(!Sick){
               switch (typeUser){
                    case "Recien Nacido" -> {
                        ritmoCardiacoD = 120 + (Math.random()*170);
                        ritmoCardiaco = (int) ritmoCardiacoD;
                        if (ritmoCardiaco >= 240){
                            ritmoCardiaco = ritmoCardiaco -120;
                        }
                        if (ritmoCardiaco > 170 && ritmoCardiaco < 240){
                            ritmoCardiaco = ritmoCardiaco -(ritmoCardiaco-170);
                        }
                    }
                    case "Lactante Menor" -> {
                        ritmoCardiacoD = Math.random()*160+120;
                        ritmoCardiaco = (int) ritmoCardiacoD;
                        if (ritmoCardiaco >= 240){
                            ritmoCardiaco = ritmoCardiaco -120;
                        }
                        if (ritmoCardiaco > 160 && ritmoCardiaco < 240){
                            ritmoCardiaco = ritmoCardiaco -(ritmoCardiaco-160);
                        }
                    }
                    case "Lantante Mayor" -> {
                        ritmoCardiacoD = Math.random()*130+110;
                        ritmoCardiaco = (int) ritmoCardiacoD;
                        if (ritmoCardiaco >= 220){
                            ritmoCardiaco = ritmoCardiaco -110;
                        }
                        if (ritmoCardiaco > 130 && ritmoCardiaco < 220){
                            ritmoCardiaco = ritmoCardiaco -(ritmoCardiaco-130);
                        }
                    }
                    case "Nino2-4" -> {
                        ritmoCardiacoD = Math.random()*120+100;
                        ritmoCardiaco = (int) ritmoCardiacoD;
                        if (ritmoCardiaco >= 200){
                            ritmoCardiaco = ritmoCardiaco -100;
                        }
                        if (ritmoCardiaco > 120 && ritmoCardiaco < 200){
                            ritmoCardiaco = ritmoCardiaco -(ritmoCardiaco-120);
                        }
                    }
                    case "Nino6-8" -> {
                        ritmoCardiacoD = Math.random()*115+100;
                        ritmoCardiaco = (int) ritmoCardiacoD;
                        if (ritmoCardiaco >= 200){
                            ritmoCardiaco = ritmoCardiaco -100;
                        }
                        if (ritmoCardiaco > 115 && ritmoCardiaco < 200){
                            ritmoCardiaco = ritmoCardiaco -(ritmoCardiaco-115);
                        }
                    }
                    case "Adulto" -> {
                        ritmoCardiacoD = Math.random()*80+60;
                        ritmoCardiaco = (int) ritmoCardiacoD;
                        if (ritmoCardiaco >= 120){
                            ritmoCardiaco = ritmoCardiaco -60;
                        }
                        if (ritmoCardiaco > 80 && ritmoCardiaco < 120){
                            ritmoCardiaco = ritmoCardiaco -(ritmoCardiaco-120);
                        }
                    }
                    default -> {
                    }
                } 
            }
            else{
                switch (typeUser){
                    case "Recien Nacido" -> {
                        ritmoCardiacoD = Math.random()*200+170;
                        ritmoCardiaco = (int) ritmoCardiacoD;
                    }
                    case "Lactante Menor" -> {
                        ritmoCardiacoD = Math.random()*200+160;
                        ritmoCardiaco = (int) ritmoCardiacoD;
                    }
                    case "Lantante Mayor" -> {
                        ritmoCardiacoD = Math.random()*200+130;
                        ritmoCardiaco = (int) ritmoCardiacoD;
                    }
                    case "Nino2-4" -> {
                        ritmoCardiacoD = Math.random()*200+120;
                        ritmoCardiaco = (int) ritmoCardiacoD;
                    }
                    case "Nino6-8" -> {
                        ritmoCardiacoD = Math.random()*200+115;
                        ritmoCardiaco = (int) ritmoCardiacoD;
                    }
                    case "Adulto" -> {
                        ritmoCardiacoD = Math.random()*150+80;
                        ritmoCardiaco = (int) ritmoCardiacoD;
                    }
                    default -> {
                    }
                } 
            }
            return ritmoCardiaco;
    }
}
