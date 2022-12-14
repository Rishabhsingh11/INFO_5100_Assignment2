/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Ui.Hospital;
import Model.Hospital;
import Model.HospitalDirectory;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author risha
 */
public class HospitalMaintainJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HospitalMaintainJPanel
     */
    HospitalDirectory hospitaldirectory;
    public HospitalMaintainJPanel(HospitalDirectory hospitaldirectory) {
        initComponents();
        this.hospitaldirectory = hospitaldirectory;
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

        BtnUpdate = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        BtnView = new javax.swing.JButton();
        BtnDelete = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtType = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtCommunity = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        txtCellNumber = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHospital = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtEmailid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lblSearchHere = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 255, 255));

        BtnUpdate.setBackground(new java.awt.Color(204, 204, 204));
        BtnUpdate.setText("Update");
        BtnUpdate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));
        BtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUpdateActionPerformed(evt);
            }
        });

        jLabel5.setText("City");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        BtnView.setBackground(new java.awt.Color(204, 204, 204));
        BtnView.setText("Pull Record");
        BtnView.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));
        BtnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnViewActionPerformed(evt);
            }
        });

        BtnDelete.setBackground(new java.awt.Color(204, 204, 204));
        BtnDelete.setText("Delete");
        BtnDelete.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));
        BtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeleteActionPerformed(evt);
            }
        });

        jLabel6.setText("Community");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        txtName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        txtId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        txtType.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        txtType.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTypeKeyPressed(evt);
            }
        });

        txtCity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });
        txtCity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCityKeyPressed(evt);
            }
        });

        txtCommunity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        txtCommunity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCommunityKeyPressed(evt);
            }
        });

        jLabel7.setText("State");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jLabel9.setText("Password");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jLabel10.setText("Mobile Number");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jLabel11.setText("Email ID");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Maintain Hospital Record");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        txtState.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        txtCellNumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        txtCellNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCellNumberActionPerformed(evt);
            }
        });
        txtCellNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCellNumberKeyPressed(evt);
            }
        });

        tblHospital.setBackground(new java.awt.Color(153, 153, 153));
        tblHospital.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        tblHospital.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Hospital ID", "Type", "City", "Community", "State", "Mobile Number", "Email", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblHospital);

        jLabel2.setText("Name");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        txtEmailid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        txtEmailid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailidActionPerformed(evt);
            }
        });
        txtEmailid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailidKeyPressed(evt);
            }
        });

        jLabel3.setText("Hospital_ID");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jLabel4.setText("Type");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        txtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblSearchHere.setText("Enter Hospital Id:");
        lblSearchHere.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        txtSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnView, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(133, 133, 133))
                            .addComponent(BtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSearchHere, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(241, 241, 241))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtType)
                                .addComponent(txtId)
                                .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(jLabel7)
                                .addGap(32, 32, 32)
                                .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BtnUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCellNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmailid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearchHere)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnView, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtCellNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtEmailid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUpdateActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblHospital.getSelectedRow();
        if(selectedRowIndex < 0)
        {
            JOptionPane.showMessageDialog(this, "Please Select a row to Update");
            return;
        }
        DefaultTableModel model = (DefaultTableModel)tblHospital.getModel();
        Hospital selectedHospital = (Hospital) model.getValueAt(tblHospital.getSelectedRow(),0);
        /*if(tbleEmphist.getSelectedRowCount()== 0)
        {
            JOptionPane.showMessageDialog(this, "Please Select a row to Update");
            return;
        }*/
        if(tblHospital.getSelectedRowCount()== 1)
        {
            String name = txtName.getText();
            String hospitalid = txtId.getText();
            String type = txtType.getText();
            String city = txtCity.getText();
            String community = txtCommunity.getText();
            String state = txtState.getText();
            String cell_number = txtCellNumber.getText();
            String email_id = txtEmailid.getText();
            String password = txtPassword.getText();

            txtId.setEnabled(false);

//            if (!Pattern.matches("^\\d+$", txtType.getText()))
//            {
//                JOptionPane.showMessageDialog(null, "Age cannot be negative", "Error", JOptionPane.ERROR_MESSAGE);
//                BtnUpdate.setEnabled(false);
//            }
//            else if (!Pattern.matches("^(1[89]|2[0-9]|3[0-9]|4[0-9]|5[0-9]|6[0-5])$", txtType.getText()))
//            {
//                JOptionPane.showMessageDialog(null, "Age should be between 18 to 65", "Error", JOptionPane.ERROR_MESSAGE);
//                BtnUpdate.setEnabled(false);
//            }
//            else if (!Pattern.matches("^^(?:male|Male|MALE|female|Female|FEMALE)$",txtCity.getText()))
//            {
//                JOptionPane.showMessageDialog(null, "Gender has to be male or female", "Error", JOptionPane.ERROR_MESSAGE);
//                BtnUpdate.setEnabled(false);
//            }
//            else if (!(Pattern.matches("^[0,1]?\\d{1}\\/(([0-2]?\\d{1})|([3][0,1]{1}))\\/(([1]{1}[9]{1}[9]{1}\\d{1})|([2-9]{1}\\d{3}))$", txtCommunity.getText())))
//            {
//                JOptionPane.showMessageDialog(null, "Please enter date in mm/dd/yyyy format", "Error", JOptionPane.ERROR_MESSAGE);
//                BtnUpdate.setEnabled(false);
//            }
//            else if (!Pattern.matches("^[1-9]{1}[0-9]{9}", txtCellNumber.getText()))
//            {
//                JOptionPane.showMessageDialog(null, "Enter valid 10 digit number", "Error", JOptionPane.ERROR_MESSAGE);
//                BtnUpdate.setEnabled(false);
//            }
//            else if (!(Pattern.matches("^[a-zA-Z0-9]*+[@]{1}+[a-zA-Z0-9]*+[.]{1}+[a-zA-Z0-9]*+$", txtEmailid.getText()))) 
//            {
//                JOptionPane.showMessageDialog(null, "Please enter a valid email", "Error", JOptionPane.ERROR_MESSAGE);
//                BtnUpdate.setEnabled(false);
//              }
//              else 
//              {
                selectedHospital.setHospital_name(name);
                selectedHospital.setHospital_type(type);
                selectedHospital.setHospital_city(city);
                selectedHospital.setHospital_community(community);
                selectedHospital.setHospital_state(state);
                selectedHospital.setHospital_password(password);
                selectedHospital.setHospital_email(email_id);
                selectedHospital.setHospital_mobile(Long.parseLong(cell_number));

                model.setValueAt(name,tblHospital.getSelectedRow(),0);
                model.setValueAt(hospitalid, tblHospital.getSelectedRow(),1);
                model.setValueAt(type, tblHospital.getSelectedRow(),2);
                model.setValueAt(city, tblHospital.getSelectedRow(),3);
                model.setValueAt(community, tblHospital.getSelectedRow(),4);
                model.setValueAt(state, tblHospital.getSelectedRow(),5);
                model.setValueAt(cell_number, tblHospital.getSelectedRow(),6);
                model.setValueAt(email_id, tblHospital.getSelectedRow(),7);
                model.setValueAt(password, tblHospital.getSelectedRow(),8);
                JOptionPane.showMessageDialog(this, "Employees Record have been updated");
                populateTable();

                txtName.setText("");
                txtId.setText("");
                txtType.setText("");
                txtCity.setText("");
                txtCommunity.setText("");
                txtState.setText("");
                txtCellNumber.setText("");
                txtEmailid.setText("");
                txtPassword.setText("");
               }
    }//GEN-LAST:event_BtnUpdateActionPerformed

    private void BtnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnViewActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblHospital.getSelectedRow();

        if(selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this, "Please Select a row to view data");
            return;
        }
        DefaultTableModel model = (DefaultTableModel)tblHospital.getModel();
        Hospital selectedHospital = (Hospital) model.getValueAt(selectedRowIndex,0);
        txtName.setText(selectedHospital.getHospital_name());
        txtId.setText(String.valueOf(selectedHospital.getHospital_id()));
        txtType.setText(selectedHospital.getHospital_type());
        txtCity.setText(selectedHospital.getHospital_city());
        txtCommunity.setText(selectedHospital.getHospital_community());
        txtState.setText(selectedHospital.getHospital_state());
        txtCellNumber.setText(String.valueOf(selectedHospital.getHospital_mobile()));
        txtEmailid.setText(selectedHospital.getHospital_email());
        txtPassword.setText(selectedHospital.getHospital_password());
        txtId.setEnabled(false);
    }//GEN-LAST:event_BtnViewActionPerformed

    private void BtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeleteActionPerformed
        // TODO add your handling code here:

        int selectedRowIndex = tblHospital.getSelectedRow();

        if(selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this, "Please Select a row to delete");
            return;
        }
        DefaultTableModel model = (DefaultTableModel)tblHospital.getModel();
        Hospital selectedHospital = (Hospital) model.getValueAt(selectedRowIndex,0);
        hospitaldirectory.deleteHospital(selectedHospital);
        JOptionPane.showMessageDialog(this, "Hospital Record deleted from directory");

        populateTable();

        txtName.setText("");
        txtId.setText("");
        txtType.setText("");
        txtCity.setText("");
        txtCommunity.setText("");
        txtState.setText("");
        txtCellNumber.setText("");
        txtEmailid.setText("");
        txtPassword.setText("");
        
    }//GEN-LAST:event_BtnDeleteActionPerformed

    private void txtTypeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTypeKeyPressed
        // TODO add your handling code here:
        BtnUpdate.setEnabled(true);
    }//GEN-LAST:event_txtTypeKeyPressed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void txtCityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCityKeyPressed
        // TODO add your handling code here:
        BtnUpdate.setEnabled(true);
    }//GEN-LAST:event_txtCityKeyPressed

    private void txtCommunityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCommunityKeyPressed
        // TODO add your handling code here:
        BtnUpdate.setEnabled(true);
    }//GEN-LAST:event_txtCommunityKeyPressed

    private void txtCellNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCellNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCellNumberActionPerformed

    private void txtCellNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCellNumberKeyPressed
        // TODO add your handling code here:
        BtnUpdate.setEnabled(true);
    }//GEN-LAST:event_txtCellNumberKeyPressed

    private void txtEmailidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailidActionPerformed

    private void txtEmailidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailidKeyPressed
        // TODO add your handling code here:
        BtnUpdate.setEnabled(true);
    }//GEN-LAST:event_txtEmailidKeyPressed

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tblHospital.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        tblHospital.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(txtSearch.getText().trim()));
    }//GEN-LAST:event_txtSearchKeyPressed

    private void populateTable() 
    {
       DefaultTableModel model = (DefaultTableModel)tblHospital.getModel();
       model.setRowCount(0);
       
       for(Hospital ed : hospitaldirectory.getHospitalDirectory())
       {
           Object [] row = new Object[11];
           row[0] = ed;
           row[1] = ed.getHospital_id();
           row[2] = ed.getHospital_type();
           row[3] = ed.getHospital_city();
           row[4] = ed.getHospital_community();
           row[5] = ed.getHospital_state();
           row[6] = ed.getHospital_mobile();
           row[7] = ed.getHospital_email();
           row[8] = ed.getHospital_password();
           
           model.addRow(row);
       }
       }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDelete;
    private javax.swing.JButton BtnUpdate;
    private javax.swing.JButton BtnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSearchHere;
    private javax.swing.JTable tblHospital;
    private javax.swing.JTextField txtCellNumber;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCommunity;
    private javax.swing.JTextField txtEmailid;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtType;
    // End of variables declaration//GEN-END:variables
}
