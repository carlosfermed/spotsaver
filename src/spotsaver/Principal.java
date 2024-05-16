

package spotsaver;

/**
 *
 * @author Carlos Fernández Medinilla
 */
public class Principal extends javax.swing.JFrame {
     
    PanelAlquilerPlaza panelAlquilerPlaza;
    PanelRetirarVehiculo panelRetirarVehiculo;
    PanelListado panelListarServicios;
    
    public Principal() {
        
        initComponents();
        setSize(800,450);
        setLocationRelativeTo(null);
        panelAlquilerPlaza = new PanelAlquilerPlaza();
        panelAlquilerPlaza.setBounds(300,0,473,400);
        panelAlquilerPlaza.pintarPkDisponibles();

        add(panelAlquilerPlaza);
        panelRetirarVehiculo = new PanelRetirarVehiculo();
        panelRetirarVehiculo.setBounds(300,0,473,400);
        add(panelRetirarVehiculo);
        panelRetirarVehiculo.setVisible(false);
        panelListarServicios = new PanelListado();
        panelListarServicios.setBounds(350,0,1116,400);
        add(panelListarServicios);
        panelListarServicios.setVisible(false);    
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelMenu = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        btnAlquilerPlaza = new java.awt.Button();
        btnRetirarVehiculo = new java.awt.Button();
        btnListarServicios = new java.awt.Button();
        btnSalir = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelMenu.setBackground(new java.awt.Color(2, 91, 102));

        labelTitulo.setFont(new java.awt.Font("Segoe UI Semilight", 0, 36)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setText("Spot Saver");

        btnAlquilerPlaza.setActionCommand("Alquiler Plaza");
        btnAlquilerPlaza.setBackground(new java.awt.Color(0, 153, 153));
        btnAlquilerPlaza.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        btnAlquilerPlaza.setForeground(new java.awt.Color(255, 255, 255));
        btnAlquilerPlaza.setLabel("Alquiler Plaza");
        btnAlquilerPlaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlquilerPlazaActionPerformed(evt);
            }
        });

        btnRetirarVehiculo.setBackground(new java.awt.Color(0, 153, 153));
        btnRetirarVehiculo.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        btnRetirarVehiculo.setForeground(new java.awt.Color(255, 255, 255));
        btnRetirarVehiculo.setLabel("Retirar Vehiculo");
        btnRetirarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarVehiculoActionPerformed(evt);
            }
        });

        btnListarServicios.setBackground(new java.awt.Color(0, 153, 153));
        btnListarServicios.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        btnListarServicios.setForeground(new java.awt.Color(255, 255, 255));
        btnListarServicios.setLabel("Listar Servicios");
        btnListarServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarServiciosActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(0, 153, 153));
        btnSalir.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setLabel("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelMenuLayout = new javax.swing.GroupLayout(PanelMenu);
        PanelMenu.setLayout(PanelMenuLayout);
        PanelMenuLayout.setHorizontalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnListarServicios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlquilerPlaza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnRetirarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTitulo)
                .addGap(62, 62, 62))
        );
        PanelMenuLayout.setVerticalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(labelTitulo)
                .addGap(107, 107, 107)
                .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAlquilerPlaza, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRetirarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnListarServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        btnAlquilerPlaza.getAccessibleContext().setAccessibleName("Alquiler Plaza");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 498, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlquilerPlazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlquilerPlazaActionPerformed
        
        setSize(800,450);        
        panelListarServicios.setVisible(false);
        panelRetirarVehiculo.setVisible(false);        
        panelAlquilerPlaza.pintarPkDisponibles();   // Pinta los pk disponibles.
        panelAlquilerPlaza.setVisible(true);
        
        revalidate();
        repaint();
    }//GEN-LAST:event_btnAlquilerPlazaActionPerformed

    private void btnRetirarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarVehiculoActionPerformed
        
        setSize(800,450);
        panelListarServicios.setVisible(false);
        panelAlquilerPlaza.setVisible(false);
        panelRetirarVehiculo.setVisible(true);
        
        revalidate();
        repaint();       
    }//GEN-LAST:event_btnRetirarVehiculoActionPerformed

    private void btnListarServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarServiciosActionPerformed
        
        setSize(1116,450);
        add(panelListarServicios);
        panelListarServicios.setVisible(true);
        panelAlquilerPlaza.setVisible(false);
        panelRetirarVehiculo.setVisible(false);
        
        revalidate();
        repaint();
    }//GEN-LAST:event_btnListarServiciosActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelMenu;
    private java.awt.Button btnAlquilerPlaza;
    private java.awt.Button btnListarServicios;
    private java.awt.Button btnRetirarVehiculo;
    private java.awt.Button btnSalir;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}
