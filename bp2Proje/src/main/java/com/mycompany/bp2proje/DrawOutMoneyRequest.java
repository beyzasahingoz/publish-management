package com.mycompany.bp2proje;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ayza
 */
public class DrawOutMoneyRequest extends javax.swing.JFrame {

    // describe variables.
    int id;
    double get;
    double amount;

    public DrawOutMoneyRequest(int id) {
        initComponents();
        this.id = id;

        //called method.
        try {
            get = getBalanceCurrent();
        } catch (SQLException ex) {
            Logger.getLogger(DrawOutMoneyRequest.class.getName()).log(Level.SEVERE, null, ex);
        }
        //setted current balance
        txtBalance.setText(String.valueOf(get));

    }

    //defined other frames.
    MainPage Mainframe;
    NewBookRequest Bookframe;
    NewEditionRequest EditionFrame;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlDrawOut = new javax.swing.JPanel();
        lblDrawOutRequest = new javax.swing.JLabel();
        lblCurrentBalance = new javax.swing.JLabel();
        btnDrawout = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        txtBalance = new javax.swing.JTextField();
        lblAmount = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        menuBarDrawOutPage = new javax.swing.JMenuBar();
        menuDrawOutPage = new javax.swing.JMenu();
        itemLogin = new javax.swing.JMenuItem();
        sprtDrawOutPage = new javax.swing.JPopupMenu.Separator();
        itemMainPage = new javax.swing.JMenuItem();
        itemEdition = new javax.swing.JMenuItem();
        itemBook = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        pnlDrawOut.setBackground(new java.awt.Color(255, 102, 102));
        pnlDrawOut.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DrawOut Money Request", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        lblDrawOutRequest.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDrawOutRequest.setForeground(new java.awt.Color(0, 0, 0));
        lblDrawOutRequest.setText("DRAWOUT MONEY REQUEST");

        lblCurrentBalance.setForeground(new java.awt.Color(0, 0, 0));
        lblCurrentBalance.setText("Current Balance:");

        btnDrawout.setBackground(new java.awt.Color(0, 102, 0));
        btnDrawout.setText("WithDraw");
        btnDrawout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrawoutActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnClose.setBackground(new java.awt.Color(153, 0, 0));
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        txtBalance.setEditable(false);

        lblAmount.setForeground(new java.awt.Color(0, 0, 0));
        lblAmount.setText("Amount Want To Withdraw:");

        javax.swing.GroupLayout pnlDrawOutLayout = new javax.swing.GroupLayout(pnlDrawOut);
        pnlDrawOut.setLayout(pnlDrawOutLayout);
        pnlDrawOutLayout.setHorizontalGroup(
            pnlDrawOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDrawOutLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnClose)
                .addGap(15, 15, 15))
            .addGroup(pnlDrawOutLayout.createSequentialGroup()
                .addGroup(pnlDrawOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDrawOutLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(pnlDrawOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAmount)
                            .addComponent(lblCurrentBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlDrawOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlDrawOutLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(btnBack)
                        .addGap(18, 18, 18)
                        .addComponent(btnDrawout))
                    .addGroup(pnlDrawOutLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(lblDrawOutRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        pnlDrawOutLayout.setVerticalGroup(
            pnlDrawOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDrawOutLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblDrawOutRequest)
                .addGap(47, 47, 47)
                .addGroup(pnlDrawOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCurrentBalance)
                    .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDrawOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAmount)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDrawOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDrawout)
                    .addComponent(btnBack))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btnClose)
                .addContainerGap())
        );

        getContentPane().add(pnlDrawOut);

        menuBarDrawOutPage.setBackground(new java.awt.Color(0, 0, 0));

        menuDrawOutPage.setText("ShortCut");

        itemLogin.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemLogin.setText("Login Page");
        itemLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemLoginActionPerformed(evt);
            }
        });
        menuDrawOutPage.add(itemLogin);
        menuDrawOutPage.add(sprtDrawOutPage);

        itemMainPage.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemMainPage.setText("Main Page");
        itemMainPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMainPageActionPerformed(evt);
            }
        });
        menuDrawOutPage.add(itemMainPage);

        itemEdition.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemEdition.setText("New Edition Page");
        itemEdition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEditionActionPerformed(evt);
            }
        });
        menuDrawOutPage.add(itemEdition);

        itemBook.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemBook.setText("New Book Page");
        itemBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBookActionPerformed(evt);
            }
        });
        menuDrawOutPage.add(itemBook);

        menuBarDrawOutPage.add(menuDrawOutPage);

        setJMenuBar(menuBarDrawOutPage);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //turned main page method with user id.
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        Mainframe = new MainPage(id);
        this.dispose();
        Mainframe.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed
    //controlled amount.
    private void btnDrawoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDrawoutActionPerformed

        String dig = txtAmount.getText();
        if (!control(dig)) {
            JOptionPane.showMessageDialog(rootPane, "Only numbers!");
        }
        try {
            getBalance();
        } catch (SQLException ex) {
            Logger.getLogger(DrawOutMoneyRequest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDrawoutActionPerformed
    //opened main page method with user id in menu.
    private void itemMainPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMainPageActionPerformed

        Mainframe = new MainPage(id);
        this.dispose();
        Mainframe.setVisible(true);
    }//GEN-LAST:event_itemMainPageActionPerformed
    //opened login method in menu.
    private void itemLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemLoginActionPerformed

        Login frame = new Login();
        this.dispose();
        frame.setVisible(true);
    }//GEN-LAST:event_itemLoginActionPerformed
    //opened edition page method with user id in menu.
    private void itemEditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditionActionPerformed

        EditionFrame = new NewEditionRequest(id);
        this.dispose();
        EditionFrame.setVisible(true);
    }//GEN-LAST:event_itemEditionActionPerformed
    //opened book page method with user id in menu.
    private void itemBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBookActionPerformed

        Bookframe = new NewBookRequest(id);
        this.dispose();
        Bookframe.setVisible(true);
    }//GEN-LAST:event_itemBookActionPerformed

    //updated balance in YAZARBILGILERI database table.
    private void update() throws SQLException {

        Connection conn = null;
        double newBalance = getBalanceValue() + amount;
        try {
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/YayincilikDB", "sa", "as");
            Statement st = conn.createStatement();
            String query = "UPDATE YAZARBILGILERI SET BAKIYE = " + newBalance + "WHERE ID=" + id;
            int rs = st.executeUpdate(query);
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DrawOutMoneyRequest.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DrawOutMoneyRequest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //controlled amount vs balance and there is no exception, accepted request.
    private void getBalance() throws SQLException {

        if (!txtAmount.getText().isEmpty()) {
            double input = Double.parseDouble(txtAmount.getText());
            double current = getBalanceCurrent();

            if (input > current) {
                JOptionPane.showMessageDialog(rootPane, "The amount to be withdrawn cannot exceed the balance!");
            } else if (current <= 0) {
                txtBalance.setText("0");
                JOptionPane.showMessageDialog(rootPane, "The amount to be withdrawn cannot exceed the balance!");
            } else {
                txtBalance.setText(String.valueOf(current));
                JOptionPane.showMessageDialog(rootPane, "Accepted!");
                amount = input;
                update();
                updateBalance();
                current = getBalanceCurrent();
                txtBalance.setText(String.valueOf(current));
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Amount Not Be Empty!!");
        }
    }

    //got balance values in YAZARBILGILERI database table with current user id.
    public double getBalanceValue() throws SQLException {

        double balance = 0;
        Connection conn = null;
        conn = DriverManager.getConnection("jdbc:derby://localhost:1527/YayincilikDB", "sa", "as");
        Statement st = conn.createStatement();
        String query = "SELECT * FROM YAZARBILGILERI WHERE ID=" + id;
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            balance = rs.getDouble("BAKIYE");

        }
        return balance;
    }

    //updated balance after current user made a draft.
    public void updateBalance() throws SQLException {

        double updatedBalance = 0;
        Connection conn = null;
        conn = DriverManager.getConnection("jdbc:derby://localhost:1527/YayincilikDB", "sa", "as");
        Statement st = conn.createStatement();
        String query = "SELECT * FROM SUMBALANCES WHERE ID=" + id;
        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {
            updatedBalance = rs.getDouble("SUMBALANCE");
            updatedBalance -= amount;
        }

        query = "UPDATE SUMBALANCES SET SUMBALANCE = " + updatedBalance + "WHERE ID=" + id;
        st.executeUpdate(query);
        conn.close();

        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(NewEditionRequest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //got current balance
    public double getBalanceCurrent() throws SQLException {

        double gain = 0;
        Connection conn = null;
        conn = DriverManager.getConnection("jdbc:derby://localhost:1527/YayincilikDB", "sa", "as");
        Statement st = conn.createStatement();
        String query = "SELECT * FROM SUMBALANCES WHERE ID=" + id;
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            gain = rs.getDouble("SUMBALANCE");
        }
        return gain;
    }

    //controlled with regex.
    public boolean control(String co) {
        String regex = "[0-9]+";
        return co.matches(regex);
    }

    //closed project.
    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDrawout;
    private javax.swing.JMenuItem itemBook;
    private javax.swing.JMenuItem itemEdition;
    private javax.swing.JMenuItem itemLogin;
    private javax.swing.JMenuItem itemMainPage;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblCurrentBalance;
    private javax.swing.JLabel lblDrawOutRequest;
    private javax.swing.JMenuBar menuBarDrawOutPage;
    private javax.swing.JMenu menuDrawOutPage;
    private javax.swing.JPanel pnlDrawOut;
    private javax.swing.JPopupMenu.Separator sprtDrawOutPage;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtBalance;
    // End of variables declaration//GEN-END:variables
}
