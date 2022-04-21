package com.mycompany.bp2proje;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 *
 * @author ayza
 */
public class MainPage extends javax.swing.JFrame {

    //defined models and variable.
    DefaultTableModel tblAuthorModel;
    DefaultTableModel tblBookModel;
    int id;

    public MainPage(int id) {
        initComponents();
        this.id = id;
        tblAuthorModel = new DefaultTableModel();
        tblBookModel = new DefaultTableModel();

        //set tables to models.
        tblAuthor.setModel(tblAuthorModel);
        tblBooks.setModel(tblBookModel);

        //set columns to models.
        tblAuthorModel.setColumnIdentifiers(new Object[]{"USER NAME", "AUTHOR NAME", "ID", "BALANCE", "PHONE NUMBER"});
        tblBookModel.setColumnIdentifiers(new Object[]{"BOOK NAME", "EDITION NUMBER", "CURRENT BALANCE", "ID", "SITUATION"});
        getAuthor();
        getBook();
    }
    //defined frames.
    NewBookRequest Bookframe;
    DrawOutMoneyRequest Moneyframe;
    NewEditionRequest Editionframe;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitMainPage = new javax.swing.JSplitPane();
        pnlTables = new javax.swing.JPanel();
        scrollPaneAuthor = new javax.swing.JScrollPane();
        tblAuthor = new javax.swing.JTable();
        scrollPaneBook = new javax.swing.JScrollPane();
        tblBooks = new javax.swing.JTable();
        pnlButtons = new javax.swing.JPanel();
        btnEditionRequest = new javax.swing.JButton();
        btnBookRequest = new javax.swing.JButton();
        btnDrawOutRequest = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnDeleteBook = new javax.swing.JButton();
        menuBarShortCut = new javax.swing.JMenuBar();
        menuMain = new javax.swing.JMenu();
        itemLogin = new javax.swing.JMenuItem();
        sprtMain = new javax.swing.JPopupMenu.Separator();
        itemEdition = new javax.swing.JMenuItem();
        itemBook = new javax.swing.JMenuItem();
        itemMoney = new javax.swing.JMenuItem();
        sprtMain2 = new javax.swing.JPopupMenu.Separator();
        itemrdbColor = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        pnlTables.setBackground(new java.awt.Color(255, 153, 153));
        pnlTables.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Author Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        pnlTables.setMinimumSize(new java.awt.Dimension(450, 60));
        pnlTables.setPreferredSize(new java.awt.Dimension(450, 60));

        tblAuthor.setBackground(new java.awt.Color(255, 255, 255));
        tblAuthor.setForeground(new java.awt.Color(0, 0, 0));
        tblAuthor.setSelectionForeground(new java.awt.Color(255, 153, 153));
        scrollPaneAuthor.setViewportView(tblAuthor);

        tblBooks.setBackground(new java.awt.Color(255, 255, 255));
        tblBooks.setForeground(new java.awt.Color(0, 0, 0));
        scrollPaneBook.setViewportView(tblBooks);

        javax.swing.GroupLayout pnlTablesLayout = new javax.swing.GroupLayout(pnlTables);
        pnlTables.setLayout(pnlTablesLayout);
        pnlTablesLayout.setHorizontalGroup(
            pnlTablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTablesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                    .addComponent(scrollPaneBook, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlTablesLayout.setVerticalGroup(
            pnlTablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTablesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPaneAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollPaneBook, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        splitMainPage.setLeftComponent(pnlTables);

        pnlButtons.setBackground(new java.awt.Color(255, 102, 102));
        pnlButtons.setMinimumSize(new java.awt.Dimension(100, 300));

        btnEditionRequest.setText("New Edition Request");
        btnEditionRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditionRequestActionPerformed(evt);
            }
        });

        btnBookRequest.setText("New Book Request");
        btnBookRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookRequestActionPerformed(evt);
            }
        });

        btnDrawOutRequest.setText("Drawout Money Request");
        btnDrawOutRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrawOutRequestActionPerformed(evt);
            }
        });

        btnClose.setBackground(new java.awt.Color(153, 0, 0));
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnDeleteBook.setBackground(new java.awt.Color(51, 51, 51));
        btnDeleteBook.setText("Delete Book");
        btnDeleteBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteBookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlButtonsLayout = new javax.swing.GroupLayout(pnlButtons);
        pnlButtons.setLayout(pnlButtonsLayout);
        pnlButtonsLayout.setHorizontalGroup(
            pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButtonsLayout.createSequentialGroup()
                .addGroup(pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlButtonsLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEditionRequest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBookRequest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDrawOutRequest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnlButtonsLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(5, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlButtonsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnDeleteBook, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        pnlButtonsLayout.setVerticalGroup(
            pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButtonsLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnEditionRequest)
                .addGap(29, 29, 29)
                .addComponent(btnBookRequest)
                .addGap(26, 26, 26)
                .addComponent(btnDrawOutRequest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(btnDeleteBook)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClose))
                .addGap(29, 29, 29))
        );

        splitMainPage.setRightComponent(pnlButtons);

        getContentPane().add(splitMainPage);

        menuBarShortCut.setBackground(new java.awt.Color(0, 0, 0));

        menuMain.setText("ShortCut");

        itemLogin.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemLogin.setText("Login Page");
        itemLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemLoginActionPerformed(evt);
            }
        });
        menuMain.add(itemLogin);
        menuMain.add(sprtMain);

        itemEdition.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemEdition.setText("New Edition Request Page");
        itemEdition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEditionActionPerformed(evt);
            }
        });
        menuMain.add(itemEdition);

        itemBook.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemBook.setText("New Book Request Page");
        itemBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBookActionPerformed(evt);
            }
        });
        menuMain.add(itemBook);

        itemMoney.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemMoney.setText("Drawout Money Request Page");
        itemMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMoneyActionPerformed(evt);
            }
        });
        menuMain.add(itemMoney);
        menuMain.add(sprtMain2);

        itemrdbColor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        itemrdbColor.setText("Change Color");
        itemrdbColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemrdbColorActionPerformed(evt);
            }
        });
        menuMain.add(itemrdbColor);

        menuBarShortCut.add(menuMain);

        setJMenuBar(menuBarShortCut);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //closed project.
    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    //opened edition page method with user id.
    private void btnEditionRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditionRequestActionPerformed

        Editionframe = new NewEditionRequest(id);
        this.dispose();
        Editionframe.setVisible(true);
    }//GEN-LAST:event_btnEditionRequestActionPerformed
    //opened book page method with user id.
    private void btnBookRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookRequestActionPerformed

        Bookframe = new NewBookRequest(id);
        this.dispose();
        Bookframe.setVisible(true);
    }//GEN-LAST:event_btnBookRequestActionPerformed

    //added row datas to author table. 
    public boolean getAuthor() {

        tblAuthorModel.setRowCount(0);
        boolean rvalue = false;
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/YayincilikDB", "sa", "as");
            Statement st = conn.createStatement();
            String query = "SELECT * FROM YAZARBILGILERI WHERE ID=" + id;
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                String userName = rs.getString("KULLANICIADI");
                String name = rs.getString("YAZARADI");
                int id = rs.getInt("ID");
                int balance = rs.getInt("BAKIYE");
                String phoneNo = rs.getString("PHONENUMBER");
                tblAuthorModel.addRow(new Object[]{userName, name, id, balance, phoneNo});
            }
            conn.close();
            rvalue = true;
        } catch (SQLException ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rvalue;

    }

    //added row datas to book table. 
    public boolean getBook() {

        tblBookModel.setRowCount(0);
        boolean rvalue = false;
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/YayincilikDB", "sa", "as");
            Statement st = conn.createStatement();
            String query = "SELECT * FROM KITAPBILGILERI WHERE ID =" + id;
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                String bookName = rs.getString("KITAPADI");
                int editionNumber = rs.getInt("BASIMSAYISI");
                double currentGain = rs.getDouble("GUNCELKAZANC");
                int id = rs.getInt("ID");
                String productSituation = rs.getString("SITUATION");
                tblBookModel.addRow(new Object[]{bookName, editionNumber, currentGain, id, productSituation});
            }
            conn.close();
            rvalue = true;
        } catch (SQLException ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rvalue;

    }

    //opened drawout money page method with user id.
    private void btnDrawOutRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDrawOutRequestActionPerformed

        Moneyframe = new DrawOutMoneyRequest(id);
        this.dispose();
        Moneyframe.setVisible(true);
    }//GEN-LAST:event_btnDrawOutRequestActionPerformed
    //turned login page method.
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        Login frame = new Login();
        this.dispose();
        frame.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed
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

    //changed color method in menu.(if is selected)
    private void itemrdbColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemrdbColorActionPerformed

        if (itemrdbColor.isSelected()) {
            pnlTables.setBackground(Color.MAGENTA);
        } else {
            pnlTables.setBackground(new java.awt.Color(255, 153, 153));
        }
    }//GEN-LAST:event_itemrdbColorActionPerformed

    //delete book method.
    public boolean delete(String bookName) {

        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/YayincilikDB", "sa", "as");
            Statement st = conn.createStatement();
            String query = "DELETE FROM KITAPBILGILERI WHERE ID=" + id + "AND KITAPADI='" + bookName + "'";
            st.executeUpdate(query);
            conn.close();
            JOptionPane.showMessageDialog(rootPane, "Delete success!");
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    // selected a row, got value and called delete method deleted that value.
    private void btnDeleteBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteBookActionPerformed

        int row = tblBooks.getSelectedRow();
        String bookName = (String) tblBooks.getValueAt(row, 0);
        delete(bookName);
        getBook();
    }//GEN-LAST:event_btnDeleteBookActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBookRequest;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDeleteBook;
    private javax.swing.JButton btnDrawOutRequest;
    private javax.swing.JButton btnEditionRequest;
    private javax.swing.JMenuItem itemBook;
    private javax.swing.JMenuItem itemEdition;
    private javax.swing.JMenuItem itemLogin;
    private javax.swing.JMenuItem itemMoney;
    private javax.swing.JRadioButtonMenuItem itemrdbColor;
    private javax.swing.JMenuBar menuBarShortCut;
    private javax.swing.JMenu menuMain;
    private javax.swing.JPanel pnlButtons;
    private javax.swing.JPanel pnlTables;
    private javax.swing.JScrollPane scrollPaneAuthor;
    private javax.swing.JScrollPane scrollPaneBook;
    private javax.swing.JSplitPane splitMainPage;
    private javax.swing.JPopupMenu.Separator sprtMain;
    private javax.swing.JPopupMenu.Separator sprtMain2;
    private javax.swing.JTable tblAuthor;
    private javax.swing.JTable tblBooks;
    // End of variables declaration//GEN-END:variables
}
