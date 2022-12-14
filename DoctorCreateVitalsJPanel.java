/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Ui.Doctor;

import Model.Doctor;
import Model.DoctorDirectory;
import Model.Encounter;
import Model.EncounterDirectory;
import Model.HospitalDirectory;
import Model.PatientDirectory;
import Model.PersonDirectory;
import Model.VitalSigns;
import Model.VitalSignsDirectory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author risha
 */
public class DoctorCreateVitalsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorCreateVitalsJPanel
     */
    PersonDirectory persondirectory;
    DoctorDirectory doctordirectory;
    PatientDirectory patientdirectory;
    HospitalDirectory hospitaldirectory;
    EncounterDirectory encounterdirectory;
    VitalSignsDirectory vitalsignsdirectory;
    public DoctorCreateVitalsJPanel(PersonDirectory persondirectory,DoctorDirectory doctordirectory,PatientDirectory patientdirectory,HospitalDirectory hospitaldirectory,EncounterDirectory encounterdirectory,VitalSignsDirectory vitalsignsdirectory) 
    {
        initComponents();
        this.persondirectory = persondirectory;
        this.doctordirectory = doctordirectory;
        this.patientdirectory = patientdirectory;
        this.hospitaldirectory = hospitaldirectory;
        this.encounterdirectory = encounterdirectory;
        this.vitalsignsdirectory = vitalsignsdirectory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtEncounterId = new javax.swing.JTextField();
        txtHeight = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        BtnView = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEncounter = new javax.swing.JTable();
        txtWeight = new javax.swing.JTextField();
        txtTemprature = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        SubmitBtn = new javax.swing.JButton();
        txtBloodPressure = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        txtHeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHeightActionPerformed(evt);
            }
        });

        jLabel12.setText("Encounter ID");

        jLabel3.setText("Height");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create Encounter");

        BtnView.setText("Pull Record");
        BtnView.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        BtnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnViewActionPerformed(evt);
            }
        });

        tblEncounter.setBackground(new java.awt.Color(153, 153, 153));
        tblEncounter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        tblEncounter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Encounter Id", "Hospital Name", "Doctor Name", "Date", "Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEncounter);

        txtWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWeightActionPerformed(evt);
            }
        });

        jLabel4.setText("Weight");

        jLabel5.setText("Temprature");

        SubmitBtn.setText("Submit");
        SubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBtnActionPerformed(evt);
            }
        });

        jLabel6.setText("Blood Pressure");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(253, 253, 253))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(SubmitBtn)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4)
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(47, 47, 47)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(txtEncounterId))
                                .addComponent(txtHeight)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(txtBloodPressure))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtTemprature, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtWeight, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnView, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(txtEncounterId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34))
                            .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTemprature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addComponent(SubmitBtn)
                .addContainerGap(69, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtHeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHeightActionPerformed

    private void BtnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnViewActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblEncounter.getSelectedRow();

        if(selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this, "Please Select a row to view data");
            return;
        }
        DefaultTableModel model = (DefaultTableModel)tblEncounter.getModel();
        Encounter selectedEncounter = (Encounter) model.getValueAt(selectedRowIndex,0);
        txtEncounterId.setText(String.valueOf(selectedEncounter.getEncounterid()));
        txtEncounterId.setEnabled(false);
    }//GEN-LAST:event_BtnViewActionPerformed

    private void txtWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWeightActionPerformed

    private void SubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBtnActionPerformed
        // TODO add your handling code here:
        String bloodpressure = txtBloodPressure.getText();
        double height = Double.parseDouble(txtHeight.getText());
        double weight = Double.parseDouble(txtWeight.getText());
        double temprature = Double.parseDouble(txtTemprature.getText());

        //        if (!Pattern.matches("^([1-9]{6})$", txtDoctorId.getText()))
        //        {
            //            JOptionPane.showMessageDialog(null, "Enter valid 6 digit employee id", "Error", JOptionPane.ERROR_MESSAGE);
            //            SubmitBtn.setEnabled(false);
            //        }
        //        else if (!Pattern.matches("^\\d+$", txtAge.getText()))
        //        {
            //            JOptionPane.showMessageDialog(null, "Age cannot be negative", "Error", JOptionPane.ERROR_MESSAGE);
            //            SubmitBtn.setEnabled(false);
            //        }
        //        else if (!Pattern.matches("^(1[89]|2[0-9]|3[0-9]|4[0-9]|5[0-9]|6[0-5])$", txtAge.getText()))
        //        {
            //            JOptionPane.showMessageDialog(null, "Age should be between 18 to 65", "Error", JOptionPane.ERROR_MESSAGE);
            //            SubmitBtn.setEnabled(false);
            //        }
        //        else if (!Pattern.matches("^^(?:male|Male|MALE|female|Female|FEMALE)$",txtGender.getText()))
        //        {
            //            JOptionPane.showMessageDialog(null, "Gender has to be male or female", "Error", JOptionPane.ERROR_MESSAGE);
            //            SubmitBtn.setEnabled(false);
            //        }
        //        else if (!Pattern.matches("^[1-9]{1}[0-9]{9}", txtMobile.getText()))
        //        {
            //            JOptionPane.showMessageDialog(null, "Enter valid 10 digit number", "Error", JOptionPane.ERROR_MESSAGE);
            //            SubmitBtn.setEnabled(false);
            //        }
        //        else if (!(Pattern.matches("^[a-zA-Z0-9]*+[@]{1}+[a-zA-Z0-9]*+[.]{1}+[a-zA-Z0-9]*+$", txtEmail.getText()))) {
            //            JOptionPane.showMessageDialog(null, "Please enter a valid email", "Error", JOptionPane.ERROR_MESSAGE);
            //            SubmitBtn.setEnabled(false);
            //        }
        //        else {

            VitalSigns vsobj =vitalsignsdirectory.addVitalSigns();

            vsobj.setHeight(height);
            vsobj.setWeight(weight);
            vsobj.setTemprature(temprature);
            vsobj.setBlood_pressure(bloodpressure);

            JOptionPane.showMessageDialog(this,"Vital Signs added to Encounter ID:"+(txtEncounterId.getText()));

            txtEncounterId.setText("");
            txtTemprature.setText("");
            txtWeight.setText("");
            txtHeight.setText("");
            txtBloodPressure.setText("");
            // }
        //}
    }//GEN-LAST:event_SubmitBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnView;
    private javax.swing.JButton SubmitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEncounter;
    private javax.swing.JTextField txtBloodPressure;
    private javax.swing.JTextField txtEncounterId;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtTemprature;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}