
package generadormejorado;

public class panel2 extends javax.swing.JPanel {

    public panel2() {
    initComponents();
  }

    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    slogan = new javax.swing.JLabel();
    jLabel1 = new javax.swing.JLabel();
    jPanel2 = new javax.swing.JPanel();

    setBackground(new java.awt.Color(255, 255, 255));
    setPreferredSize(new java.awt.Dimension(860, 600));
    setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jPanel1.setBackground(new java.awt.Color(255, 102, 51));

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 0, Short.MAX_VALUE)
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 40, Short.MAX_VALUE)
    );

    add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 568, 860, -1));

    slogan.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
    slogan.setForeground(new java.awt.Color(0, 0, 0));
    slogan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    slogan.setText("Dile \"NO\" a las salidas por compromiso. Ahora siempre tendrás algo que decir");
    add(slogan, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 500, 80));

    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generadormejorado/istockphoto-1179331968-612x612_1.jpg"))); // NOI18N
    add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, -1, -1));

    jPanel2.setBackground(new java.awt.Color(255, 204, 0));

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 60, Short.MAX_VALUE)
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 570, Short.MAX_VALUE)
    );

    add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 570));
  }// </editor-fold>//GEN-END:initComponents


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel jLabel1;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JLabel slogan;
  // End of variables declaration//GEN-END:variables
}
