
package vista;

import java.awt.Color;
import javax.swing.JLabel;
import modelo.Imagen;
import modelo.Tablero;
import modelo.Jugador;
import modelo.TipoImagen;

public class form extends javax.swing.JFrame {

    public static Imagen imgJugadorEquis;
    public static Imagen imgJugadorCirculo;
    public static JLabel nombreJugadorEquis;
    public static JLabel nombreJugadorCirculo;
    public static JLabel puntajeEquis;
    public static JLabel puntajeCirculo;
    
    private Jugador jugador1;
    private Jugador jugador2;
    private Tablero tablero;
    
    public form(Jugador jugador1,Jugador jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        init();
        imgJugadorEquis = jugadorEquis;
        imgJugadorCirculo = jugadorCirculo;
        nombreJugadorEquis = lblnombrejug1;
        nombreJugadorCirculo = lblnombrejug2;
        puntajeEquis = lblPuntajeJug1;
        puntajeCirculo = lblPuntajeJug2;
        tablero.cambiarEstilos(TipoImagen.EQUIS);
    }
    
    public void init(){
        setUndecorated(true);
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        panelFondo.setOpaque(false);
        setBackground(new Color(0,0,0,0));
        
        lblnombrejug1.setText(jugador1.getNombre());
        lblnombrejug2.setText(jugador2.getNombre());
        
        //creamos el tablero y lo inicializamos en el panel
        tablero = new Tablero();
        tablero.setJugador1(jugador1);
        tablero.setJugador2(jugador2);
        tablero.setAlturaCI(100);
        tablero.setAnchoCI(100);
        tablero.setMargen(5);
        tablero.setColorCI(new Color(14,19,43));
        tablero.setColorTablero(new Color(239,180,255));
        tablero.setLocation(40,150);
        tablero.crearTablero();
        tablero.setVisible(true);
        
        panelFondo.add(tablero);
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new modelo.PanelRedondeado();
        lblCierre = new javax.swing.JLabel();
        jugadorEquis = new modelo.Imagen();
        jugadorCirculo = new modelo.Imagen();
        lblnombrejug2 = new javax.swing.JLabel();
        lblnombrejug1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblPuntajeJug2 = new javax.swing.JLabel();
        lblPuntajeJug1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelFondo.setBackground(new java.awt.Color(14, 19, 43));
        panelFondo.setPreferredSize(new java.awt.Dimension(400, 500));
        panelFondo.setLayout(null);

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
        panelFondo.add(lblCierre);
        lblCierre.setBounds(360, 10, 30, 25);

        jugadorEquis.setText("imagen2");
        jugadorEquis.setRuta("/recursos/JugadorEquis.png");
        panelFondo.add(jugadorEquis);
        jugadorEquis.setBounds(75, 50, 50, 50);

        jugadorCirculo.setText("imagen2");
        jugadorCirculo.setRuta("/recursos/JugadorCirculo.png");
        panelFondo.add(jugadorCirculo);
        jugadorCirculo.setBounds(275, 50, 50, 50);

        lblnombrejug2.setFont(new java.awt.Font("always  forever", 1, 30)); // NOI18N
        lblnombrejug2.setForeground(new java.awt.Color(255, 200, 255));
        lblnombrejug2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblnombrejug2.setText("Name ");
        panelFondo.add(lblnombrejug2);
        lblnombrejug2.setBounds(240, 100, 120, 30);

        lblnombrejug1.setFont(new java.awt.Font("always  forever", 1, 30)); // NOI18N
        lblnombrejug1.setForeground(new java.awt.Color(180, 232, 255));
        lblnombrejug1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblnombrejug1.setText("Name ");
        panelFondo.add(lblnombrejug1);
        lblnombrejug1.setBounds(30, 100, 140, 30);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("-");
        panelFondo.add(jLabel1);
        jLabel1.setBounds(190, 50, 20, 60);

        lblPuntajeJug2.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        lblPuntajeJug2.setForeground(new java.awt.Color(255, 255, 255));
        lblPuntajeJug2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuntajeJug2.setText("0");
        panelFondo.add(lblPuntajeJug2);
        lblPuntajeJug2.setBounds(210, 50, 60, 60);

        lblPuntajeJug1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        lblPuntajeJug1.setForeground(new java.awt.Color(255, 255, 255));
        lblPuntajeJug1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuntajeJug1.setText("0");
        panelFondo.add(lblPuntajeJug1);
        lblPuntajeJug1.setBounds(130, 50, 60, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    //creamos metos getters and setters de jugador 1 y 2
    
   public Jugador getJugador1() {
        return jugador1;
    }

    public void setJugador1(Jugador jugador1) {
        this.jugador1 = jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public void setJugador2(Jugador jugador2) {
        this.jugador2 = jugador2;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private modelo.Imagen jugadorCirculo;
    private modelo.Imagen jugadorEquis;
    private javax.swing.JLabel lblCierre;
    private javax.swing.JLabel lblPuntajeJug1;
    private javax.swing.JLabel lblPuntajeJug2;
    private javax.swing.JLabel lblnombrejug1;
    private javax.swing.JLabel lblnombrejug2;
    private javax.swing.JPanel panelFondo;
    // End of variables declaration//GEN-END:variables
}
