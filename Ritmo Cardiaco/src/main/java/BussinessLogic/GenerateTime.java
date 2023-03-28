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

    private Timer timer = new Timer(); 
    private int segundos=0;
    private int ritmoCardiaco = 0;
    private double ritmoCardiacoD = 0; 
    private String typeUser;
    private boolean Sick;
	private JLabel labelObject;
    //Clase interna que funciona como contador
    class Contador extends TimerTask {
        public void run() {
            segundos++;
            if(!Sick){
               switch (typeUser){
                    case "Recien Nacido":
                        ritmoCardiacoD = 120 + (Math.random()*170);
                        ritmoCardiaco = (int) ritmoCardiacoD;
						if (ritmoCardiaco >= 240){
							ritmoCardiaco = ritmoCardiaco -120;
						}
						if (ritmoCardiaco > 170 && ritmoCardiaco < 240){
							ritmoCardiaco = ritmoCardiaco -(ritmoCardiaco-170);
						}
                    break;
                    case "Lactante Menor":
                        ritmoCardiacoD = Math.random()*160+120;
                        ritmoCardiaco = (int) ritmoCardiacoD;
						if (ritmoCardiaco >= 240){
							ritmoCardiaco = ritmoCardiaco -120;
						}
						if (ritmoCardiaco > 160 && ritmoCardiaco < 240){
							ritmoCardiaco = ritmoCardiaco -(ritmoCardiaco-160);
						}
                    break;
                    case "Lantante Mayor":
                        ritmoCardiacoD = Math.random()*130+110;
                        ritmoCardiaco = (int) ritmoCardiacoD;
						if (ritmoCardiaco >= 220){
							ritmoCardiaco = ritmoCardiaco -110;
						}
						if (ritmoCardiaco > 130 && ritmoCardiaco < 220){
							ritmoCardiaco = ritmoCardiaco -(ritmoCardiaco-130);
						}
                    break;
                    case "Nino2-4":
                        ritmoCardiacoD = Math.random()*120+100;
                        ritmoCardiaco = (int) ritmoCardiacoD;
						if (ritmoCardiaco >= 200){
							ritmoCardiaco = ritmoCardiaco -100;
						}
						if (ritmoCardiaco > 120 && ritmoCardiaco < 200){
							ritmoCardiaco = ritmoCardiaco -(ritmoCardiaco-120);
						}
                    break;
                    case "Nino6-8":
                        ritmoCardiacoD = Math.random()*115+100;
                        ritmoCardiaco = (int) ritmoCardiacoD;
						if (ritmoCardiaco >= 200){
							ritmoCardiaco = ritmoCardiaco -100;
						}
						if (ritmoCardiaco > 115 && ritmoCardiaco < 200){
							ritmoCardiaco = ritmoCardiaco -(ritmoCardiaco-115);
						}
                    break;
                    case "Adulto":
                        ritmoCardiacoD = Math.random()*80+60;
                        ritmoCardiaco = (int) ritmoCardiacoD;
						if (ritmoCardiaco >= 120){
							ritmoCardiaco = ritmoCardiaco -60;
						}
						if (ritmoCardiaco > 80 && ritmoCardiaco < 120){
							ritmoCardiaco = ritmoCardiaco -(ritmoCardiaco-120);
						}
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
            if (ritmoCardiaco%2 == 0){
				SetImagenLabel(labelObject,"https://images.ecestaticos.com/aTyeFebpQ-BqHJ7FIQjnjzcN2og=/334x4:1953x1213/1200x900/filters:fill(white):format(jpg)/f.elconfidencial.com%2Foriginal%2Fb9e%2Fd37%2F516%2Fb9ed3751689578efdbb19ed1b8b401e9.jpg");
			}
			else{
				SetImagenLabel(labelObject,"");
			}
            System.out.println("segundo: " + segundos + "\n Ritmo Cardiaco = " + ritmoCardiaco);
        }
    }
    //Crea un timer, inicia segundos a 0 y comienza a contar
    public void Contar(String typeUser, boolean Sick,JLabel labelName)
    {
        this.segundos=0;
        this.typeUser = typeUser;
        this.Sick = Sick;
        timer = new Timer();
		this.labelObject = labelName;
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
	 public void SetImagenLabel (JLabel labelName, String strPath){
		 ImageIcon image = new ImageIcon(strPath);
		 Icon icon  = new ImageIcon(
			 image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT)
		 );
		 labelName.setIcon(icon);
		 this.repaint();
	 }
}
