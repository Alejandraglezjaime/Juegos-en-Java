
import java.awt.Color;
import java.awt.Graphics;


public class end {
    laberinto lab= new laberinto(); //ESTO ES PARA HACER USO DE UN METODO DE LA CLASE LABERINTO 
    private int fila=0, columna=0;
     private final int nFilas=13;
    private final int nColumnas=23;
    private final int anchoBloque=40;
    private final int altoBloque=40;

    private final int x=11;
    private final int y=22;
    
    public void paint(Graphics g){
        int [][]laberinto=lab.obtieneLaberinto();
        //Va a recorrer la matriz pero solo va a pintar de color gris lo que se supone es el final del juego
        for(fila=0;fila<nFilas;fila++){
            for(columna=0; columna<nColumnas;columna++){
                 if (fila == x && columna == y) {
                    // Pintar en la posición (x, y)
                    g.setColor(Color.DARK_GRAY); // Cambia el color según tus necesidades
                    g.fillRect(columna * anchoBloque, fila * altoBloque, anchoBloque, altoBloque);
                    g.setColor(Color.BLACK);
                    g.drawRect(columna * anchoBloque, fila * altoBloque, anchoBloque, altoBloque);
                } 
            }
        }
    }
    
}

