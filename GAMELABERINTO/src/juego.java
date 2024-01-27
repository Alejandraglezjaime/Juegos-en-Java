
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class juego extends JPanel{
    
    laberinto lab = new laberinto();
    personaje per = new personaje();
    end end = new end();
    
    //METODO QUE VA A ESTAR PENDIENTE DE LAS TECLAS QUE PRESIONE EL USUARIO
    public juego(){
        addKeyListener(new KeyListener(){ //ESCRIBES ESTA LINEA Y DESPUES AGREGAS LOS DEMAS METODOS DE ACCION
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                per.teclaPresionada(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        setFocusable(true);
        
    }
   
    
    @Override //PAINT NECESITA EL OVERRIDE PORQUE HACE REFERENCIA A QUE ES UN METODO AGREGADO DE JPANEL
    //METODO PAINT PARA DIBUJAR EN EL PANEL EL LABERINTO Y EL PERSONAJE
    public void paint(Graphics g){
         super.paint(g);
        // Despinta la posición anterior del personaje
        per.despintar(g);
        //MANDO A PINTAR EL PERSONAJE Y EL LABERINTO 
        lab.paint(g);
        per.paint(g);
        end.paint(g);
        
        
        
    }
    
    public static void main(String[] args){
      
        
        JFrame ventana = new JFrame("LABERINTO");
        juego game = new juego(); //crea un objeto de esa clase
        ventana.add(game); 
        ventana.setSize(935,555);
        ventana.setLocation(300, 200);
        ventana.setVisible(true);
        
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
        //CREAREMOS UN BUCLE INFINITO PARA REPINTAR EL MOVIMIENTO DE TODO LO QUE HACE EN EL MOMENTO
        while(true){
            try {
                Thread.sleep(10); //LE DA UN TIEMPO DE 10 MILISEGUNDOS DE DESFACE EN PINTARSE
            } catch (InterruptedException ex) {
                Logger.getLogger(juego.class.getName()).log(Level.SEVERE, null, ex);
            }
            game.repaint();}
    
    }
    
  
}
