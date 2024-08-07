
package colisionessimple;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;


public class Juego extends JPanel{
    Personaje personaje1 = new Personaje(this);
    Obstaculo obstaculo1 = new Obstaculo(this);
    Fondo fondo1 = new Fondo();
    
    public boolean juegoFinalizado = false;
    public boolean pierdeVida = false; 
    public int puntos = 0; 
    public int vidas = 3;
    public int nivel = 1;
    
    public Juego(){
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                personaje1.keypressed(e);
            }
                
            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        setFocusable(true);
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2= (Graphics2D)g;
        g2.setPaint(Color.white);
        
        dibujar(g2);
        dibujarPuntaje(g2);
    }
    
    public void dibujar(Graphics2D g){
        switch (nivel) {
            case 1: g.setColor(new Color(182,218,216));
                fondo1.paint(g);
                break;
            case 2: g.setColor(new Color(169,202,200));
                fondo1.paint(g);
                break;
            case 3: g.setColor(new Color(158,189,187));
                fondo1.paint(g);
                break;
            case 4: g.setColor(new Color(145,173,170));
                fondo1.paint(g);
                break;
            case 5: g.setColor(new Color(132,158,156));
                fondo1.paint(g);
                break;
            case 6: g.setColor(new Color(125,150,148));
                fondo1.paint(g);
                break;
        }
        g.setColor(new Color(245, 6, 79));
        personaje1.paint(g);
        
        g.setColor(new Color( 7, 14, 125 ));
        obstaculo1.paint(g);
        
        obstaculo1.mover();
        personaje1.mover();
    }
    public void dibujarPuntaje(Graphics2D g){
        Graphics2D g1 = g, g2 = g;
        Font score = new Font("Arial", Font.BOLD,30); 
        g.setFont(score);
        g.setColor(Color.BLACK);
        
        g1.drawString("Vidas : "+(vidas+1), 20, 30);
        g1.drawString("Puntaje : "+puntos, 1000, 30);
        g1.drawString("Nivel : "+nivel, 500, 30);
        
        if(juegoFinalizado){
            g2.setColor(Color.red);
            g2.drawString("¡¡¡HAZ PERDIDO!!!", ((float)getBounds().getCenterX()/2)+170, 70);
        }

    }
    public void finJuego(){
        juegoFinalizado=true;
    }
    
    public void pierdeVida(){
        pierdeVida=true;
    }
}
