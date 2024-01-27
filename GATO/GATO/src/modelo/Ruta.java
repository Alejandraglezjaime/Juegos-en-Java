package modelo;

public class Ruta {
    public static final String EQUIS = "/recursos/Equis.png";
    public static final String CIRCULO = "/recursos/Circulo.png";
    public static final String JUGADOREQUIS = "/recursos/JugadorEquis.png";
    public static final String JUGADORCIRCULO = "/recursos/JugadorCirculo.png";
    public static final String JUGADORAUXILLAR = "/recursos/JugadorAuxillar.png";
    
    public static String LINEA1 = "/recursos/CirculoLinea1.png";
    public static String LINEA2 = "/recursos/CirculoLinea2.png";
    public static String LINEA3 = "/recursos/CirculoLinea3.png";
    public static String LINEA4 = "/recursos/CirculoLinea4.png";
    public static String LINEA5 = "/recursos/CirculoLinea5.png";
    public static String LINEA6 = "/recursos/CirculoLinea6.png";
    public static String LINEA7 = "/recursos/CirculoLinea7.png";
    public static String LINEA8 = "/recursos/CirculoLinea8.png";
    
    public static void cambiarRutas(TipoImagen tipoImagen){
        if(tipoImagen==TipoImagen.CIRCULO){
           LINEA1 = "/recursos/CirculoLinea1.png";
           LINEA2 = "/recursos/CirculoLinea2.png";
           LINEA3 = "/recursos/CirculoLinea3.png";
           LINEA4 = "/recursos/CirculoLinea4.png";
           LINEA5 = "/recursos/CirculoLinea5.png";
           LINEA6 = "/recursos/CirculoLinea6.png";
           LINEA7 = "/recursos/CirculoLinea7.png";
           LINEA8 = "/recursos/CirculoLinea8.png";
        }
        else if(tipoImagen==TipoImagen.EQUIS){
           LINEA1 = "/recursos/EquisLinea1.png";
           LINEA2 = "/recursos/EquisLinea2.png";
           LINEA3 = "/recursos/EquisLinea3.png";
           LINEA4 = "/recursos/EquisLinea4.png";
           LINEA5 = "/recursos/EquisLinea5.png";
           LINEA6 = "/recursos/EquisLinea6.png";
           LINEA7 = "/recursos/EquisLinea7.png";
           LINEA8 = "/recursos/EquisLinea8.png";
        }
    }
}