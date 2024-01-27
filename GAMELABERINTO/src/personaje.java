
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;


public class personaje {
    laberinto labe= new laberinto(); //ESTO ES PARA HACER USO DE UN METODO DE LA CLASE LABERINTO 
    private int x=40, y=40;
    private final int ancho=40;
    private final int alto=40;
    private final int movimiento=40;
    
  
    
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.fillOval(x, y, ancho, alto); //RELLENA UN OVALO
        //LINEAS QUE NOS PERMITE VER UNA LINEA QUE MUESTRA EL CONTORNO DEL OVALO
        g.setColor(Color.black);
        g.drawOval(x, y, ancho, alto);
    }
    
    
     public void despintar(Graphics g) {
        g.setColor(Color.white);
        g.fillOval(x, y, ancho, alto); //RELLENA UN OVALO
        //LINEAS QUE NOS PERMITE VER UNA LINEA QUE MUESTRA EL CONTORNO DEL OVALO
        g.setColor(Color.white);
        g.drawOval(x, y, ancho, alto);
    }
    
     
    
    public void teclaPresionada(KeyEvent evento){
        int [][]laberinto=labe.obtieneLaberinto();
        if(evento.getKeyCode()==37){ //TECLA IZQUIERDA
            //NOTA; SI SE UTILIZA IZQUIERDA O DERECHA SE UTILIZA LA VARIABLE X
           if(laberinto[y/40][(x/40)-1]!=1){
             x=x-movimiento;
           }
           
        } 
        if(evento.getKeyCode()==39){ //TECLA DERECHA
            if(laberinto[y/40][(x/40)+1]!=1){
             x=x+movimiento;
           }
        }
        if(evento.getKeyCode()==40){ //TECLA ABAJO
            //NOTA: SI SE UTILIZA LA VARIABLE ABAJO O ARRIBA SE UTIILIZA LA VARIABLE Y
            if(laberinto[(y/40)+1][(x/40)]!=1){
             y=y+movimiento;
           }
        }
        if(evento.getKeyCode()==38){ //TECLA ARRIBA 
             if(laberinto[(y/40)-1][(x/40)]!=1){
             y=y-movimiento;
           }
        }
        
        
        
    }

   
    
}
