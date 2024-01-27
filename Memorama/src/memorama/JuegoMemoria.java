
package memorama;

//librerias
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;
import javax.swing.*;

public class JuegoMemoria extends JFrame implements ActionListener{
    JPanel panel;
    JLabel matriz [][],etiqueta,etique,nombreju,cronometro,lblfecha,lblhora;
    int mat [][] = new int[4][5];
    int mat2 [][] = new int[4][5];
    Random ran;
    int contador,ban,ban1,annum,anposx,anposy,acnum,acposx,acposy;
    Timer espera, espera2,tiempo;
    int consegund,seg,min;
    int hora,minutos,segundos;
    JButton reiniciar;
    //Thread hilo;

    
    public JuegoMemoria(){
        this.setTitle("Memorama");
        this.setSize(1500, 720);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        
        //*****************  se coloca un panel a la ventana  ********************************
        
        panel = new JPanel();
        this.getContentPane().add(panel);
        panel.setLayout(null);
        this.getContentPane().add(panel);  
       // panel.setBackground(new Color(240,230,255)); //color al panel
      
      
        //*************  proposito de mat2, que las cartas aparescan volteadas  **************
        ran = new Random();
        this.numaleatorios();

        //****************************  matriz de imagenes  **********************************
        //este hara una matriz de 4filas por 5columnas donde mostrara imagenes 
        matriz = new JLabel[4][5];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = new JLabel();
                matriz[i][j].setSize(matriz[i][j].getWidth(), matriz[i][j].getHeight());
                /*aqui la damos espacios a la imagenes para que no salgan pegadas width y height dan el tamaño de la matriz y los dos primeros dan el espacio entre las imagenes, 
                le di 6 pixeles mas para que se notara el espacio */
                matriz[i][j].setBounds(350+(j*210),30+(i*160), 204, 156);
                //declaramos la imagenes que tiene el los nombres de 1 a 10
                matriz[i][j].setIcon(new ImageIcon("src/imagenes/"+mat2[i][j]+".png")); 
                      matriz[i][j].setHorizontalAlignment(JLabel.CENTER);
                      matriz[i][j].setVerticalAlignment(JLabel.CENTER);
                      
                      
                //colocamos que la matriz se muestre en pantalla
                matriz[i][j].setVisible(true);
                //aqui se añaden junto con la 0
                panel.add(matriz[i][j],0);
                
                
            } 
            
        }

        // ******************************** tiempo transcurrido *************************
        seg = 0;
        min = 0;        
        
        tiempo = new Timer (1000, new ActionListener()
        {
          
            public void actionPerformed(ActionEvent e) 
            {
                
                seg++;
                if(seg == 60){
                    min++;
                    seg=0;
                }
                
            //declaramos en una variable cronometro el tiempo que transcurre
            cronometro.setText(min+":"+seg); 
            }} );
        
        
        
        
        //declaramos en la variable espera la cual es otro tiempo el cual lo utilizamos para colocar un tiempo a la hora de que las cartas se voltean 
        consegund = 0;
        espera = new Timer (400, new ActionListener() 
        {
          
            public void actionPerformed(ActionEvent e) 
            {
                consegund++;
            }});
        
        
        
        espera.start();
        espera.stop();
        consegund = 0;
        ban=0;
        ban1=0;
        
        //*************************  evento de clic en la cartas  *******************************
        contador = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j].addMouseListener(new MouseAdapter(){
                    public void mousePressed(MouseEvent e){
                        for (int k = 0; k < 4; k++) {
                            for (int l = 0; l < 5; l++) {
                                if(e.getSource() == matriz[k][l]){
                                   // System.out.println(k+" "+l);
                                   
                                   //cuando se da click a la carta esta se volteara
                                   if(mat2[k][l] == 0 && contador !=2){
                                       mat2[k][l] = mat[k][l];
                                       matriz[k][l].setIcon(new ImageIcon("src/imagenes/"+mat2[k][l]+".png"));
                                            
                                       contador++;
                                       acnum = mat[k][l];
                                       acposx = k;
                                       acposy = l;
                                       if(contador == 1){
                                            annum = mat[k][l];
                                            anposx = k;
                                            anposy = l;
                                       }
                                       
                                       //tiempo que se tarda en dar vuelta
                                       espera2 = new Timer (400, new ActionListener()
                                       {
          
                                        public void actionPerformed(ActionEvent e) {

                                           if(contador == 2 && ban1 == 0){
                                               espera.restart();
                                               ban1=1;
                                            }
                                            if(contador == 2 && consegund == 2){
                                                espera.stop();
                                                consegund = 0;
                                                
                                                //Desaparecen las cartas que son iguales y deja las que aun no se encuentran
                                                if(mat2[acposx][acposy]==mat2[anposx][anposy]){
                                                
                                                    mat2[acposx][acposy] = -1;
                                                    mat2[anposx][anposy] = -1;
                                                    matriz[acposx][acposy].setIcon(new ImageIcon("src/imagenes/"+mat2[acposx][acposy]+".png"));
                                                 
                                                    matriz[anposx][anposy].setIcon(new ImageIcon("src/imagenes/"+mat2[anposx][anposy]+".png"));
                                                    contador=0;
                                                    //gano si toda la mat2 es -1
                                                    int acum = 0;
                                                    for (int m = 0; m < 4; m++) {
                                                       for (int n = 0; n < 5; n++) {
                                                          if (mat2[m][n] == -1)
                                                              acum++;
                                                          }
                                                    }
                                                    
                                                    
                                                    /*cuando no tenga ninguna imagen aparecera una ventana diciendo  */ 
                                                       if(acum == 20){
                                                           JOptionPane.showMessageDialog(panel, "FELICIDADES GANASTE");
                                                           
                                                            RecordJugadorDos ventana = new RecordJugadorDos();
                                                            ventana.setVisible(true);
                                                            tiempo.stop();
                                                            ventana.lbltiempoju.setText(min+":"+seg);
                                                            ventana.lblnombrejuga.setText(nombreju.getText());
                                                            ventana.lblhorainicio.setText(lblhora.getText());
                                                            ventana.lblfechaju.setText(lblfecha.getText());
                                                           
                                                       }
                                                }
                                                for (int m = 0; m < 4; m++) {
                                                    for (int n = 0; n < 5; n++) {
                                                        //se coloca el valor -1 a las cartas pares
                                                        if(mat2[m][n]!=0 && mat2[m][n]!=-1){
                                                            mat2[m][n] = 0;
                                                            matriz[m][n].setIcon(new ImageIcon("src/imagenes/"+mat2[m][n]+".png"));
   
                                                            contador=0;

                                                        }
                                                        System.out.println("salio");

                                                    }

                                                }
                                                espera2.stop();
                                                ban1=0;
                                            }
                                        }});
                                       if(ban == 0)
                                           espera2.start();
                                           ban = 1;
                                       if(contador == 2)
                                               espera2.restart();
                                   }    
  
                                }
                                
                            }
                            
                        }
                    }

                   
                });
                
            }
            
        }
        
        
        componentes();
        lblfecha.setText(fecha());
        hora();
        //hilo = new Thread(this);  
    }
    
    // *************************  este metodo va obtener la hora actual del despositivo  ********************************
    private void hora(){ 
      Calendar calendario = new GregorianCalendar();
      hora= calendario.get(Calendar.HOUR_OF_DAY);
      minutos = calendario.get(Calendar.MINUTE);
      segundos = calendario.get(Calendar.SECOND);
      lblhora.setText(hora + ":" + minutos + ":" + segundos);   
    } 
    
    //*************************** este metodo obtiene la fecha del dia mediante el dispositivo  *************************
    private String fecha(){
        Date fecha = new Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatofecha.format(fecha);
        
    }
    
    // ***************************  este metodo se hace para obtener aleatoriamente las cartas  **************************
    //cada vez que se inicie el juego las cartas apareceran en diferentes lugares, tambien para obtener dos veces la misma carta
    private void numaleatorios(){
        int acumulador = 0;
         for (int i = 0; i < 4; i++) 
            for (int j = 0; j < 5; j++){
                mat[i][j] = 0;
              //  mat2[i][j] = 0;
                
            }    
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                mat[i][j] = ran.nextInt(10)+1;
                
                do{
                    acumulador = 0;
                    for (int k = 0; k < 4; k++) {
                        for (int l = 0; l < 5; l++) {
                             if(mat[i][j]== mat[k][l]){
                                acumulador +=1;
                            }
                        }
                    }
                //*********************  esto se coloca para que solo se duplique dos veces la carta  ************************
                if(acumulador == 3){
                    mat[i][j] = ran.nextInt(10)+1;
                }
                }while(acumulador == 3); 
            }   
        }
        
       
            
        
         
    }
    
    
   
   // **************************  estos son los componentes del programa  ********************************* 
    private void componentes(){
        etiqueta = new JLabel("Jugador: ");
        etiqueta.setBounds(40,40,150,40);
        etiqueta.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 15));
        panel.add(etiqueta);
        
        nombreju = new JLabel();
        nombreju.setBounds(135,40,150,40);
        nombreju.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        panel.add(nombreju);
        
        etiqueta = new JLabel("Tiempo: ");
        etiqueta.setBounds(40,80,150,40);
        etiqueta.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 15));
        panel.add(etiqueta);
        
        //en este JLabel aparecera la hora transcurrida durante el juego
        cronometro = new JLabel();
        cronometro.setBounds(135,80,150,40);
        cronometro.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        panel.add(cronometro);
        
        etiqueta = new JLabel("Hora inicio: ");
        etiqueta.setBounds(40,120,150,40);
        etiqueta.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 15));
        panel.add(etiqueta);
        
        //en este JLabel se mostrar la fecha
        lblfecha = new JLabel();
        lblfecha.setBounds(135,160,150,40);
        lblfecha.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        panel.add(lblfecha);
        
        etiqueta = new JLabel("Fecha: ");
        etiqueta.setBounds(40,160,150,40);
        etiqueta.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 15));
        panel.add(etiqueta);
        
        //en este JLabel se mostrara la hora 
        lblhora = new JLabel();
        lblhora.setBounds(135,120,150,40);
        lblhora.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        panel.add(lblhora);
        
        //este boton reiniciara el juego
        reiniciar = new JButton("Reiniciar");
        reiniciar.setBounds(115,560,120,40);
        reiniciar.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 15));
        reiniciar.addActionListener(this);
        panel.add(reiniciar);
        
    }
    
    
    //estos son los eventos de accion
    @Override
    public void actionPerformed(ActionEvent e) {
        
        //se coloca que el boton reinicia mostrara un mensaje preguntando si esta segurdo de querea hacerlo
        //si es si, se reiniciara desde el inicio y sino pues seguira en la partida
         if(e.getSource() == reiniciar){
              if (JOptionPane.showConfirmDialog(rootPane, "¿Estas seguro de querer reiniciar el juego?\n Al hacer esto lo mandara a menu inico y su trayectoria abra desaparecido.",
                "Reinicio de Juego", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE) == JOptionPane.YES_OPTION)
        {
            Inicio ventana = new Inicio();
            ventana.setVisible(true);
            this.setVisible(false);
        }
        else{
                setDefaultCloseOperation(0);
        }
         }
    }
        
}