/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ahorcado;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Icon;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author aleja
 */
public class Ahorcado extends JFrame implements ActionListener{
    private JButton btnBuscar, btnSalir, btnNuevo, btnCreditos;
    private JTextField edt1, edt2;
    private JLabel lbl1, lbl2, lbl3, imagenn, imagenn1, imagenn2, imagenn3, imagenn4, imagenn5, imagen,imagen1, imagen2, imagen3, imagen4, imagen5, title;
    private String palabra;
    private String []lineas = new String[10];
    public int contador=0, correctas = 0 , intentos = 0;
    
    public Ahorcado(){
        
    super("Ahorcado");
    
    lbl1=new JLabel("Palabra: ");
    lbl1.setBounds(30, 50, 100, 20);
    lbl2= new JLabel("Letra ");
    lbl2.setBounds(150, 90, 100, 20);
    lbl3=new JLabel("");
    lbl3.setBounds(30, 20, 600, 25);
    title = new JLabel(" '' Juego del ahorcado ''");
    title.setBounds(440, 20, 600   , 20);
    title.setFont(new Font("arial", 1, 20));
    
    
    edt1 = new JTextField("");
    edt1.setEditable(false);
    edt1.setBounds(100, 50, 200, 20);
    edt2=new JTextField("");
    edt2.setBounds(200, 90, 80, 20);
    
    btnBuscar = new JButton("Verificar");
    btnBuscar.setBounds(200, 120, 100, 20);
    
    btnSalir = new JButton("Salir");
    btnSalir.setBounds(200, 200 , 100, 20);
    
    btnNuevo = new JButton("Nuevo ");
    btnNuevo.setBounds(200, 160, 100, 20);
    
    btnCreditos = new JButton("Creditos");
    btnCreditos.setBounds(200, 300, 100, 20);
    
    btnSalir.addActionListener(this);
    btnBuscar.addActionListener(this);
    btnNuevo.addActionListener(this);
    btnCreditos.addActionListener(this);
    
    Icon imagenInicio = new ImageIcon("D:\\PROGRAMAS JAVA\\NETBEANS\\JUEGO AHORCADO\\Ahorcado\\src\\ahorcado\\Inicio.jpeg");
    imagenn= new JLabel(imagenInicio);    
    imagenn.setSize(1100, 500);
    //LAS DOS SIGUIENTES LINEAS CENTRAN LA IMAGEN AL JLABEL
     imagenn.setHorizontalAlignment(SwingConstants.CENTER); 
        imagenn.setVerticalAlignment(SwingConstants.CENTER);
    
    
    Icon imagen1 = new ImageIcon("D:\\PROGRAMAS JAVA\\NETBEANS\\JUEGO AHORCADO\\Ahorcado\\src\\ahorcado\\1.jpeg");
    imagenn1= new JLabel(imagen1);
    imagenn1.setSize(1100, 500);
     imagenn1.setHorizontalAlignment(SwingConstants.CENTER);
        imagenn1.setVerticalAlignment(SwingConstants.CENTER);
   
            
    Icon imagen2 = new ImageIcon("D:\\PROGRAMAS JAVA\\NETBEANS\\JUEGO AHORCADO\\Ahorcado\\src\\ahorcado\\2.jpeg");
    imagenn2= new JLabel(imagen2);
    imagenn2.setSize(1100, 500);
     imagenn2.setHorizontalAlignment(SwingConstants.CENTER);
        imagenn2.setVerticalAlignment(SwingConstants.CENTER);
    
    Icon imagen3 = new ImageIcon("D:\\PROGRAMAS JAVA\\NETBEANS\\JUEGO AHORCADO\\Ahorcado\\src\\ahorcado\\3.jpeg");
    imagenn3= new JLabel(imagen3);
    imagenn3.setSize(1100, 500);
     imagenn3.setHorizontalAlignment(SwingConstants.CENTER);
        imagenn3.setVerticalAlignment(SwingConstants.CENTER);
    
    Icon imagen4 = new ImageIcon("D:\\PROGRAMAS JAVA\\NETBEANS\\JUEGO AHORCADO\\Ahorcado\\src\\ahorcado\\4.jpeg");
    imagenn4= new JLabel(imagen4);
    imagenn4.setSize(1100, 500);
     imagenn4.setHorizontalAlignment(SwingConstants.CENTER);
        imagenn4.setVerticalAlignment(SwingConstants.CENTER);
    
    Icon imagen5 = new ImageIcon("D:\\PROGRAMAS JAVA\\NETBEANS\\JUEGO AHORCADO\\Ahorcado\\src\\ahorcado\\5.jpeg");
    imagenn5= new JLabel(imagen5);
    imagenn5.setSize(1100, 500);
     imagenn5.setHorizontalAlignment(SwingConstants.CENTER);
        imagenn5.setVerticalAlignment(SwingConstants.CENTER);
        
    imagenes();
    crearPalabra();
    
    getContentPane().add(lbl1);
    getContentPane().add(lbl2);
    getContentPane().add(lbl3);
    getContentPane().add(edt1);
    getContentPane().add(edt2);
    getContentPane().add(btnSalir);
    getContentPane().add(btnBuscar);
    getContentPane().add(btnNuevo);
     getContentPane().add(btnCreditos);
     getContentPane().add(title);
    
    
    getContentPane().setLayout(null);
        setSize(800, 550);
        setVisible(true);

    }

    private void crearPalabra(){
        String [][] lista = {{"LITIO","BERILIO","BORO","CARBONO","NIQUEL","OXIGENO","FOSFORO"},
                             {"CANGREGO","CANGURO","DELFIN","DINOSAURIO","TIBURON","KOALA","TORTUGA"},
                             {"AZUL","VIOLETA","TURQUESA","LILA","MAGNETA","MORADO","ROJO"},
                             {"CHINA","INDIA","TURQUIA","MEXICO","CANADA","JAPON","BRASIL"}  };
       
        int categoria =(int)(Math.random()*3);
        int pala=(int)(Math.random()*7);
        palabra = lista[categoria][pala];
       
        if(categoria==0){
            lbl3.setText("TU PALABRA A BUSCAR ES DE LA TABLA PERIODICA");
        } if(categoria==1){
          lbl3.setText("TU PALABRA A BUSCAR ES UN ANIMAL");} 
        if(categoria==2){
        lbl3.setText("TU PALABRA A BUSCAR ES UN COLOR");}
        if (categoria==3) {
        lbl3.setText("TU PALABRA A BUSCAR ES UN PAIS");}
    
      for(int j = 0; j < palabra.length(); j++){
        contador++;
        lineas[j]="_";
        edt1.setText(edt1.getText() + lineas[j] + " ");
      }
    
    }
    
    private void imagenes(){
    if(intentos==0){
        imagenn.setVisible(true);}
    if(intentos==1){
        imagenn1.setVisible(true);}
    if(intentos==2){
        imagenn2.setVisible(true);}
    if(intentos==3){
        imagenn3.setVisible(true);}
    if(intentos==4){
        imagenn4.setVisible(true);}
    if(intentos==5){
        imagenn5.setVisible(true);}
    
    if(intentos==0){
        getContentPane().add(imagenn);}
    if(intentos==1){
        imagenn.setVisible(false);
        getContentPane().add(imagenn1);}
    if(intentos==2){
        imagenn1.setVisible(false);
        getContentPane().add(imagenn2);}
    if(intentos==3){
        imagenn2.setVisible(false);
        getContentPane().add(imagenn3);}
    if(intentos==4){
        imagenn3.setVisible(false);
        getContentPane().add(imagenn4);}
    if(intentos==5){
        imagenn4.setVisible(false);
        getContentPane().add(imagenn5);}
    }
    
    
    
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource().equals(btnSalir)){
        System.exit(0);}
        
        if(e.getSource().equals(btnBuscar)){
            char letra = caracter(edt2.getText());
            String letra2=(edt2.getText());
            String temp = edt1.getText();
            intentos ++;
            
            for(int i=0; i<palabra.length();i++){
            
                if(letra==palabra.charAt(i)){
                    lineas[i]=letra2;
                    correctas++;
                    edt1.setText(null);
                    intentos=intentos-1;
                    
                    for(int j=0; j<palabra.length();j++){
                    edt1.setText(edt1.getText()+lineas[j]+ " ");}
                }
                
                }
            imagenes();
            
            if(correctas==contador){
                JOptionPane.showMessageDialog(null, "FELICIDADES, GANASTE");
                edt2.setEditable(false);
            } 
            if(intentos==5){
                JOptionPane.showMessageDialog(null, "SORRY, PERDISTE :C");
                edt2.setEditable(false);
            }
            edt2.setText(null);
        }
        
        if(e.getSource().equals(btnNuevo)){
         edt1.setText(null);
         contador=0;
         crearPalabra();
         intentos=0;
         correctas=0;
         edt2.setEditable(true);
         
         imagenn.setVisible(true);
         imagenn1.setVisible(true);
         imagenn2.setVisible(true);
         imagenn3.setVisible(true);
         imagenn4.setVisible(true);
         imagenn5.setVisible(true);
         
         }
        
        if(e.getSource().equals(btnCreditos)){
         JOptionPane.showMessageDialog(null, "Creado por Arleth Alejandra Gonzalez Jaime "
                                                        + "\n\nEstudiante de la carrera de ingenieria en computacion \nen la Facultad de Estudios Superiores Aragon"
                                                        + "\n\nRed Social : https://www.instagram.com/alejandra_g01j?utm_source=qr&r=nametag ");
         }

    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Ahorcado x = new Ahorcado();     
        x.setLocationRelativeTo(null);
        x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private char caracter(String text){
    return text.charAt(0);}
    
}
