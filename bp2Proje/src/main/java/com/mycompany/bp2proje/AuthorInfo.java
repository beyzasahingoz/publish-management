package com.mycompany.bp2proje;

import javax.swing.JOptionPane;

/**
 *
 * @author ayza
 */
public class AuthorInfo extends javax.swing.JFrame {
    
    public AuthorInfo() {
        initComponents();
        txtAreaFalconeye.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        tabbedPaneAuthorInfo = new javax.swing.JTabbedPane();
        scrollAuthors = new javax.swing.JScrollPane();
        lstAuthors = new javax.swing.JList<>();
        pnlAboutFalconeye = new javax.swing.JPanel();
        pnlAbout = new javax.swing.JPanel();
        scrollAbout = new javax.swing.JScrollPane();
        txtAreaFalconeye = new javax.swing.JTextArea();
        rdbYes = new javax.swing.JRadioButton();
        rdbNo = new javax.swing.JRadioButton();
        lblQuestion = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        tabbedPaneAuthorInfo.setBackground(new java.awt.Color(0, 0, 0));

        lstAuthors.setBackground(new java.awt.Color(255, 102, 102));
        lstAuthors.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 24)); // NOI18N
        lstAuthors.setForeground(new java.awt.Color(0, 0, 0));
        lstAuthors.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Ali Atahan", "Eylul Gonen", "Selin Yilmaz" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstAuthors.setSelectionBackground(new java.awt.Color(102, 0, 0));
        lstAuthors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstAuthorsMouseClicked(evt);
            }
        });
        scrollAuthors.setViewportView(lstAuthors);

        tabbedPaneAuthorInfo.addTab("Authors", scrollAuthors);

        pnlAbout.setBackground(new java.awt.Color(255, 102, 102));

        txtAreaFalconeye.setColumns(20);
        txtAreaFalconeye.setForeground(new java.awt.Color(0, 0, 0));
        txtAreaFalconeye.setLineWrap(true);
        txtAreaFalconeye.setRows(5);
        txtAreaFalconeye.setText("Former journalist and book lover Ahmet Tevfik moldy opened\nFalconeye publishing house on Sakarya Street in 1956.\nFor over half a century of time. \nIt is considered one of the symbols of Ankara and \nthe period frequented by bureaucrats,writers, artists.\nFalconeye Publishing was founded by the Publishers\nAssociation in April 1994. It was named\n\"Bookstore of the year\". \nFalconeye publishing house, which published nearly 4000books\nin half a century. Falconeye publishing house \nwith the participation of its employees in 2009.\nPrinting and distribution bookstore and stationery A.P.\n\"institutionalized by name.\n\nCompetent editorial board members, expert employees and\nvaluable the “Falconeye family” of authors literature and \nculture it offers services in the field.");
        scrollAbout.setViewportView(txtAreaFalconeye);

        buttonGroup1.add(rdbYes);
        rdbYes.setForeground(new java.awt.Color(0, 0, 0));
        rdbYes.setText("Yes");
        rdbYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbYesActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdbNo);
        rdbNo.setForeground(new java.awt.Color(0, 0, 0));
        rdbNo.setText("No");
        rdbNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbNoActionPerformed(evt);
            }
        });

        lblQuestion.setForeground(new java.awt.Color(0, 0, 0));
        lblQuestion.setText("Are you satisfied with the information?");

        javax.swing.GroupLayout pnlAboutLayout = new javax.swing.GroupLayout(pnlAbout);
        pnlAbout.setLayout(pnlAboutLayout);
        pnlAboutLayout.setHorizontalGroup(
            pnlAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAboutLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(pnlAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAboutLayout.createSequentialGroup()
                        .addGroup(pnlAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblQuestion)
                            .addGroup(pnlAboutLayout.createSequentialGroup()
                                .addComponent(rdbYes, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(rdbNo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAboutLayout.createSequentialGroup()
                        .addComponent(scrollAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );
        pnlAboutLayout.setVerticalGroup(
            pnlAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAboutLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(scrollAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblQuestion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbNo)
                    .addComponent(rdbYes))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlAboutFalconeyeLayout = new javax.swing.GroupLayout(pnlAboutFalconeye);
        pnlAboutFalconeye.setLayout(pnlAboutFalconeyeLayout);
        pnlAboutFalconeyeLayout.setHorizontalGroup(
            pnlAboutFalconeyeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAbout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnlAboutFalconeyeLayout.setVerticalGroup(
            pnlAboutFalconeyeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAbout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        tabbedPaneAuthorInfo.addTab("About", pnlAboutFalconeye);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPaneAuthorInfo)
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(btnBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabbedPaneAuthorInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //showed message if it was selected.
    private void rdbYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbYesActionPerformed
        
        if (rdbYes.isSelected()) {
            JOptionPane.showMessageDialog(rootPane, "Thank you for participating in our survey!");
        }
    }//GEN-LAST:event_rdbYesActionPerformed

    //showed message if it was selected.
    private void rdbNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbNoActionPerformed
        
        if (rdbNo.isSelected()) {
            JOptionPane.showMessageDialog(rootPane, "Thank you for participating in our survey!");
        }
    }//GEN-LAST:event_rdbNoActionPerformed

    //turned the page that before this page.
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        
        Login frame = new Login();
        this.dispose();
        frame.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    //information about the selected author was given
    private void lstAuthorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstAuthorsMouseClicked
        // TODO add your handling code here:
        if (lstAuthors.getSelectedValue().toString().equals("Ali Atahan")) {
            JOptionPane.showMessageDialog(rootPane, "Ali Atahan has thirteen novels,two of them published by Falconeye.\nHe won the Costa Novel of the Year Award and the Prix du Livre Européen.\nHe is also the author of a biography of B.S Johnson and The Broken Mirror, a children's book.");
        }
        if (lstAuthors.getSelectedValue().toString().equals("Eylul Gonen")) {
            JOptionPane.showMessageDialog(rootPane, "Eylul Gonen began her career at Elle magazine.\nShe has since written for Harper's Bazaar and international editions of Vogue.\nShe is the author of the #1 Amazon bestseller 2020 Astrology:\n Your Five Year Horoscope Guide.\n Eylul lives between Australia and the UK.");
        }
        if (lstAuthors.getSelectedValue().toString().equals("Selin Yilmaz")) {
            JOptionPane.showMessageDialog(rootPane, "Selin Yilmaz is the award-winning Sunday Times bestseller.\nShe has worked in Italy for much of her life.\nIt has been the inspiration for many of her books.");
        }
        

    }//GEN-LAST:event_lstAuthorsMouseClicked

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
            java.util.logging.Logger.getLogger(AuthorInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AuthorInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AuthorInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AuthorInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AuthorInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel lblQuestion;
    private javax.swing.JList<String> lstAuthors;
    private javax.swing.JPanel pnlAbout;
    private javax.swing.JPanel pnlAboutFalconeye;
    private javax.swing.JRadioButton rdbNo;
    private javax.swing.JRadioButton rdbYes;
    private javax.swing.JScrollPane scrollAbout;
    private javax.swing.JScrollPane scrollAuthors;
    private javax.swing.JTabbedPane tabbedPaneAuthorInfo;
    private javax.swing.JTextArea txtAreaFalconeye;
    // End of variables declaration//GEN-END:variables
}
