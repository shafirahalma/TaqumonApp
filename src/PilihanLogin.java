/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author shafira halmahera
 */
public class PilihanLogin extends javax.swing.JFrame {

    /**
     * Creates new form PilihanLogin
     */
    public PilihanLogin() {
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

        jLabel2 = new javax.swing.JLabel();
        bt_login_user = new javax.swing.JButton();
        bt_login_admin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, -1, -1));

        bt_login_user.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        bt_login_user.setText("LOGIN USER");
        bt_login_user.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_login_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_login_userActionPerformed(evt);
            }
        });
        getContentPane().add(bt_login_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 170, 40));

        bt_login_admin.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        bt_login_admin.setText("LOGIN ADMIN");
        bt_login_admin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_login_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_login_adminActionPerformed(evt);
            }
        });
        getContentPane().add(bt_login_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 170, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bgkartun.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(679, 414));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_login_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_login_userActionPerformed
     new halaman_login_user().setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_bt_login_userActionPerformed

    private void bt_login_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_login_adminActionPerformed
       new halaman_login_admin().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bt_login_adminActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PilihanLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PilihanLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PilihanLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PilihanLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PilihanLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_login_admin;
    private javax.swing.JButton bt_login_user;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
