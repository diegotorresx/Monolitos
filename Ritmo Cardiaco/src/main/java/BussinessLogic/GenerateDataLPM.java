/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BussinessLogic;
import DataObjects.RitmoCardiacoModel;

/**
 *
 * @author Estudiantes
 */
public class GenerateDataLPM {
    
    private RitmoCardiacoModel rc = new RitmoCardiacoModel();
    private  RitmoCardiacoModel genereateData(String usuarioType){
        Double d;
        switch (usuarioType){
            case "Recien Nacido":
                d = Math.random()*170+120;
                rc.setLPM(d.intValue());
                break;
            case "Lactante Menor":
                d = Math.random()*160+120;
                rc.setLPM(d.intValue());
                break;
            case "Lactante Mayor":
                d = Math.random()*130+110;
                rc.setLPM(d.intValue());
                break;
            case "Nino2-4":
                d = Math.random()*120+100;
                rc.setLPM(d.intValue());
                break;
            case "Nino6-8":
                d = Math.random()*115+100;
                rc.setLPM(d.intValue());
                break;
            case "Adulto":
                d = Math.random()*80+60;
                rc.setLPM(d.intValue());
                break;
        }
        return rc;
    }
}
