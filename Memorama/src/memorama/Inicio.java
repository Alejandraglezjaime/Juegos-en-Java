
//Esta es una segunda opcion de la ventana inicial, aqui se realiza desde el DESING sin hacer la ventana desde el codigo

package memorama;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        
        this.setTitle("MEMORAMA DE LOS PERSONAJES DE DISNEY");
        this.setSize(1010, 720);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        
    
        
        
        initComponents();
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etiqueta = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        imagen2 = new memorama.Imagen();
        txtnomjugador = new javax.swing.JTextField();
        creditos = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        iniciarjuego = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etiqueta.setFont(new java.awt.Font("From Cartoon Blocks", 1, 70)); // NOI18N
        etiqueta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiqueta.setText("MEMORAMA");

        jLabel1.setFont(new java.awt.Font("always  forever", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nombre del jugador");

        imagen2.setText("imagen2");
        imagen2.setRuta("/imagenes/disney.jpg");

        txtnomjugador.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        txtnomjugador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnomjugador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnomjugadorKeyTyped(evt);
            }
        });

        creditos.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        creditos.setText("CREADOR");
        creditos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                creditosMousePressed(evt);
            }
        });
        creditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditosActionPerformed(evt);
            }
        });

        salir.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        salir.setText("SALIR");
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                salirMousePressed(evt);
            }
        });
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        iniciarjuego.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        iniciarjuego.setText(" INICIAR JUEGO");
        iniciarjuego.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                iniciarjuegoMousePressed(evt);
            }
        });
        iniciarjuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarjuegoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(imagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(txtnomjugador, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(creditos, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iniciarjuego, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69))))
            .addComponent(etiqueta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(etiqueta)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtnomjugador, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(iniciarjuego, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(creditos, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void creditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_creditosActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salirActionPerformed

    private void iniciarjuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarjuegoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iniciarjuegoActionPerformed

    private void iniciarjuegoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciarjuegoMousePressed
         //se coloca un if para colocar una excepcion a la hora de iniciar el juego 
             if(txtnomjugador.getText().equals("")){
                 //si en el txtnomjugador no se encuentra ningun valor
             JOptionPane.showMessageDialog(null, "Coloca nombre de jugador");
             //mandara un mensaje diciendo que tiene que colocar algun nombre
            }else{
                 //de lo contrario, se inicializara el juego de memoria
                 //se manda a llamar la clase JuegoMemoria
                 JuegoMemoria ventana = new JuegoMemoria();
                 //decimos que nombreju de la clase JuegoMemoria 
                 //va a obtener el valor que se coloco en el txtnomjugador
                 ventana.nombreju.setText(txtnomjugador.getText());
                 //esto se coloca para inicializar el tiempo de la clase JuegoMemoria
                 ventana.tiempo.start();
                 //mostramos la ventana de la clase JuegoMemoria
                 ventana.setVisible(true);
                 //ocultamos la ventana de menuinicial
                 this.setVisible(false);
                 
                 
             }
    }//GEN-LAST:event_iniciarjuegoMousePressed

    private void creditosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creditosMousePressed
         //se manda a llamar una imagen 
            Icon g=new ImageIcon(getClass().getResource("/imagenes/logoUNAM.png"));
            //se implementa que a la hora de apachar el boton creditos este mostrara una ventana
            //donde se mostraran algun datos del creador del programa
         JOptionPane.showMessageDialog(null,"Programadora:\n Arleth Alejandra Gonzalez Jaime.\n "
                 + "Carrera:\n Ingenieria en Computacion.       "
                 + "\n 5to semestre"
                 + "\n "
                 + "\n "
                 + "\n Proyecto: Juego de Memoria."
                 + "\n "
                 + "\n "
                 + "\n Proyecto realizado con fines educativos"
                 + "\n Programa realizado para implementar los conocimintos basicos"
                 + "\n del lenguaje JAVA, creando un programa conocido con el nombre"
                 + "\n de Juego de Memoria o memorama el cual tiene como objetivo"
                 + "\n encontrar el par de cada carta. "
                 
                 //al final mandamos a llamar a la imagen para que se coloque en la ventana
                , "Informacion del Estudiante",JOptionPane.INFORMATION_MESSAGE, g);
         
         
    }//GEN-LAST:event_creditosMousePressed

    private void salirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMousePressed
        //se mostrara una ventana donde hace una pregunta y tiene las opciones de salir o no
           if (JOptionPane.showConfirmDialog(rootPane, "¿Esta seguro de querer salir de la aplicacion?",
                "Salir de la aplicacion", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE) == JOptionPane.YES_OPTION)
                System.exit(0);
    }//GEN-LAST:event_salirMousePressed

    private void txtnomjugadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomjugadorKeyTyped
       // PASAR LO QUE ESCRIBE EL NOMBRE EN MAYUSCULA
        char caracter = Character.toUpperCase(evt.getKeyChar());
        evt.setKeyChar(caracter);
    }//GEN-LAST:event_txtnomjugadorKeyTyped

    
    
    public static void main(String args[]) {
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton creditos;
    private javax.swing.JLabel etiqueta;
    private memorama.Imagen imagen2;
    private javax.swing.JButton iniciarjuego;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton salir;
    private javax.swing.JTextField txtnomjugador;
    // End of variables declaration//GEN-END:variables
}
