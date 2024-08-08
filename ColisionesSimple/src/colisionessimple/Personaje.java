package colisionessimple;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

public class Personaje {
    static final int ancho = 100;
    static final int alto = 100;
    int x = 50;
    static int y = 250;
    int y1 = 0;
    
    Juego jueguito;
    static boolean saltando = false;
    boolean sube = false;
    boolean baja = false; 
    
    public Personaje(Juego jueguito){
        this.jueguito = jueguito;
    }
    
    public void mover(){
        if(saltando){
            if(y==250){
                sube=true;
                y1=-5;
                baja=false;
            }
            if(y==50){
                baja=true;
                y1=5;
                sube=false;
            }
            if(sube){
                y+=y1;
            }
            if(baja){
                y+=y1;
                if(y==250){
                    saltando=false;
                }
            }
        }
    }
    
    
    public void paint(Graphics2D g){
        g.fillRect(x, y, ancho, alto);
    }
    
    public void keypressed(KeyEvent e){
        //el personaje salta con la tecla espacio
        if(e.getKeyCode()==KeyEvent.VK_SPACE){
            saltando=true;
        }
    }
    
    public Rectangle getBounds(){
        return new Rectangle(x,y,ancho,alto);
    }
}
