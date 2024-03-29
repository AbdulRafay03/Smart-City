/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package smartcityg;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class user_scr extends javax.swing.JFrame {

    /**
     * Creates new form user_scr
     */
    public user_scr() {
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

        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        namef = new javax.swing.JTextField();
        passf = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        reg = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(920, 610));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Welcome to Smart City");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 340, 60));

        jLabel2.setBackground(new java.awt.Color(51, 0, 153));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 80, 40));

        jLabel3.setBackground(new java.awt.Color(51, 0, 153));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 130, 40));

        namef.setEditable(true);
        namef.setBackground(new java.awt.Color(95, 17, 131));
        namef.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        namef.setForeground(new java.awt.Color(255, 255, 255));
        namef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namefActionPerformed(evt);
            }
        });
        getContentPane().add(namef, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 190, 40));

        passf.setBackground(new java.awt.Color(95, 17, 131));
        passf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        passf.setForeground(new java.awt.Color(255, 255, 255));
        passf.setCaretColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(passf, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 190, 40));

        login.setBackground(new java.awt.Color(95, 17, 131));
        login.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("Login");
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
        });
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, 100, 30));

        reg.setBackground(new java.awt.Color(95, 17, 131));
        reg.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        reg.setForeground(new java.awt.Color(255, 255, 255));
        reg.setText("Register");
        reg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regMouseClicked(evt);
            }
        });
        reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regActionPerformed(evt);
            }
        });
        getContentPane().add(reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, 110, 30));

        jButton1.setBackground(new java.awt.Color(95, 17, 131));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, -1, -1));

        jLabel1.setBackground(new java.awt.Color(51, 0, 153));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smartcityg/modern-city-at-night-cartoon-background-vector-23716650.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(1041, 780));
        jLabel1.setMinimumSize(new java.awt.Dimension(1041, 780));
        jLabel1.setPreferredSize(new java.awt.Dimension(1041, 780));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namefActionPerformed

    private void regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regActionPerformed

    private void regMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regMouseClicked
        // TODO add your handling code here:
        new user_reg().setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_regMouseClicked

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
        // TODO add your handling code here:
        String line;
        try {
            BufferedReader br = new BufferedReader(new FileReader("Student"));
            while ((line = br.readLine()) != null) {
                String values[] = line.split(",");
                String x = values[2];
                if (values[0].equals(namef.getText()) && Arrays.equals(passf.getPassword(), x.toCharArray())) {
                    name = namef.getText();
                    pass = String.valueOf(passf.getPassword());
                    id = values[1];
                    ins = values[3];
                    gpaa = values[4];
                    add = values[5];
                    email = values[6];
                    gen = values[7];
                    T = 1;

                }
            }

            br.close();
        } catch (IOException e) {
            System.out.println("reading error");
        }

        if (T == 0) {
            try {
                BufferedReader br = new BufferedReader(new FileReader("Employee"));
                while ((line = br.readLine()) != null) {
                    String values[] = line.split(",");
                    String x = values[2];
                    if (values[0].equals(namef.getText()) && Arrays.equals(passf.getPassword(), x.toCharArray())) {
                        name = namef.getText();
                        pass = String.valueOf(passf.getPassword());
                        id = values[1];
                        wp = values[3];
                        sal = values[4];
                        add = values[5];
                        email = values[6];
                        gen = values[7];
                        T = 2;

                    }
                }

                br.close();
            } catch (IOException e) {
                System.out.println("reading error");
            }
        }
        if (T == 1) {
            this.setVisible(false);
            new stu_logged(id, name, pass, ins, gpaa, add, email).setVisible(true);

        } else if (T == 2) {
            this.setVisible(false);
            new stu_logged(id, name, pass, add, email, wp, sal, 1).setVisible(true);
        }
        else{
            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f, "user not found \n usernamer password incorrect");
        }
    }//GEN-LAST:event_loginMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        this.dispose();
        new main_menu().setVisible(true);
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
            java.util.logging.Logger.getLogger(user_scr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(user_scr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(user_scr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(user_scr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new user_scr().setVisible(true);
            }
        });

    }
    int T = 0;
    public String name, pass;
    String id;
    public String ins, gpaa, add, email, wp, sal, gen;


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton login;
    private javax.swing.JTextField namef;
    private javax.swing.JPasswordField passf;
    private javax.swing.JButton reg;
    // End of variables declaration//GEN-END:variables
}
