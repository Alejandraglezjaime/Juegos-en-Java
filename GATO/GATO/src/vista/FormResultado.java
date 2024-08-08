package vista;

import java.awt.Color;
import java.awt.Window;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import modelo.Jugador;
import modelo.Ruta;
import modelo.Tablero;
import modelo.TipoImagen;


public class FormResultado extends javax.swing.JFrame {
    
    private Tablero tablero;
    private TipoImagen jugadorGanador;
    

   public FormResultado(TipoImagen jugadorGanador,Tablero tablero) {
        
        init();
        this.tablero = tablero;
        this.jugadorGanador = jugadorGanador;
        
        if(jugadorGanador==TipoImagen.EQUIS){
            imgIzquierda.setRuta(Ruta.JUGADOREQUIS);
            imgDerecha.setRuta(Ruta.EQUIS);
            lblInicial.setText(Form.nombreJugadorEquis.getText());
        }
        else if(jugadorGanador==TipoImagen.CIRCULO){
            imgIzquierda.setRuta(Ruta.JUGADORCIRCULO);
            imgDerecha.setRuta(Ruta.CIRCULO);
            lblInicial.setText(Form.nombreJugadorCirculo.getText());
        }
        else if(jugadorGanador==TipoImagen.EMPATE){
            imgIzquierda.setRuta(Ruta.JUGADOREQUIS);
            imgDerecha.setRuta(Ruta.JUGADORCIRCULO);
            lblInicial.setText("EMPATE");
        }
    }
    
    
    public void init(){
        setUndecorated(true);
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setBackground(new Color(0,0,0,0));
        PanelFondo.requestFocus();  
        PanelFondo.setOpaque(false);
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelFondo = new modelo.PanelRedondeado();
        lblCierre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        imgIzquierda = new modelo.Imagen();
        imgDerecha = new modelo.Imagen();
        lblInicial = new javax.swing.JLabel();
        panelBoton = new javax.swing.JPanel();
        lblSalir = new javax.swing.JLabel();
        panelBotonReinicio = new javax.swing.JPanel();
        lblReiniciar = new javax.swing.JLabel();
        panelBoton2 = new javax.swing.JPanel();
        lblIniciar3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelFondo.setBackground(new java.awt.Color(14, 19, 49));
        PanelFondo.setPreferredSize(new java.awt.Dimension(416, 315));
        PanelFondo.setLayout(null);

        lblCierre.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        lblCierre.setForeground(new java.awt.Color(240, 192, 255));
        lblCierre.setText("X");
        lblCierre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCierre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCierreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCierreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCierreMouseExited(evt);
            }
        });
        PanelFondo.add(lblCierre);
        lblCierre.setBounds(380, 10, 30, 25);

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(230, 251, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GANADOR");
        PanelFondo.add(jLabel1);
        jLabel1.setBounds(0, 20, 420, 45);

        imgIzquierda.setText("imagen1");
        imgIzquierda.setRuta("/recursos/JugadorEquis.png");
        PanelFondo.add(imgIzquierda);
        imgIzquierda.setBounds(40, 90, 60, 50);

        imgDerecha.setText("imagen1");
        imgDerecha.setRuta("/recursos/Equis.png");
        PanelFondo.add(imgDerecha);
        imgDerecha.setBounds(336, 90, 50, 50);

        lblInicial.setBackground(new java.awt.Color(60, 63, 65));
        lblInicial.setFont(new java.awt.Font("always  forever", 1, 36)); // NOI18N
        lblInicial.setForeground(new java.awt.Color(241, 227, 252));
        lblInicial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInicial.setText("NOMBRE");
        lblInicial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PanelFondo.add(lblInicial);
        lblInicial.setBounds(0, 90, 420, 50);

        panelBoton.setBackground(new java.awt.Color(42, 22, 79));

        lblSalir.setBackground(new java.awt.Color(60, 63, 65));
        lblSalir.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        lblSalir.setForeground(new java.awt.Color(241, 227, 252));
        lblSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSalir.setText("Salir del juego");
        lblSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSalir.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblSalirMouseMoved(evt);
            }
        });
        lblSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSalirMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblSalirMousePressed(evt);
            }
        });
        lblSalir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblSalirKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonLayout = new javax.swing.GroupLayout(panelBoton);
        panelBoton.setLayout(panelBotonLayout);
        panelBotonLayout.setHorizontalGroup(
            panelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        panelBotonLayout.setVerticalGroup(
            panelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        PanelFondo.add(panelBoton);
        panelBoton.setBounds(220, 180, 160, 50);

        panelBotonReinicio.setBackground(new java.awt.Color(42, 22, 79));
        panelBotonReinicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelBotonReinicioMouseClicked(evt);
            }
        });

        lblReiniciar.setBackground(new java.awt.Color(60, 63, 65));
        lblReiniciar.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        lblReiniciar.setForeground(new java.awt.Color(241, 227, 252));
        lblReiniciar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReiniciar.setText("Otra partida");
        lblReiniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblReiniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblReiniciarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblReiniciarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblReiniciarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblReiniciarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonReinicioLayout = new javax.swing.GroupLayout(panelBotonReinicio);
        panelBotonReinicio.setLayout(panelBotonReinicioLayout);
        panelBotonReinicioLayout.setHorizontalGroup(
            panelBotonReinicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblReiniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        panelBotonReinicioLayout.setVerticalGroup(
            panelBotonReinicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblReiniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        PanelFondo.add(panelBotonReinicio);
        panelBotonReinicio.setBounds(30, 180, 160, 50);

        panelBoton2.setBackground(new java.awt.Color(42, 22, 79));

        lblIniciar3.setBackground(new java.awt.Color(60, 63, 65));
        lblIniciar3.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        lblIniciar3.setForeground(new java.awt.Color(241, 227, 252));
        lblIniciar3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIniciar3.setText("Otra partida");
        lblIniciar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblIniciar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIniciar3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblIniciar3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblIniciar3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblIniciar3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelBoton2Layout = new javax.swing.GroupLayout(panelBoton2);
        panelBoton2.setLayout(panelBoton2Layout);
        panelBoton2Layout.setHorizontalGroup(
            panelBoton2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBoton2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblIniciar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(52, 52, 52))
        );
        panelBoton2Layout.setVerticalGroup(
            panelBoton2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBoton2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblIniciar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelFondo.add(panelBoton2);
        panelBoton2.setBounds(30, 180, 160, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCierreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseClicked
        dispose();
        tablero.reiniciarTablero(jugadorGanador);
    }//GEN-LAST:event_lblCierreMouseClicked

    private void lblCierreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseEntered
       lblCierre.setForeground(Color.red); //para que cuando pase el mouse arriba del label cambie de color
    }//GEN-LAST:event_lblCierreMouseEntered

    private void lblCierreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseExited
       lblCierre.setForeground(new Color(240,192,255)); //para que cuando el mouse salsa del label regrese a su color original, dado en el desing 
    }//GEN-LAST:event_lblCierreMouseExited

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblSalirMouseClicked

    private void lblSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseEntered
        panelBoton.setBackground(new Color(126,49,196));
    }//GEN-LAST:event_lblSalirMouseEntered

    private void lblSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseExited
        panelBoton.setBackground(new Color(42,22,79));
    }//GEN-LAST:event_lblSalirMouseExited

    private void lblSalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMousePressed
         System.out.println("Cerrando todas las ventanas excepto FormInicio."); // Depuración

    // Cerrar todas las ventanas excepto FormInicio
    for (Window window : Window.getWindows()) {
        if (window instanceof FormInicio) {
            continue; // No cerrar la ventana FormInicio
        }
        window.dispose();// Cierra la ventana actual
    }

    // Mostrar la ventana de FormInicio
    FormInicio inicio = new FormInicio(); // Crea una nueva instancia de FormInicio si es necesario
    inicio.setVisible(true); // Muestra la ventana de FormInicio
    }//GEN-LAST:event_lblSalirMousePressed

    private void lblReiniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReiniciarMouseClicked
        dispose();
        tablero.reiniciarTablero(jugadorGanador);     // TODO add your handling code here:
    }//GEN-LAST:event_lblReiniciarMouseClicked

    private void lblReiniciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReiniciarMouseEntered
       panelBotonReinicio.setBackground(new Color(126,49,196)); 
    }//GEN-LAST:event_lblReiniciarMouseEntered

    private void lblReiniciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReiniciarMouseExited
        panelBotonReinicio.setBackground(new Color(42,22,79)); 
    }//GEN-LAST:event_lblReiniciarMouseExited

    private void lblReiniciarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReiniciarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblReiniciarMousePressed

    private void lblIniciar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIniciar3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblIniciar3MouseClicked

    private void lblIniciar3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIniciar3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblIniciar3MouseEntered

    private void lblIniciar3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIniciar3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblIniciar3MouseExited

    private void lblIniciar3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIniciar3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblIniciar3MousePressed

    private void lblSalirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblSalirKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblSalirKeyPressed

    private void panelBotonReinicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBotonReinicioMouseClicked
           // TODO add your handling code here:
    }//GEN-LAST:event_panelBotonReinicioMouseClicked

    private void lblSalirMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_lblSalirMouseMoved

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelFondo;
    private modelo.Imagen imgDerecha;
    private modelo.Imagen imgIzquierda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCierre;
    private javax.swing.JLabel lblInicial;
    private javax.swing.JLabel lblIniciar3;
    private javax.swing.JLabel lblReiniciar;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JPanel panelBoton;
    private javax.swing.JPanel panelBoton2;
    private javax.swing.JPanel panelBotonReinicio;
    // End of variables declaration//GEN-END:variables

    
}
