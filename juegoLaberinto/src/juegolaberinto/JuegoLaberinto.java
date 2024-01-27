
package juegolaberinto;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JuegoLaberinto extends JPanel{
    
    //LLAMO A LAS DEMAS CLASES YA QUE VOY A USAR UN METODO DE LAS MISMAS
    laberinto laberinto = new laberinto();
    personaje personaje = new personaje();
    public static int nivel = 1; //VA A INICIAR SIEMPRE EN EL NIVEL 1
    
    //LOS EVENTOS O MOVIMIENTOS QUE SE REALICE EL PERSONAJE
    public JuegoLaberinto(){
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                personaje.teclaPresionada(e);
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        setFocusable(true);
    }
    
    //VA  A IR PINTANDO
    public void paint(Graphics g){
        super.paint(g);
        // Despinta la posición anterior del personaje
        personaje.despintar(g);
        laberinto.paint(g);
        personaje.paint(g);
    }
    
    public static int cambiaNivel(){
        return nivel++;
    }
    
    public static int obtieneNivel(){
        return nivel;
    }
    
    
   
    public static void main(String[] args) {
        
     JOptionPane.showMessageDialog(null, "QUE COMIENCE EL JUEGO. ");
     JFrame miVentana= new JFrame("Laberinto");
     
     JuegoLaberinto game = new JuegoLaberinto();
     miVentana.add(game);
     miVentana.setSize(920,540);
     miVentana.setLocation(300, 200);
     miVentana.setVisible(true);
     miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
     while (true) {         
         try {
             Thread.sleep(5); //TIEMPO EN EL QUE SE MUEVE EL PERSONAJE
         } catch (InterruptedException ex) {
             Logger.getLogger(JuegoLaberinto.class.getName()).log(Level.SEVERE, null, ex);
         }
         game.repaint();
         
         if(obtieneNivel()>3){
          // Mostrar un cuadro de diálogo con dos opciones: "Reiniciar" y "Salir"
          int opcion = JOptionPane.showOptionDialog(
                        null,
                        "Fin del juego", // Mensaje mostrado en el cuadro de diálogo
                        "Fin del juego", // Título del cuadro de diálogo
                        JOptionPane.YES_NO_OPTION, // Tipo de opciones (Sí y No)
                        JOptionPane.INFORMATION_MESSAGE, // Tipo de mensaje (Ícono de información)
                        null, // Ícono personalizado (null utiliza el predeterminado)
                        new Object[]{"Reiniciar", "Salir"}, // Opciones a mostrar en el cuadro de diálogo
                        "Reiniciar"); // Opción predeterminada seleccionada

                if (opcion == JOptionPane.YES_OPTION) {
                    reiniciarJuego();  // Si el usuario elige "Reiniciar", llama a la función reiniciarJuego()
                } else {
                    System.exit(0);
                }
         
         }
     }
     
        
    }
    private static void reiniciarJuego() {
        // Lógica para reiniciar el juego
        nivel = 1;
        JOptionPane.showMessageDialog(null, "Juego reiniciado");
    }
    
}
