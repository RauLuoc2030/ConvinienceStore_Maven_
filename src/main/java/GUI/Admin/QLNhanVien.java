/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.Admin;

import BUS.NhanVienBUS;
import GUI.Product_icon;
import java.awt.Component;

/**
 *
 * @author Locc
 */
public class QLNhanVien extends javax.swing.JPanel {

    /**
     * Creates new form QLNhanVien
     */
    public QLNhanVien() {
        initComponents();
        NhanVienBUS nhanVienBUS = new NhanVienBUS();
        for (int i = 0; i < nhanVienBUS.getListnNhanVienDTOs().size(); i++) {
            NhanVien nhanVien = new NhanVien(nhanVienBUS.getListnNhanVienDTOs().get(i));
            jPanel4.add(nhanVien);
        }
        jPanel4.revalidate();
        jPanel4.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogDeleteSP = new javax.swing.JDialog();
        panelRound2 = new GUI.PanelRound();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
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
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        panelRound1 = new GUI.PanelRound();
        jTextField5 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelTenNV = new javax.swing.JLabel();
        jLabelSDT = new javax.swing.JLabel();
        jLabelChucVu = new javax.swing.JLabel();
        jLabelMaNV = new javax.swing.JLabel();
        jLabelLuong = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();

        jDialogDeleteSP.setFocusable(false);
        jDialogDeleteSP.setFocusableWindowState(false);
        jDialogDeleteSP.setModal(true);
        jDialogDeleteSP.setUndecorated(true);
        jDialogDeleteSP.setResizable(false);
        jDialogDeleteSP.setSize(new java.awt.Dimension(625, 210));
        jDialogDeleteSP.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound2.setBackground(new java.awt.Color(143, 203, 253));
        panelRound2.setMaximumSize(new java.awt.Dimension(625, 210));
        panelRound2.setMinimumSize(new java.awt.Dimension(625, 210));
        panelRound2.setRoundBottomLeft(20);
        panelRound2.setRoundBottomRight(20);
        panelRound2.setRoundTopLeft(20);
        panelRound2.setRoundTopRight(20);
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 22)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Xác nhận xóa sản phẩm đã chọn?");
        panelRound2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 30, 610, -1));

        jLabel20.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 115, 130));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Lưu ý sản phẩm sẽ bị xoá hoàn toàn và không thể khôi phục");
        panelRound2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 80, 610, -1));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(45, 96, 151), 2));
        jPanel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel11.setFocusable(false);
        jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel11MouseClicked(evt);
            }
        });
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(45, 96, 151));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Hủy bỏ");
        jPanel11.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 5, 104, 32));

        panelRound2.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(424, 143, 170, 45));

        jLabel22.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 19)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Xác nhận");
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel22.setFocusable(false);
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        panelRound2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 104, 32));

        jDialogDeleteSP.getContentPane().add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 625, 210));

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
        jLabel8.setText("Giá");
        jPanel9.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 87, 135, 24));

        jLabel9.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jLabel9.setText("Mã sản phẩm");
        jPanel9.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 22, 135, 24));

        jLabel10.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jLabel10.setText("Mô tả");
        jPanel9.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 156, 135, 24));

        jLabel12.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jLabel12.setText("Tên sản phẩm");
        jPanel9.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 22, 135, 24));

        jLabel13.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jLabel13.setText("Phân loại");
        jPanel9.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 87, 135, 24));

        jLabel14.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jLabel14.setText("Số lượng");
        jPanel9.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 156, 135, 24));

        jLabel15.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jLabel15.setText("NSX");
        jLabel15.setEnabled(false);
        jPanel9.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 223, 135, 24));

        jLabel16.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jLabel16.setText("HSD");
        jLabel16.setEnabled(false);
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
        jComboBox1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 96, 151)));
        jComboBox1.setLightWeightPopupEnabled(false);
        jComboBox1.setOpaque(true);
        jPanel9.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 111, 135, 24));

        jDateChooser1.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 96, 151)));
        jDateChooser1.setDateFormatString("dd/MM/yyyy");
        jDateChooser1.setEnabled(false);
        jDateChooser1.setFont(new java.awt.Font("Be Vietnam Pro", 0, 10)); // NOI18N
        jPanel9.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 247, 135, 24));

        jDateChooser2.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 96, 151)));
        jDateChooser2.setDateFormatString("dd/MM/yyyy");
        jDateChooser2.setEnabled(false);
        jDateChooser2.setFont(new java.awt.Font("Be Vietnam Pro", 0, 10)); // NOI18N
        jPanel9.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 247, 135, 24));

        jPanel8.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 400, 507));

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 51, 420, 517));

        jLabel17.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Thêm sản phẩm");
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 168, 60));

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
        setMaximumSize(new java.awt.Dimension(1200, 900));
        setMinimumSize(new java.awt.Dimension(1200, 900));
        setName(""); // NOI18N
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(143, 203, 253));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel16.setBackground(new java.awt.Color(143, 203, 253));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search 1.png"))); // NOI18N
        jPanel16.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 21, 48, 48));

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setMaximumSize(new java.awt.Dimension(330, 50));
        panelRound1.setMinimumSize(new java.awt.Dimension(330, 50));
        panelRound1.setPreferredSize(new java.awt.Dimension(330, 50));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField5.setFont(new java.awt.Font("Be Vietnam Pro", 0, 24)); // NOI18N
        jTextField5.setBorder(null);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        panelRound1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 0, 280, 50));

        jPanel16.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 330, 50));

        jPanel1.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 430, 90));

        jPanel3.setBackground(new java.awt.Color(45, 96, 151));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Be Vietnam Pro Medium", 0, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Xóa NV");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 210, 70));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 10, 230, 70));

        jPanel6.setBackground(new java.awt.Color(45, 96, 151));
        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Be Vietnam Pro Medium", 0, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Thêm NV");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 70));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 10, 230, 70));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 90));

        jPanel2.setBackground(new java.awt.Color(45, 96, 151));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTenNV.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 24)); // NOI18N
        jLabelTenNV.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTenNV.setText("Tên");
        jPanel2.add(jLabelTenNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 280, 60));

        jLabelSDT.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 24)); // NOI18N
        jLabelSDT.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSDT.setText("SDT");
        jPanel2.add(jLabelSDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 170, 60));

        jLabelChucVu.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 24)); // NOI18N
        jLabelChucVu.setForeground(new java.awt.Color(255, 255, 255));
        jLabelChucVu.setText("Chức vụ");
        jPanel2.add(jLabelChucVu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, 170, 60));

        jLabelMaNV.setBackground(new java.awt.Color(255, 255, 255));
        jLabelMaNV.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 24)); // NOI18N
        jLabelMaNV.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMaNV.setText("Mã NV");
        jPanel2.add(jLabelMaNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 160, 60));

        jLabelLuong.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 24)); // NOI18N
        jLabelLuong.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLuong.setText("Lương");
        jPanel2.add(jLabelLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 170, 60));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1200, 60));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(jPanel4);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1200, 750));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
//        String keyword = jTextField5.getText();
//        TestProcedure testProcedure = new TestProcedure();
//        jPanel4.removeAll();
//        if (keyword.length() != 0) {
//            List<KhachHangDTO> khachHangDTOs = testProcedure.SEARCH_KHACHHANG(keyword);
//            if (!khachHangDTOs.isEmpty()) {
//                for (KhachHangDTO khachHangDTO : khachHangDTOs) {
//                    //                    Product_icon product_icon = new Product_icon(sanPhamDTO);
//                    KhachHang khachHang = new KhachHang(khachHangDTO);
//                    jPanel4.add(khachHang);
//                }
//            }
//        } else {
//            for (int i = 0; i < khachHangBUS.getlist_KhachHangDTOs().size(); i++) {
//                KhachHang khachHang = new KhachHang(khachHangBUS.getlist_KhachHangDTOs().get(i));
//                jPanel4.add(khachHang);
//            }
//        }
//        jPanel4.revalidate();
//        jPanel4.repaint();
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        // TODO add your handling code here:
//        jDialogDeleteKH.setVisible(true);
        Component[] components = jPanel4.getComponents();

        // Iterate over the components in reverse order
        for (int i = components.length - 1; i >= 0; i--) {
            Component component = components[i];

            // Check if the component is an instance of Product
            if (component instanceof Product_icon) {
                Product_icon product_icon = (Product_icon) component;

                // Check if the product needs to be deleted
                if (product_icon.isSelect()) {
                    jDialogDeleteSP.setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        // TODO add your handling code here:
//        khachHangDAO = new KhachHangDAO();
//        jTextFieldMaKH.setText(khachHangDAO.AutoGenerateMaKH());
//        AbstractDocument doc = (AbstractDocument) jTextFieldSDTKH.getDocument();
//        doc.setDocumentFilter(new LimitDigitsDocumentFilter(10));
//        jDialogAddKH.setVisible(true);
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jPanel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel11MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jPanelSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelSaveMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jPanelSaveMouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel18MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JDialog jDialogAddSP;
    private javax.swing.JDialog jDialogDeleteSP;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelChucVu;
    private javax.swing.JLabel jLabelLuong;
    private javax.swing.JLabel jLabelMaNV;
    private javax.swing.JLabel jLabelSDT;
    private javax.swing.JLabel jLabelTenNV;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelSave;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private GUI.PanelRound panelRound1;
    private GUI.PanelRound panelRound2;
    // End of variables declaration//GEN-END:variables
}
