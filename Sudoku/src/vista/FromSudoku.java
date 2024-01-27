
package vista;

import java.awt.Color;

public class FromSudoku extends javax.swing.JFrame {

    public static TableroSudoku tableroSudoku;
    private TableroNumeros tableroNumeros;
    private FromNiveles fromNiveles;
    public boolean estadoCrear;
    
    private int xPos; 
    private int yPos;
    
    public FromSudoku() {
        initComponents();
        iniciarComponentes();
    }
    
    public void iniciarComponentes(){
        tableroSudoku = new TableroSudoku();
        tableroSudoku.setTxtAltura(36); 
        tableroSudoku.setTxtAncho(36);
        tableroSudoku.setTxtMargen(4);
        tableroSudoku.setTxtTamañoLetra(27);
        
        tableroSudoku.setPanelBackground(new Color(195,155,211));
        
        tableroSudoku.setTxtBackground1(Color.WHITE);
        tableroSudoku.setTxtForeground1(new Color(153,1,1));
        tableroSudoku.setTxtBackground2(new Color(232,186,186));
        tableroSudoku.setTxtForeground2(Color.BLACK);
        tableroSudoku.setTxtBackground3(new Color(203,102,102));
        tableroSudoku.setTxtForeground3(Color.WHITE);
        tableroSudoku.setTxtBackground4(new Color(   235, 237, 239 )); //ESTA LINEA LE DA COLOR A LOS CUADROS GENERADOS POR EL SUDOKU
        tableroSudoku.setTxtForeground4(Color.BLACK);
        
        
        panelFondo.add(tableroSudoku);
        tableroSudoku.setLocation(70, 60);
        tableroSudoku.setVisible(true);
        tableroSudoku.crearSudoku();  
        
        
        //ESTE ES EL TABLERO DE NUMEROS, EL QUE SE ENCUENTRA DEL LADO IZQUIERDO
        tableroNumeros = new TableroNumeros();
        tableroNumeros.setTxtAncho(36);
        tableroNumeros.setTxtAltura(36);
        tableroNumeros.setTxtMargen(4);
        tableroNumeros.setTxtTamañoLetra(37);
        tableroNumeros.setPanelBackground(new Color( 118, 68, 138));
        tableroNumeros.setTxtBackground1(new Color(232, 218, 239));
        tableroNumeros.setTxtForeground1(new Color(232, 218, 239));
        tableroNumeros.setTxtBackground1(new Color(81, 46, 95));
        tableroNumeros.setTxtForeground1(Color.WHITE);
        panelFondo.add(tableroNumeros);
        tableroNumeros.crearTablero();
        tableroNumeros.setLocation(20, 60);
        tableroNumeros.setVisible(true);
        
        tableroSudoku.generarSudoku(2); //ESTA LINEA GENERA UN SUDOKU POR DEFECTO DE NIVEL 2
        estadoCrear = true; 
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        panelFondo = new javax.swing.JPanel();
        panelResolver = new javax.swing.JPanel();
        lblResolver = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelLimpiar = new javax.swing.JPanel();
        lblLimpiar = new javax.swing.JLabel();
        panelCrear = new javax.swing.JPanel();
        lblCrear = new javax.swing.JLabel();
        panelComprobar = new javax.swing.JPanel();
        lblComprobar = new javax.swing.JLabel();
        panelNuevaPartida = new javax.swing.JPanel();
        lblnuevapartida = new javax.swing.JLabel();
        panelSalir = new javax.swing.JPanel();
        lblSalir = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panelFondo.setBackground(new java.awt.Color(235, 222, 240));
        panelFondo.setPreferredSize(new java.awt.Dimension(590, 420));
        panelFondo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelFondoMouseDragged(evt);
            }
        });
        panelFondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelFondoMousePressed(evt);
            }
        });
        panelFondo.setLayout(null);

        lblResolver.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 16)); // NOI18N
        lblResolver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResolver.setText("RESOLVER");
        lblResolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblResolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblResolverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblResolverMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblResolverMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelResolverLayout = new javax.swing.GroupLayout(panelResolver);
        panelResolver.setLayout(panelResolverLayout);
        panelResolverLayout.setHorizontalGroup(
            panelResolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelResolverLayout.createSequentialGroup()
                .addComponent(lblResolver, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelResolverLayout.setVerticalGroup(
            panelResolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelResolverLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblResolver, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelFondo.add(panelResolver);
        panelResolver.setBounds(430, 280, 130, 40);

        jLabel2.setFont(new java.awt.Font("Britannic Bold", 1, 24)); // NOI18N
        jLabel2.setText("SUDOKU");
        panelFondo.add(jLabel2);
        jLabel2.setBounds(20, 10, 110, 40);

        lblLimpiar.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 16)); // NOI18N
        lblLimpiar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLimpiar.setText("LIMPIAR");
        lblLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLimpiarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblLimpiarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelLimpiarLayout = new javax.swing.GroupLayout(panelLimpiar);
        panelLimpiar.setLayout(panelLimpiarLayout);
        panelLimpiarLayout.setHorizontalGroup(
            panelLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        panelLimpiarLayout.setVerticalGroup(
            panelLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLimpiarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelFondo.add(panelLimpiar);
        panelLimpiar.setBounds(430, 100, 130, 40);

        lblCrear.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 16)); // NOI18N
        lblCrear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCrear.setText("CREAR");
        lblCrear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCrearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCrearMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCrearMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelCrearLayout = new javax.swing.GroupLayout(panelCrear);
        panelCrear.setLayout(panelCrearLayout);
        panelCrearLayout.setHorizontalGroup(
            panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCrear, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        panelCrearLayout.setVerticalGroup(
            panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCrearLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelFondo.add(panelCrear);
        panelCrear.setBounds(430, 160, 130, 40);

        lblComprobar.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 16)); // NOI18N
        lblComprobar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblComprobar.setText("COMPROBAR");
        lblComprobar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblComprobar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblComprobarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblComprobarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblComprobarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelComprobarLayout = new javax.swing.GroupLayout(panelComprobar);
        panelComprobar.setLayout(panelComprobarLayout);
        panelComprobarLayout.setHorizontalGroup(
            panelComprobarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelComprobarLayout.createSequentialGroup()
                .addComponent(lblComprobar, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelComprobarLayout.setVerticalGroup(
            panelComprobarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelComprobarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblComprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelFondo.add(panelComprobar);
        panelComprobar.setBounds(430, 220, 130, 40);

        lblnuevapartida.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 16)); // NOI18N
        lblnuevapartida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblnuevapartida.setText("NUEVA PARTIDA");
        lblnuevapartida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblnuevapartida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblnuevapartidaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblnuevapartidaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblnuevapartidaMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelNuevaPartidaLayout = new javax.swing.GroupLayout(panelNuevaPartida);
        panelNuevaPartida.setLayout(panelNuevaPartidaLayout);
        panelNuevaPartidaLayout.setHorizontalGroup(
            panelNuevaPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNuevaPartidaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblnuevapartida, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelNuevaPartidaLayout.setVerticalGroup(
            panelNuevaPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblnuevapartida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panelFondo.add(panelNuevaPartida);
        panelNuevaPartida.setBounds(430, 40, 130, 40);

        lblSalir.setFont(new java.awt.Font("Britannic Bold", 1, 18)); // NOI18N
        lblSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSalir.setText("SALIR");
        lblSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        });

        javax.swing.GroupLayout panelSalirLayout = new javax.swing.GroupLayout(panelSalir);
        panelSalir.setLayout(panelSalirLayout);
        panelSalirLayout.setHorizontalGroup(
            panelSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        panelSalirLayout.setVerticalGroup(
            panelSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panelFondo.add(panelSalir);
        panelSalir.setBounds(430, 340, 130, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblnuevapartidaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblnuevapartidaMousePressed
        if(fromNiveles!=null){
            fromNiveles.setVisible(true);
        } else {
            fromNiveles = new FromNiveles(tableroSudoku);
            fromNiveles.setVisible(true);
        }
    }//GEN-LAST:event_lblnuevapartidaMousePressed

    private void lblLimpiarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLimpiarMousePressed
        // BOTON LIMPIAR
        tableroSudoku.limpiar();
        
    }//GEN-LAST:event_lblLimpiarMousePressed

    private void lblCrearMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCrearMousePressed
        // BOTON CREAR
        
        if(estadoCrear){
            lblnuevapartida.setVisible(false);
            lblLimpiar.setVisible(false);
            lblComprobar.setVisible(false);
            lblResolver.setVisible(false);
            estadoCrear = false;
            tableroSudoku.limpiarTxt();
            lblCrear.setText("LISTO");
        } else {
            if(tableroSudoku.crearSudokuPersonalizado()){
                lblnuevapartida.setVisible(true);
                lblLimpiar.setVisible(true);
                lblComprobar.setVisible(true);
                lblResolver.setVisible(true);
                estadoCrear = true;
                lblCrear.setText("CREAR"); 
            }
        }
    }//GEN-LAST:event_lblCrearMousePressed

    private void lblComprobarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblComprobarMousePressed
        // BOTON COMPROBAR
        tableroSudoku.comprobar();
    }//GEN-LAST:event_lblComprobarMousePressed

    private void lblResolverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblResolverMousePressed
        // BOTON RESOLVER
        tableroSudoku.resolver();
    }//GEN-LAST:event_lblResolverMousePressed

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        // BOTON SALIR
        System.exit(0);
    }//GEN-LAST:event_lblSalirMouseClicked

    private void panelFondoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFondoMousePressed
        //PANEL FONDO
        //PARA SI EL USUSARIO QUIERE MOVER LA PANTALLA
        xPos = evt.getX();
        yPos = evt.getY();
    }//GEN-LAST:event_panelFondoMousePressed

    private void panelFondoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFondoMouseDragged
        // ESTE SE EJECUTA CUANDO MOVEMOS EL PANEL
        this.setLocation(evt.getXOnScreen()-xPos,evt.getYOnScreen()-yPos);
    }//GEN-LAST:event_panelFondoMouseDragged

    private void lblnuevapartidaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblnuevapartidaMouseEntered
        //CAMBIA DE COLOR CUANDO PASA EL MOUSE POR ENCIMA DEL LABEL
        panelNuevaPartida.setBackground(new Color(210, 180, 222));
    }//GEN-LAST:event_lblnuevapartidaMouseEntered

    private void lblnuevapartidaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblnuevapartidaMouseExited
        //CAMBIA DE COLOR CUANDO PASA EL MOUSE POR ENCIMA DEL LABEL
        panelNuevaPartida.setBackground(new Color(242,242,242));
    }//GEN-LAST:event_lblnuevapartidaMouseExited

    private void lblLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLimpiarMouseEntered
        panelLimpiar.setBackground(new Color(210, 180, 222));
    }//GEN-LAST:event_lblLimpiarMouseEntered

    private void lblCrearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCrearMouseEntered
        panelCrear.setBackground(new Color(210, 180, 222));
    }//GEN-LAST:event_lblCrearMouseEntered

    private void lblComprobarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblComprobarMouseEntered
        panelComprobar.setBackground(new Color(210, 180, 222));
    }//GEN-LAST:event_lblComprobarMouseEntered

    private void lblResolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblResolverMouseEntered
        panelResolver.setBackground(new Color(210, 180, 222));
    }//GEN-LAST:event_lblResolverMouseEntered

    private void lblSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseEntered
        panelSalir.setBackground(new Color(210, 180, 222));
    }//GEN-LAST:event_lblSalirMouseEntered

    private void lblLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLimpiarMouseExited
        panelLimpiar.setBackground(new Color(242,242,242));
    }//GEN-LAST:event_lblLimpiarMouseExited

    private void lblCrearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCrearMouseExited
        panelCrear.setBackground(new Color(242,242,242));
    }//GEN-LAST:event_lblCrearMouseExited

    private void lblComprobarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblComprobarMouseExited
        panelComprobar.setBackground(new Color(242,242,242));
    }//GEN-LAST:event_lblComprobarMouseExited

    private void lblResolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblResolverMouseExited
        panelResolver.setBackground(new Color(242,242,242));
    }//GEN-LAST:event_lblResolverMouseExited

    private void lblSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseExited
        panelSalir.setBackground(new Color(242,242,242));
    }//GEN-LAST:event_lblSalirMouseExited

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FromSudoku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lblComprobar;
    private javax.swing.JLabel lblCrear;
    private javax.swing.JLabel lblLimpiar;
    private javax.swing.JLabel lblResolver;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JLabel lblnuevapartida;
    private javax.swing.JPanel panelComprobar;
    private javax.swing.JPanel panelCrear;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelLimpiar;
    private javax.swing.JPanel panelNuevaPartida;
    private javax.swing.JPanel panelResolver;
    private javax.swing.JPanel panelSalir;
    // End of variables declaration//GEN-END:variables
}
