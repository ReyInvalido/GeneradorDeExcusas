
package generadormejorado;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public class ventana extends javax.swing.JFrame {

  Generador gen1 = new Generador();
  public ventana() {
    initComponents();
  }

  
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    fondo = new javax.swing.JPanel();
    jPanel1 = new javax.swing.JPanel();
    fototipitos = new javax.swing.JLabel();
    satistaccion = new javax.swing.JLabel();
    jPanel2 = new javax.swing.JPanel();
    bienvenido = new javax.swing.JLabel();
    slogan = new javax.swing.JLabel();
    INICIAR = new javax.swing.JButton();
    fototipo = new javax.swing.JLabel();
    segundaPantalla = new javax.swing.JPanel();
    jPanel5 = new javax.swing.JPanel();
    slogan1 = new javax.swing.JLabel();
    jLabel1 = new javax.swing.JLabel();
    jPanel6 = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    jTextArea1 = new javax.swing.JTextArea();
    jLabel2 = new javax.swing.JLabel();
    jButton1 = new javax.swing.JButton();
    EXCUSA = new javax.swing.JLabel();
    jButton2 = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setBounds(new java.awt.Rectangle(0, 0, 860, 600));
    setMinimumSize(new java.awt.Dimension(860, 600));
    setResizable(false);
    setSize(new java.awt.Dimension(860, 600));
    getContentPane().setLayout(new java.awt.CardLayout());

    fondo.setBackground(new java.awt.Color(255, 255, 255));
    fondo.setMinimumSize(new java.awt.Dimension(860, 600));
    fondo.setPreferredSize(new java.awt.Dimension(860, 600));
    fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jPanel1.setBackground(new java.awt.Color(255, 153, 51));

    fototipitos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generadormejorado/small-group-icon-small.png"))); // NOI18N

    satistaccion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
    satistaccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    satistaccion.setText("Satisfacción Garantizada");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap(27, Short.MAX_VALUE)
        .addComponent(fototipitos)
        .addGap(23, 23, 23))
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(satistaccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(fototipitos)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(satistaccion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(402, Short.MAX_VALUE))
    );

    fondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 600));

    jPanel2.setBackground(new java.awt.Color(255, 51, 51));

    bienvenido.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
    bienvenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    bienvenido.setText("Bienvenido al Generador de Excusas");

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
        .addContainerGap(100, Short.MAX_VALUE)
        .addComponent(bienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(83, 83, 83))
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addGap(21, 21, 21)
        .addComponent(bienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(30, Short.MAX_VALUE))
    );

    fondo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 0, 660, -1));

    slogan.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
    slogan.setForeground(new java.awt.Color(0, 0, 0));
    slogan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    slogan.setText("Dile \"NO\" a las salidas por compromiso. Ahora siempre tendrás algo que decir");
    fondo.add(slogan, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 610, 80));

    INICIAR.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
    INICIAR.setText("INICIAR");
    INICIAR.setFocusable(false);
    INICIAR.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        INICIARMouseClicked(evt);
      }
    });
    INICIAR.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        INICIARActionPerformed(evt);
      }
    });
    fondo.add(INICIAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 200, 70));

    fototipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generadormejorado/istock-175238195_fmt.png"))); // NOI18N
    fototipo.setText("jLabel3");
    fondo.add(fototipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-170, 160, 830, 440));

    getContentPane().add(fondo, "card2");

    segundaPantalla.setBackground(new java.awt.Color(255, 255, 255));
    segundaPantalla.setPreferredSize(new java.awt.Dimension(860, 600));
    segundaPantalla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jPanel5.setBackground(new java.awt.Color(255, 102, 51));

    javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
    jPanel5.setLayout(jPanel5Layout);
    jPanel5Layout.setHorizontalGroup(
      jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 0, Short.MAX_VALUE)
    );
    jPanel5Layout.setVerticalGroup(
      jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 40, Short.MAX_VALUE)
    );

    segundaPantalla.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 568, 860, -1));

    slogan1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
    slogan1.setForeground(new java.awt.Color(0, 0, 0));
    slogan1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    slogan1.setText("Dile \"NO\" a las salidas por compromiso. Ahora siempre tendrás algo que decir");
    segundaPantalla.add(slogan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, 500, 80));

    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generadormejorado/istockphoto-1179331968-612x612_1.jpg"))); // NOI18N
    segundaPantalla.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, -1, -1));

    jPanel6.setBackground(new java.awt.Color(255, 204, 0));

    javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
    jPanel6.setLayout(jPanel6Layout);
    jPanel6Layout.setHorizontalGroup(
      jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 60, Short.MAX_VALUE)
    );
    jPanel6Layout.setVerticalGroup(
      jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 570, Short.MAX_VALUE)
    );

    segundaPantalla.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 570));

    jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

    jTextArea1.setBackground(new java.awt.Color(255, 255, 255));
    jTextArea1.setColumns(20);
    jTextArea1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
    jTextArea1.setForeground(new java.awt.Color(0, 0, 0));
    jTextArea1.setRows(5);
    jTextArea1.setText("Una excusa se compone de los siguientes atributos:\n- Una apertura \n- Un chivo expiatorio \n- Un inconveniente \nCon estos tres elementos podremos formar una excusa que impacte al recibidor\ny no continúe su afán de invitarnos a hacer algo.\n");
    jScrollPane1.setViewportView(jTextArea1);

    segundaPantalla.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 540, 140));

    jLabel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(0, 0, 0));
    jLabel2.setText("Haz click en \"Generar\" para obtener tu excusa");
    segundaPantalla.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, -1, -1));

    jButton1.setText("GENERAR");
    jButton1.setFocusable(false);
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });
    segundaPantalla.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, -1, -1));

    EXCUSA.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
    EXCUSA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    EXCUSA.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 51), 3, true));
    segundaPantalla.add(EXCUSA, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 780, 50));

    jButton2.setText("COPIAR");
    jButton2.setFocusable(false);
    jButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton2ActionPerformed(evt);
      }
    });
    segundaPantalla.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, 90, -1));

    getContentPane().add(segundaPantalla, "card3");

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void INICIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INICIARActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_INICIARActionPerformed

  private void INICIARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_INICIARMouseClicked
      this.getContentPane().removeAll();
      this.repaint();
      //segundaPantalla = new javax.swing.JPanel(); ya esta iniciado en initComponents.
      //segundaPantalla.setBounds(0, 0, 860, 600);
      //segundaPantalla.setOpaque(true);
      segundaPantalla.setVisible(true);
      this.add(segundaPantalla);
  }//GEN-LAST:event_INICIARMouseClicked

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    EXCUSA.setText(gen1.getExcusa());
  }//GEN-LAST:event_jButton1ActionPerformed

  private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    StringSelection stringSelection = new StringSelection(EXCUSA.getText());
    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    clipboard.setContents(stringSelection, null);
  }//GEN-LAST:event_jButton2ActionPerformed

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
      java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new ventana().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel EXCUSA;
  private javax.swing.JButton INICIAR;
  private javax.swing.JLabel bienvenido;
  private javax.swing.JPanel fondo;
  private javax.swing.JLabel fototipitos;
  private javax.swing.JLabel fototipo;
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel5;
  private javax.swing.JPanel jPanel6;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTextArea jTextArea1;
  private javax.swing.JLabel satistaccion;
  private javax.swing.JPanel segundaPantalla;
  private javax.swing.JLabel slogan;
  private javax.swing.JLabel slogan1;
  // End of variables declaration//GEN-END:variables
}
