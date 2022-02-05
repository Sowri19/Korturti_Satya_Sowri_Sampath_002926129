/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Car_UI_Section;

import Model.CarProduct;
import Model.CarProductHistory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dpsmv
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DisplayJPanel
     */
    CarProductHistory history;
    CarProduct  cardetails;
    public ViewJPanel(CarProductHistory history, CarProduct cardetails) {
        initComponents();
        this.history = history;
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

        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtOnwer_Telephone_Num = new javax.swing.JTextField();
        lblBrand = new javax.swing.JLabel();
        txtWarranty_Year = new javax.swing.JTextField();
        lblOwnerName = new javax.swing.JLabel();
        lblModel = new javax.swing.JLabel();
        txtYear = new javax.swing.JTextField();
        txtOwner_Name = new javax.swing.JTextField();
        lblOnwerTelephonenumbers = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        lblOwnerEmailaddresses = new javax.swing.JLabel();
        txtOwner_Driver_license = new javax.swing.JTextField();
        lblOwnerDriverlicense = new javax.swing.JLabel();
        lblYear = new javax.swing.JLabel();
        lblOwnerSSN = new javax.swing.JLabel();
        txtOwner_SSN = new javax.swing.JTextField();
        lblEngineNo = new javax.swing.JLabel();
        lblOwneraddress = new javax.swing.JLabel();
        txtOwner_Address = new javax.swing.JTextField();
        lblseatsNumber = new javax.swing.JLabel();
        lblWarrantyYear = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();
        txtBrand = new javax.swing.JTextField();
        txtModel = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtEngine_Num = new javax.swing.JTextField();
        txtLicense_Plates = new javax.swing.JTextField();
        txtSeats_Num = new javax.swing.JTextField();
        txtOwner_Email_Add = new javax.swing.JTextField();
        lblLicenseplates = new javax.swing.JLabel();

        lblTitle.setFont(new java.awt.Font("Symbol", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("View Car Details");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Car Model", "Engine Num", "License Plate"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("View");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtOnwer_Telephone_Num.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtOnwer_Telephone_Num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOnwer_Telephone_NumActionPerformed(evt);
            }
        });

        lblBrand.setText("Brand");

        txtWarranty_Year.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtWarranty_Year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWarranty_YearActionPerformed(evt);
            }
        });

        lblOwnerName.setText("Seats number");

        lblModel.setText("Model");

        txtYear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtYearActionPerformed(evt);
            }
        });
        txtYear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtYearKeyPressed(evt);
            }
        });

        txtOwner_Name.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtOwner_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOwner_NameActionPerformed(evt);
            }
        });

        lblOnwerTelephonenumbers.setText("Owner Email Address");

        lblColor.setText("Color");

        lblOwnerEmailaddresses.setText("Owner Telephone number");

        txtOwner_Driver_license.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtOwner_Driver_license.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOwner_Driver_licenseActionPerformed(evt);
            }
        });

        lblOwnerDriverlicense.setText("Owner Driver licence");

        lblYear.setText("Year");

        lblOwnerSSN.setText("OwnerSSN");

        txtOwner_SSN.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtOwner_SSN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOwner_SSNActionPerformed(evt);
            }
        });

        lblEngineNo.setText("Engine No.");

        lblOwneraddress.setText("Owner Address");

        txtOwner_Address.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtOwner_Address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOwner_AddressActionPerformed(evt);
            }
        });

        lblseatsNumber.setText("Owner Name");

        lblWarrantyYear.setText("Warranty Year");

        lblImage.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtBrand.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBrandActionPerformed(evt);
            }
        });
        txtBrand.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBrandKeyPressed(evt);
            }
        });

        txtModel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModelActionPerformed(evt);
            }
        });

        txtColor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColorActionPerformed(evt);
            }
        });

        txtEngine_Num.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtEngine_Num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEngine_NumActionPerformed(evt);
            }
        });

        txtLicense_Plates.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtLicense_Plates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLicense_PlatesActionPerformed(evt);
            }
        });

        txtSeats_Num.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtSeats_Num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeats_NumActionPerformed(evt);
            }
        });

        txtOwner_Email_Add.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtOwner_Email_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOwner_Email_AddActionPerformed(evt);
            }
        });

        lblLicenseplates.setText("Licence plate");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(53, 53, 53)
                                            .addComponent(lblYear)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(lblBrand)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(3, 3, 3)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblLicenseplates)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtLicense_Plates, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(lblColor, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(78, 78, 78)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lblModel)
                                                    .addComponent(lblEngineNo)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblWarrantyYear)
                                                        .addComponent(lblseatsNumber)
                                                        .addComponent(lblOwnerName, javax.swing.GroupLayout.Alignment.TRAILING))))
                                            .addComponent(lblOwnerSSN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(lblOwnerDriverlicense, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblOwneraddress, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtWarranty_Year, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSeats_Num, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtOwner_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtOwner_Driver_license, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtOwner_SSN, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtOwner_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtEngine_Num, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(39, 39, 39)
                                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblOnwerTelephonenumbers)
                                    .addComponent(lblOwnerEmailaddresses))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtOwner_Email_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtOnwer_Telephone_Num, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton2))))
                .addGap(44, 165, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblTitle)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(26, 26, 26)
                        .addComponent(jButton2)))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBrand)
                    .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblYear)
                    .addComponent(txtYear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLicenseplates)
                    .addComponent(txtLicense_Plates, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblColor)
                            .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblOwnerEmailaddresses, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOnwer_Telephone_Num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblOnwerTelephonenumbers)
                            .addComponent(txtOwner_Email_Add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblOwneraddress)
                            .addComponent(txtOwner_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblModel)
                            .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEngineNo)
                            .addComponent(txtEngine_Num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblWarrantyYear)
                            .addComponent(txtWarranty_Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOwnerName)
                            .addComponent(txtSeats_Num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblseatsNumber)
                            .addComponent(txtOwner_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblOwnerDriverlicense, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOwner_Driver_license, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblOwnerSSN)
                            .addComponent(txtOwner_SSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
      int selectedRowIndex = jTable1.getSelectedRow();
      if (selectedRowIndex<0)
      {
          JOptionPane.showMessageDialog(this, "Please select a row to delete");
          return;
      }
      DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
      CarProduct selectedcars = (CarProduct) model.getValueAt(selectedRowIndex, 0);
      
     history.deletecars(selectedcars);
      JOptionPane.showMessageDialog(this, "row to delete");
      populateTable();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtOnwer_Telephone_NumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOnwer_Telephone_NumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOnwer_Telephone_NumActionPerformed

    private void txtWarranty_YearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWarranty_YearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWarranty_YearActionPerformed

    private void txtYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtYearActionPerformed

    private void txtYearKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtYearKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtYearKeyPressed

    private void txtOwner_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOwner_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOwner_NameActionPerformed

    private void txtOwner_Driver_licenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOwner_Driver_licenseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOwner_Driver_licenseActionPerformed

    private void txtOwner_SSNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOwner_SSNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOwner_SSNActionPerformed

    private void txtOwner_AddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOwner_AddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOwner_AddressActionPerformed

    private void txtBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBrandActionPerformed

    private void txtBrandKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBrandKeyPressed

    }//GEN-LAST:event_txtBrandKeyPressed

    private void txtModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModelActionPerformed

    private void txtColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColorActionPerformed

    private void txtEngine_NumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEngine_NumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEngine_NumActionPerformed

    private void txtLicense_PlatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLicense_PlatesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLicense_PlatesActionPerformed

    private void txtSeats_NumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeats_NumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSeats_NumActionPerformed

    private void txtOwner_Email_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOwner_Email_AddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOwner_Email_AddActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int RowIndex = jTable1.getSelectedRow();
        if(RowIndex<0){
            JOptionPane.showMessageDialog(this, "choose service record");
            return;
        }
         DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
         CarProduct selectedValue = (CarProduct)model.getValueAt(RowIndex, 0);
         txtBrand.setText(selectedValue.getBrand());
         txtColor.setText(selectedValue.getColor());
         txtEngine_Num.setText(String.valueOf(selectedValue.getEngineNumber()));
         txtSeats_Num.setText(String.valueOf(selectedValue.getSeatsNumber()));
         txtLicense_Plates.setText(String.valueOf(selectedValue.getLicensePlates()));
         txtModel.setText(selectedValue.getModel());
         txtOnwer_Telephone_Num.setText(String.valueOf(selectedValue.getOwnerTelephoneNumbers()));
         txtOwner_Address.setText(selectedValue.getOwneraddress());
         txtOwner_Driver_license.setText(selectedValue.getOwnerDriverLicense());
         txtOwner_Email_Add.setText(selectedValue.getOwnerEmailAddress());
         txtOwner_Name.setText(selectedValue.getOwnerName());
         txtOwner_SSN.setText(String.valueOf(selectedValue.getOwnerSSN()));
         txtSeats_Num.setText(String.valueOf(selectedValue.getSeatsNumber()));
         txtWarranty_Year.setText(String.valueOf(selectedValue.getWarrantyYear()));
         txtYear.setText(String.valueOf(selectedValue.getYear()));
        
         
        
        ImageIcon icon = new ImageIcon((selectedValue.getImage()));
    lblImage.setIcon(icon); 
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblBrand;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblEngineNo;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblLicenseplates;
    private javax.swing.JLabel lblModel;
    private javax.swing.JLabel lblOnwerTelephonenumbers;
    private javax.swing.JLabel lblOwnerDriverlicense;
    private javax.swing.JLabel lblOwnerEmailaddresses;
    private javax.swing.JLabel lblOwnerName;
    private javax.swing.JLabel lblOwnerSSN;
    private javax.swing.JLabel lblOwneraddress;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblWarrantyYear;
    private javax.swing.JLabel lblYear;
    private javax.swing.JLabel lblseatsNumber;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtEngine_Num;
    private javax.swing.JTextField txtLicense_Plates;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtOnwer_Telephone_Num;
    private javax.swing.JTextField txtOwner_Address;
    private javax.swing.JTextField txtOwner_Driver_license;
    private javax.swing.JTextField txtOwner_Email_Add;
    private javax.swing.JTextField txtOwner_Name;
    private javax.swing.JTextField txtOwner_SSN;
    private javax.swing.JTextField txtSeats_Num;
    private javax.swing.JTextField txtWarranty_Year;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for (CarProduct vs : history.getHistory())
        {
           Object[] row = new Object[3];
           row[0] = vs;
           row[1] = vs.getEngineNumber();
           row[2] = vs.getLicensePlates();
           
           
           model.addRow(row);
           
        }
        }

    
}
