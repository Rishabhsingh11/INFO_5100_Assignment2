/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Ui.Patient;

import Model.Doctor;
import Model.DoctorDirectory;
import javax.swing.table.TableRowSorter;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author risha
 */
import Model.Encounter;
import Model.EncounterDirectory;
import Model.HospitalDirectory;
import Model.Patient;
import Model.PatientDirectory;
import Model.PersonDirectory;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
public class PatientReadEncounterJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientReadEncounterJPanel
     */
    PersonDirectory persondirectory;
    DoctorDirectory doctordirectory;
    PatientDirectory patientdirectory;
    HospitalDirectory hospitaldirectory;
    String PID;
    String Hname;
    EncounterDirectory encounterdirectory;
    
    public PatientReadEncounterJPanel(PersonDirectory persondirectory,DoctorDirectory doctordirectory,PatientDirectory patientdirectory,HospitalDirectory hospitaldirectory,String PID,EncounterDirectory encounterdirectory) {
        initComponents();
        this.persondirectory = persondirectory;
        this.doctordirectory = doctordirectory;
        this.hospitaldirectory = hospitaldirectory;
        this.patientdirectory = patientdirectory;
        this.PID = PID;
        this.encounterdirectory = encounterdirectory;      
        for(Patient patient : patientdirectory.getPatientDirectory())
       {
           if(String.valueOf(patient.getPatient_id()).equals(PID))
           {
               Hname = patient.getHospital_name();  
           }  
       }
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSearchHere = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbleEncounter = new javax.swing.JTable();
        BtnView = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtEncounterId = new javax.swing.JTextField();
        txtHospitalName = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtDoctorName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTime = new javax.swing.JTextField();
        SubmitBtn = new javax.swing.JButton();

        lblSearchHere.setText("Enter Encounter Id:");
        lblSearchHere.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        txtSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Read Encounter Record");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        tbleEncounter.setBackground(new java.awt.Color(153, 153, 153));
        tbleEncounter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        tbleEncounter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Encounter ID", "Hospital Name", "Doctor Name", "Date", "Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbleEncounter);

        BtnView.setText("Pull Record");
        BtnView.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        BtnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnViewActionPerformed(evt);
            }
        });

        jLabel5.setText("Date");

        jLabel6.setText("Time");

        jLabel12.setText("Encounter Id");

        txtDoctorName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoctorNameActionPerformed(evt);
            }
        });

        jLabel3.setText("Hospital Name");

        jLabel4.setText("Doctor Name");

        SubmitBtn.setText("Submit");
        SubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SubmitBtn)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel12))
                            .addGap(48, 48, 48)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtEncounterId, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                .addComponent(txtHospitalName)
                                .addComponent(txtDoctorName)
                                .addComponent(txtDate)
                                .addComponent(txtTime))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnView, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addGap(239, 239, 239))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblSearchHere, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearchHere)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnView, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(txtEncounterId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(SubmitBtn)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tbleEncounter.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        tbleEncounter.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(txtSearch.getText().trim()));
    }//GEN-LAST:event_txtSearchKeyPressed

    private void BtnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnViewActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tbleEncounter.getSelectedRow();

        if(selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this, "Please Select a row to view data");
            return;
        }
        DefaultTableModel model = (DefaultTableModel)tbleEncounter.getModel();
        Encounter selectedEncounter = (Encounter) model.getValueAt(selectedRowIndex,0);
        txtEncounterId.setText(String.valueOf((selectedEncounter.getEncounterid())));
        txtDate.setText(String.valueOf(selectedEncounter.getEncounter_date()));
        txtDoctorName.setText(String.valueOf(selectedEncounter.getDoctor_Name()));
        txtHospitalName.setText(selectedEncounter.getHospital_Name());
        txtTime.setText(selectedEncounter.getEncounter_time());
        txtDate.setEnabled(false);
    }//GEN-LAST:event_BtnViewActionPerformed

    private void txtDoctorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoctorNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoctorNameActionPerformed

    private void SubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBtnActionPerformed
        // TODO add your handling code here:
        String encid = txtEncounterId.getText();
        String docname = txtDoctorName.getText();
        String hospitalname = txtHospitalName.getText();
        String date = txtDate.getText();
        String time = txtTime.getText();

//        if (!Pattern.matches("^([1-9]{6})$", txtDate.getText()))
//        {
//            JOptionPane.showMessageDialog(null, "Enter valid 6 digit employee id", "Error", JOptionPane.ERROR_MESSAGE);
//            SubmitBtn.setEnabled(false);
//        }
//        else if (!Pattern.matches("^\\d+$", txtDoctorName.getText()))
//        {
//            JOptionPane.showMessageDialog(null, "Age cannot be negative", "Error", JOptionPane.ERROR_MESSAGE);
//            SubmitBtn.setEnabled(false);
//        }
//        else if (!Pattern.matches("^(1[89]|2[0-9]|3[0-9]|4[0-9]|5[0-9]|6[0-5])$", txtDoctorName.getText()))
//        {
//            JOptionPane.showMessageDialog(null, "Age should be between 18 to 65", "Error", JOptionPane.ERROR_MESSAGE);
//            SubmitBtn.setEnabled(false);
//        }
//        else if (!Pattern.matches("^^(?:male|Male|MALE|female|Female|FEMALE)$",txtHospitalName.getText()))
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

            Encounter encounterobj = encounterdirectory.addEncounter();

            encounterobj.setEncounter_date(date);
            encounterobj.setEncounter_time(time);

            JOptionPane.showMessageDialog(this,"Updated Docotr details to directory");

            txtEncounterId.setText("");
            txtDate.setText("");
            txtDoctorName.setText("");
            txtHospitalName.setText("");
            txtTime.setText("");
        //}
    }//GEN-LAST:event_SubmitBtnActionPerformed


     private void populateTable() 
    {
       DefaultTableModel model = (DefaultTableModel)tbleEncounter.getModel();
       model.setRowCount(0);
       
       for(Encounter enc : encounterdirectory.getEncounterDirectory())
       {
           if(String.valueOf(enc.getHospital_Name()).equals(Hname))
           {
           Object [] row = new Object[12];
           row[0] = enc.getEncounterid();
           row[1] = enc;
           row[2] = enc.getDoctor_Name();
           row[3] = enc.getEncounter_date();
           row[4] = enc.getEncounter_time();
           model.addRow(row);
           }
       }
    }
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
    private javax.swing.JLabel lblSearchHere;
    private javax.swing.JTable tbleEncounter;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDoctorName;
    private javax.swing.JTextField txtEncounterId;
    private javax.swing.JTextField txtHospitalName;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTime;
    // End of variables declaration//GEN-END:variables
}
