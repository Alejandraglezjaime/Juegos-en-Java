import java.awt.Graphics2D;

public class Nube {
    int diametro = 20, diametro2 = 40, x = 700, y = 100;
    
    private Juego juegoColisiones;
    
    public Nube(Juego juegoColisiones){
        this.juegoColisiones = juegoColisiones; }
    
    public void mover(){
        x = x-1;
        if(x==-50){
            x=700;
        }
    }
    
    public void paint(Graphics2D g){
        g.fillOval(x, y, diametro, diametro);
        g.fillOval(x+15, y-15, diametro2, diametro2);
        g.fillOval(x+50, y, diametro, diametro);
    }
}
