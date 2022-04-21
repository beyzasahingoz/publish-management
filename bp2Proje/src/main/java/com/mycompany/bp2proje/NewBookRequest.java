package com.mycompany.bp2proje;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class NewBookRequest extends javax.swing.JFrame {

    //defined variables.
    int id;
    File ff;
    FileReader fff = null;

    public NewBookRequest(int id) {
        initComponents();
        this.id = id;
    }

    //defined frames.
    MainPage Mainframe;
    DrawOutMoneyRequest Moneyframe;
    NewEditionRequest Editionframe;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBookPage = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblSendPDF = new javax.swing.JLabel();
        btnUpload = new javax.swing.JButton();
        lblUploadTask = new javax.swing.JLabel();
        scrollTask = new javax.swing.JScrollPane();
        txtAreaBookTask = new javax.swing.JTextArea();
        lblBookName = new javax.swing.JLabel();
        txtBookName = new javax.swing.JTextField();
        lblEx = new javax.swing.JLabel();
        btnSend = new javax.swing.JButton();
        menuBarBookPage = new javax.swing.JMenuBar();
        menuBookPage = new javax.swing.JMenu();
        itemLogin = new javax.swing.JMenuItem();
        sprtBookPage = new javax.swing.JPopupMenu.Separator();
        itemMainPage = new javax.swing.JMenuItem();
        itemEdition = new javax.swing.JMenuItem();
        itemMoney = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        pnlBookPage.setBackground(new java.awt.Color(255, 102, 102));
        pnlBookPage.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "New Book Request", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 0, 0));
        lblTitle.setText("NEW BOOK REQUEST");

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(0, 0, 0));
        lblEmail.setText("falconeyepublishinghome@gmail.com");
        lblEmail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "mail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblSendPDF.setForeground(new java.awt.Color(0, 0, 0));
        lblSendPDF.setText("send your book Draft to the e-mail address in pdf form.");

        btnUpload.setText("Open File");
        btnUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadActionPerformed(evt);
            }
        });

        lblUploadTask.setForeground(new java.awt.Color(0, 0, 0));
        lblUploadTask.setText("If you are going to upload from this screen, upload your draft as a text document (txt)");

        txtAreaBookTask.setColumns(20);
        txtAreaBookTask.setRows(5);
        scrollTask.setViewportView(txtAreaBookTask);

        lblBookName.setForeground(new java.awt.Color(0, 0, 0));
        lblBookName.setText("Enter Book Name");

        btnSend.setBackground(new java.awt.Color(0, 102, 0));
        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBookPageLayout = new javax.swing.GroupLayout(pnlBookPage);
        pnlBookPage.setLayout(pnlBookPageLayout);
        pnlBookPageLayout.setHorizontalGroup(
            pnlBookPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBookPageLayout.createSequentialGroup()
                .addGroup(pnlBookPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBookPageLayout.createSequentialGroup()
                        .addGap(0, 7, Short.MAX_VALUE)
                        .addComponent(lblUploadTask))
                    .addGroup(pnlBookPageLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scrollTask))
                    .addGroup(pnlBookPageLayout.createSequentialGroup()
                        .addGroup(pnlBookPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlBookPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnlBookPageLayout.createSequentialGroup()
                                    .addGap(109, 109, 109)
                                    .addComponent(lblTitle))
                                .addGroup(pnlBookPageLayout.createSequentialGroup()
                                    .addGap(127, 127, 127)
                                    .addComponent(btnUpload, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnSend))
                                .addGroup(pnlBookPageLayout.createSequentialGroup()
                                    .addGap(97, 97, 97)
                                    .addGroup(pnlBookPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblEx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(pnlBookPageLayout.createSequentialGroup()
                                            .addComponent(lblBookName)
                                            .addGap(40, 40, 40)
                                            .addComponent(txtBookName, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(pnlBookPageLayout.createSequentialGroup()
                                    .addGap(61, 61, 61)
                                    .addComponent(lblSendPDF))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBookPageLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(33, 33, 33))
        );
        pnlBookPageLayout.setVerticalGroup(
            pnlBookPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBookPageLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(lblEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSendPDF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlBookPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBookName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBookName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(lblEx, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUploadTask)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollTask, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlBookPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpload)
                    .addComponent(btnSend))
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        getContentPane().add(pnlBookPage);

        menuBarBookPage.setBackground(new java.awt.Color(0, 0, 0));

        menuBookPage.setText("ShortCut");

        itemLogin.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemLogin.setText("Login Page");
        itemLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemLoginActionPerformed(evt);
            }
        });
        menuBookPage.add(itemLogin);
        menuBookPage.add(sprtBookPage);

        itemMainPage.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemMainPage.setText("Main Page");
        itemMainPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMainPageActionPerformed(evt);
            }
        });
        menuBookPage.add(itemMainPage);

        itemEdition.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemEdition.setText("New Edition Page");
        itemEdition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEditionActionPerformed(evt);
            }
        });
        menuBookPage.add(itemEdition);

        itemMoney.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemMoney.setText("DrawOut Money Page");
        itemMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMoneyActionPerformed(evt);
            }
        });
        menuBookPage.add(itemMoney);

        menuBarBookPage.add(menuBookPage);

        setJMenuBar(menuBarBookPage);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //opened main page method with user id.
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        Mainframe = new MainPage(id);
        this.dispose();
        Mainframe.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    //got file with filechooser and showed text area.
    private void btnUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadActionPerformed

        JFileChooser file = new JFileChooser();
        int btn = file.showOpenDialog(null);
        if (btn == JFileChooser.APPROVE_OPTION) {
            try {
                ff = file.getSelectedFile();
                txtAreaBookTask.setText(ff.getAbsolutePath());
                System.out.println(ff);
                JOptionPane.showMessageDialog(rootPane, "File Name: " + ff.getName());
                fff = new FileReader(ff);
                txtAreaBookTask.read(fff, "");
            } catch (Exception ex) {
                Logger.getLogger(NewBookRequest.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    fff.close();
                } catch (IOException ex) {
                    Logger.getLogger(NewBookRequest.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

    }//GEN-LAST:event_btnUploadActionPerformed
    }

    //inserted book to table.
    public boolean InsertBook(String bookName, int editionNumber, double currentGain, String productSituation) throws SQLException {

        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/YayincilikDB", "sa", "as");
            Statement st = conn.createStatement();
            String query = "SELECT COUNT(*) FROM KITAPBILGILERI";
            ResultSet rs = st.executeQuery(query);
            query = "INSERT INTO KITAPBILGILERI VALUES('" + bookName + "'," + editionNumber + "," + currentGain + "," + id + ",'" + productSituation + "')";
            st.executeUpdate(query);
            conn.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(NewBookRequest.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(NewBookRequest.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    //opened main page method with user id in menu.
    private void itemMainPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMainPageActionPerformed

        Mainframe = new MainPage(id);
        this.dispose();
        Mainframe.setVisible(true);
    }//GEN-LAST:event_itemMainPageActionPerformed

    //opened edition page method with user id in menu.
    private void itemEditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditionActionPerformed

        Editionframe = new NewEditionRequest(id);
        this.dispose();
        Editionframe.setVisible(true);
    }//GEN-LAST:event_itemEditionActionPerformed

    //opened login page method in menu.
    private void itemLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemLoginActionPerformed

        Login frame = new Login();
        this.dispose();
        frame.setVisible(true);
    }//GEN-LAST:event_itemLoginActionPerformed

    //opened drawout page method with user id in menu.
    private void itemMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMoneyActionPerformed

        // TODO add your handling code here:
        Moneyframe = new DrawOutMoneyRequest(id);
        this.dispose();
        Moneyframe.setVisible(true);
    }//GEN-LAST:event_itemMoneyActionPerformed

    //checks were made and the draft was sent if there were no errors.
    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed

        String bookName = txtBookName.getText();
        String productSituation = "in review";
        Matcher matcher;
        if (txtBookName.getText().isEmpty()) {
            lblEx.setText("Book Name Must Not Be Empty");
            lblEx.setVisible(true);
            return;
        } else {
            matcher = Pattern.compile("^[A-Za-z0-9]+$").matcher(txtBookName.getText());
            if (!matcher.find()) {
                lblEx.setText("Book Name Must Not Be Punctuation Mark");
                lblEx.setVisible(true);
                return;
            } else {
                lblEx.setVisible(false);
            }
        }
        if (txtAreaBookTask.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Task Must Not Be Empty!!");
        } else {
            try {
                JOptionPane.showMessageDialog(rootPane, "Draft sent!");
                InsertBook(bookName, 100, 0, productSituation);
            } catch (SQLException ex) {
                Logger.getLogger(NewBookRequest.class.getName()).log(Level.SEVERE, null, ex);
            }
            Mainframe = new MainPage(id);
            this.dispose();
            Mainframe.setVisible(true);
        }

    }//GEN-LAST:event_btnSendActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnUpload;
    private javax.swing.JMenuItem itemEdition;
    private javax.swing.JMenuItem itemLogin;
    private javax.swing.JMenuItem itemMainPage;
    private javax.swing.JMenuItem itemMoney;
    private javax.swing.JLabel lblBookName;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEx;
    private javax.swing.JLabel lblSendPDF;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUploadTask;
    private javax.swing.JMenuBar menuBarBookPage;
    private javax.swing.JMenu menuBookPage;
    private javax.swing.JPanel pnlBookPage;
    private javax.swing.JScrollPane scrollTask;
    private javax.swing.JPopupMenu.Separator sprtBookPage;
    private javax.swing.JTextArea txtAreaBookTask;
    private javax.swing.JTextField txtBookName;
    // End of variables declaration//GEN-END:variables
}
