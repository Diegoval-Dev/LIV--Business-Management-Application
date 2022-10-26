/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

/**
 *
 * @author Usuario
 */
public class MenuPrincipalLiv extends javax.swing.JFrame {
    int xMouse, yMouse;
    

    /**
     * Creates new form MenuPrincipalLive
     */
    public MenuPrincipalLiv() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBarra = new javax.swing.JPanel();
        btnClose = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnFacturas = new javax.swing.JButton();
        btnAccount = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        btnEmpleados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBarra.setBackground(new java.awt.Color(255, 255, 255));
        panelBarra.setPreferredSize(new java.awt.Dimension(680, 30));
        panelBarra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelBarraMouseDragged(evt);
            }
        });
        panelBarra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelBarraMousePressed(evt);
            }
        });

        btnClose.setBackground(new java.awt.Color(0, 0, 0));
        btnClose.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnClose.setForeground(new java.awt.Color(0, 0, 0));
        btnClose.setText("X");
        btnClose.setBorder(null);
        btnClose.setBorderPainted(false);
        btnClose.setContentAreaFilled(false);
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Liv");

        javax.swing.GroupLayout panelBarraLayout = new javax.swing.GroupLayout(panelBarra);
        panelBarra.setLayout(panelBarraLayout);
        panelBarraLayout.setHorizontalGroup(
            panelBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBarraLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 576, Short.MAX_VALUE)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelBarraLayout.setVerticalGroup(
            panelBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnClose, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(panelBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnFacturas.setBackground(new java.awt.Color(117, 198, 17));
        btnFacturas.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnFacturas.setForeground(new java.awt.Color(0, 0, 0));
        btnFacturas.setText("Facturas");
        btnFacturas.setBorder(null);
        btnFacturas.setBorderPainted(false);
        btnFacturas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFacturas.setPreferredSize(new java.awt.Dimension(67, 22));
        btnFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturasActionPerformed(evt);
            }
        });
        getContentPane().add(btnFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 170, 490));

        btnAccount.setBackground(new java.awt.Color(255, 51, 51));
        btnAccount.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnAccount.setForeground(new java.awt.Color(0, 0, 0));
        btnAccount.setText("Account");
        btnAccount.setBorder(null);
        btnAccount.setBorderPainted(false);
        btnAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAccount.setPreferredSize(new java.awt.Dimension(67, 22));
        btnAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccountActionPerformed(evt);
            }
        });
        getContentPane().add(btnAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 170, 490));

        btnInventario.setBackground(new java.awt.Color(239, 156, 2));
        btnInventario.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnInventario.setForeground(new java.awt.Color(0, 0, 0));
        btnInventario.setText("Inventario");
        btnInventario.setBorder(null);
        btnInventario.setBorderPainted(false);
        btnInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInventario.setPreferredSize(new java.awt.Dimension(67, 22));
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 170, 490));

        btnEmpleados.setBackground(new java.awt.Color(30, 160, 236));
        btnEmpleados.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnEmpleados.setForeground(new java.awt.Color(0, 0, 0));
        btnEmpleados.setText("Empleados");
        btnEmpleados.setBorder(null);
        btnEmpleados.setBorderPainted(false);
        btnEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEmpleados.setPreferredSize(new java.awt.Dimension(67, 22));
        btnEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadosActionPerformed(evt);
            }
        });
        getContentPane().add(btnEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 170, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelBarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBarraMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_panelBarraMousePressed

    private void panelBarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBarraMouseDragged
        // TODO add your handling code here:
        int x =  evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_panelBarraMouseDragged

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCloseMouseClicked

    private void btnEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadosActionPerformed
    // TODO add your handling code here:
    EmpleadosMenu empleados = new EmpleadosMenu();
    empleados.setVisible(true);
    this.setVisible(false);
        
    }//GEN-LAST:event_btnEmpleadosActionPerformed

    private void btnAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccountActionPerformed
    // TODO add your handling code here:
    AccountMenu account = new AccountMenu();
    account.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_btnAccountActionPerformed

    private void btnFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturasActionPerformed
        // TODO add your handling code here:
        FacturasMenu facturas = new FacturasMenu();
        facturas.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnFacturasActionPerformed

    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed
        // TODO add your handling code here:
        InventarioMenu inventario = new InventarioMenu();
        inventario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnInventarioActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccount;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnEmpleados;
    private javax.swing.JButton btnFacturas;
    private javax.swing.JButton btnInventario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelBarra;
    // End of variables declaration//GEN-END:variables
}
