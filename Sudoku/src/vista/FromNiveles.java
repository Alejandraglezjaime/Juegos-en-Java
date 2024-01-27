
package vista;

import java.awt.Color;


public class FromNiveles extends javax.swing.JFrame {
    
    private int xPos; 
    private int yPos;

   private TableroSudoku tableroSudoku;
    public FromNiveles(TableroSudoku tableroSudoku) {
        initComponents();
        this.tableroSudoku = tableroSudoku;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panelMedio = new javax.swing.JPanel();
        lblMedio = new javax.swing.JLabel();
        panelDificil = new javax.swing.JPanel();
        lblDificil = new javax.swing.JLabel();
        panelFacil = new javax.swing.JPanel();
        lblFacil = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panelFondo.setBackground(new java.awt.Color(235, 222, 240));
        panelFondo.setPreferredSize(new java.awt.Dimension(400, 300));
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

        jLabel2.setFont(new java.awt.Font("Britannic Bold", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SUDOKU");
        panelFondo.add(jLabel2);
        jLabel2.setBounds(70, 20, 130, 40);

        lblMedio.setFont(new java.awt.Font("Britannic Bold", 0, 16)); // NOI18N
        lblMedio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMedio.setText("MEDIO");
        lblMedio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMedio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMedioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMedioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblMedioMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelMedioLayout = new javax.swing.GroupLayout(panelMedio);
        panelMedio.setLayout(panelMedioLayout);
        panelMedioLayout.setHorizontalGroup(
            panelMedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMedioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblMedio, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelMedioLayout.setVerticalGroup(
            panelMedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMedioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblMedio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelFondo.add(panelMedio);
        panelMedio.setBounds(70, 140, 130, 40);

        lblDificil.setFont(new java.awt.Font("Britannic Bold", 0, 16)); // NOI18N
        lblDificil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDificil.setText("DIFICIL");
        lblDificil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDificil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDificilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDificilMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblDificilMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelDificilLayout = new javax.swing.GroupLayout(panelDificil);
        panelDificil.setLayout(panelDificilLayout);
        panelDificilLayout.setHorizontalGroup(
            panelDificilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDificilLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblDificil, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelDificilLayout.setVerticalGroup(
            panelDificilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDificilLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblDificil, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelFondo.add(panelDificil);
        panelDificil.setBounds(70, 200, 130, 40);

        lblFacil.setFont(new java.awt.Font("Britannic Bold", 0, 16)); // NOI18N
        lblFacil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFacil.setText("FACIL");
        lblFacil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblFacil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblFacilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblFacilMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblFacilMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelFacilLayout = new javax.swing.GroupLayout(panelFacil);
        panelFacil.setLayout(panelFacilLayout);
        panelFacilLayout.setHorizontalGroup(
            panelFacilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFacil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        panelFacilLayout.setVerticalGroup(
            panelFacilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFacilLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblFacil, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelFondo.add(panelFacil);
        panelFacil.setBounds(70, 80, 130, 40);

        jLabel1.setFont(new java.awt.Font("Britannic Bold", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EXIT");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        panelFondo.add(jLabel1);
        jLabel1.setBounds(200, 270, 49, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblMedioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMedioMousePressed
        //NIVEL MEDIO
        tableroSudoku.generarSudoku(2);
        this.setVisible(false);
    }//GEN-LAST:event_lblMedioMousePressed

    private void lblFacilMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFacilMousePressed
        //NIVEL FACIL
        tableroSudoku.generarSudoku(1);
        this.setVisible(false);
    }//GEN-LAST:event_lblFacilMousePressed

    private void lblDificilMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDificilMousePressed
        //NIVEL DIFICIL
        tableroSudoku.generarSudoku(3);
        this.setVisible(false);
    }//GEN-LAST:event_lblDificilMousePressed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // BOTON SALIR DE LA VENTANA NIVELES
        this.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

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

    private void lblFacilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFacilMouseEntered
        panelFacil.setBackground(new Color(242,242,242));
    }//GEN-LAST:event_lblFacilMouseEntered

    private void lblMedioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMedioMouseEntered
        panelMedio.setBackground(new Color(242,242,242));
    }//GEN-LAST:event_lblMedioMouseEntered

    private void lblDificilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDificilMouseEntered
        panelDificil.setBackground(new Color(242,242,242));
    }//GEN-LAST:event_lblDificilMouseEntered

    private void lblFacilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFacilMouseExited
        panelFacil.setBackground(new Color(242,242,242));
    }//GEN-LAST:event_lblFacilMouseExited

    private void lblMedioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMedioMouseExited
        panelMedio.setBackground(new Color(242,242,242));        
    }//GEN-LAST:event_lblMedioMouseExited

    private void lblDificilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDificilMouseExited
        panelDificil.setBackground(new Color(242,242,242));
    }//GEN-LAST:event_lblDificilMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblDificil;
    private javax.swing.JLabel lblFacil;
    private javax.swing.JLabel lblMedio;
    private javax.swing.JPanel panelDificil;
    private javax.swing.JPanel panelFacil;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelMedio;
    // End of variables declaration//GEN-END:variables
}
