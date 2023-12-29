/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package smartcityg;

import java.awt.Color;
import static java.awt.Color.red;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import javax.swing.ButtonModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

/**
 *
 * @author USER
 */
public class user_reg extends javax.swing.JFrame {

    /**
     * Creates new form user_reg
     */
    public user_reg() {

        initComponents();
        jLabel6.setVisible(false);
        jLabel1.setVisible(false);
        jLabel9.setVisible(false);
        

    }
    student stu;
    employee emp;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.ButtonGroup();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        emailf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        passf = new javax.swing.JPasswordField();
        type = new javax.swing.JComboBox<>();
        addf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        namef = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        f = new javax.swing.JRadioButton();
        m = new javax.swing.JRadioButton();
        cont = new javax.swing.JButton();
        ins_n = new javax.swing.JLabel();
        gpa = new javax.swing.JLabel();
        gpaf = new javax.swing.JTextField();
        regbut = new javax.swing.JButton();
        insnam = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jLabel9 = new javax.swing.JLabel();
        insf = new javax.swing.JLabel();

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smartcityg/modern-city-at-night-cartoon-background-vector-23716650.jpg"))); // NOI18N
        jLabel7.setText("jLabel1");
        jLabel7.setPreferredSize(new java.awt.Dimension(930, 620));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(95, 17, 131));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("User Registeration");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, -1));

        jLabel3.setBackground(new java.awt.Color(51, 0, 153));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 80, 40));

        emailf.setEditable(true);
        emailf.setBackground(new java.awt.Color(95, 17, 131));
        emailf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        emailf.setForeground(new java.awt.Color(255, 255, 255));
        emailf.setText("@");
        emailf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailfActionPerformed(evt);
            }
        });
        getContentPane().add(emailf, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 190, 40));

        jLabel4.setBackground(new java.awt.Color(51, 0, 153));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 130, 40));

        passf.setBackground(new java.awt.Color(95, 17, 131));
        passf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        passf.setForeground(new java.awt.Color(255, 255, 255));
        passf.setCaretColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(passf, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 190, 40));

        type.setBackground(new java.awt.Color(95, 17, 131));
        type.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        type.setForeground(new java.awt.Color(255, 255, 255));
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student", "Employee" }));
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });
        getContentPane().add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, 110, 30));

        addf.setEditable(true);
        addf.setBackground(new java.awt.Color(95, 17, 131));
        addf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addf.setForeground(new java.awt.Color(255, 255, 255));
        addf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addfActionPerformed(evt);
            }
        });
        getContentPane().add(addf, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 190, 40));

        jLabel5.setBackground(new java.awt.Color(51, 0, 153));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Address");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 140, 40));

        namef.setEditable(true);
        namef.setBackground(new java.awt.Color(95, 17, 131));
        namef.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        namef.setForeground(new java.awt.Color(255, 255, 255));
        namef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namefActionPerformed(evt);
            }
        });
        getContentPane().add(namef, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 190, 40));

        jLabel8.setBackground(new java.awt.Color(51, 0, 153));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Name");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 80, 40));

        f.setBackground(new java.awt.Color(95, 17, 131));
        bg.add(f);
        f.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        f.setForeground(new java.awt.Color(255, 255, 255));
        f.setText("Female");
        getContentPane().add(f, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, 100, -1));

        m.setBackground(new java.awt.Color(95, 17, 131));
        bg.add(m);
        m.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        m.setForeground(new java.awt.Color(255, 255, 255));
        m.setText("Male");
        getContentPane().add(m, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, 100, -1));

        cont.setBackground(new java.awt.Color(95, 17, 131));
        cont.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cont.setForeground(new java.awt.Color(255, 255, 255));
        cont.setText("continue");
        cont.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contMouseClicked(evt);
            }
        });
        getContentPane().add(cont, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 410, 110, 40));

        ins_n.setVisible(false);
        ins_n.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ins_n.setForeground(new java.awt.Color(255, 255, 255));
        ins_n.setText("Institue name");
        getContentPane().add(ins_n, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 170, -1));

        gpa.setVisible(false);
        gpa.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        gpa.setForeground(new java.awt.Color(255, 255, 255));
        gpa.setText("GPA");
        getContentPane().add(gpa, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 150, -1));

        gpaf.setVisible(false);
        gpaf.setEditable(false);
        gpaf.setBackground(new java.awt.Color(95, 17, 131));
        gpaf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        gpaf.setForeground(new java.awt.Color(255, 255, 255));
        gpaf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gpafActionPerformed(evt);
            }
        });
        gpaf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                gpafKeyPressed(evt);
            }
        });
        getContentPane().add(gpaf, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 460, 180, -1));

        regbut.setVisible(false);
        regbut.setBackground(new java.awt.Color(95, 17, 131));
        regbut.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        regbut.setForeground(new java.awt.Color(255, 255, 255));
        regbut.setText("Register");
        regbut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regbutMouseClicked(evt);
            }
        });
        getContentPane().add(regbut, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 460, 110, 40));

        insnam.setVisible(false);
        insnam.setBackground(new java.awt.Color(95, 17, 131));
        insnam.setForeground(new java.awt.Color(255, 255, 255));
        insnam.setMaximumRowCount(30);
        getContentPane().add(insnam, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 180, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(java.awt.Color.red);
        jLabel1.setText("name already used");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 140, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(java.awt.Color.red);
        jLabel6.setText("gpa cant be greater than 4");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 490, 170, 20));

        jButton1.setBackground(new java.awt.Color(95, 17, 131));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, -1, -1));
        getContentPane().add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 540, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(java.awt.Color.red);
        jLabel9.setText("E-mail already used");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 160, -1));

        insf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smartcityg/modern-city-at-night-cartoon-background-vector-23716650.jpg"))); // NOI18N
        insf.setText("jLabel1");
        getContentPane().add(insf, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailfActionPerformed

    private void addfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addfActionPerformed

    private void namefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namefActionPerformed

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeActionPerformed

    private void contMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contMouseClicked
        // TODO add your handling code here:
        namef.setBorder(new LineBorder(Color.white, 1));
        passf.setBorder(new LineBorder(Color.white, 1));
        emailf.setBorder(new LineBorder(Color.white, 1));
        addf.setBorder(new LineBorder(Color.white, 1));
        f.setBorder(new LineBorder(Color.white, 1));
        m.setBorder(new LineBorder(Color.white, 1));
        if (namef.getText().equals("") || namef.getText().equals(null)) {
            namef.setBorder(new LineBorder(Color.red, 1));
        } else if (String.valueOf(passf.getPassword()).equals("") || String.valueOf(passf.getPassword()).equals(null)) {
            passf.setBorder(new LineBorder(Color.red, 1));
        } else if (emailf.getText().equals("") || emailf.getText().equals(null) || !emailf.getText().contains("@")) {
            emailf.setBorder(new LineBorder(Color.red, 1));
        } else if (addf.getText().equals("") || addf.getText().equals(null)) {
            addf.setBorder(new LineBorder(Color.red, 1));
        } else if (!m.isSelected() && !f.isSelected()) {
            m.setForeground(red);
            f.setForeground(red);
        } else {
            x = String.valueOf(passf.getPassword());

            if (m.isSelected()) {
                g = "male";
            } else if (f.isSelected()) {
                g = "female";
            }
            //add ins and wp in drop down
            if (type.getSelectedItem().equals("Student")) {
                ins_n.setVisible(true);
                ins_n.setText("Institute Name");

                insnam.setVisible(true);
                try {
                    BufferedReader br = new BufferedReader(new FileReader("institute"));
                    while ((line = br.readLine()) != null) {
                        String values[] = line.split(",");
                        insnam.addItem(values[0]);
                    }
                } catch (IOException e) {

                }
                gpa.setVisible(true);
                gpa.setText("GPA");

                gpaf.setVisible(true);
                regbut.setVisible(true);
                cont.setVisible(false);
                T = true;

            } else {
                ins_n.setVisible(true);
                ins_n.setText("Workplace Name");

                insnam.setVisible(true);
                try {
                    BufferedReader br = new BufferedReader(new FileReader("business"));
                    while ((line = br.readLine()) != null) {
                        String values[] = line.split(",");
                        insnam.addItem(values[0]);
                    }
                } catch (IOException e) {

                }

                gpa.setVisible(true);
                gpa.setText("Salary");

                gpaf.setVisible(true);
                regbut.setVisible(true);
                cont.setVisible(false);
                type.setEditable(false);
                
            }
        }

    }//GEN-LAST:event_contMouseClicked

    private void gpafActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gpafActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gpafActionPerformed

    private void gpafKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gpafKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (Character.isLetter(c)) {
            gpaf.setEditable(false);
        } else {
            gpaf.setEditable(true);
        }

    }//GEN-LAST:event_gpafKeyPressed

    private void regbutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regbutMouseClicked
        // TODO add your handling code here:
        gpaf.setBorder(new LineBorder(Color.white, 1));
        jLabel6.setVisible(false);
        namef.setBorder(new LineBorder(Color.white, 1));
        jLabel1.setVisible(false);
        
        if (gpaf.getText().equals("") || gpaf.getText().equals(null)) {
            gpaf.setBorder(new LineBorder(Color.red, 1));
        }
        if (T) {
            double gp = 0;
            try {
                gp = Double.parseDouble(gpaf.getText());

            } catch (NumberFormatException e) {
            }
            if (gp > 4) {
                gpaf.setText("");
                gpaf.setBorder(new LineBorder(Color.red, 1));
                jLabel6.setVisible(true);
            } else {
                T = false;
                try {
                    BufferedReader br = new BufferedReader(new FileReader("student"));
                    while ((line = br.readLine()) != null) {
                        String[] values = line.split(",");

                        if (namef.getText().equals(values[0])) {
                            System.out.println(values[0]);
                            namef.setBorder(new LineBorder(Color.red, 1));
                            T = true;
                            jLabel1.setVisible(true);
                        }
                        else if(emailf.getText().equals(values[5])){
                            emailf.setBorder(new LineBorder(Color.RED,1));
                            T =true;
                            jLabel9.setVisible(true);
                        }
                    }

                } catch (IOException f) {
                }
                try {
                    BufferedReader br = new BufferedReader(new FileReader("student"));
                    while ((line = br.readLine()) != null) {
                        String[] values = line.split(",");

                        if (namef.getText().equals(values[0])) {
                            System.out.println(values[0]);
                            namef.setBorder(new LineBorder(Color.red, 1));
                            T = true;
                            jLabel1.setVisible(true);
                        }
                        else if(emailf.getText().equals(values[5])){
                            emailf.setBorder(new LineBorder(Color.RED,1));
                            T =true;
                            jLabel9.setVisible(true);
                        }
                    }

                } catch (IOException f) {
                }
            }
            if (T == false) {
                new student(insnam.getSelectedItem().toString(), gp, namef.getText(), emailf.getText(), x, addf.getText(), g);
                this.setVisible(false);
                new user_scr().setVisible(true);
            }
        } else {
            int sal = 0;
            try {
                sal = Integer.parseInt(gpaf.getText());
            } catch (NumberFormatException e) {
            }
            T = false;
            try {
                BufferedReader br = new BufferedReader(new FileReader("student"));
                while ((line = br.readLine()) != null) {
                    String[] values = line.split(",");

                    if (namef.getText().equals(values[0])) {
                        System.out.println(values[0]);
                        namef.setBorder(new LineBorder(Color.red, 1));
                        T = true;
                        jLabel1.setVisible(true);
                    }
                    else if(emailf.getText().equals(values[5])){
                            emailf.setBorder(new LineBorder(Color.RED,1));
                            T =true;
                            jLabel9.setVisible(true);
                        }
                }

            } catch (IOException f) {
            }
            try {
                BufferedReader br = new BufferedReader(new FileReader("student"));
                while ((line = br.readLine()) != null) {
                    String[] values = line.split(",");

                    if (namef.getText().equals(values[0])) {
                        System.out.println(values[0]);
                        namef.setBorder(new LineBorder(Color.red, 1));
                        T = true;
                        jLabel1.setVisible(true);
                    }
                    else if(emailf.getText().equals(values[5])){
                            emailf.setBorder(new LineBorder(Color.RED,1));
                            T =true;
                            jLabel9.setVisible(true);
                        }
                }

            } catch (IOException f) {
            }
            if (T == false) {
                new employee(insf.getText(), sal, namef.getText(), emailf.getText(), x, addf.getText(), g);
                this.setVisible(false);
                new user_scr().setVisible(true);
            }
        }


    }//GEN-LAST:event_regbutMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        this.dispose();
        new user_scr().setVisible(true);
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
            java.util.logging.Logger.getLogger(user_reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(user_reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(user_reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(user_reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new user_reg().setVisible(true);
            }
        });

    }
    String line;
    String x;
    String g = null;
    boolean T = false;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addf;
    private javax.swing.ButtonGroup bg;
    public javax.swing.JButton cont;
    private javax.swing.JTextField emailf;
    private javax.swing.JRadioButton f;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel gpa;
    private javax.swing.JTextField gpaf;
    private javax.swing.JLabel ins_n;
    private javax.swing.JLabel insf;
    private javax.swing.JComboBox<String> insnam;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton m;
    private javax.swing.JTextField namef;
    private javax.swing.JPasswordField passf;
    private javax.swing.JButton regbut;
    private javax.swing.JComboBox<String> type;
    // End of variables declaration//GEN-END:variables
}
