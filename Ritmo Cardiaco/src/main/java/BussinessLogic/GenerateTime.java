/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BussinessLogic;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Estudiantes
 */
public class GenerateTime {

    private Timer timer = new Timer(); 
    private int segundos=0;
    private int ritmoCardiaco = 0;
    private double ritmoCardiacoD = 0; 
    private String typeUser;
    private boolean Sick = true;
    //Clase interna que funciona como contador
    class Contador extends TimerTask {
        public void run() {
            segundos++;
            if(!Sick){
               switch (typeUser){
                    case "Recien Nacido":
                        ritmoCardiacoD = Math.random()*170+120;
                        ritmoCardiaco = (int) ritmoCardiacoD;
                    break;
                    case "Lactante Menor":
                        ritmoCardiacoD = Math.random()*160+120;
                        ritmoCardiaco = (int) ritmoCardiacoD;
                    break;
                    case "Lantante Mayor":
                        ritmoCardiacoD = Math.random()*130+110;
                        ritmoCardiaco = (int) ritmoCardiacoD;
                    break;
                    case "Nino2-4":
                        ritmoCardiacoD = Math.random()*120+100;
                        ritmoCardiaco = (int) ritmoCardiacoD;
                    break;
                    case "Nino6-8":
                        ritmoCardiacoD = Math.random()*115+100;
                        ritmoCardiaco = (int) ritmoCardiacoD;
                    break;
                    case "Adulto":
                        ritmoCardiacoD = Math.random()*80+60;
                        ritmoCardiaco = (int) ritmoCardiacoD;
                    break;
                    default:
                } 
            }
            else{
                switch (typeUser){
                    case "Recien Nacido":
                        ritmoCardiacoD = Math.random()*200+170;
                        ritmoCardiaco = (int) ritmoCardiacoD;
                    break;
                    case "Lactante Menor":
                        ritmoCardiacoD = Math.random()*200+160;
                        ritmoCardiaco = (int) ritmoCardiacoD;
                    break;
                    case "Lantante Mayor":
                        ritmoCardiacoD = Math.random()*200+130;
                        ritmoCardiaco = (int) ritmoCardiacoD;
                    break;
                    case "Nino2-4":
                        ritmoCardiacoD = Math.random()*200+120;
                        ritmoCardiaco = (int) ritmoCardiacoD;
                    break;
                    case "Nino6-8":
                        ritmoCardiacoD = Math.random()*200+115;
                        ritmoCardiaco = (int) ritmoCardiacoD;
                    break;
                    case "Adulto":
                        ritmoCardiacoD = Math.random()*150+80;
                        ritmoCardiaco = (int) ritmoCardiacoD;
                    break;
                    default:
                } 
            }
                  
            System.out.println("segundo: " + segundos + "\n Ritmo Cardiaco = " + ritmoCardiaco);
        }
    }
    //Crea un timer, inicia segundos a 0 y comienza a contar
    public void Contar(String typeUser, boolean Sick)
    {
        this.segundos=0;
        this.typeUser = typeUser;
        this.Sick = Sick;
        timer = new Timer();
        timer.schedule(new Contador(), 0, 1000);
    }
    //Detiene el contador
    public void Detener() {
        timer.cancel();
    }
    //Metodo que retorna los segundos transcurridos
    public int[] getSegundos()
    {
        int arrayValues[] = {this.segundos,ritmoCardiaco};
        return arrayValues;
    }

}
