
package memorama;


public class RecordJugadorDos extends javax.swing.JFrame {

  
    public RecordJugadorDos() {
        this.setTitle("Record de Jugador");
        this.setSize(1010, 720);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiqueta2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        imagen2 = new memorama.Imagen();
        record = new javax.swing.JLabel();
        etiqueta = new javax.swing.JLabel();
        etiqueta1 = new javax.swing.JLabel();
        etiqueta3 = new javax.swing.JLabel();
        lbltiempoju = new javax.swing.JLabel();
        etiqueta5 = new javax.swing.JLabel();
        lblhorainicio = new javax.swing.JLabel();
        lblnombrejuga = new javax.swing.JLabel();
        lblfechaju = new javax.swing.JLabel();
        regresar = new javax.swing.JButton();

        etiqueta2.setFont(new java.awt.Font("always  forever", 1, 36)); // NOI18N
        etiqueta2.setText("Nombre jugador: ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        imagen2.setText("imagen2");
        imagen2.setRuta("/imagenes/disney.png");

        record.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        record.setForeground(new java.awt.Color(21, 151, 149));
        record.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        record.setText("TU RECORD");

        etiqueta.setFont(new java.awt.Font("always  forever", 1, 36)); // NOI18N
        etiqueta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiqueta.setText("Tiempo final :");

        etiqueta1.setFont(new java.awt.Font("always  forever", 1, 36)); // NOI18N
        etiqueta1.setText("Hora inicial :");

        etiqueta3.setFont(new java.awt.Font("always  forever", 1, 36)); // NOI18N
        etiqueta3.setText("Fecha : ");

        lbltiempoju.setFont(new java.awt.Font("always  forever", 1, 36)); // NOI18N
        lbltiempoju.setForeground(new java.awt.Color(0, 51, 51));
        lbltiempoju.setText("tiempo");

        etiqueta5.setFont(new java.awt.Font("always  forever", 1, 36)); // NOI18N
        etiqueta5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiqueta5.setText("Nombre jugador : ");

        lblhorainicio.setFont(new java.awt.Font("always  forever", 1, 36)); // NOI18N
        lblhorainicio.setForeground(new java.awt.Color(0, 51, 51));
        lblhorainicio.setText("hora");

        lblnombrejuga.setFont(new java.awt.Font("always  forever", 1, 36)); // NOI18N
        lblnombrejuga.setForeground(new java.awt.Color(0, 51, 51));
        lblnombrejuga.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblnombrejuga.setText("nombre");
        lblnombrejuga.setToolTipText("");

        lblfechaju.setFont(new java.awt.Font("always  forever", 1, 36)); // NOI18N
        lblfechaju.setForeground(new java.awt.Color(0, 51, 51));
        lblfechaju.setText("fecha");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(record, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(etiqueta5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblnombrejuga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(etiqueta3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblfechaju, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(etiqueta1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(etiqueta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbltiempoju, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblhorainicio, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(imagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 86, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(record)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etiqueta5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblnombrejuga, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltiempoju, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqueta1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblhorainicio, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqueta3)
                    .addComponent(lblfechaju, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        regresar.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        regresar.setText("REGRESAR AL MENU");
        regresar.setToolTipText("");
        regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                regresarMousePressed(evt);
            }
        });
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regresar)
                .addGap(0, 35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
     
    }//GEN-LAST:event_regresarActionPerformed

    private void regresarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresarMousePressed
        Inicio  ventana = new Inicio();
            JuegoMemoria ventana2 = new JuegoMemoria();
            ventana2.setVisible(false);
            ventana.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_regresarMousePressed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etiqueta;
    private javax.swing.JLabel etiqueta1;
    private javax.swing.JLabel etiqueta2;
    private javax.swing.JLabel etiqueta3;
    private javax.swing.JLabel etiqueta5;
    private memorama.Imagen imagen2;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel lblfechaju;
    public javax.swing.JLabel lblhorainicio;
    public javax.swing.JLabel lblnombrejuga;
    public javax.swing.JLabel lbltiempoju;
    private javax.swing.JLabel record;
    private javax.swing.JButton regresar;
    // End of variables declaration//GEN-END:variables
}
