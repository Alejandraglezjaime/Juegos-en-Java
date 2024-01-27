
import java.awt.Graphics2D;
import java.awt.Rectangle;


public class Obstaculo {
    int ancho = 20, alto = 50, x = 700, y = 200, x1 = -5;
    
    private Juego juegoColisiones;
    
    public Obstaculo(Juego juegoColisiones){
        this.juegoColisiones = juegoColisiones;
    }
    
    void mover(){
        if(x<=-50){
        juegoColisiones.puntos++;
        x=700; } else {
            if(colision()){
                juegoColisiones.finJuego();
            } else {
                x = x + x1;}
        }
    }
    
    private boolean colision(){
        return juegoColisiones.personaje1.getBounds().intersects(getBounds());
    }

    void paint(Graphics2D g){
        g.fillRect(x, y, ancho, alto);}
    
    private Rectangle getBounds(){
        return new Rectangle(x,y,ancho,alto);
    }
    
    
    
}
