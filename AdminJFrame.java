/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ui.Admin;

import Model.CommunityDirectory;
import Model.DoctorDirectory;
import Model.EncounterDirectory;
import Model.HospitalDirectory;
import Model.PatientDirectory;
import Model.PersonDirectory;
import Model.VitalSignsDirectory;
import Ui.Community.CommunityFormJPanel;
import Ui.Community.CommunityReadJPanel;
import Ui.Doctor.DoctorMaintainJPanel;
import Ui.Doctor.DoctorSystemCreateFormJPanel;
import Ui.Hospital.HospitalFormJPanel;
import Ui.Hospital.HospitalMaintainJPanel;
import Ui.Mainframe.MainJFram;
import Ui.Patient.PatientMaintainJPanel;
import Ui.Patient.PatientSystemCreateFormJPanel;
import Ui.Person.PersonMaintainJPanel;

/**
 *
 * @author risha
 */
public class AdminJFrame extends javax.swing.JFrame {

    /**
     * Creates new form AdminJFrame
     */
    PersonDirectory persondirectory;
    HospitalDirectory hospitaldirectory;
    DoctorDirectory doctordirectory;
    PatientDirectory patientdirectory;
    EncounterDirectory encounterdirectory;
    VitalSignsDirectory vitalsignsdirectory;
    CommunityDirectory communitydirectory;
    public AdminJFrame(PersonDirectory persondirectory,HospitalDirectory hospitaldirectory,DoctorDirectory doctordirectory,PatientDirectory patientdirectory,VitalSignsDirectory vitalsignsdirectory,CommunityDirectory communitydirectory) {
        initComponents();
        this.persondirectory = persondirectory;
        this.hospitaldirectory = hospitaldirectory;
        this.doctordirectory = doctordirectory;
        this.patientdirectory = patientdirectory;
        this.encounterdirectory = encounterdirectory;
        this.vitalsignsdirectory = vitalsignsdirectory;
        this.communitydirectory = communitydirectory;
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
        btnCreatePerson = new javax.swing.JButton();
        btnMaintainPerson = new javax.swing.JButton();
        btnCreateDoctor = new javax.swing.JButton();
        btnMaintainDoctor = new javax.swing.JButton();
        btnCreateHospital = new javax.swing.JButton();
        btnMaintainHospital = new javax.swing.JButton();
        txtCreateCommunity = new javax.swing.JButton();
        btnMaintainCommunity = new javax.swing.JButton();
        btnCreatePatient = new javax.swing.JButton();
        btnMaintainPatient = new javax.swing.JButton();
        LogOutBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        btnCreatePerson.setBackground(new java.awt.Color(204, 255, 255));
        btnCreatePerson.setText("Create Person");
        btnCreatePerson.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnCreatePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatePersonActionPerformed(evt);
            }
        });

        btnMaintainPerson.setBackground(new java.awt.Color(204, 255, 255));
        btnMaintainPerson.setText("Maintain Person");
        btnMaintainPerson.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnMaintainPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaintainPersonActionPerformed(evt);
            }
        });

        btnCreateDoctor.setBackground(new java.awt.Color(204, 255, 255));
        btnCreateDoctor.setText("Create Doctor");
        btnCreateDoctor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnCreateDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateDoctorActionPerformed(evt);
            }
        });

        btnMaintainDoctor.setBackground(new java.awt.Color(204, 255, 255));
        btnMaintainDoctor.setText("Maintain Doctor");
        btnMaintainDoctor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnMaintainDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaintainDoctorActionPerformed(evt);
            }
        });

        btnCreateHospital.setBackground(new java.awt.Color(204, 255, 255));
        btnCreateHospital.setText("Create Hospital");
        btnCreateHospital.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnCreateHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateHospitalActionPerformed(evt);
            }
        });

        btnMaintainHospital.setBackground(new java.awt.Color(204, 255, 255));
        btnMaintainHospital.setText("Maintain Hospital");
        btnMaintainHospital.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnMaintainHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaintainHospitalActionPerformed(evt);
            }
        });

        txtCreateCommunity.setBackground(new java.awt.Color(204, 255, 255));
        txtCreateCommunity.setText("Create Community");
        txtCreateCommunity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCreateCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCreateCommunityActionPerformed(evt);
            }
        });

        btnMaintainCommunity.setBackground(new java.awt.Color(204, 255, 255));
        btnMaintainCommunity.setText("Maintain Community");
        btnMaintainCommunity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnMaintainCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaintainCommunityActionPerformed(evt);
            }
        });

        btnCreatePatient.setBackground(new java.awt.Color(204, 255, 255));
        btnCreatePatient.setText("Create Patient");
        btnCreatePatient.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnCreatePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatePatientActionPerformed(evt);
            }
        });

        btnMaintainPatient.setBackground(new java.awt.Color(204, 255, 255));
        btnMaintainPatient.setText("Maintain Patient");
        btnMaintainPatient.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnMaintainPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaintainPatientActionPerformed(evt);
            }
        });

        LogOutBtn.setBackground(new java.awt.Color(204, 255, 255));
        LogOutBtn.setText("Logout");
        LogOutBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMaintainPerson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMaintainCommunity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCreatePerson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCreatePatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMaintainPatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCreateCommunity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMaintainHospital, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCreateHospital, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMaintainDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCreateDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LogOutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnCreatePerson)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMaintainPerson)
                .addGap(46, 46, 46)
                .addComponent(btnCreateDoctor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMaintainDoctor)
                .addGap(36, 36, 36)
                .addComponent(btnCreateHospital)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMaintainHospital)
                .addGap(35, 35, 35)
                .addComponent(txtCreateCommunity)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMaintainCommunity)
                .addGap(40, 40, 40)
                .addComponent(btnCreatePatient)
                .addGap(18, 18, 18)
                .addComponent(btnMaintainPatient)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addComponent(LogOutBtn)
                .addGap(14, 14, 14))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 695, Short.MAX_VALUE)
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
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutBtnActionPerformed
        new MainJFram(persondirectory,hospitaldirectory,doctordirectory,patientdirectory,encounterdirectory,vitalsignsdirectory,communitydirectory).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LogOutBtnActionPerformed

    private void btnCreatePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatePatientActionPerformed
        PatientSystemCreateFormJPanel patientsyspanel = new PatientSystemCreateFormJPanel(persondirectory,patientdirectory,hospitaldirectory);
        jSplitPane1.setRightComponent(patientsyspanel);
    }//GEN-LAST:event_btnCreatePatientActionPerformed

    private void btnMaintainPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaintainPersonActionPerformed
        // TODO add your handling code here:
         PersonMaintainJPanel personmaintainpanel = new PersonMaintainJPanel(persondirectory,doctordirectory,patientdirectory);
        jSplitPane1.setRightComponent(personmaintainpanel);
    }//GEN-LAST:event_btnMaintainPersonActionPerformed

    private void btnCreatePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatePersonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCreatePersonActionPerformed

    private void btnCreateDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateDoctorActionPerformed
        // TODO add your handling code here:
        DoctorSystemCreateFormJPanel docsyspanel = new DoctorSystemCreateFormJPanel(persondirectory,patientdirectory,hospitaldirectory,doctordirectory);
        jSplitPane1.setRightComponent(docsyspanel);
        
    }//GEN-LAST:event_btnCreateDoctorActionPerformed

    private void btnMaintainDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaintainDoctorActionPerformed
        // TODO add your handling code here:
        DoctorMaintainJPanel doctormaintainpanel = new DoctorMaintainJPanel(persondirectory, hospitaldirectory, doctordirectory);
        jSplitPane1.setRightComponent(doctormaintainpanel);
    }//GEN-LAST:event_btnMaintainDoctorActionPerformed

    private void btnCreateHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateHospitalActionPerformed
    HospitalFormJPanel hospitalcreatepanel = new HospitalFormJPanel(hospitaldirectory,communitydirectory);
    jSplitPane1.setRightComponent(hospitalcreatepanel);
    }//GEN-LAST:event_btnCreateHospitalActionPerformed

    private void btnMaintainHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaintainHospitalActionPerformed
        // TODO add your handling code here:
        HospitalMaintainJPanel hospitalmaintainpanel = new HospitalMaintainJPanel(hospitaldirectory);
        jSplitPane1.setRightComponent(hospitalmaintainpanel);
    }//GEN-LAST:event_btnMaintainHospitalActionPerformed

    private void btnMaintainPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaintainPatientActionPerformed
        // TODO add your handling code here:
        PatientMaintainJPanel patientmaintainpanel = new PatientMaintainJPanel(persondirectory,hospitaldirectory,doctordirectory,patientdirectory);
        jSplitPane1.setRightComponent(patientmaintainpanel);
    }//GEN-LAST:event_btnMaintainPatientActionPerformed

    private void txtCreateCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCreateCommunityActionPerformed
        // TODO add your handling code here:
        CommunityFormJPanel communityform = new CommunityFormJPanel(communitydirectory);
        jSplitPane1.setRightComponent(communityform);
    }//GEN-LAST:event_txtCreateCommunityActionPerformed

    private void btnMaintainCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaintainCommunityActionPerformed
        // TODO add your handling code here:
        CommunityReadJPanel commread = new CommunityReadJPanel(persondirectory, hospitaldirectory, doctordirectory, communitydirectory);
        jSplitPane1.setRightComponent(commread);
    }//GEN-LAST:event_btnMaintainCommunityActionPerformed

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
            java.util.logging.Logger.getLogger(AdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AdminJFrame().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogOutBtn;
    private javax.swing.JButton btnCreateDoctor;
    private javax.swing.JButton btnCreateHospital;
    private javax.swing.JButton btnCreatePatient;
    private javax.swing.JButton btnCreatePerson;
    private javax.swing.JButton btnMaintainCommunity;
    private javax.swing.JButton btnMaintainDoctor;
    private javax.swing.JButton btnMaintainHospital;
    private javax.swing.JButton btnMaintainPatient;
    private javax.swing.JButton btnMaintainPerson;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton txtCreateCommunity;
    // End of variables declaration//GEN-END:variables
}
