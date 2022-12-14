/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ui.Doctor;

import Model.DoctorDirectory;
import Model.EncounterDirectory;
import Model.HospitalDirectory;
import Model.PatientDirectory;
import Model.Person;
import Model.PersonDirectory;
import Model.VitalSignsDirectory;
import Ui.Mainframe.MainJFram;
import Ui.Patient.PatientCreateJPanel;
import java.util.ArrayList;

/**
 *
 * @author risha
 */
public class DoctorJFrame extends javax.swing.JFrame {

    /**
     * Creates new form DoctorJFrame
     */
    PersonDirectory persondirectory;
    DoctorDirectory doctordirectory;
    PatientDirectory patientdirectory;
    HospitalDirectory hospitaldirectory;
    String DID;
    EncounterDirectory encounterdirectory;
    VitalSignsDirectory vitalsdirectory;
    public DoctorJFrame(PersonDirectory persondirectory,HospitalDirectory hospitaldirectory,String DID,DoctorDirectory doctordirectory,PatientDirectory patientdirectory,EncounterDirectory encounterdirectory,VitalSignsDirectory vitalsdirectory) 
    {
        initComponents();
        this.persondirectory = persondirectory;
        this.doctordirectory = doctordirectory;
        this.patientdirectory = patientdirectory;
        this.hospitaldirectory = hospitaldirectory;
        this.DID = DID;
        this.encounterdirectory = encounterdirectory;
        this.vitalsdirectory = vitalsdirectory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        CreatBtn = new javax.swing.JButton();
        ViewBtn = new javax.swing.JButton();
        LogOutBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CreatBtn.setText("Create Vital Signs");
        CreatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreatBtnActionPerformed(evt);
            }
        });

        ViewBtn.setText("View Vital Signs");
        ViewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewBtnActionPerformed(evt);
            }
        });

        LogOutBtn.setText("Logout");
        LogOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LogOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CreatBtn)
                    .addComponent(ViewBtn))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(CreatBtn)
                .addGap(61, 61, 61)
                .addComponent(ViewBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 371, Short.MAX_VALUE)
                .addComponent(LogOutBtn)
                .addGap(37, 37, 37))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 672, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ViewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewBtnActionPerformed
        // TODO add your handling code here:
        DoctorReadVitalSignsJPanel readvitals = new DoctorReadVitalSignsJPanel(persondirectory,doctordirectory,patientdirectory,hospitaldirectory,encounterdirectory,vitalsdirectory);
        jSplitPane1.setRightComponent(readvitals);
        
    }//GEN-LAST:event_ViewBtnActionPerformed

    private void LogOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutBtnActionPerformed
        new MainJFram().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LogOutBtnActionPerformed

    private void CreatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreatBtnActionPerformed
        // TODO add your handling code here:
        DoctorCreateVitalsJPanel vitalspanel = new DoctorCreateVitalsJPanel(persondirectory,doctordirectory,patientdirectory,hospitaldirectory,encounterdirectory,vitalsdirectory);
        jSplitPane1.setRightComponent(vitalspanel);
    }//GEN-LAST:event_CreatBtnActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(DoctorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DoctorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DoctorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DoctorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new DoctorJFrame().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreatBtn;
    private javax.swing.JButton LogOutBtn;
    private javax.swing.JButton ViewBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
