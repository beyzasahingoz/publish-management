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
public class NewEditionRequest extends javax.swing.JFrame {

    //defined variables.
    int id;
    int edit;
    String name;

    public NewEditionRequest(int id) {
        initComponents();
        this.id = id;
    }

    //defined frames.
    MainPage Mainframe;
    NewBookRequest Bookframe;
    DrawOutMoneyRequest Moneyframe;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlEdition = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        btnSend = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblEnterBookName = new javax.swing.JLabel();
        txtBookName = new javax.swing.JTextField();
        spnEditionRequest = new javax.swing.JSpinner();
        lblWarning = new javax.swing.JLabel();
        lblChooseEditionNumber = new javax.swing.JLabel();
        chcAccept = new javax.swing.JCheckBox();
        menuBarEditionPage = new javax.swing.JMenuBar();
        menuEdition = new javax.swing.JMenu();
        itemLogin = new javax.swing.JMenuItem();
        sprtEdition = new javax.swing.JPopupMenu.Separator();
        itemMainPage = new javax.swing.JMenuItem();
        itemBook = new javax.swing.JMenuItem();
        itemMoney = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        pnlEdition.setBackground(new java.awt.Color(255, 102, 102));
        pnlEdition.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "New Edition Request", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 0, 0));
        lblTitle.setText("NEW EDITION REQUEST");

        btnSend.setBackground(new java.awt.Color(0, 102, 0));
        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblEnterBookName.setForeground(new java.awt.Color(0, 0, 0));
        lblEnterBookName.setText("Enter The Name Of Your Book That You Want To Request For Publication: ");

        spnEditionRequest.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));

        lblWarning.setForeground(new java.awt.Color(153, 0, 0));
        lblWarning.setText("(your choice will be multiplied by 100!)");

        lblChooseEditionNumber.setForeground(new java.awt.Color(0, 0, 0));
        lblChooseEditionNumber.setText("Choose Edition Number Request: ");

        chcAccept.setBackground(new java.awt.Color(0, 0, 0));
        chcAccept.setForeground(new java.awt.Color(0, 102, 102));
        chcAccept.setText("Accept");

        javax.swing.GroupLayout pnlEditionLayout = new javax.swing.GroupLayout(pnlEdition);
        pnlEdition.setLayout(pnlEditionLayout);
        pnlEditionLayout.setHorizontalGroup(
            pnlEditionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEditionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(18, 18, 18)
                .addComponent(btnSend)
                .addGap(169, 169, 169))
            .addGroup(pnlEditionLayout.createSequentialGroup()
                .addGroup(pnlEditionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEditionLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(lblTitle))
                    .addGroup(pnlEditionLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addGroup(pnlEditionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBookName, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                            .addComponent(spnEditionRequest)))
                    .addGroup(pnlEditionLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(pnlEditionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEnterBookName)
                            .addGroup(pnlEditionLayout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(lblChooseEditionNumber))))
                    .addGroup(pnlEditionLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(lblWarning))
                    .addGroup(pnlEditionLayout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(chcAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        pnlEditionLayout.setVerticalGroup(
            pnlEditionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditionLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEnterBookName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBookName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblChooseEditionNumber)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnEditionRequest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblWarning)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chcAccept)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(pnlEditionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSend)
                    .addComponent(btnBack))
                .addGap(16, 16, 16))
        );

        getContentPane().add(pnlEdition);

        menuBarEditionPage.setBackground(new java.awt.Color(0, 0, 0));

        menuEdition.setText("ShortCut");

        itemLogin.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemLogin.setText("Login Page");
        itemLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemLoginActionPerformed(evt);
            }
        });
        menuEdition.add(itemLogin);
        menuEdition.add(sprtEdition);

        itemMainPage.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemMainPage.setText("Main Page Page");
        itemMainPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMainPageActionPerformed(evt);
            }
        });
        menuEdition.add(itemMainPage);

        itemBook.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemBook.setText("New Book Request Page");
        itemBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBookActionPerformed(evt);
            }
        });
        menuEdition.add(itemBook);

        itemMoney.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemMoney.setText("DrawOut Money Page");
        itemMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMoneyActionPerformed(evt);
            }
        });
        menuEdition.add(itemMoney);

        menuBarEditionPage.add(menuEdition);

        setJMenuBar(menuBarEditionPage);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //opened main page method with user id.
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        Mainframe = new MainPage(id);
        this.dispose();
        Mainframe.setVisible(true);

    }//GEN-LAST:event_btnBackActionPerformed

    //called bookName method for sending.
    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed

        if (chcAccept.isSelected()) {
            try {
                getBookName();
            } catch (SQLException ex) {
                Logger.getLogger(NewEditionRequest.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "not accepted!");
        }
    }//GEN-LAST:event_btnSendActionPerformed

    //got book Name and edition number. if there is no excepiton received request.
    private void getBookName() throws SQLException {

        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/YayincilikDB", "sa", "as");
            Statement st = con.createStatement();
            String queryString = "SELECT * FROM KITAPBILGILERI where KITAPADI='" + txtBookName.getText() + "'and ID=" + id;
            ResultSet results = st.executeQuery(queryString);
            if (!results.next()) {
                JOptionPane.showMessageDialog(rootPane, "incorrect entry!");
            } else {
                int value = (int) spnEditionRequest.getValue();
                if (value == 0) {
                    JOptionPane.showMessageDialog(rootPane, "Please Choose The Number of Editions!");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Editions added!");
                    bookEditionUpdate();
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //updated editions.
    private void bookEditionUpdate() {

        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/YayincilikDB", "sa", "as");
            Statement st = conn.createStatement();
            String query = "SELECT * FROM KITAPBILGILERI WHERE KITAPADI='" + txtBookName.getText() + "'and ID=" + id;
            ResultSet rs = st.executeQuery(query);
            rs.next();
            int editno = rs.getInt("BASIMSAYISI");
            edit += editno;
            int value = (int) spnEditionRequest.getValue();
            edit += (100 * value);
            query = "UPDATE KITAPBILGILERI SET BASIMSAYISI = " + edit + "WHERE KITAPADI='" + txtBookName.getText() + "'";
            st.executeUpdate(query);
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(NewEditionRequest.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(NewEditionRequest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //opened login page method in menu.
    private void itemLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemLoginActionPerformed

        Login frame = new Login();
        this.dispose();
        frame.setVisible(true);
    }//GEN-LAST:event_itemLoginActionPerformed

    //opened main page method with user id in menu.
    private void itemMainPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMainPageActionPerformed

        Mainframe = new MainPage(id);
        this.dispose();
        Mainframe.setVisible(true);
    }//GEN-LAST:event_itemMainPageActionPerformed

    //opened book page method with user id in menu.
    private void itemBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBookActionPerformed

        Bookframe = new NewBookRequest(id);
        this.dispose();
        Bookframe.setVisible(true);
    }//GEN-LAST:event_itemBookActionPerformed

    //opened drawout money page method with user id in menu.
    private void itemMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMoneyActionPerformed

        Moneyframe = new DrawOutMoneyRequest(id);
        this.dispose();
        Moneyframe.setVisible(true);
    }//GEN-LAST:event_itemMoneyActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSend;
    private javax.swing.JCheckBox chcAccept;
    private javax.swing.JMenuItem itemBook;
    private javax.swing.JMenuItem itemLogin;
    private javax.swing.JMenuItem itemMainPage;
    private javax.swing.JMenuItem itemMoney;
    private javax.swing.JLabel lblChooseEditionNumber;
    private javax.swing.JLabel lblEnterBookName;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblWarning;
    private javax.swing.JMenuBar menuBarEditionPage;
    private javax.swing.JMenu menuEdition;
    private javax.swing.JPanel pnlEdition;
    private javax.swing.JSpinner spnEditionRequest;
    private javax.swing.JPopupMenu.Separator sprtEdition;
    private javax.swing.JTextField txtBookName;
    // End of variables declaration//GEN-END:variables
}
