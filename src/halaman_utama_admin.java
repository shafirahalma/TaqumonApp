/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




/**
 *
 * @author amirul
 */
public class halaman_utama_admin extends javax.swing.JFrame {

    /**
     * Creates new form halaman_utama_admin
     */
    public halaman_utama_admin() {
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

        user = new javax.swing.JLabel();
        log_out = new javax.swing.JButton();
        cek_hafalan_terakhir = new javax.swing.JButton();
        tambahkan_hafalan = new javax.swing.JButton();
        bg = new javax.swing.JLabel();
        data_hafalan_mahasiswa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        log_out.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        log_out.setText("Log Out");
        log_out.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        log_out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_outActionPerformed(evt);
            }
        });
        getContentPane().add(log_out, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, -1, 40));

        cek_hafalan_terakhir.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cek_hafalan_terakhir.setText("Cek Hafalan Terakhir");
        cek_hafalan_terakhir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cek_hafalan_terakhir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cek_hafalan_terakhirActionPerformed(evt);
            }
        });
        getContentPane().add(cek_hafalan_terakhir, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 230, 50));

        tambahkan_hafalan.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tambahkan_hafalan.setText("Tambahkan Hafalan");
        tambahkan_hafalan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tambahkan_hafalan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahkan_hafalanActionPerformed(evt);
            }
        });
        getContentPane().add(tambahkan_hafalan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 230, 50));
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        data_hafalan_mahasiswa.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        data_hafalan_mahasiswa.setText("Data Hafalan Mahasiswa");
        data_hafalan_mahasiswa.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        data_hafalan_mahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                data_hafalan_mahasiswaActionPerformed(evt);
            }
        });
        getContentPane().add(data_hafalan_mahasiswa, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 230, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bgkartun.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(676, 409));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void log_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_outActionPerformed
        // TODO add your handling code here:
        new awal().setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_log_outActionPerformed

    private void tambahkan_hafalanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahkan_hafalanActionPerformed
        // TODO add your handling code here:
        new tambah_hafalan().setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_tambahkan_hafalanActionPerformed

    private void cek_hafalan_terakhirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cek_hafalan_terakhirActionPerformed
        // TODO add your handling code here:
        new cek_hafalan_terakhir_1().setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_cek_hafalan_terakhirActionPerformed

    private void data_hafalan_mahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_data_hafalan_mahasiswaActionPerformed
        // TODO add your handling code here:
         new data_hafalan_mahasiswa().setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_data_hafalan_mahasiswaActionPerformed

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
            java.util.logging.Logger.getLogger(halaman_utama_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(halaman_utama_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(halaman_utama_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(halaman_utama_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new halaman_utama_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton cek_hafalan_terakhir;
    private javax.swing.JButton data_hafalan_mahasiswa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton log_out;
    private javax.swing.JButton tambahkan_hafalan;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
