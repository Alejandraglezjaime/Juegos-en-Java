
import java.awt.Color;
import java.awt.Graphics;


public class laberinto {
    
    private int fila=0, columna=0;
    private final int nFilas=13;
    private final int nColumnas=23;
    private final int anchoBloque=40;
    private final int altoBloque=40;
    
    public void paint(Graphics g){
        int[][]laberinto=obtieneLaberinto();
        //PARA RECORRER LA MATRIZ  
        for(fila=0;fila<nFilas;fila++){
            for(columna=0; columna<nColumnas;columna++){
                if(laberinto[fila][columna]==1){ //SI LABERINTO ES IGUAL A UN MURO
                   g.setColor(Color.BLUE);
                   g.fillRect(columna*40, fila*40, anchoBloque, altoBloque); //pintamos un cuadrado de color azul
                   g.setColor(Color.black);
                   g.drawRect(columna*40, fila*40, anchoBloque, altoBloque);
                }
            }
        }
    }
    
    public int[][] obtieneLaberinto(){
        int laberinto[][] = {
            //LOS NUMERO 1 DIBUJA UN MURO Y LOS CERO SON ESPACIOS VACIOS
            
    {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
    {1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
    {1,1,1,0,1,0,1,1,1,1,1,0,1,1,1,1,1,1,1,1,0,1,1},
    {1,1,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,1,1},
    {1,1,0,1,1,1,1,0,1,1,1,1,1,1,0,1,1,1,1,1,0,1,1},
    {1,1,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,1,1},
    {1,1,1,0,1,0,1,1,0,1,1,1,1,1,1,1,1,1,0,1,0,1,1},
    {1,1,0,0,1,0,1,0,0,0,1,0,0,0,0,0,0,0,0,1,0,1,1},
    {1,1,0,1,1,0,1,0,1,0,1,0,1,1,1,1,1,1,1,1,0,1,1},
    {1,1,0,1,0,0,0,0,1,0,1,0,0,1,0,0,0,0,0,1,0,1,1},
    {1,1,0,1,0,1,1,1,1,1,1,1,0,1,1,1,0,1,0,1,1,1,1},
    {1,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,1},
    {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
   

            
        };
        
    return laberinto;
    }
    
    
    
    
}
