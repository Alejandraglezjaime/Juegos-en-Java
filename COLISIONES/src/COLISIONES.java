import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class COLISIONES {
    private static Juego juegoColisiones;

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Juego de gestión de colisiones");
        juegoColisiones = new Juego();
        ventana.add(juegoColisiones);
        ventana.setSize(700, 290);
        ventana.setLocation(400, 200);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Timer timer = new Timer(8, new ActionListener() { // actualiza el juego cada 8 milisegundos
            @Override
            public void actionPerformed(ActionEvent e) {
                juegoColisiones.repaint();

                if (juegoColisiones.juegoFinalizado) {
                    ((Timer) e.getSource()).stop(); // Detener el timer cuando el juego finaliza
                    
                    // Mensaje que muestra el puntaje y pregunta si se desea reiniciar o salir
                    int opcion = JOptionPane.showOptionDialog(ventana,
                            "El juego ha terminado.\nPuntaje: " + juegoColisiones.puntos + "\n¿Qué te gustaría hacer?",
                            "Juego Finalizado",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            new Object[]{"Reiniciar", "Salir"},
                            "Reiniciar");

                    if (opcion == JOptionPane.YES_OPTION) {
                        // Reiniciar el juego
                        juegoColisiones.juegoFinalizado = false; // Resetear el estado del juego
                        juegoColisiones.puntos = 0; // Resetear puntos
                        ventana.remove(juegoColisiones); // Quitar el juego actual
                        juegoColisiones = new Juego(); // Crear un nuevo juego
                        ventana.add(juegoColisiones); // Agregar el nuevo juego a la ventana
                        ventana.revalidate(); // Refrescar la ventana
                        ((Timer) e.getSource()).start(); // Reiniciar el timer
                    } else {
                        System.exit(0); // Salir del juego
                    }
                }
            }
        });
        timer.start(); // Iniciar el timer
    }
}
