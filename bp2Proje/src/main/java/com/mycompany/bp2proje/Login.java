package com.mycompany.bp2proje;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.temporal.JulianFields;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/*
 * @author ayza
 */
public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        lblPasswordControl.setVisible(false);
    }

    //defined frame for open main page
    MainPage frame;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popUpLogin = new javax.swing.JPopupMenu();
        itemNormal = new javax.swing.JCheckBoxMenuItem();
        itemMagenta = new javax.swing.JCheckBoxMenuItem();
        btnGroup1 = new javax.swing.ButtonGroup();
        pnlLogin = new javax.swing.JPanel();
        lblLoginPage = new javax.swing.JLabel();
        lblFalconeyeYayinevi = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        pswPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        cmbUserName = new javax.swing.JComboBox<>();
        lblPasswordControl = new javax.swing.JLabel();
        lblReferences = new javax.swing.JLabel();
        lblInfo = new javax.swing.JLabel();
        btnFalconeye = new com.mycompany.bp2proje.grap(){};

        btnGroup1.add(itemNormal);
        itemNormal.setSelected(true);
        itemNormal.setText("MakePink");
        itemNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNormalActionPerformed(evt);
            }
        });
        popUpLogin.add(itemNormal);

        btnGroup1.add(itemMagenta);
        itemMagenta.setText("MakeMagenta");
        itemMagenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMagentaActionPerformed(evt);
            }
        });
        popUpLogin.add(itemMagenta);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        pnlLogin.setBackground(new java.awt.Color(255, 102, 102));
        pnlLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login Page", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        pnlLogin.setComponentPopupMenu(popUpLogin);

        lblLoginPage.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblLoginPage.setForeground(new java.awt.Color(0, 0, 0));
        lblLoginPage.setText("LOGIN PAGE");

        lblFalconeyeYayinevi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFalconeyeYayinevi.setForeground(new java.awt.Color(0, 0, 0));
        lblFalconeyeYayinevi.setText("FALCONEYE PUBLISHING HOME");

        lblUserName.setBackground(new java.awt.Color(255, 204, 204));
        lblUserName.setForeground(new java.awt.Color(0, 0, 0));
        lblUserName.setText("User name:");

        lblPassword.setBackground(new java.awt.Color(255, 204, 204));
        lblPassword.setForeground(new java.awt.Color(0, 0, 0));
        lblPassword.setText("Password:");

        btnLogin.setBackground(new java.awt.Color(0, 102, 0));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnClose.setBackground(new java.awt.Color(153, 0, 0));
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        cmbUserName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "aatahan", "eylulgnn", "selyilmaz" }));

        lblReferences.setBackground(new java.awt.Color(204, 0, 204));
        lblReferences.setForeground(new java.awt.Color(0, 0, 0));
        lblReferences.setText("for references falconeyepublishinghome@gmail.com");

        lblInfo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblInfo.setForeground(new java.awt.Color(0, 0, 0));
        lblInfo.setText("↓ Click for informations ↓ ");

        btnFalconeye.setForeground(new java.awt.Color(255, 0, 0));
        btnFalconeye.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFalconeyeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(lblLoginPage, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblInfo)
                            .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(pnlLoginLayout.createSequentialGroup()
                                    .addComponent(btnLogin)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnClose))
                                .addGroup(pnlLoginLayout.createSequentialGroup()
                                    .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cmbUserName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pswPassword)))
                                .addComponent(lblPasswordControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(103, Short.MAX_VALUE))
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblFalconeyeYayinevi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblReferences)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(btnFalconeye, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblLoginPage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFalconeyeYayinevi)
                .addGap(52, 52, 52)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserName)
                    .addComponent(cmbUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(pswPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(lblPasswordControl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(btnClose))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(lblInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFalconeye, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblReferences, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(pnlLogin);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //i writed a method for close project.
    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed

        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    //checks were made for the password
    public void passwordControl() {
        Matcher matcher;
        if (pswPassword.getText().isEmpty()) {
            lblPasswordControl.setText("Password Must Not Be Empty");
            lblPasswordControl.setVisible(true);
            return;
        } else {
            matcher = Pattern.compile("^{5,}$").matcher(pswPassword.getText());
            if (!matcher.find()) {
                lblPasswordControl.setText("Password Must Be At Least 5 Digit and Be Correct.");
                lblPasswordControl.setVisible(true);
                return;
            } else {
                lblPasswordControl.setVisible(false);
            }
        }
    }

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        //connected authors in database table.
        Connection con = null;
        int id;
        try {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/YayincilikDB", "sa", "as");
            Statement st = con.createStatement();
            String queryString = "SELECT * FROM YAZARBILGILERI where KULLANICIADI='" + cmbUserName.getSelectedItem() + "'and SIFRE='" + pswPassword.getText() + "'";
            ResultSet results = st.executeQuery(queryString);

            //controlled exceptions and if there is no exception, opened current user's account.
            passwordControl();
            if (!results.next()) {
                JOptionPane.showMessageDialog(rootPane, "incorrect entry!");
            } else {
                id = results.getInt("ID");
                frame = new MainPage(id);
                this.dispose();
                frame.setVisible(true);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            if (con != null && !con.isClosed()) {
                con.close();

            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    //setted background colors. (default color and magenta color)
    private void itemNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNormalActionPerformed

        pnlLogin.setBackground(new java.awt.Color(255, 102, 102));
    }//GEN-LAST:event_itemNormalActionPerformed

    private void itemMagentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMagentaActionPerformed

        pnlLogin.setBackground(Color.MAGENTA);
    }//GEN-LAST:event_itemMagentaActionPerformed

    //opened author info page method 
    private void btnFalconeyeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFalconeyeActionPerformed

        AuthorInfo frame = new AuthorInfo();
        this.dispose();
        frame.setVisible(true);
    }//GEN-LAST:event_btnFalconeyeActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnFalconeye;
    private javax.swing.ButtonGroup btnGroup1;
    private javax.swing.JButton btnLogin;
    private javax.swing.JComboBox<String> cmbUserName;
    private javax.swing.JCheckBoxMenuItem itemMagenta;
    private javax.swing.JCheckBoxMenuItem itemNormal;
    private javax.swing.JLabel lblFalconeyeYayinevi;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblLoginPage;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPasswordControl;
    private javax.swing.JLabel lblReferences;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPopupMenu popUpLogin;
    private javax.swing.JPasswordField pswPassword;
    // End of variables declaration//GEN-END:variables
}
