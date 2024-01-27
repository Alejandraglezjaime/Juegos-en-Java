
import java.awt.Graphics2D;
import java.awt.Rectangle;


public class Obstaculo {
    static final int ancho = 50;
     static final int alto = 100;
     static int inc_x = -5;
     static int x=1200;
     int y = 250;
     
     Juego jueguito;
     
     public Obstaculo(Juego jueguito){
         this.jueguito=jueguito;
     }
     
     public void mover(){
         if(x<=-50){
         jueguito.puntos++;
         x=1200;
            if(jueguito.puntos==3|jueguito.puntos==6|jueguito.puntos==9|jueguito.puntos==12|jueguito.puntos==15){
                inc_x+=-2;
                jueguito.nivel++;
            }
         } else{
             if(colision()){
                if(jueguito.vidas==0){
                    jueguito.finJuego();
                } else{
                jueguito.pierdeVida();}
                } else {
             x+=inc_x;}
         }
     }
     
     public boolean colision(){
         return jueguito.personaje1.getBounds().intersects(getBounds());
     }
     
     public void paint(Graphics2D g){
         g.fillRect(x, y, ancho, alto);
     }
     
     public Rectangle getBounds(){
         return new Rectangle(x-5,y,ancho,alto);
     }
}
