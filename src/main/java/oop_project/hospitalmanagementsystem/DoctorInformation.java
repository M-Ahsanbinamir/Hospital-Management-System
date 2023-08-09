/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oop_project.hospitalmanagementsystem;

import java.awt.*;
import java.io.*;
import java.nio.file.*;
import javax.swing.*;

/**
 *
 * @author hp
 */
public class DoctorInformation extends javax.swing.JFrame {

    /**
     * Creates new form DoctorInformation
     */
    public DoctorInformation() {
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

        DocInfoHeaderPanel = new javax.swing.JPanel();
        DocInfoHeader = new javax.swing.JLabel();
        DocInfoMainPanel = new javax.swing.JPanel();
        DocNameText = new javax.swing.JLabel();
        DocIDText = new javax.swing.JLabel();
        DocQualificationText = new javax.swing.JLabel();
        DocExperienceText = new javax.swing.JLabel();
        DocNameField = new javax.swing.JTextField();
        DocExperienceField = new javax.swing.JTextField();
        DocQualificationField = new javax.swing.JTextField();
        DocClearButton = new javax.swing.JButton();
        DocAddButton = new javax.swing.JButton();
        DocRecord = new javax.swing.JLabel();
        DocHomeButton = new javax.swing.JButton();
        DocIDField = new javax.swing.JTextField();
        DocDisplayButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        RecDisplay = new javax.swing.JTextArea();
        DocDeleteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Doctor's Information");
        setUndecorated(true);

        javax.swing.GroupLayout DocInfoHeaderPanelLayout = new javax.swing.GroupLayout(DocInfoHeaderPanel);
        DocInfoHeaderPanel.setLayout(DocInfoHeaderPanelLayout);
        DocInfoHeaderPanelLayout.setHorizontalGroup(
            DocInfoHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DocInfoHeader, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 961, Short.MAX_VALUE)
        );
        DocInfoHeaderPanelLayout.setVerticalGroup(
            DocInfoHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DocInfoHeaderPanelLayout.createSequentialGroup()
                .addComponent(DocInfoHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        DocInfoMainPanel.setBackground(new java.awt.Color(255, 255, 255));

        DocNameText.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        DocNameText.setForeground(new java.awt.Color(0, 102, 204));
        DocNameText.setText("Doctor's Name:");

        DocIDText.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        DocIDText.setForeground(new java.awt.Color(0, 102, 204));
        DocIDText.setText("Doctor's ID:");

        DocQualificationText.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        DocQualificationText.setForeground(new java.awt.Color(0, 102, 204));
        DocQualificationText.setText("Qualification:");

        DocExperienceText.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        DocExperienceText.setForeground(new java.awt.Color(0, 102, 204));
        DocExperienceText.setText("Experience:");

        DocNameField.setBackground(new java.awt.Color(0, 102, 204));
        DocNameField.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        DocNameField.setForeground(new java.awt.Color(255, 255, 255));

        DocExperienceField.setBackground(new java.awt.Color(0, 102, 204));
        DocExperienceField.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        DocExperienceField.setForeground(new java.awt.Color(255, 255, 255));

        DocQualificationField.setBackground(new java.awt.Color(0, 102, 204));
        DocQualificationField.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        DocQualificationField.setForeground(new java.awt.Color(255, 255, 255));

        DocClearButton.setBackground(new java.awt.Color(0, 51, 255));
        DocClearButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        DocClearButton.setForeground(new java.awt.Color(255, 255, 255));
        DocClearButton.setText("CLEAR");
        DocClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocClearButtonActionPerformed(evt);
            }
        });

        DocAddButton.setBackground(new java.awt.Color(0, 51, 255));
        DocAddButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        DocAddButton.setForeground(new java.awt.Color(255, 255, 255));
        DocAddButton.setText("ADD");
        DocAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocAddButtonActionPerformed(evt);
            }
        });

        DocRecord.setBorder(new javax.swing.border.MatteBorder(null));

        DocHomeButton.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        DocHomeButton.setForeground(new java.awt.Color(0, 51, 255));
        DocHomeButton.setText("HOME");
        DocHomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocHomeButtonActionPerformed(evt);
            }
        });

        DocIDField.setBackground(new java.awt.Color(0, 102, 204));
        DocIDField.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        DocIDField.setForeground(new java.awt.Color(255, 255, 255));
        DocIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocIDFieldActionPerformed(evt);
            }
        });

        DocDisplayButton.setBackground(new java.awt.Color(0, 51, 255));
        DocDisplayButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        DocDisplayButton.setForeground(new java.awt.Color(255, 255, 255));
        DocDisplayButton.setText("DISPLAY");
        DocDisplayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocDisplayButtonActionPerformed(evt);
            }
        });

        RecDisplay.setBackground(new java.awt.Color(0, 0, 255));
        RecDisplay.setColumns(20);
        RecDisplay.setForeground(new java.awt.Color(255, 255, 255));
        RecDisplay.setRows(5);
        jScrollPane1.setViewportView(RecDisplay);

        DocDeleteButton.setBackground(new java.awt.Color(0, 51, 255));
        DocDeleteButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        DocDeleteButton.setForeground(new java.awt.Color(255, 255, 255));
        DocDeleteButton.setText("DELETE");
        DocDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocDeleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DocInfoMainPanelLayout = new javax.swing.GroupLayout(DocInfoMainPanel);
        DocInfoMainPanel.setLayout(DocInfoMainPanelLayout);
        DocInfoMainPanelLayout.setHorizontalGroup(
            DocInfoMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DocInfoMainPanelLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(DocInfoMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DocInfoMainPanelLayout.createSequentialGroup()
                        .addComponent(DocNameText)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DocInfoMainPanelLayout.createSequentialGroup()
                        .addComponent(DocIDText)
                        .addGap(34, 34, 34)))
                .addGroup(DocInfoMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DocIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DocNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(DocInfoMainPanelLayout.createSequentialGroup()
                        .addComponent(DocAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DocDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(DocInfoMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(DocInfoMainPanelLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(DocDisplayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(DocClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(DocInfoMainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(DocInfoMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(DocInfoMainPanelLayout.createSequentialGroup()
                                .addComponent(DocQualificationText)
                                .addGap(18, 18, 18)
                                .addComponent(DocQualificationField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(DocInfoMainPanelLayout.createSequentialGroup()
                                .addComponent(DocExperienceText)
                                .addGap(18, 18, 18)
                                .addComponent(DocExperienceField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(90, 90, 90))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DocInfoMainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DocHomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(401, 401, 401))
            .addGroup(DocInfoMainPanelLayout.createSequentialGroup()
                .addComponent(DocRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 973, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(DocInfoMainPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        DocInfoMainPanelLayout.setVerticalGroup(
            DocInfoMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DocInfoMainPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(DocInfoMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DocQualificationText)
                    .addComponent(DocQualificationField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DocIDText)
                    .addComponent(DocIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DocInfoMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DocNameText)
                    .addComponent(DocNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DocExperienceText)
                    .addComponent(DocExperienceField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DocInfoMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DocClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DocAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DocDisplayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DocDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DocRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DocHomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DocInfoHeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(DocInfoMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 961, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(DocInfoHeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(DocInfoMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    private void DocAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocAddButtonActionPerformed
        // TODO add your handling code here:
        String id, dname, dq, dexp;
        id = DocIDField.getText();
        dname = DocNameField.getText();
        dq = DocQualificationField.getText();
        dexp = DocExperienceField.getText();

        try (FileWriter Writer = new FileWriter(id+".txt", true)) {
            Writer.write("******  Doctor's Information  *****");
            Writer.write(System.lineSeparator());
            Writer.write(System.lineSeparator());
            Writer.write(">> ID: "+id);
            Writer.write(System.lineSeparator());
            Writer.write(">> Name: "+dname);
            Writer.write(System.lineSeparator());
            Writer.write(">> Qualification: "+dq);
            Writer.write(System.lineSeparator());
            Writer.write(">> Experience: "+dexp);

            JOptionPane.showMessageDialog(null, "Successful");
            setVisible(false);
            new DoctorInformation().setVisible(true);

        }catch(HeadlessException | IOException e){
            JOptionPane.showMessageDialog(null, "Error 404 !!!");
        }
    }//GEN-LAST:event_DocAddButtonActionPerformed

    private void DocHomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocHomeButtonActionPerformed
        // TODO add your handling code here:
        HomePage ho = new HomePage();
        ho.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DocHomeButtonActionPerformed

    private void DocClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocClearButtonActionPerformed
        // TODO add your handling code here:
        DocIDField.setText(null);
        DocNameField.setText(null);
        DocQualificationField.setText(null);
        DocExperienceField.setText(null);
    }//GEN-LAST:event_DocClearButtonActionPerformed

    private void DocDisplayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocDisplayButtonActionPerformed
        try {
            // TODO add your handling code here:
            String q = DocIDField.getText();
            Path show = Path.of(q+".txt");
            String textString = Files.readString(show);
            RecDisplay.setText(textString);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error 202 : Read Error !!!");
        }
        
    }//GEN-LAST:event_DocDisplayButtonActionPerformed

    private void DocDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocDeleteButtonActionPerformed
        // TODO add your handling code here:
        String w = DocIDField.getText();
        File file = new File(w+".txt");
        file.delete();
        JOptionPane.showMessageDialog(null, "Record Deleted Successfully");
    }//GEN-LAST:event_DocDeleteButtonActionPerformed

    private void DocIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocIDFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DocIDFieldActionPerformed

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
            java.util.logging.Logger.getLogger(DoctorInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorInformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DocAddButton;
    private javax.swing.JButton DocClearButton;
    private javax.swing.JButton DocDeleteButton;
    private javax.swing.JButton DocDisplayButton;
    private javax.swing.JTextField DocExperienceField;
    private javax.swing.JLabel DocExperienceText;
    private javax.swing.JButton DocHomeButton;
    private javax.swing.JTextField DocIDField;
    private javax.swing.JLabel DocIDText;
    private javax.swing.JLabel DocInfoHeader;
    private javax.swing.JPanel DocInfoHeaderPanel;
    private javax.swing.JPanel DocInfoMainPanel;
    private javax.swing.JTextField DocNameField;
    private javax.swing.JLabel DocNameText;
    private javax.swing.JTextField DocQualificationField;
    private javax.swing.JLabel DocQualificationText;
    private javax.swing.JLabel DocRecord;
    private javax.swing.JTextArea RecDisplay;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}