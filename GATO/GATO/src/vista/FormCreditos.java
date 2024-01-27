package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import modelo.Jugador;
import modelo.Ruta;
import modelo.Tablero;
import modelo.TipoImagen;


public class FormCreditos extends javax.swing.JFrame {
    

   public FormCreditos() {
        init();
        
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
        imgDerecha = new modelo.Imagen();
        lblInicial = new javax.swing.JLabel();
        lblInicial1 = new javax.swing.JLabel();
        lblInicial2 = new javax.swing.JLabel();
        imgInsta = new modelo.Imagen();
        imgIzquierda = new modelo.Imagen();

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
        lblCierre.setBounds(580, 10, 30, 25);

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(230, 251, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("creador");
        PanelFondo.add(jLabel1);
        jLabel1.setBounds(0, 20, 610, 45);

        imgDerecha.setText("imagen1");
        imgDerecha.setRuta("/recursos/JugadorCirculo.png");
        PanelFondo.add(imgDerecha);
        imgDerecha.setBounds(440, 10, 50, 50);

        lblInicial.setBackground(new java.awt.Color(60, 63, 65));
        lblInicial.setFont(new java.awt.Font("always  forever", 1, 24)); // NOI18N
        lblInicial.setForeground(new java.awt.Color(241, 227, 252));
        lblInicial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInicial.setText("         https://www.instagram.com/alejandra_g01j?utm_source=qr&r=nametag");
        lblInicial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PanelFondo.add(lblInicial);
        lblInicial.setBounds(0, 160, 610, 50);

        lblInicial1.setBackground(new java.awt.Color(60, 63, 65));
        lblInicial1.setFont(new java.awt.Font("always  forever", 1, 24)); // NOI18N
        lblInicial1.setForeground(new java.awt.Color(241, 227, 252));
        lblInicial1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInicial1.setText("Red social");
        lblInicial1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PanelFondo.add(lblInicial1);
        lblInicial1.setBounds(0, 130, 610, 40);

        lblInicial2.setBackground(new java.awt.Color(60, 63, 65));
        lblInicial2.setFont(new java.awt.Font("always  forever", 1, 24)); // NOI18N
        lblInicial2.setForeground(new java.awt.Color(241, 227, 252));
        lblInicial2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInicial2.setText("Creado por Arleth Alejandra Gonzalez Jaime");
        lblInicial2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PanelFondo.add(lblInicial2);
        lblInicial2.setBounds(0, 70, 620, 50);

        imgInsta.setText("imagen1");
        imgInsta.setRuta("/recursos/Insta.png");
        PanelFondo.add(imgInsta);
        imgInsta.setBounds(50, 170, 30, 30);

        imgIzquierda.setText("imagen1");
        imgIzquierda.setRuta("/recursos/JugadorEquis.png");
        PanelFondo.add(imgIzquierda);
        imgIzquierda.setBounds(120, 10, 50, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCierreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseClicked
       dispose();
       //cuando de clic en el x regresar a la ventana inicial
        FormInicio creditos = new FormInicio(); 
        creditos.setVisible(true);
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
    private modelo.Imagen imgInsta;
    private modelo.Imagen imgIzquierda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCierre;
    private javax.swing.JLabel lblInicial;
    private javax.swing.JLabel lblInicial1;
    private javax.swing.JLabel lblInicial2;
    // End of variables declaration//GEN-END:variables
}
