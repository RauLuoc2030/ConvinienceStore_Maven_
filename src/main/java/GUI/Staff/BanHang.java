/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI.Staff;

import BUS.SanPhamBUS;
import DTO.SanPhamDTO;
import GUI.Product;
import GUI.Product_icon;

import java.awt.Component;
import java.awt.event.*;

/**
 *
 * @author Locc
 */
public class BanHang extends javax.swing.JFrame {

    private SanPhamBUS sanPhamBUS;
    private boolean isjTextField_TimKiemActionPerformedEnable = true;

    /**
     * Creates new form BanHang
     */
    public BanHang() {
        initComponents();
        setLocationRelativeTo(null);
        sanPhamBUS = new SanPhamBUS();
        for (int i = 0; i < sanPhamBUS.getList_SanPhamDTOs().size(); i++) {
            Product_icon product_icon = new Product_icon(sanPhamBUS.getList_SanPhamDTOs().get(i));

            product_icon.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    System.out.println("Click");
                    Component[] components = jPanelGioHang.getComponents();
                    if (components.length == 0) {

                        Product p = new Product(product_icon.getTen(), product_icon.getGia());
                        jPanelGioHang.add(p);
                        updateTongGia();
                        jPanelGioHang.revalidate();
                        jPanelGioHang.repaint();
                    } else {
                        boolean isExist = false;
                        // Iterate over the components in reverse order
                        for (int i = components.length - 1; i >= 0; i--) {
                            Component component = components[i];
                            if (component instanceof Product) {
                                Product product = (Product) component;
                                // TODO: Kiểm tra sản phẩm đã tồn tại trong giỏ hàng hay chưa
                                if (product.getTen().equals(product_icon.getTen())
                                        && product.getGia().equals(product_icon.getGia())) { // Đã tồn tại
                                    // Tăng số lượng lên
                                    product.tangSoLuong();
                                    updateTongGia();
                                    jPanelGioHang.revalidate();
                                    jPanelGioHang.repaint();
                                    isExist = true;
                                    System.out.println("Sản phẩm đã tồn tại");
                                }
                            }
                        }

                        if (!isExist) { // Chưa tồn tại
                            Product p = new Product(product_icon.getTen(), product_icon.getGia());
                            jPanelGioHang.add(p);
                            updateTongGia();
                            jPanelGioHang.revalidate();
                            jPanelGioHang.repaint();
                            System.out.println("Sản phẩm chưa tồn tại");
                        }
                    }
                }
            });

            product_icon.getjPanel11().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    Component[] components = jPanelGioHang.getComponents();
                    if (components.length == 0) {

                        Product p = new Product(product_icon.getTen(), product_icon.getGia());
                        jPanelGioHang.add(p);
                        updateTongGia();
                        jPanelGioHang.revalidate();
                        jPanelGioHang.repaint();
                    } else {
                        boolean isExist = false;
                        for (Component component : components) {
                            if (component instanceof Product) {
                                Product product = (Product) component;
                                // TODO: Kiểm tra sản phẩm đã tồn tại trong giỏ hàng hay chưa
                                if (product.getTen().equals(product_icon.getTen())
                                        && product.getGia().equals(product_icon.getGia())) { // Đã tồn tại
                                    // Tăng số lượng lên
                                    product.tangSoLuong();
                                    updateTongGia();
                                    jPanelGioHang.revalidate();
                                    jPanelGioHang.repaint();
                                    isExist = true;
                                    System.out.println("Sản phẩm đã tồn tại");

                                }
                            }
                        }

                        if (!isExist) { // Chưa tồn tại
                            Product p = new Product(product_icon.getTen(), product_icon.getGia());
                            jPanelGioHang.add(p);
                            updateTongGia();
                            jPanelGioHang.revalidate();
                            jPanelGioHang.repaint();
                            System.out.println("Sản phẩm chưa tồn tại");
                        }
                    }
                }
            });

            product_icon.getjLabelTen().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    Component[] components = jPanelGioHang.getComponents();
                    if (components.length == 0) {

                        Product p = new Product(product_icon.getTen(), product_icon.getGia());
                        jPanelGioHang.add(p);
                        updateTongGia();
                        jPanelGioHang.revalidate();
                        jPanelGioHang.repaint();
                    } else {
                        boolean isExist = false;
                        for (Component component : components) {
                            if (component instanceof Product) {
                                Product product = (Product) component;
                                // TODO: Kiểm tra sản phẩm đã tồn tại trong giỏ hàng hay chưa
                                if (product.getTen().equals(product_icon.getTen())
                                        && product.getGia().equals(product_icon.getGia())) { // Đã tồn tại
                                    // Tăng số lượng lên
                                    product.tangSoLuong();
                                    updateTongGia();
                                    jPanelGioHang.revalidate();
                                    jPanelGioHang.repaint();
                                    isExist = true;
                                    System.out.println("Sản phẩm đã tồn tại");

                                }
                            }
                        }

                        if (!isExist) { // Chưa tồn tại
                            Product p = new Product(product_icon.getTen(), product_icon.getGia());
                            jPanelGioHang.add(p);
                            updateTongGia();
                            jPanelGioHang.revalidate();
                            jPanelGioHang.repaint();
                            System.out.println("Sản phẩm chưa tồn tại");
                        }
                    }
                }
            });

            product_icon.getjLabelGia().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    Component[] components = jPanelGioHang.getComponents();
                    if (components.length == 0) {

                        Product p = new Product(product_icon.getTen(), product_icon.getGia());
                        jPanelGioHang.add(p);
                        updateTongGia();
                        jPanelGioHang.revalidate();
                        jPanelGioHang.repaint();
                    } else {
                        boolean isExist = false;
                        for (Component component : components) {
                            if (component instanceof Product) {
                                Product product = (Product) component;
                                // TODO: Kiểm tra sản phẩm đã tồn tại trong giỏ hàng hay chưa
                                if (product.getTen().equals(product_icon.getTen())
                                        && product.getGia().equals(product_icon.getGia())) { // Đã tồn tại
                                    // Tăng số lượng lên
                                    product.tangSoLuong();
                                    updateTongGia();
                                    jPanelGioHang.revalidate();
                                    jPanelGioHang.repaint();
                                    isExist = true;
                                    System.out.println("Sản phẩm đã tồn tại");

                                }
                            }
                        }

                        if (!isExist) { // Chưa tồn tại
                            Product p = new Product(product_icon.getTen(), product_icon.getGia());
                            jPanelGioHang.add(p);
                            updateTongGia();
                            jPanelGioHang.revalidate();
                            jPanelGioHang.repaint();
                            System.out.println("Sản phẩm chưa tồn tại");
                        }
                    }
                }
            });

            product_icon.getjLabelSL().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    Component[] components = jPanelGioHang.getComponents();
                    if (components.length == 0) {

                        Product p = new Product(product_icon.getTen(), product_icon.getGia());
                        jPanelGioHang.add(p);
                        updateTongGia();
                        jPanelGioHang.revalidate();
                        jPanelGioHang.repaint();
                    } else {
                        boolean isExist = false;
                        for (Component component : components) {
                            if (component instanceof Product) {
                                Product product = (Product) component;
                                // TODO: Kiểm tra sản phẩm đã tồn tại trong giỏ hàng hay chưa
                                if (product.getTen().equals(product_icon.getTen())
                                        && product.getGia().equals(product_icon.getGia())) { // Đã tồn tại
                                    // Tăng số lượng lên
                                    product.tangSoLuong();
                                    updateTongGia();
                                    jPanelGioHang.revalidate();
                                    jPanelGioHang.repaint();
                                    isExist = true;
                                    System.out.println("Sản phẩm đã tồn tại");

                                }
                            }
                        }

                        if (!isExist) { // Chưa tồn tại
                            Product p = new Product(product_icon.getTen(), product_icon.getGia());
                            jPanelGioHang.add(p);
                            updateTongGia();
                            jPanelGioHang.revalidate();
                            jPanelGioHang.repaint();
                            System.out.println("Sản phẩm chưa tồn tại");
                        }
                    }
                }
            });
            jPanelSanPham.add(product_icon);
            product_icon.addMouseListener(product_icon);

        }
        jPanelSanPham.revalidate();
        jPanelSanPham.repaint();
        // System.out.println("GUI.BanHang.jPanel7MouseClicked()");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelProduct = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jTextField_TimKiem = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton_7 = new javax.swing.JButton();
        jButton_8 = new javax.swing.JButton();
        jButton_9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton_4 = new javax.swing.JButton();
        jButton_5 = new javax.swing.JButton();
        jButton_6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton_1 = new javax.swing.JButton();
        jButton_2 = new javax.swing.JButton();
        jButton_3 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton_0 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButtonXoa = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanelGioHang = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanelSanPham = new javax.swing.JPanel();

        jPanelProduct.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("icon");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel11.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 150));

        jLabel5.setText("Tên ");
        jPanel11.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 150, 25));

        jLabel6.setText("Giá");
        jPanel11.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 175, 150, 25));

        jPanelProduct.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 200));

        jPanel15.setBackground(new java.awt.Color(204, 204, 255));

        jLabel8.setText("Product 1");

        jLabel9.setText("Số lượng:");

        jLabel10.setText("Tiền");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(128, 128, 128)
                        .addComponent(jLabel10))
                    .addComponent(jLabel8))
                .addContainerGap(274, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setLabel("Thoát");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jTextField_TimKiem.setBackground(new java.awt.Color(204, 204, 204));
        jTextField_TimKiem.setText("Tìm kiếm");
        jTextField_TimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_TimKiemMouseClicked(evt);
            }
        });
        jTextField_TimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_TimKiemActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_TimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 0, 200, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 50));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("label");
        jPanel7.add(jLabel1, new java.awt.GridBagConstraints());

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 60));

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Thanh Toán");
        jPanel3.add(jLabel2, new java.awt.GridBagConstraints());

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 250, 190));

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 250, 250));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(new java.awt.GridLayout(4, 4));

        jButton_7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton_7.setText("7");
        jPanel5.add(jButton_7);
        jButton_7.getAccessibleContext().setAccessibleName("jButton1");

        jButton_8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton_8.setText("8");
        jPanel5.add(jButton_8);

        jButton_9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton_9.setText("9");
        jPanel5.add(jButton_9);

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton8.setText("SL");
        jPanel5.add(jButton8);

        jButton_4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton_4.setText("4");
        jPanel5.add(jButton_4);

        jButton_5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton_5.setText("5");
        jPanel5.add(jButton_5);

        jButton_6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton_6.setText("6");
        jPanel5.add(jButton_6);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel5.add(jButton1);

        jButton_1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton_1.setText("1");
        jPanel5.add(jButton_1);

        jButton_2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton_2.setText("2");
        jPanel5.add(jButton_2);

        jButton_3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton_3.setText("3");
        jPanel5.add(jButton_3);

        jButton11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel5.add(jButton11);

        jButton12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel5.add(jButton12);

        jButton_0.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton_0.setText("0");
        jPanel5.add(jButton_0);

        jButton15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton15.setText(",");
        jPanel5.add(jButton15);

        jButtonXoa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonXoa.setText("Xóa");
        jButtonXoa.setFocusable(false);
        jButtonXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonXoaMouseClicked(evt);
            }
        });
        jPanel5.add(jButtonXoa);

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 600, 250, 250));

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setText("mua");
        jPanel8.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, 40));

        jPanel9.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 167, 40));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 165, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 0, 167, 40));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 164, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 0, 166, 40));

        jPanel4.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 500, 40));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Tổng:");
        jPanel10.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 180, 60));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("0");
        jPanel10.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 230, 60));

        jPanel4.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 500, 60));

        jPanelGioHang.setLayout(new javax.swing.BoxLayout(jPanelGioHang, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(jPanelGioHang);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 500, 850));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 24)); // NOI18N
        jLabel12.setText("Tên sản phẩm");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 490, 40));

        jLabel13.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 24)); // NOI18N
        jLabel13.setText("Giá");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 5, 60, 40));

        jLabel14.setFont(new java.awt.Font("Be Vietnam Pro SemiBold", 0, 24)); // NOI18N
        jLabel14.setText("Số lượng");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 5, 150, 40));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 1100, 50));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanelSanPham.setLayout(new javax.swing.BoxLayout(jPanelSanPham, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane2.setViewportView(jPanelSanPham);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 1100, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        NhanVienHomePage nhanVienHomePage = new NhanVienHomePage();
        nhanVienHomePage.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jPanel3MouseClicked

    private void jButtonXoaMouseClicked(java.awt.event.MouseEvent evt) {
        Component[] components = jPanelGioHang.getComponents();

        // Iterate over the components in reverse order
        for (int i = components.length - 1; i >= 0; i--) {
            Component component = components[i];

            // Check if the component is an instance of Product
            if (component instanceof Product) {
                Product product = (Product) component;

                // Check if the product needs to be deleted
                if (product.isSelect()) {
                    // Remove the product from the panel and update the UI
                    jPanelGioHang.remove(product);
                    updateTongGia();
                }
            }
        }

        // Update the UI after all products have been removed
        jPanelGioHang.revalidate();
        jPanelGioHang.repaint();
    }

    private void jTextField_TimKiemActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField_TimKiemActionPerformed
        String text = jTextField_TimKiem.getText();
        if (text.length() != 0) {
            sanPhamBUS = new SanPhamBUS();
            SanPhamDTO sp = sanPhamBUS.tim(text);
            if (sp != null) {
                Product_icon p = new Product_icon(sp);
                jPanelSanPham.removeAll();
                jPanelSanPham.add(p);

            } else {
                jPanelSanPham.removeAll();
            }
            jPanelSanPham.revalidate();
            jPanelSanPham.repaint();
            System.out.println("TextField contains text");
        } else {
            jPanelSanPham.removeAll();
            sanPhamBUS = new SanPhamBUS();
            for (int i = 0; i < sanPhamBUS.getList_SanPhamDTOs().size(); i++) {
                Product_icon product_icon = new Product_icon(sanPhamBUS.getList_SanPhamDTOs().get(i));
                jPanelSanPham.add(product_icon);
            }
            jPanelSanPham.revalidate();
            jPanelSanPham.repaint();
        }
    }// GEN-LAST:event_jTextField_TimKiemActionPerformed

    private void jTextField_TimKiemMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jTextField_TimKiemMouseClicked
        if (isjTextField_TimKiemActionPerformedEnable) {
            jTextField_TimKiem.setText("");
            isjTextField_TimKiemActionPerformedEnable = false;
        }

    }// GEN-LAST:event_jTextField_TimKiemMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
    }// GEN-LAST:event_jLabel4MouseClicked

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanel7MouseClicked
        // TODO add your handling code here:

    }// GEN-LAST:event_jPanel7MouseClicked

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanel8MouseClicked
        // TODO add your handling code here:
        Product p = new Product();
        jPanelGioHang.add(p);
        jPanelSanPham.revalidate();
        jPanelSanPham.repaint();
    }// GEN-LAST:event_jPanel8MouseClicked

    public void updateTongGia() {
        Integer tongGia = 0;
        Component[] components = jPanelGioHang.getComponents();
        // Iterate over the components in reverse order
        for (int i = components.length - 1; i >= 0; i--) {
            Component component = components[i];

            // Check if the component is an instance of Product
            if (component instanceof Product) {
                Product product = (Product) component;

                tongGia += product.getSl() * Integer.valueOf(product.getGia());
            }
        }
        jLabel7.setText(tongGia.toString());
        // Update the UI after all products have been removed
        jPanelGioHang.revalidate();
        jPanelGioHang.repaint();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BanHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BanHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BanHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BanHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BanHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButtonXoa;
    private javax.swing.JButton jButton_0;
    private javax.swing.JButton jButton_1;
    private javax.swing.JButton jButton_2;
    private javax.swing.JButton jButton_3;
    private javax.swing.JButton jButton_4;
    private javax.swing.JButton jButton_5;
    private javax.swing.JButton jButton_6;
    private javax.swing.JButton jButton_7;
    private javax.swing.JButton jButton_8;
    private javax.swing.JButton jButton_9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelGioHang;
    private javax.swing.JPanel jPanelProduct;
    private javax.swing.JPanel jPanelSanPham;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField_TimKiem;
    // End of variables declaration//GEN-END:variables
}
