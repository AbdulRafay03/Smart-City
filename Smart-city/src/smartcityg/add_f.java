/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package smartcityg;

/**
 *
 * @author USER
 */
public class add_f extends javax.swing.JFrame {

    /**
     * Creates new form add_f
     */
    public add_f() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        conf = new javax.swing.JTextField();
        namef = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        desf = new javax.swing.JTextField();
        passf = new javax.swing.JPasswordField();
        combo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        addf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(930, 620));
        setMinimumSize(new java.awt.Dimension(930, 620));
        setPreferredSize(new java.awt.Dimension(930, 620));
        getContentPane().setLayout(null);

        jLabel2.setBackground(new java.awt.Color(95, 17, 131));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(242, 242, 242));
        jLabel2.setText("E mail");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 400, 140, 40);

        jLabel3.setBackground(new java.awt.Color(95, 17, 131));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(242, 242, 242));
        jLabel3.setText("Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 150, 80, 40);

        jLabel4.setBackground(new java.awt.Color(95, 17, 131));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(242, 242, 242));
        jLabel4.setText("Password");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 280, 140, 40);

        jLabel5.setBackground(new java.awt.Color(95, 17, 131));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(242, 242, 242));
        jLabel5.setText("Description");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(300, 150, 140, 40);

        jLabel6.setBackground(new java.awt.Color(95, 17, 131));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(242, 242, 242));
        jLabel6.setText("Address");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(300, 400, 140, 40);

        conf.setBackground(new java.awt.Color(95, 17, 131));
        conf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        conf.setForeground(new java.awt.Color(255, 255, 255));
        conf.setToolTipText("");
        getContentPane().add(conf);
        conf.setBounds(300, 330, 190, 40);

        namef.setBackground(new java.awt.Color(95, 17, 131));
        namef.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        namef.setForeground(new java.awt.Color(255, 255, 255));
        namef.setToolTipText("");
        getContentPane().add(namef);
        namef.setBounds(40, 200, 190, 40);

        email.setBackground(new java.awt.Color(95, 17, 131));
        email.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setToolTipText("");
        getContentPane().add(email);
        email.setBounds(30, 450, 200, 40);

        desf.setBackground(new java.awt.Color(95, 17, 131));
        desf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        desf.setForeground(new java.awt.Color(255, 255, 255));
        desf.setToolTipText("");
        getContentPane().add(desf);
        desf.setBounds(300, 200, 190, 40);

        passf.setBackground(new java.awt.Color(95, 17, 131));
        passf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        passf.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(passf);
        passf.setBounds(30, 330, 200, 40);

        combo.setBackground(new java.awt.Color(95, 17, 131));
        combo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        combo.setForeground(new java.awt.Color(255, 255, 255));
        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Business", "Institute" }));
        getContentPane().add(combo);
        combo.setBounds(630, 190, 130, 30);

        jButton1.setBackground(new java.awt.Color(95, 17, 131));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ADD");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(630, 330, 120, 30);

        addf.setBackground(new java.awt.Color(95, 17, 131));
        addf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addf.setForeground(new java.awt.Color(255, 255, 255));
        addf.setToolTipText("");
        getContentPane().add(addf);
        addf.setBounds(300, 450, 190, 40);

        jLabel7.setBackground(new java.awt.Color(95, 17, 131));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(242, 242, 242));
        jLabel7.setText("Contact");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(300, 280, 140, 40);

        jLabel1.setBackground(new java.awt.Color(95, 17, 131));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smartcityg/modern-city-at-night-cartoon-background-vector-23716650.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(930, 620));
        jLabel1.setMinimumSize(new java.awt.Dimension(930, 620));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 930, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        if (combo.getSelectedItem().equals("Business")) {
            new business(namef.getText(), desf.getText(), "bussiness", addf.getText(), email.getText(), conf.getText());
            this.dispose();
           new add_job_op(namef.getText()).setVisible(true);

        } else {
            new institute(namef.getText(), desf.getText(), "institute", addf.getText(), email.getText(), conf.getText());
            this.dispose();
//            new admin_logged().setVisible(true);
            new add_scholar(namef.getText()).setVisible(true);
        }

    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(add_f.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_f.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_f.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_f.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_f().setVisible(true);
            }
        });
        business b;
        institute i;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addf;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JTextField conf;
    private javax.swing.JTextField desf;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField namef;
    private javax.swing.JPasswordField passf;
    // End of variables declaration//GEN-END:variables

}
