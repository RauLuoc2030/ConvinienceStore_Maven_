/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import DTO.SanPhamDTO;
import static GUI.LoHang.formatter;

/**
 *
 * @author Locc
 */
public class CTKho extends javax.swing.JPanel {

    /**
     * Creates new form CTKho
     */
    public CTKho() {
        initComponents();
    }

    public CTKho(SanPhamDTO sanPhamDTO) {
        initComponents();
        jLabelMaSP.setText(sanPhamDTO.getMaSPString());
        jLabelTenSP.setText(sanPhamDTO.getTenSPString());
        jLabelTenSP.setToolTipText(sanPhamDTO.getTenSPString());
        jLabelPhanLoai.setText(sanPhamDTO.getPhanLoaiString());
        jLabelPhanLoai.setToolTipText(sanPhamDTO.getPhanLoaiString());
        jLabelNSX.setText(formatter.format(sanPhamDTO.getNSXDate()));
        jLabelHSD.setText(formatter.format(sanPhamDTO.getHSDDate()));
        jLabelSoLuong.setText(sanPhamDTO.getSoLuongSPInt().toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTenSP = new javax.swing.JLabel();
        jLabelMaSP = new javax.swing.JLabel();
        jLabelHSD = new javax.swing.JLabel();
        jLabelPhanLoai = new javax.swing.JLabel();
        jLabelNSX = new javax.swing.JLabel();
        jLabelSoLuong = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        setMaximumSize(new java.awt.Dimension(1148, 60));
        setMinimumSize(new java.awt.Dimension(1148, 60));
        setPreferredSize(new java.awt.Dimension(1148, 60));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTenSP.setFont(new java.awt.Font("Be Vietnam Pro Light", 0, 24)); // NOI18N
        jLabelTenSP.setText("Tên sản phẩm");
        add(jLabelTenSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 297, 60));

        jLabelMaSP.setFont(new java.awt.Font("Be Vietnam Pro Light", 0, 24)); // NOI18N
        jLabelMaSP.setText("SP001");
        add(jLabelMaSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 150, 60));

        jLabelHSD.setFont(new java.awt.Font("Be Vietnam Pro Light", 0, 24)); // NOI18N
        jLabelHSD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHSD.setText("HSD");
        add(jLabelHSD, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 180, 60));

        jLabelPhanLoai.setFont(new java.awt.Font("Be Vietnam Pro Light", 0, 24)); // NOI18N
        jLabelPhanLoai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPhanLoai.setText("Phân loại");
        add(jLabelPhanLoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 180, 60));

        jLabelNSX.setFont(new java.awt.Font("Be Vietnam Pro Light", 0, 24)); // NOI18N
        jLabelNSX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNSX.setText("NSX");
        add(jLabelNSX, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, 180, 60));

        jLabelSoLuong.setFont(new java.awt.Font("Be Vietnam Pro Light", 0, 24)); // NOI18N
        jLabelSoLuong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSoLuong.setText("SL");
        add(jLabelSoLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 0, 132, 60));
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelHSD;
    private javax.swing.JLabel jLabelMaSP;
    private javax.swing.JLabel jLabelNSX;
    private javax.swing.JLabel jLabelPhanLoai;
    private javax.swing.JLabel jLabelSoLuong;
    private javax.swing.JLabel jLabelTenSP;
    // End of variables declaration//GEN-END:variables
}
