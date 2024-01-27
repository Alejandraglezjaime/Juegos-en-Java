package vista;

import java.awt.Color;
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
            lblInicial.setText(form.nombreJugadorEquis.getText());
        }
        else if(jugadorGanador==TipoImagen.CIRCULO){
            imgIzquierda.setRuta(Ruta.JUGADORCIRCULO);
            imgDerecha.setRuta(Ruta.CIRCULO);
            lblInicial.setText(form.nombreJugadorCirculo.getText());
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 134, Short.MAX_VALUE))
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

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelFondo;
    private modelo.Imagen imgDerecha;
    private modelo.Imagen imgIzquierda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCierre;
    private javax.swing.JLabel lblInicial;
    // End of variables declaration//GEN-END:variables
}
