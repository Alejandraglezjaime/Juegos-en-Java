
import java.security.Principal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class COLISIONES{
    public static void main(String[] args){
        JFrame ventana = new JFrame("Juego de gestion de colisiones");
        Juego juegoColisiones = new Juego();
        ventana.add(juegoColisiones);
        ventana.setSize(700,290);
        ventana.setLocation(400, 200);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        while (!juegoColisiones.juegoFinalizado) { //pinta de forma continua los graficos del juego
            juegoColisiones.repaint();
            try {
                Thread.sleep(8); //velocidad que avanza
            } catch (InterruptedException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        juegoColisiones.repaint();
    }
}
