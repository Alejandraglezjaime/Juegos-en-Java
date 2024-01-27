
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal {
    public static int reiniciaJuego=-1;
    
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "QUE COMIENCE EL JUEGO");
        JFrame ventana = new JFrame("JUEGO DE COLISIONES MEJORADO 2.0");
        Juego jueguito = new Juego();
        ventana.add(jueguito);
        ventana.setSize(1200, 400);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        while (true) { 
            
            if(jueguito.juegoFinalizado){
                reiniciaJuego=JOptionPane.showConfirmDialog(null, "HAZ PERDIDO, ¿QUIERES VOLVER A JUGAR?","HAZ PERDIDO",JOptionPane.YES_NO_OPTION);
                if(reiniciaJuego==0){
                    jueguito.juegoFinalizado=false;
                    Obstaculo.inc_x=-5;
                    Obstaculo.x=1200;
                    jueguito.puntos=0;
                    jueguito.nivel=1;
                    jueguito.vidas=3;
                    reiniciaJuego=-1;
                }else if(reiniciaJuego==1){
                System.exit(0);}
            }else {
                        jueguito.repaint();
                    try {
                        Thread.sleep(10 );
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    if(jueguito.pierdeVida){
                        JOptionPane.showMessageDialog(null, "CUIDADO");
                        jueguito.pierdeVida=false;
                        jueguito.vidas--;
                        Obstaculo.x=1200;
                        Personaje.saltando = false;
                        Personaje.y=250;
                    }
            }
            
            
        }
    }
    
}
