/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import BUS.KhoBUS;

/**
 *
 * @author Locc
 */
public class QLKho extends javax.swing.JPanel {

    private KhoBUS khoVanBUS;

    /**
     * Creates new form QLKho
     */
    public QLKho() {
        initComponents();
        khoVanBUS = new KhoBUS();
        for (int i = 0; i < khoVanBUS.getList_KhoVanDTOs().size(); i++) {
            LoHang loHang = new LoHang(khoVanBUS.getList_KhoVanDTOs().get(i));
            jPanel4.add(loHang);
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

        jDialogAddSP = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanelSave = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jDialogDeleteSP = new javax.swing.JDialog();
        panelRound1 = new GUI.PanelRound();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        panelRound2 = new GUI.PanelRound();
        jTextField5 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();

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

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 102, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 93, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 22, 104, 95));

        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(101, 77, 40));
        jLabel8.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 10)); // NOI18N
        jLabel8.setText("Chọn file");
        jPanel11.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, -2, 48, 30));

        jPanel9.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 124, 86, 26));

        jLabel9.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jLabel9.setText("Giá");
        jPanel9.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 222, 135, 24));

        jLabel10.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jLabel10.setText("Mã lô hàng");
        jPanel9.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 157, 135, 24));

        jLabel11.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jLabel11.setText("Mô tả");
        jPanel9.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 289, 135, 24));

        jLabel12.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jLabel12.setText("Thông tin chi tiết");
        jLabel12.setToolTipText("");
        jPanel9.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 377, 135, 24));

        jLabel13.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jLabel13.setText("Tên sản phẩm");
        jPanel9.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 22, 135, 24));

        jLabel14.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jLabel14.setText("Phân loại");
        jPanel9.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 87, 135, 24));

        jLabel15.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jLabel15.setText("Số lượng");
        jPanel9.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 156, 135, 24));

        jLabel16.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jLabel16.setText("NSX");
        jPanel9.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 223, 135, 24));

        jLabel17.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jLabel17.setText("HSD");
        jPanel9.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 301, 135, 24));

        jTextField1.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 96, 151)));
        jPanel9.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 181, 135, 24));

        jTextField2.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 96, 151)));
        jPanel9.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 246, 135, 24));

        jTextField3.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 96, 151)));
        jPanel9.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 313, 135, 24));

        jTextField4.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 96, 151)));
        jPanel9.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 46, 135, 24));

        jTextField6.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jTextField6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 96, 151)));
        jPanel9.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 180, 135, 24));

        jTextField7.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jTextField7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 96, 151)));
        jPanel9.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 247, 135, 24));

        jTextField8.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jTextField8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 96, 151)));
        jPanel9.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 325, 135, 24));

        jTextField9.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jTextField9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 96, 151)));
        jPanel9.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 401, 347, 24));

        jComboBox1.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PL1", "PL2", "PL3", "PL4", "PL5" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 96, 151)));
        jComboBox1.setLightWeightPopupEnabled(false);
        jComboBox1.setOpaque(true);
        jPanel9.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 111, 135, 24));

        jPanel8.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 400, 507));

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 51, 420, 517));

        jLabel18.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 20)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Thêm lô hàng");
        jPanel7.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 168, 60));

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/x.png"))); // NOI18N
        jLabel19.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 13, 24, 24));

        jDialogAddSP.getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 570));

        jDialogDeleteSP.setModal(true);
        jDialogDeleteSP.setUndecorated(true);
        jDialogDeleteSP.setResizable(false);
        jDialogDeleteSP.setSize(new java.awt.Dimension(625, 210));
        jDialogDeleteSP.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(143, 203, 253));
        panelRound1.setMaximumSize(new java.awt.Dimension(625, 210));
        panelRound1.setMinimumSize(new java.awt.Dimension(625, 210));
        panelRound1.setRoundBottomLeft(20);
        panelRound1.setRoundBottomRight(20);
        panelRound1.setRoundTopLeft(20);
        panelRound1.setRoundTopRight(20);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 22)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Xác nhận xóa lô hàng đã chọn?");
        panelRound1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 30, 610, -1));

        jLabel21.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 115, 130));
        jLabel21.setText("Lưu ý lô hàng sẽ bị xoá hoàn toàn và không thể khôi phục");
        panelRound1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 80, 610, -1));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(45, 96, 151), 2));
        jPanel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel12MouseClicked(evt);
            }
        });
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(45, 96, 151));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Hủy bỏ");
        jPanel12.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 5, 104, 32));

        panelRound1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(424, 143, 170, 45));

        jLabel23.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 19)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Xác nhận");
        panelRound1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 104, 32));

        jDialogDeleteSP.getContentPane().add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 625, 210));

        setMaximumSize(new java.awt.Dimension(1200, 900));
        setMinimumSize(new java.awt.Dimension(1200, 900));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(143, 203, 253));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel16.setBackground(new java.awt.Color(143, 203, 253));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search 1.png"))); // NOI18N
        jPanel16.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 21, 48, 48));

        panelRound2.setBackground(new java.awt.Color(255, 255, 255));
        panelRound2.setMaximumSize(new java.awt.Dimension(330, 50));
        panelRound2.setMinimumSize(new java.awt.Dimension(330, 50));
        panelRound2.setPreferredSize(new java.awt.Dimension(330, 50));
        panelRound2.setRoundBottomLeft(50);
        panelRound2.setRoundBottomRight(50);
        panelRound2.setRoundTopLeft(50);
        panelRound2.setRoundTopRight(50);
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField5.setBorder(null);
        panelRound2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 0, 280, 50));

        jPanel16.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 330, 50));

        jPanel1.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 430, 90));

        jPanel3.setBackground(new java.awt.Color(45, 96, 151));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Be Vietnam Pro Medium", 0, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Xóa lô hàng");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 210, 70));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 10, 230, 70));

        jPanel6.setBackground(new java.awt.Color(45, 96, 151));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Be Vietnam Pro Medium", 0, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Thêm lô hàng");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 210, 70));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 10, 230, 70));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 90));

        jPanel2.setBackground(new java.awt.Color(45, 96, 151));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SL SP trong LH");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 0, 190, 60));

        jLabel2.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tên nhà cung cấp");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 260, 60));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mã lô hàng");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 160, 60));

        jLabel24.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Ngày nhập");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 170, 60));

        jLabel25.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Mã NV");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 170, 60));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1200, 60));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(jPanel4);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1200, 750));
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelSaveMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelSaveMouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handling code here:
        jDialogAddSP.dispose();
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jPanel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseClicked
        // TODO add your handling code here:
        jDialogDeleteSP.dispose();
    }//GEN-LAST:event_jPanel12MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JDialog jDialogAddSP;
    private javax.swing.JDialog jDialogDeleteSP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
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
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private GUI.PanelRound panelRound1;
    private GUI.PanelRound panelRound2;
    // End of variables declaration//GEN-END:variables
}
