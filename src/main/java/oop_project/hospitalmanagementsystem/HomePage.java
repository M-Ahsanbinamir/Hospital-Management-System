/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oop_project.hospitalmanagementsystem;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    public HomePage() {
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

        HomePagePanel = new javax.swing.JPanel();
        HomePageHeader = new javax.swing.JLabel();
        DoctorInfoIcon = new javax.swing.JLabel();
        PatientInfoIcon = new javax.swing.JLabel();
        DiagnosisIcon = new javax.swing.JLabel();
        StaffContactIcon = new javax.swing.JLabel();
        DoctorsInfoButton = new javax.swing.JButton();
        PatientInfoButton = new javax.swing.JButton();
        ContactButton = new javax.swing.JButton();
        PaymentButton = new javax.swing.JButton();
        HomePageFooter = new javax.swing.JLabel();
        ExitButton = new javax.swing.JButton();
        Logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home Page");
        setUndecorated(true);

        HomePagePanel.setBackground(new java.awt.Color(0, 0, 51));
        HomePagePanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        HomePageHeader.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\HospitalManagementSystem\\img\\HomePage Header.png")); // NOI18N

        DoctorInfoIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\HospitalManagementSystem\\img\\Doctor Logo.png")); // NOI18N

        PatientInfoIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\HospitalManagementSystem\\img\\Patient Logo.png")); // NOI18N

        DiagnosisIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\HospitalManagementSystem\\img\\Payment Information.png")); // NOI18N

        StaffContactIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\HospitalManagementSystem\\img\\Call Log Logo.png")); // NOI18N

        DoctorsInfoButton.setBackground(new java.awt.Color(153, 51, 255));
        DoctorsInfoButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        DoctorsInfoButton.setForeground(new java.awt.Color(0, 0, 51));
        DoctorsInfoButton.setText("Doctor's Info");
        DoctorsInfoButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DoctorsInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoctorsInfoButtonActionPerformed(evt);
            }
        });

        PatientInfoButton.setBackground(new java.awt.Color(153, 51, 255));
        PatientInfoButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        PatientInfoButton.setForeground(new java.awt.Color(0, 0, 51));
        PatientInfoButton.setText("Patient's Info");
        PatientInfoButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PatientInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientInfoButtonActionPerformed(evt);
            }
        });

        ContactButton.setBackground(new java.awt.Color(153, 51, 255));
        ContactButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        ContactButton.setForeground(new java.awt.Color(0, 0, 51));
        ContactButton.setText("Staff Contact");
        ContactButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ContactButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContactButtonActionPerformed(evt);
            }
        });

        PaymentButton.setBackground(new java.awt.Color(153, 51, 255));
        PaymentButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        PaymentButton.setForeground(new java.awt.Color(0, 0, 51));
        PaymentButton.setText("Payment");
        PaymentButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PaymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaymentButtonActionPerformed(evt);
            }
        });

        HomePageFooter.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\HospitalManagementSystem\\img\\HomePage Footer (2).png")); // NOI18N

        ExitButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ExitButton.setForeground(new java.awt.Color(153, 0, 204));
        ExitButton.setText("Exit");
        ExitButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        Logout.setBackground(new java.awt.Color(153, 0, 204));
        Logout.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Logout.setForeground(new java.awt.Color(255, 255, 255));
        Logout.setText("Log Out");
        Logout.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HomePagePanelLayout = new javax.swing.GroupLayout(HomePagePanel);
        HomePagePanel.setLayout(HomePagePanelLayout);
        HomePagePanelLayout.setHorizontalGroup(
            HomePagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HomePageHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(HomePagePanelLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(HomePagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DoctorsInfoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DoctorInfoIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(HomePagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PatientInfoIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PatientInfoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(HomePagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DiagnosisIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PaymentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(HomePagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ContactButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StaffContactIcon, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(74, 74, 74))
            .addGroup(HomePagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HomePageFooter, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(HomePagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ExitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Logout, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HomePagePanelLayout.setVerticalGroup(
            HomePagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePagePanelLayout.createSequentialGroup()
                .addComponent(HomePageHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(HomePagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(PatientInfoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DoctorsInfoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PaymentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ContactButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(HomePagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(DoctorInfoIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PatientInfoIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DiagnosisIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(StaffContactIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(HomePagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HomePagePanelLayout.createSequentialGroup()
                        .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(HomePageFooter, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HomePagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HomePagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PatientInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientInfoButtonActionPerformed
        // TODO add your handling code here:
        PatientsInformation scd = new PatientsInformation();
        scd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_PatientInfoButtonActionPerformed

    private void ContactButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContactButtonActionPerformed
        // TODO add your handling code here:
        StaffContact sc = new StaffContact();
        sc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ContactButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("EXIT");
        if (JOptionPane.showConfirmDialog(frame,"Confirm to Exit", "EXIT", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
        System.exit(0);
        }
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Logged Out Successfully", "My Output", JOptionPane.INFORMATION_MESSAGE);
        
        Login lg = new Login();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutActionPerformed

    private void DoctorsInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoctorsInfoButtonActionPerformed
        // TODO add your handling code here:
        DoctorInformation di = new DoctorInformation();
        di.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DoctorsInfoButtonActionPerformed

    private void PaymentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaymentButtonActionPerformed
        // TODO add your handling code here:
        PaymentInformation pie = new PaymentInformation();
        pie.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_PaymentButtonActionPerformed
    
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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ContactButton;
    private javax.swing.JLabel DiagnosisIcon;
    private javax.swing.JLabel DoctorInfoIcon;
    private javax.swing.JButton DoctorsInfoButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JLabel HomePageFooter;
    private javax.swing.JLabel HomePageHeader;
    private javax.swing.JPanel HomePagePanel;
    private javax.swing.JButton Logout;
    private javax.swing.JButton PatientInfoButton;
    private javax.swing.JLabel PatientInfoIcon;
    private javax.swing.JButton PaymentButton;
    private javax.swing.JLabel StaffContactIcon;
    // End of variables declaration//GEN-END:variables
}
