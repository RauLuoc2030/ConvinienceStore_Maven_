/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.Admin;

import DTO.NhanVienDTO;
import java.awt.Color;

import DAO_Hibernate.NhanVienDAO;

/**
 *
 * @author Locc
 */
public class NhanVien extends javax.swing.JPanel {

    private NhanVienDTO nhanVienDTO;

    private int clickCount;
    private long lastClickTime;
    private boolean isSelect;

    /**
     * Creates new form NhanVien
     */
    public NhanVien() {
        initComponents();
    }

    public NhanVien(NhanVienDTO nhanVienDTO) {
        initComponents();
        jDialogAddSP.setLocationRelativeTo(null);

        this.nhanVienDTO = new NhanVienDTO();
        this.nhanVienDTO = nhanVienDTO;

        jLabelLuong.setText(nhanVienDTO.getLuongInteger().toString());
        jLabelMaNV.setText(nhanVienDTO.getMaNVString());
        jLabelSDT.setText(nhanVienDTO.getSDTNVString());
        jLabelTenNV.setText(nhanVienDTO.getHoTenNVString());
        if (nhanVienDTO.getChucVuNVString().equals("quan ly")) {
            jLabelChucVu.setText("Quản lý");
        } else {
            jLabelChucVu.setText("Nhân viên");
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogAddSP = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanelSave = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jTextField7 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabelMaNV = new javax.swing.JLabel();
        jLabelTenNV = new javax.swing.JLabel();
        jLabelSDT = new javax.swing.JLabel();
        jLabelLuong = new javax.swing.JLabel();
        jLabelChucVu = new javax.swing.JLabel();

        jDialogAddSP.setModal(true);
        jDialogAddSP.setUndecorated(true);
        jDialogAddSP.setResizable(false);
        jDialogAddSP.setSize(new java.awt.Dimension(420, 570));
        jDialogAddSP.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(45, 96, 151));
        jPanel7.setMaximumSize(new java.awt.Dimension(420, 568));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(143, 203, 253));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(209, 202, 191)));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelSave.setBackground(new java.awt.Color(45, 96, 151));
        jPanelSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelSaveMouseClicked(evt);
            }
        });
        jPanelSave.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Lưu");
        jPanelSave.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, -10, 40, 60));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/download.png"))); // NOI18N
        jPanelSave.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 8, 24, 24));

        jPanel9.add(jPanelSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 452, 135, 41));

        jLabel8.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jLabel8.setText("SDT");
        jPanel9.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 87, 135, 24));

        jLabel9.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jLabel9.setText("Mã nhân viên");
        jPanel9.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 22, 135, 24));

        jLabel10.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jLabel10.setText("CCCD");
        jPanel9.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 156, 135, 24));

        jLabel12.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jLabel12.setText("Tên nhân viên");
        jPanel9.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 22, 135, 24));

        jLabel13.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jLabel13.setText("Ngày sinh");
        jPanel9.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 87, 135, 24));

        jLabel14.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jLabel14.setText("Địa chỉ");
        jPanel9.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 156, 135, 24));

        jLabel15.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jLabel15.setText("Ngày vào làm");
        jPanel9.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 290, 135, 24));

        jLabel16.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jLabel16.setText("Lương");
        jPanel9.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 223, 135, 24));

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 96, 151)));
        jPanel9.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 46, 135, 24));

        jTextField2.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jTextField2.setText("0");
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 96, 151)));
        jPanel9.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 111, 135, 24));

        jTextField3.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 96, 151)));
        jPanel9.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 180, 135, 24));

        jTextField4.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 96, 151)));
        jPanel9.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 46, 135, 24));

        jTextField6.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jTextField6.setText("0");
        jTextField6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 96, 151)));
        jPanel9.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 180, 135, 24));

        jComboBox1.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quản lý", "Nhân viên" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 96, 151)));
        jComboBox1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jComboBox1.setLightWeightPopupEnabled(false);
        jComboBox1.setOpaque(true);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel9.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 247, 135, 24));

        jDateChooser2.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 96, 151)));
        jDateChooser2.setDateFormatString("dd/MM/yyyy");
        jDateChooser2.setFont(new java.awt.Font("Be Vietnam Pro", 0, 10)); // NOI18N
        jPanel9.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 320, 135, 24));

        jTextField7.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jTextField7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 96, 151)));
        jPanel9.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 247, 135, 24));

        jLabel23.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jLabel23.setText("Chức vụ");
        jPanel9.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 223, 135, 24));

        jTextField8.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jTextField8.setText("0");
        jTextField8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 96, 151)));
        jPanel9.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 180, 135, 24));

        jDateChooser3.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 96, 151)));
        jDateChooser3.setDateFormatString("dd/MM/yyyy");
        jDateChooser3.setFont(new java.awt.Font("Be Vietnam Pro", 0, 10)); // NOI18N
        jPanel9.add(jDateChooser3, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 111, 135, 24));

        jPanel8.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 400, 507));

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 51, 420, 517));

        jLabel17.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Thông tin nhân viên");
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 350, 60));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/x.png"))); // NOI18N
        jLabel18.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 13, 24, 24));

        jDialogAddSP.getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 570));

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(45, 96, 151)));
        setMaximumSize(new java.awt.Dimension(1200, 60));
        setMinimumSize(new java.awt.Dimension(1200, 60));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                formFocusLost(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelMaNV.setFont(new java.awt.Font("Be Vietnam Pro Light", 0, 24)); // NOI18N
        jLabelMaNV.setText("NV000001");
        jLabelMaNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMaNVMouseClicked(evt);
            }
        });
        add(jLabelMaNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 140, 60));

        jLabelTenNV.setFont(new java.awt.Font("Be Vietnam Pro Light", 0, 24)); // NOI18N
        jLabelTenNV.setText("Tên");
        jLabelTenNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTenNVMouseClicked(evt);
            }
        });
        add(jLabelTenNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 280, 60));

        jLabelSDT.setFont(new java.awt.Font("Be Vietnam Pro Light", 0, 24)); // NOI18N
        jLabelSDT.setText("SDT");
        jLabelSDT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSDTMouseClicked(evt);
            }
        });
        add(jLabelSDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 170, 60));

        jLabelLuong.setFont(new java.awt.Font("Be Vietnam Pro Light", 0, 24)); // NOI18N
        jLabelLuong.setText("Lương");
        jLabelLuong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLuongMouseClicked(evt);
            }
        });
        add(jLabelLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 170, 60));

        jLabelChucVu.setFont(new java.awt.Font("Be Vietnam Pro Light", 0, 24)); // NOI18N
        jLabelChucVu.setText("Chức vụ");
        jLabelChucVu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelChucVuMouseClicked(evt);
            }
        });
        add(jLabelChucVu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, 170, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
        setBackground(new java.awt.Color(245, 181, 189));
        isSelect = true;
    }//GEN-LAST:event_formFocusGained

    private void formFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusLost
        // TODO add your handling code here:
        isSelect = false;
        setBackground(Color.WHITE);
    }//GEN-LAST:event_formFocusLost

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        long currentTime = System.currentTimeMillis();

        if (clickCount == 1 && (currentTime - lastClickTime) <= 200) {
            // Xử lý sự kiện double click
            jTextField1.setText(nhanVienDTO.getMaNVString());
            jTextField4.setText(nhanVienDTO.getHoTenNVString());
            jTextField2.setText(nhanVienDTO.getSDTNVString());
            jDateChooser3.setDate(nhanVienDTO.getNgaySinhNVDate());
            jTextField3.setText(nhanVienDTO.getCCCDNVString());
            jTextField6.setText(nhanVienDTO.getDiaChiNVString());
            if (nhanVienDTO.getChucVuNVString().equals("quan ly")) {
                jComboBox1.setSelectedItem("Quản lý");
            } else {
                jComboBox1.setSelectedItem("Nhân viên");
            }
            jTextField7.setText(nhanVienDTO.getLuongInteger().toString());
            jDateChooser2.setDate(nhanVienDTO.getNgayVaoLamDate());

            jDialogAddSP.setVisible(true);
            // Reset lại số lần click và thời gian sau khi xử lý xong
            clickCount = 0;
            lastClickTime = 0;
        } else {
            // Lưu số lần click và thời gian hiện tại
            clickCount = 1;
            lastClickTime = currentTime;
            requestFocus();
        }
    }//GEN-LAST:event_formMouseClicked

    private void jLabelMaNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMaNVMouseClicked
        // TODO add your handling code here:
        requestFocus();
    }//GEN-LAST:event_jLabelMaNVMouseClicked

    private void jLabelTenNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTenNVMouseClicked
        // TODO add your handling code here:
        requestFocus();
    }//GEN-LAST:event_jLabelTenNVMouseClicked

    private void jLabelSDTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSDTMouseClicked
        // TODO add your handling code here:
        requestFocus();
    }//GEN-LAST:event_jLabelSDTMouseClicked

    private void jLabelLuongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLuongMouseClicked
        // TODO add your handling code here:
        requestFocus();
    }//GEN-LAST:event_jLabelLuongMouseClicked

    private void jLabelChucVuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelChucVuMouseClicked
        // TODO add your handling code here:
        requestFocus();
    }//GEN-LAST:event_jLabelChucVuMouseClicked

    private void jPanelSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelSaveMouseClicked
        // TODO add your handling code here:
        NhanVienDTO nhanVienDTO = new NhanVienDTO();
        nhanVienDTO.setMaNVString(jTextField1.getText());
        nhanVienDTO.setHoTenNVString(jTextField4.getText());
        nhanVienDTO.setSDTNVString(jTextField2.getText());
        nhanVienDTO.setNgaySinhNVDate(jDateChooser3.getDate());
        nhanVienDTO.setCCCDNVString(jTextField3.getText());
        nhanVienDTO.setDiaChiNVString(jTextField6.getText());
        if (jComboBox1.getSelectedItem().equals("Quản lý")){
            nhanVienDTO.setChucVuNVString("quan ly");
        } else if (jComboBox1.getSelectedItem().equals("Nhân viên")) {
            nhanVienDTO.setChucVuNVString("nhan vien");
        }
        nhanVienDTO.setLuongInteger(Integer.valueOf(jTextField7.getText()));
        nhanVienDTO.setNgayVaoLamDate(jDateChooser2.getDate());

        NhanVienDAO nhanVienDAO = new NhanVienDAO();
        nhanVienDAO.updateNhanVien(nhanVienDTO);
        this.nhanVienDTO = nhanVienDTO;
        jDialogAddSP.dispose();
    }//GEN-LAST:event_jPanelSaveMouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        // TODO add your handling code here:
        jDialogAddSP.dispose();
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private javax.swing.JDialog jDialogAddSP;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelChucVu;
    private javax.swing.JLabel jLabelLuong;
    private javax.swing.JLabel jLabelMaNV;
    private javax.swing.JLabel jLabelSDT;
    private javax.swing.JLabel jLabelTenNV;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelSave;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the isSelect
     */
    public boolean isSelect() {
        return isSelect;
    }

    /**
     * @param isSelect the isSelect to set
     */
    public void setIsSelect(boolean isSelect) {
        this.isSelect = isSelect;
    }

    /**
     * @return the nhanVienDTO
     */
    public NhanVienDTO getNhanVienDTO() {
        return nhanVienDTO;
    }

    /**
     * @param nhanVienDTO the nhanVienDTO to set
     */
    public void setNhanVienDTO(NhanVienDTO nhanVienDTO) {
        this.nhanVienDTO = nhanVienDTO;
    }
}
