
package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import modelo.Jugador;
import modelo.TipoImagen;



public class FormInicio extends javax.swing.JFrame {

    public FormInicio() {
        init();
    }
    
    
    public void init(){
        setUndecorated(true);
        initComponents();
        setResizable(false); //ya no permite hacerla mas pequeña o mas grande
        setLocationRelativeTo(null); //aparece en el centro
        setBackground(new Color(0,0,0,0));
        PanelFondo.requestFocus(); //indicamos que el cursor ya no se encuentre en ningun campo de texto, ya que el foco se va a encontrar en el panel 
        
        PanelFondo.setOpaque(false); //hace el panel fondo transparente 
        Border bordeBoton = BorderFactory.createLineBorder(new Color(243,211,246),2); //Le estoy indicando que label que tenda un borde y en la siguiente linea se la estoy agregando al boton
        panelBoton.setBorder(bordeBoton);
        
        Border bordeBoton1 = BorderFactory.createLineBorder(new Color(243,211,246),2); 
        panelBoton1.setBorder(bordeBoton1);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelFondo = new modelo.PanelRedondeado();
        lblCierre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtJugador2 = new javax.swing.JTextField();
        txtJugador1 = new javax.swing.JTextField();
        panelBoton = new javax.swing.JPanel();
        lblIniciar = new javax.swing.JLabel();
        imagen1 = new modelo.Imagen();
        imagen2 = new modelo.Imagen();
        imagen3 = new modelo.Imagen();
        imagen4 = new modelo.Imagen();
        panelBoton1 = new javax.swing.JPanel();
        lblCreditos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelFondo.setBackground(new java.awt.Color(14, 19, 49));
        PanelFondo.setPreferredSize(new java.awt.Dimension(416, 315));
        PanelFondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PanelFondoMousePressed(evt);
            }
        });
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
        jLabel1.setText("TIC TAC TOE");
        PanelFondo.add(jLabel1);
        jLabel1.setBounds(0, 20, 420, 45);

        txtJugador2.setBackground(new java.awt.Color(249, 230, 254));
        txtJugador2.setFont(new java.awt.Font("Segoe Print", 1, 28)); // NOI18N
        txtJugador2.setForeground(new java.awt.Color(205, 105, 220));
        txtJugador2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtJugador2.setText("jugador 2");
        txtJugador2.setBorder(null);
        txtJugador2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtJugador2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtJugador2FocusLost(evt);
            }
        });
        txtJugador2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtJugador2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtJugador2MouseExited(evt);
            }
        });
        txtJugador2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtJugador2KeyTyped(evt);
            }
        });
        PanelFondo.add(txtJugador2);
        txtJugador2.setBounds(100, 160, 230, 40);

        txtJugador1.setBackground(new java.awt.Color(214, 252, 249));
        txtJugador1.setFont(new java.awt.Font("Segoe Print", 1, 28)); // NOI18N
        txtJugador1.setForeground(new java.awt.Color(101, 175, 245));
        txtJugador1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtJugador1.setText("jugador 1");
        txtJugador1.setBorder(null);
        txtJugador1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtJugador1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtJugador1FocusLost(evt);
            }
        });
        txtJugador1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtJugador1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtJugador1MouseExited(evt);
            }
        });
        txtJugador1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtJugador1KeyTyped(evt);
            }
        });
        PanelFondo.add(txtJugador1);
        txtJugador1.setBounds(100, 100, 230, 40);

        panelBoton.setBackground(new java.awt.Color(42, 22, 79));

        lblIniciar.setBackground(new java.awt.Color(60, 63, 65));
        lblIniciar.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        lblIniciar.setForeground(new java.awt.Color(241, 227, 252));
        lblIniciar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIniciar.setText("lNICIAR");
        lblIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIniciarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblIniciarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblIniciarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblIniciarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonLayout = new javax.swing.GroupLayout(panelBoton);
        panelBoton.setLayout(panelBotonLayout);
        panelBotonLayout.setHorizontalGroup(
            panelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIniciar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        panelBotonLayout.setVerticalGroup(
            panelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        PanelFondo.add(panelBoton);
        panelBoton.setBounds(130, 230, 160, 50);

        imagen1.setText("imagen1");
        imagen1.setRuta("/recursos/Circulo.png");
        PanelFondo.add(imagen1);
        imagen1.setBounds(340, 160, 46, 40);

        imagen2.setText("imagen1");
        imagen2.setRuta("/recursos/JugadorEquis.png");
        PanelFondo.add(imagen2);
        imagen2.setBounds(40, 100, 40, 40);

        imagen3.setText("imagen1");
        imagen3.setRuta("/recursos/JugadorCirculo.png");
        PanelFondo.add(imagen3);
        imagen3.setBounds(40, 160, 40, 40);

        imagen4.setText("imagen1");
        imagen4.setRuta("/recursos/Equis.png");
        PanelFondo.add(imagen4);
        imagen4.setBounds(340, 100, 46, 40);

        panelBoton1.setBackground(new java.awt.Color(42, 22, 79));

        lblCreditos.setBackground(new java.awt.Color(60, 63, 65));
        lblCreditos.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        lblCreditos.setForeground(new java.awt.Color(241, 227, 252));
        lblCreditos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreditos.setText("CREADOR");
        lblCreditos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCreditos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCreditosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCreditosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCreditosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCreditosMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelBoton1Layout = new javax.swing.GroupLayout(panelBoton1);
        panelBoton1.setLayout(panelBoton1Layout);
        panelBoton1Layout.setHorizontalGroup(
            panelBoton1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCreditos, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        panelBoton1Layout.setVerticalGroup(
            panelBoton1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBoton1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PanelFondo.add(panelBoton1);
        panelBoton1.setBounds(130, 300, 160, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCierreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseClicked
        System.exit(0); //Para que cuando pasemos el mouse sobre el label acabe el codigo
    }//GEN-LAST:event_lblCierreMouseClicked

    private void lblCierreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseEntered
       lblCierre.setForeground(Color.red); //para que cuando pase el mouse arriba del label cambie de color
    }//GEN-LAST:event_lblCierreMouseEntered

    private void lblCierreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseExited
       lblCierre.setForeground(new Color(240,192,255)); //para que cuando el mouse salsa del label regrese a su color original, dado en el desing 
    }//GEN-LAST:event_lblCierreMouseExited

    private void txtJugador1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtJugador1MouseEntered
        Border borde = BorderFactory.createLineBorder(new Color(52,126,235), 2); //le da un borde al momento que el mouse esta encima 
        txtJugador1.setBorder(borde);
    }//GEN-LAST:event_txtJugador1MouseEntered

    private void txtJugador2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtJugador2MouseEntered
       Border borde = BorderFactory.createLineBorder(new Color(165,40,174), 2);  
        txtJugador2.setBorder(borde);
    }//GEN-LAST:event_txtJugador2MouseEntered

    private void txtJugador1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtJugador1MouseExited
        txtJugador1.setBorder(null); // quita el borde despues de quitar el mouse 
    }//GEN-LAST:event_txtJugador1MouseExited

    private void txtJugador2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtJugador2MouseExited
         txtJugador2.setBorder(null);
    }//GEN-LAST:event_txtJugador2MouseExited

    private void txtJugador1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtJugador1FocusGained
        if(txtJugador1.getText().equals("jugador 1")) {  //estas dos lineas hacen que cuando el usuario le de clic el texto mostrado se elimine automaticamente 
        txtJugador1.setText("");}
    }//GEN-LAST:event_txtJugador1FocusGained

    private void txtJugador2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtJugador2FocusGained
         if(txtJugador2.getText().equals("jugador 2"))  {
        txtJugador2.setText("");}
    }//GEN-LAST:event_txtJugador2FocusGained

    private void PanelFondoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelFondoMousePressed
        PanelFondo.requestFocus(); // si presionamos un JTextField y lo dejamos vacio, presionamos nuevamente al panel regresara automaticamente a su texto de inicio
    }//GEN-LAST:event_PanelFondoMousePressed

    private void txtJugador1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtJugador1FocusLost
        if(txtJugador1.getText().equals("")) {  //estas dos lineas hacen que cuando el usuario salga del texto regrese a lo escrito inicialmente 
        txtJugador1.setText("jugador 1"); }
    }//GEN-LAST:event_txtJugador1FocusLost

    private void txtJugador2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtJugador2FocusLost
        if(txtJugador2.getText().equals("")) { 
        txtJugador2.setText("jugador 2"); }
    }//GEN-LAST:event_txtJugador2FocusLost

    private void txtJugador1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJugador1KeyTyped
        char caracter = Character.toUpperCase(evt.getKeyChar()); // convertimos a mayuscula
        evt.setKeyChar(caracter);
        //para que solo ingrese 8 caracteres 
        if(txtJugador1.getText().length()>=9){
            evt.consume(); // hace que cuando ya se agregen 8 caracteres no permita que agregue mas 
         }
    }//GEN-LAST:event_txtJugador1KeyTyped

    private void txtJugador2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJugador2KeyTyped
        char caracter = Character.toUpperCase(evt.getKeyChar()); // convertimos a mayuscula
        evt.setKeyChar(caracter);
        //para que solo ingrese 8 caracteres 
        if(txtJugador2.getText().length()>=9){
            evt.consume(); // hace que cuando ya se agregen 8 caracteres no permita que agregue mas 
         }
    }//GEN-LAST:event_txtJugador2KeyTyped

    private void lblCreditosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCreditosMouseEntered
        panelBoton1.setBackground(new Color(126,49,196) );
    }//GEN-LAST:event_lblCreditosMouseEntered

    private void lblCreditosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCreditosMouseExited
        panelBoton1.setBackground(new Color(42,22,79));
    }//GEN-LAST:event_lblCreditosMouseExited

    private void lblCreditosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCreditosMousePressed
        this.dispose();//liberamos recursos y hacemos invisible la primera ventana
       
       
        FormCreditos creditos = new FormCreditos(); 
        creditos.setVisible(true); //abre el formulario nuevo
        
    }//GEN-LAST:event_lblCreditosMousePressed

    private void lblCreditosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCreditosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCreditosMouseClicked

    private void lblIniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIniciarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblIniciarMouseClicked

    private void lblIniciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIniciarMouseEntered
        panelBoton.setBackground(new Color(126,49,196));
    }//GEN-LAST:event_lblIniciarMouseEntered

    private void lblIniciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIniciarMouseExited
        panelBoton.setBackground(new Color(42,22,79));
    }//GEN-LAST:event_lblIniciarMouseExited

    private void lblIniciarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIniciarMousePressed
       this.dispose();
        
        Jugador jugador1 = new Jugador(TipoImagen.EQUIS);
        if(txtJugador1.getText().equals(""))
            jugador1.setNombre("JUGADOR1");
        else
            jugador1.setNombre(txtJugador1.getText());
        
        Jugador jugador2 = new Jugador(TipoImagen.CIRCULO);
        if(txtJugador2.getText().equals(""))
            jugador2.setNombre("JUGADOR2");
        else
            jugador2.setNombre(txtJugador2.getText());
        
        form tikTacToe = new form(jugador1,jugador2);
        tikTacToe.setVisible(true);
    }//GEN-LAST:event_lblIniciarMousePressed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelFondo;
    private modelo.Imagen imagen1;
    private modelo.Imagen imagen2;
    private modelo.Imagen imagen3;
    private modelo.Imagen imagen4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCierre;
    private javax.swing.JLabel lblCreditos;
    private javax.swing.JLabel lblIniciar;
    private javax.swing.JPanel panelBoton;
    private javax.swing.JPanel panelBoton1;
    private javax.swing.JTextField txtJugador1;
    private javax.swing.JTextField txtJugador2;
    // End of variables declaration//GEN-END:variables
}
