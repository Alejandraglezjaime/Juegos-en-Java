
package juegolaberinto;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;


public class personaje {
    laberinto lab = new laberinto();
    int x = 40, y = 40, ancho = 40, alto=40, movimiento = 40;
    
    
    public void paint(Graphics g){
        //CUERPO DEL PERSONAJE
        g.setColor(Color.red);
        g.fillOval(x, y, ancho, alto);
        g.setColor(Color.black);
        g.drawOval(x, y, ancho, alto);
        //OJOS DEL PERSONAJE
        g.setColor(Color.white);
        g.fillOval(x+7,y+8,13,13);
        g.fillOval(x+21,y+8,13,13);
        g.setColor(Color.black);
        g.fillOval(x+11,y+12,5,5);
        g.fillOval(x+25,y+12,5,5);
        //BOCA DEL PERSONAJE
        g.setColor(Color.black);
        g.fillOval(x+7, y+24, 27, 7); 
    }
    
    public void despintar(Graphics g) {
        g.setColor(Color.white);
        g.fillOval(x, y, ancho, alto); //RELLENA UN OVALO
        //LINEAS QUE NOS PERMITE VER UNA LINEA QUE MUESTRA EL CONTORNO DEL OVALO
        g.setColor(Color.white);
        g.drawOval(x, y, ancho, alto);
    }
    
    public void teclaPresionada(KeyEvent evento){
        int [][]laberinto=lab.obtieneLaberinto();
        
        if(evento.getKeyCode()==37){ //IZQUIERDA
            if(laberinto[y/40][(x/40)-1]!=1){
                x=x-movimiento;
            }
        }
        if(evento.getKeyCode()==39){ //DERECHA
            if(laberinto[y/40][(x/40)+1]!=1){
                x=x+movimiento;
            }
        }
        if(evento.getKeyCode()==40){ //ABAJO
            if(laberinto[(y/40)+1][(x/40)]!=1){
                y=y+movimiento;
            }
        }
        if(evento.getKeyCode()==38){ //ARRIBA
            if(laberinto[(y/40)-1][(x/40)]!=1){
                y=y-movimiento;
            }
        }
        //AL LLEGAR AL FINAL
        if(x==840 && y==440){
            JuegoLaberinto.cambiaNivel();
            x=40; y=40;
        }
    }

}
