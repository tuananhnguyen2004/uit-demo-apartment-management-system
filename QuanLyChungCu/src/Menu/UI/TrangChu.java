/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Menu.UI;

/**
 *
 * @author Admin
 */
public class TrangChu extends javax.swing.JFrame {

    /**
     * Creates new form TrangChu
     */
    public TrangChu() {
        initComponents();
        tbl_HoaDon.getColumnModel().getColumn(4).setCellRenderer(new TableActionCellRender());
        tbl_HoaDon.getColumnModel().getColumn(4).setCellEditor(new TableActionCellEditor());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jbTrangChu = new javax.swing.JButton();
        jbHopDong = new javax.swing.JButton();
        jbThietBi = new javax.swing.JButton();
        jbNguoiThue = new javax.swing.JButton();
        jbHoaDon = new javax.swing.JButton();
        jbNhaCC = new javax.swing.JButton();
        jbLS = new javax.swing.JButton();
        jbDangXuat = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        tbTrangChu = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        tbNguoiThue = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tbHoaDon = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_HoaDon = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        tbNhaCungCap = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        tbHopDong = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        tbThietBi = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        tbLichSuThanhToan = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/UI/assets/Icons8-Ios7-Household-Apartment.48.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jbTrangChu.setBackground(new java.awt.Color(204, 255, 255));
        jbTrangChu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbTrangChu.setText("Trang chủ");
        jbTrangChu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jbTrangChu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbTrangChuMouseClicked(evt);
            }
        });
        jbTrangChu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTrangChuActionPerformed(evt);
            }
        });

        jbHopDong.setBackground(new java.awt.Color(204, 255, 255));
        jbHopDong.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbHopDong.setText("Hợp đồng");
        jbHopDong.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jbHopDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbHopDongActionPerformed(evt);
            }
        });

        jbThietBi.setBackground(new java.awt.Color(204, 255, 255));
        jbThietBi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbThietBi.setText("Thiết bị");
        jbThietBi.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jbThietBi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbThietBiActionPerformed(evt);
            }
        });

        jbNguoiThue.setBackground(new java.awt.Color(204, 255, 255));
        jbNguoiThue.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbNguoiThue.setText("Người thuê");
        jbNguoiThue.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jbNguoiThue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbNguoiThueMouseClicked(evt);
            }
        });
        jbNguoiThue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNguoiThueActionPerformed(evt);
            }
        });

        jbHoaDon.setBackground(new java.awt.Color(204, 255, 255));
        jbHoaDon.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbHoaDon.setText("Hóa Đơn");
        jbHoaDon.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jbHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbHoaDonActionPerformed(evt);
            }
        });

        jbNhaCC.setBackground(new java.awt.Color(204, 255, 255));
        jbNhaCC.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbNhaCC.setText("Nhà cung cấp");
        jbNhaCC.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jbNhaCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNhaCCActionPerformed(evt);
            }
        });

        jbLS.setBackground(new java.awt.Color(204, 255, 255));
        jbLS.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbLS.setText("Lịch sử thanh toán");
        jbLS.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jbLS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLSActionPerformed(evt);
            }
        });

        jbDangXuat.setBackground(new java.awt.Color(255, 204, 204));
        jbDangXuat.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbDangXuat.setText("Đăng xuất");
        jbDangXuat.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbNguoiThue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbThietBi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbHopDong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbNhaCC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbLS, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jbDangXuat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbNguoiThue, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbNhaCC, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbHopDong, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbThietBi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbLS, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Quản lý chung cư");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Trang chủ");

        javax.swing.GroupLayout tbTrangChuLayout = new javax.swing.GroupLayout(tbTrangChu);
        tbTrangChu.setLayout(tbTrangChuLayout);
        tbTrangChuLayout.setHorizontalGroup(
            tbTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        tbTrangChuLayout.setVerticalGroup(
            tbTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("NguoiThue");

        javax.swing.GroupLayout tbNguoiThueLayout = new javax.swing.GroupLayout(tbNguoiThue);
        tbNguoiThue.setLayout(tbNguoiThueLayout);
        tbNguoiThueLayout.setHorizontalGroup(
            tbNguoiThueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbNguoiThueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 861, Short.MAX_VALUE)
                .addContainerGap())
        );
        tbNguoiThueLayout.setVerticalGroup(
            tbNguoiThueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbNguoiThueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                .addContainerGap())
        );

        tbl_HoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã hóa đơn", "Mã người thuê", "Ngày", "Trị giá", "Hành động"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_HoaDon.setRowHeight(30);
        jScrollPane1.setViewportView(tbl_HoaDon);

        jButton1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.hoverBorderColor"));
        jButton1.setText("Thêm");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tbHoaDonLayout = new javax.swing.GroupLayout(tbHoaDon);
        tbHoaDon.setLayout(tbHoaDonLayout);
        tbHoaDonLayout.setHorizontalGroup(
            tbHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbHoaDonLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(tbHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tbHoaDonLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 665, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tbHoaDonLayout.setVerticalGroup(
            tbHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbHoaDonLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("NhaCungCap");

        javax.swing.GroupLayout tbNhaCungCapLayout = new javax.swing.GroupLayout(tbNhaCungCap);
        tbNhaCungCap.setLayout(tbNhaCungCapLayout);
        tbNhaCungCapLayout.setHorizontalGroup(
            tbNhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 873, Short.MAX_VALUE)
        );
        tbNhaCungCapLayout.setVerticalGroup(
            tbNhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
        );

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("HopDong");

        javax.swing.GroupLayout tbHopDongLayout = new javax.swing.GroupLayout(tbHopDong);
        tbHopDong.setLayout(tbHopDongLayout);
        tbHopDongLayout.setHorizontalGroup(
            tbHopDongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 873, Short.MAX_VALUE)
        );
        tbHopDongLayout.setVerticalGroup(
            tbHopDongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
        );

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ThietBi");

        javax.swing.GroupLayout tbThietBiLayout = new javax.swing.GroupLayout(tbThietBi);
        tbThietBi.setLayout(tbThietBiLayout);
        tbThietBiLayout.setHorizontalGroup(
            tbThietBiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 873, Short.MAX_VALUE)
        );
        tbThietBiLayout.setVerticalGroup(
            tbThietBiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
        );

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("LichSuThanhToan");

        javax.swing.GroupLayout tbLichSuThanhToanLayout = new javax.swing.GroupLayout(tbLichSuThanhToan);
        tbLichSuThanhToan.setLayout(tbLichSuThanhToanLayout);
        tbLichSuThanhToanLayout.setHorizontalGroup(
            tbLichSuThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 873, Short.MAX_VALUE)
        );
        tbLichSuThanhToanLayout.setVerticalGroup(
            tbLichSuThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbTrangChu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(tbNguoiThue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(tbHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(tbNhaCungCap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(tbHopDong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(tbThietBi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(tbLichSuThanhToan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(tbTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addComponent(tbNguoiThue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addComponent(tbHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addComponent(tbNhaCungCap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addComponent(tbHopDong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addComponent(tbThietBi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addComponent(tbLichSuThanhToan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbThietBiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbThietBiActionPerformed
        // TODO add your handling code here:
        tbTrangChu.setVisible(false);
        tbNguoiThue.setVisible(false);
        tbHoaDon.setVisible(false);
        tbNhaCungCap.setVisible(false);
        tbHopDong.setVisible(false);
        tbThietBi.setVisible(true);
        tbLichSuThanhToan.setVisible(false);
    }//GEN-LAST:event_jbThietBiActionPerformed

    private void jbNguoiThueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNguoiThueActionPerformed
        // TODO add your handling code here:
        tbTrangChu.setVisible(false);
        tbNguoiThue.setVisible(true);
        tbHoaDon.setVisible(false);
        tbNhaCungCap.setVisible(false);
        tbHopDong.setVisible(false);
        tbThietBi.setVisible(false);
        tbLichSuThanhToan.setVisible(false);
    }//GEN-LAST:event_jbNguoiThueActionPerformed

    private void jbHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbHoaDonActionPerformed
        // TODO add your handling code here:
        tbTrangChu.setVisible(false);
        tbNguoiThue.setVisible(false);
        tbHoaDon.setVisible(true);
        tbNhaCungCap.setVisible(false);
        tbHopDong.setVisible(false);
        tbThietBi.setVisible(false);
        tbLichSuThanhToan.setVisible(false);
    }//GEN-LAST:event_jbHoaDonActionPerformed

    private void jbNhaCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNhaCCActionPerformed
        // TODO add your handling code here:
        tbTrangChu.setVisible(false);
        tbNguoiThue.setVisible(false);
        tbHoaDon.setVisible(false);
        tbNhaCungCap.setVisible(true);
        tbHopDong.setVisible(false);
        tbThietBi.setVisible(false);
        tbLichSuThanhToan.setVisible(false);
    }//GEN-LAST:event_jbNhaCCActionPerformed

    private void jbLSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLSActionPerformed
        // TODO add your handling code here:
        tbTrangChu.setVisible(false);
        tbNguoiThue.setVisible(false);
        tbHoaDon.setVisible(false);
        tbNhaCungCap.setVisible(false);
        tbHopDong.setVisible(false);
        tbThietBi.setVisible(false);
        tbLichSuThanhToan.setVisible(true);
    }//GEN-LAST:event_jbLSActionPerformed

    private void jbTrangChuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTrangChuActionPerformed
        // TODO add your handling code here:
        tbTrangChu.setVisible(true);
        tbNguoiThue.setVisible(false);
        tbHoaDon.setVisible(false);
        tbNhaCungCap.setVisible(false);
        tbHopDong.setVisible(false);
        tbThietBi.setVisible(false);
        tbLichSuThanhToan.setVisible(false);
    }//GEN-LAST:event_jbTrangChuActionPerformed

    private void jbTrangChuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbTrangChuMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jbTrangChuMouseClicked

    private void jbNguoiThueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbNguoiThueMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jbNguoiThueMouseClicked

    private void jbHopDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbHopDongActionPerformed
        // TODO add your handling code here:
        tbTrangChu.setVisible(false);
        tbNguoiThue.setVisible(false);
        tbHoaDon.setVisible(false);
        tbNhaCungCap.setVisible(false);
        tbHopDong.setVisible(true);
        tbThietBi.setVisible(false);
        tbLichSuThanhToan.setVisible(false);
    }//GEN-LAST:event_jbHopDongActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbDangXuat;
    private javax.swing.JButton jbHoaDon;
    private javax.swing.JButton jbHopDong;
    private javax.swing.JButton jbLS;
    private javax.swing.JButton jbNguoiThue;
    private javax.swing.JButton jbNhaCC;
    private javax.swing.JButton jbThietBi;
    private javax.swing.JButton jbTrangChu;
    private javax.swing.JPanel tbHoaDon;
    private javax.swing.JPanel tbHopDong;
    private javax.swing.JPanel tbLichSuThanhToan;
    private javax.swing.JPanel tbNguoiThue;
    private javax.swing.JPanel tbNhaCungCap;
    private javax.swing.JPanel tbThietBi;
    private javax.swing.JPanel tbTrangChu;
    private javax.swing.JTable tbl_HoaDon;
    // End of variables declaration//GEN-END:variables
}
