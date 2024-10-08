import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

public class Personaje {
    int ancho =50;
    int alto = 50;
    int x = 50, y = 200, x1 = 0, y1 = 0;
    private Juego juegoColisiones;
    boolean saltando = false;
    boolean sube = false;
    boolean baja = false;
    
    public Personaje(Juego juegoColisiones){
        this.juegoColisiones = juegoColisiones;
    }
    
    public void mover(){
        if(x + x1 > 0 && x + x1 < juegoColisiones.getWidth() - ancho )
            x = x + x1;
        
        if(saltando){
            if(y == 200 ){ //el persoonaje esta en el suelo
                sube = true;
                y1 = -5;
                baja = false;
            }
            if(y == 90){ //el personaje llego al limite del salto
                baja = true;
                y1 = 5;
                sube = false;
            }
            if(sube){
            y = y + y1;}
            if(baja){
            y = y + y1;
            if(y==200){
            saltando=false;}
            }
        }
        
    }
    
    public void paint(Graphics2D g){
        g.fillRect(x, y, ancho, alto);}
    
    public void keyPressed(KeyEvent e){
        if(e.getKeyCode() == KeyEvent.VK_SPACE){
            saltando=true;
        }
    }
    
    public Rectangle getBounds(){
        return new Rectangle(x+5, y+y1, ancho, alto);}
    
    
}
