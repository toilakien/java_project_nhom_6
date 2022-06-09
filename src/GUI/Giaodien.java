package GUI;

import Entities.docgia;
import Entities.phieumuon;
import Entities.sach;
import Proceed.Giaotiep;
import Proceed.docghifile;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;




public final class Giaodien extends javax.swing.JFrame {

    DefaultTableModel model;//model cho bảng sách
    DefaultTableModel model1;//model cho bảng đọc giả
    DefaultTableModel model2;//model cho bảng khách mượn
    private ArrayList<Giaotiep> listsach;//danh sách sách
    private ArrayList<Giaotiep> listdocgia;//danh sách đọc giả
    private ArrayList<Giaotiep> listphieumuon;//danh sach phieu muon
    docghifile ioFile;

    public Giaodien() {
        ioFile = new docghifile();
        listsach = new ArrayList<>();
        listdocgia = new ArrayList<>();
        listphieumuon = new ArrayList<>();
        listsach = ioFile.doc("sach.txt");
        listdocgia = ioFile.doc("docgia.txt");
        listphieumuon = ioFile.doc("phieumuon.txt");
        initComponents();
        model = (DefaultTableModel) banghienthisach.getModel();
        model1 = (DefaultTableModel) banghienthidg.getModel();
        model2 = (DefaultTableModel) banghienthiphieumuon.getModel();
        hienthisach();
        hienthidocgia();
        hienthiphieumuon();
    }

    public void hienthisach() {
        for (Giaotiep g : listsach) {
            sach s = (sach) g;
            model.addRow(new Object[]{
                s.getMasach(), s.getTensach(), s.getTheloai(), s.getTacgia(), s.getSoluong(), s.getTinhtrang()
            });
        }
    }

    public void hienthidocgia() {
        for (Giaotiep g : listdocgia) {
            docgia dg = (docgia) g;
            model1.addRow(new Object[]{
                dg.getMadg(), dg.getTendg(), dg.getDiachi(), dg.getEmaildg(), dg.getSdtdg()
            });
        }
    }

    public void hienthiphieumuon() {
        for (Giaotiep g : listphieumuon) {
            phieumuon pm = (phieumuon) g;
            model2.addRow(new Object[]{
                pm.getMadausach(), pm.getMaphieumuon(), pm.getMadocgia(), pm.getNgaymuon()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        banghienthisach = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        nhaptensach = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        nhaptheloaisach = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        nhaptacgia = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        nhapsoluongsach = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tinhtrangsach = new javax.swing.JComboBox<>();
        themsach = new javax.swing.JButton();
        nutsuasach = new javax.swing.JButton();
        luusach = new javax.swing.JButton();
        nuthuy1 = new javax.swing.JButton();
        nutxoa = new javax.swing.JButton();
        nutThoat1 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        nhaptukhoasach = new javax.swing.JTextField();
        nuttimsach = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        suadg = new javax.swing.JButton();
        luudg = new javax.swing.JButton();
        themdg = new javax.swing.JButton();
        nuthuy2 = new javax.swing.JButton();
        xoadg = new javax.swing.JButton();
        nutThoat2 = new javax.swing.JButton();
        nhapsdt = new javax.swing.JTextField();
        nhapemail = new javax.swing.JTextField();
        nhapdiachi = new javax.swing.JTextField();
        nhaptendg = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        banghienthidg = new javax.swing.JTable();
        jLabel28 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        nhaptukhoadg = new javax.swing.JTextField();
        nuttimdg = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        nútuakhachmuon = new javax.swing.JButton();
        nutluukhachmuon = new javax.swing.JButton();
        nutthemkhach = new javax.swing.JButton();
        nuthuy3 = new javax.swing.JButton();
        nutxoakhachmuon = new javax.swing.JButton();
        NutThoat3 = new javax.swing.JButton();
        nhapngay = new javax.swing.JTextField();
        nhapmaspm = new javax.swing.JTextField();
        nhapmadgpm = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        banghienthiphieumuon = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        nhaptukhoapm = new javax.swing.JTextField();
        nuttimpm = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        tongsosach = new javax.swing.JTextField();
        tongsodg = new javax.swing.JTextField();
        tongsopm = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lí sách-nhóm 6");

        jTabbedPane1.setName("nhóm 6"); // NOI18N
        jTabbedPane1.setRequestFocusEnabled(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        banghienthisach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sách", "Tên sách", "Thể loại", "Tác giả", "Số lượng", "Tình trạng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(banghienthisach);

        jLabel6.setText("Tên sách");

        nhaptensach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhaptensachActionPerformed(evt);
            }
        });

        jLabel7.setText("Thể loại");

        nhaptheloaisach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhaptheloaisachActionPerformed(evt);
            }
        });

        jLabel8.setText("Tác giả");

        jLabel9.setText("Số lượng");

        jLabel10.setText("Tình trạng");

        tinhtrangsach.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Còn", "Hết" }));
        tinhtrangsach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tinhtrangsachActionPerformed(evt);
            }
        });

        themsach.setText("Thêm");
        themsach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themsachActionPerformed(evt);
            }
        });

        nutsuasach.setText("Sửa");
        nutsuasach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutsuasachActionPerformed(evt);
            }
        });

        luusach.setText("Lưu");
        luusach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luusachActionPerformed(evt);
            }
        });

        nuthuy1.setText("Hủy");
        nuthuy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuthuy1ActionPerformed(evt);
            }
        });

        nutxoa.setText("Xóa");
        nutxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutxoaActionPerformed(evt);
            }
        });

        nutThoat1.setText("Thoát chương trình");
        nutThoat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutThoat1ActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setText("Tìm Kiếm");

        jLabel25.setText("Từ Khóa");

        nhaptukhoasach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhaptukhoasachActionPerformed(evt);
            }
        });

        nuttimsach.setText("Tìm");
        nuttimsach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuttimsachActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nhaptensach, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                    .addComponent(nhaptheloaisach)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel9)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel8)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(tinhtrangsach, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(49, 49, 49))
                                            .addComponent(nhapsoluongsach, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(nhaptacgia, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(176, 176, 176)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(themsach, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(luusach, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(nuthuy1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(nutThoat1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(nutsuasach, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(nutxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(168, 168, 168)
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nhaptukhoasach, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nuttimsach)))
                        .addGap(0, 56, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel24)
                        .addGap(207, 207, 207))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(nhaptensach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(jLabel24)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(nhaptukhoasach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nuttimsach)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nhaptheloaisach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(themsach)
                            .addComponent(nutsuasach)
                            .addComponent(nutxoa))
                        .addGap(44, 44, 44))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nhaptacgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nhapsoluongsach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tinhtrangsach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nuthuy1)
                    .addComponent(luusach)
                    .addComponent(nutThoat1))
                .addGap(0, 45, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Quản lý sách", jPanel1);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        suadg.setText("Sửa");
        suadg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suadgActionPerformed(evt);
            }
        });

        luudg.setText("Lưu");
        luudg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luudgActionPerformed(evt);
            }
        });

        themdg.setText("Thêm");
        themdg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themdgActionPerformed(evt);
            }
        });

        nuthuy2.setText("Hủy");
        nuthuy2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuthuy2ActionPerformed(evt);
            }
        });

        xoadg.setText("Xóa");
        xoadg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoadgActionPerformed(evt);
            }
        });

        nutThoat2.setText("Thoát chương trình");
        nutThoat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutThoat2ActionPerformed(evt);
            }
        });

        nhapdiachi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhapdiachiActionPerformed(evt);
            }
        });

        jLabel11.setText("Tên đọc giả");

        jLabel12.setText("Địa chỉ");

        jLabel13.setText("Email");

        jLabel14.setText("Số điện thoại");

        banghienthidg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã đọc giả", "Tên đọc giả", "Địa chỉ", "email", "Số điện thoại"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(banghienthidg);

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel28.setText("Tìm kiếm");

        jLabel26.setText("Từ Khóa");

        nuttimdg.setText("Tìm");
        nuttimdg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuttimdgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(nhapemail)
                                    .addComponent(nhapdiachi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nhapsdt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(108, 108, 108)
                        .addComponent(jLabel26)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(nhaptukhoadg, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nuttimdg)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(themdg, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(luudg, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(suadg, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nuthuy2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(xoadg, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 180, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(nutThoat2)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(nhaptendg, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(263, 263, 263)
                        .addComponent(jLabel28)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(nhaptendg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(nhapemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nuttimdg)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12)
                                .addComponent(nhapdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel26)
                                .addComponent(nhaptukhoadg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(themdg)
                            .addComponent(suadg)
                            .addComponent(xoadg))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(nhapsdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuthuy2)
                    .addComponent(luudg)
                    .addComponent(nutThoat2))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Quản lý đọc giả", jPanel2);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        nútuakhachmuon.setText("Sửa TT mượn");
        nútuakhachmuon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nútuakhachmuonActionPerformed(evt);
            }
        });

        nutluukhachmuon.setText("Lưu");
        nutluukhachmuon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutluukhachmuonActionPerformed(evt);
            }
        });

        nutthemkhach.setText("Thêm TT mượn");
        nutthemkhach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutthemkhachActionPerformed(evt);
            }
        });

        nuthuy3.setText("Hủy");
        nuthuy3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuthuy3ActionPerformed(evt);
            }
        });

        nutxoakhachmuon.setText("Xóa TT đã trả");
        nutxoakhachmuon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutxoakhachmuonActionPerformed(evt);
            }
        });

        NutThoat3.setText("Thoát chương trình");
        NutThoat3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NutThoat3ActionPerformed(evt);
            }
        });

        nhapngay.setText("   /   / 2017");

        jLabel16.setText("Mã đọc giả");

        jLabel18.setText("Mã sách mượn");

        jLabel19.setText("Ngày mượn");

        banghienthiphieumuon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phiếu mượn", "Mã đọc giả mượn", "Mã sách mượn", "Ngày mượn"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(banghienthiphieumuon);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Seach");

        nuttimpm.setText("Tìm");
        nuttimpm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuttimpmActionPerformed(evt);
            }
        });

        jLabel27.setText("Từ khóa");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 917, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(22, 22, 22)
                                .addComponent(nhapmadgpm, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nhapmaspm, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(nhapngay, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17)
                        .addGap(339, 339, 339))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nhaptukhoapm, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nuttimpm)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(nutluukhachmuon, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(nuthuy3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NutThoat3))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(nutthemkhach, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(nútuakhachmuon, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nutxoakhachmuon)
                                .addGap(32, 32, 32)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(nhapmadgpm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(nhapmaspm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nhaptukhoapm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27)
                            .addComponent(nuttimpm))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nutxoakhachmuon)
                            .addComponent(nutthemkhach)
                            .addComponent(nútuakhachmuon))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nutluukhachmuon)
                            .addComponent(nuthuy3)
                            .addComponent(NutThoat3)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(nhapngay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel19)))))
                .addGap(0, 127, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Quản lý mượn sách", jPanel3);

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));

        jLabel20.setFont(new java.awt.Font("DialogInput", 1, 36)); // NOI18N
        jLabel20.setText("Thống kê số liệu");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Tổng số sách trong kho");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Tổng số đọc giả đã đăng ký");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Số sách đang cho mượn");

        tongsosach.setEditable(false);
        tongsosach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tongsosachActionPerformed(evt);
            }
        });

        tongsodg.setEditable(false);

        tongsopm.setEditable(false);

        jButton1.setText("Làm mới");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(jLabel20))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel23)
                                    .addGap(21, 21, 21))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel22)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(23, 23, 23)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tongsosach, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(tongsodg)
                            .addComponent(tongsopm)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(372, 372, 372)
                        .addComponent(jButton1)))
                .addContainerGap(297, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(tongsosach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(tongsodg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tongsopm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jButton1)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Thống kê", jPanel4);

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setText("Nhóm tác giả");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setText("Lê Văn Kiên (Nhóm trưởng)");

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setText("Nguyễn Văn Cường");

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel4.setText("Tô Văn Tài");

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel5.setText("Nguyễn Thanh Tuân");

        jLabel15.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel15.setText("Giảng viên:Trần Thái Cường");

        jLabel29.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel29.setText("Nguyễn Hoàng  Tuấn");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(342, 342, 342)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(292, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel29)
                .addGap(34, 34, 34)
                .addComponent(jLabel15)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Thông tin nhóm tác giả", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nhaptheloaisachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhaptheloaisachActionPerformed

    }//GEN-LAST:event_nhaptheloaisachActionPerformed

    private void nhapdiachiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhapdiachiActionPerformed

    }//GEN-LAST:event_nhapdiachiActionPerformed

    private void nutxoakhachmuonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutxoakhachmuonActionPerformed
 int hangpm = banghienthiphieumuon.getSelectedRow();
       if (hangpm != -1) {
           model2.removeRow(hangpm);
            listphieumuon.remove(hangpm);
           ioFile.ghi(listphieumuon, "phieumuon.txt");
        }else{
           JOptionPane.showMessageDialog(rootPane, "Bạn cần chọn dòng muốn xóa!");
       }
    
    }//GEN-LAST:event_nutxoakhachmuonActionPerformed

    public boolean khongtrungmasach(int masach) { 
        
        for (Giaotiep g : listsach) {
            sach s = (sach) g;
            if (s.getMasach() == masach) {
                return false;
            }
        }
        return true;
    }

    public boolean khongtrungmadg(int madg) {
        for (Giaotiep g : listdocgia) {
            docgia dg = (docgia) g;
            if (dg.getMadg() == madg) {
                return false;
            }
        }
        return true;
    }

    public boolean khongtrungmapm(int mapm) { 
        
        for (Giaotiep g : listphieumuon) {
            phieumuon pm = (phieumuon) g;
            if (pm.getMaphieumuon() == mapm) {
                return false;
            }
        }
        return true;    
    }
    private void themsachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themsachActionPerformed
        
        if (nhaptensach.getText().length() != 0) {
            int ma = 1;
            while (true) {
                if (khongtrungmasach(ma)) {
                    break;
                }
                ma++;
            }

            sach s = new sach();
            s.setMasach(ma);
            s.setTensach(nhaptensach.getText());
            s.setTheloai(nhaptheloaisach.getText());
            s.setTacgia(nhaptacgia.getText());

            if (nhapsoluongsach.getText().length() == 0) {
                s.setSoluong(0);
            } else {
                s.setSoluong(Integer.parseInt(nhapsoluongsach.getText()));//(1)
            }

            s.setTinhtrang(tinhtrangsach.getSelectedItem().toString());
            listsach.add(s);
            ioFile.ghi(listsach, "sach.txt");

            model.addRow(new Object[]{
                s.getMasach(), s.getTensach(), s.getTheloai(), s.getTacgia(), s.getSoluong(), s.getTinhtrang()});
            nhaptensach.setText("");
            nhapsoluongsach.setText("");
            nhaptheloaisach.setText("");
            nhaptacgia.setText("");
            
    }//GEN-LAST:event_themsachActionPerformed
     else {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần nhập Tên sách!");
        }
    }
    private void nhaptensachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhaptensachActionPerformed

    }//GEN-LAST:event_nhaptensachActionPerformed

    private void nutThoat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutThoat1ActionPerformed
        System.exit(0);//thoát hoàn toàn chương trình
    }//GEN-LAST:event_nutThoat1ActionPerformed

    private void nutThoat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutThoat2ActionPerformed
        System.exit(0);//thoát hoàn toàn chương trình
    }//GEN-LAST:event_nutThoat2ActionPerformed

    private void NutThoat3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NutThoat3ActionPerformed
        System.exit(0);//thoát hoàn toàn chương trình
    }//GEN-LAST:event_NutThoat3ActionPerformed

    private void tinhtrangsachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tinhtrangsachActionPerformed

    }//GEN-LAST:event_tinhtrangsachActionPerformed

    private void nutsuasachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutsuasachActionPerformed

        int hangchon;
        hangchon = banghienthisach.getSelectedRow(); 
        if (hangchon != -1) {
            nhaptensach.setText(model.getValueAt(hangchon, 1).toString());
            nhaptheloaisach.setText(model.getValueAt(hangchon, 2).toString());
            nhaptacgia.setText(model.getValueAt(hangchon, 3).toString());
            nhapsoluongsach.setText(model.getValueAt(hangchon, 4).toString());
            tinhtrangsach.setSelectedItem(model.getValueAt(hangchon, 5).toString());
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần chọn dòng muốn sửa!");
        }
    }//GEN-LAST:event_nutsuasachActionPerformed

    private void luusachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luusachActionPerformed
        
        if (nhaptensach.getText().length() != 0) {
            int hang = banghienthisach.getSelectedRow();
            
            sach s = new sach();
            s.setMasach(Integer.parseInt(model.getValueAt(hang, 0).toString()));//(2)
            s.setTensach(nhaptensach.getText());
            s.setTheloai(nhaptheloaisach.getText());
            s.setTacgia(nhaptacgia.getText());
            if (nhapsoluongsach.getText().length() == 0) {
                s.setSoluong(0);
            } else {
                s.setSoluong(Integer.parseInt(nhapsoluongsach.getText()));
            }

            s.setTinhtrang(tinhtrangsach.getSelectedItem().toString());
            listsach.set(hang, s);
            
            ioFile.ghi(listsach, "sach.txt");//Ghi thông tin ra file

            model.setValueAt(s.getMasach(), hang, 0);//ghi thông tin ra từng cột trong hàng
            model.setValueAt(s.getTensach(), hang, 1);
            model.setValueAt(s.getTheloai(), hang, 2);
            model.setValueAt(s.getTacgia(), hang, 3);
            model.setValueAt(s.getSoluong(), hang, 4);
            model.setValueAt(s.getTinhtrang(), hang, 5);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần nhập Tên sách!");
        }
    }//GEN-LAST:event_luusachActionPerformed

    private void nutxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutxoaActionPerformed
        
        int hang = banghienthisach.getSelectedRow();
        if (hang != -1) {
            model.removeRow(hang);//xóa thông tin trong hàng đã chọn
            listsach.remove(hang);//xóa thông tin trong list
            ioFile.ghi(listsach, "sach.txt");//xóa thông tin trong file lưu trữ
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần chọn dòng muốn xóa!");
        }
    }//GEN-LAST:event_nutxoaActionPerformed

    private void nuthuy1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuthuy1ActionPerformed
       
        nhaptensach.setText("");
        nhaptukhoasach.setText("");
        nhaptheloaisach.setText("");
        nhaptacgia.setText("");
        nhapsoluongsach.setText("");
        tinhtrangsach.setSelectedIndex(0);
    }//GEN-LAST:event_nuthuy1ActionPerformed

    private void nuthuy2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuthuy2ActionPerformed


        nhaptendg.setText("");
        nhaptukhoadg.setText("");
        nhapdiachi.setText("");
        nhapemail.setText("");
        nhapsdt.setText("");
    }//GEN-LAST:event_nuthuy2ActionPerformed

    private void nuthuy3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuthuy3ActionPerformed
       
        nhapmadgpm.setText("");
        nhapmaspm.setText("");
        nhapngay.setText("");
        nhaptukhoapm.setText("");
    }//GEN-LAST:event_nuthuy3ActionPerformed

    private void themdgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themdgActionPerformed
        
        if (nhaptendg.getText().length() != 0 && nhapsdt.getText().length() != 0 && nhapdiachi.getText().length() != 0 && nhapemail.getText().length() != 0) {//độ dài chuỗi nhập vào khác 0
            int madg = 10000;//khởi tạo mã sách là 10000
            while (true) {
                if (khongtrungmadg(madg)) {
                    break;
                }
                madg++;
            }
            docgia dg = new docgia();
            dg.setMadg(madg);
            dg.setTendg(nhaptendg.getText());
            dg.setDiachi(nhapdiachi.getText());
            dg.setEmaildg(nhapemail.getText());
            dg.setSdtdg(Integer.parseInt(nhapsdt.getText()));
            listdocgia.add(dg);//Ghi thông tin vào list
            ioFile.ghi(listdocgia, "docgia.txt");//Ghi thông tin ra file
            model1.addRow(new Object[]{//Ghi thông tin ra bảng
                dg.getMadg(), dg.getTendg(), dg.getDiachi(), dg.getEmaildg(), dg.getSdtdg()});
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần nhập tất cả thông tin!");
        }
    }//GEN-LAST:event_themdgActionPerformed

    private void suadgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suadgActionPerformed
        
        int hangdg;
        hangdg = banghienthidg.getSelectedRow(); 
        if (hangdg != -1) {
            nhaptendg.setText(model1.getValueAt(hangdg, 1).toString());
            nhapdiachi.setText(model1.getValueAt(hangdg, 2).toString());
            nhapemail.setText(model1.getValueAt(hangdg, 3).toString());
            nhapsdt.setText(model1.getValueAt(hangdg, 4).toString());
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần chọn đọc giả muốn sửa!");
        }

    }//GEN-LAST:event_suadgActionPerformed

    private void xoadgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoadgActionPerformed


        int hangdg = banghienthidg.getSelectedRow();
        if (hangdg != -1) {
            model1.removeRow(hangdg);
            listdocgia.remove(hangdg);
            ioFile.ghi(listdocgia, "docgia.DAT");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần chọn đọc giả muốn xóa!");
        }
    }//GEN-LAST:event_xoadgActionPerformed

    private void luudgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luudgActionPerformed
        
        if (nhaptendg.getText().length() != 0 && nhapsdt.getText().length() != 0 && nhapdiachi.getText().length() != 0 && nhapemail.getText().length() != 0) {
            int hangdg = banghienthidg.getSelectedRow();
            
            docgia dg = new docgia();
            dg.setMadg(Integer.parseInt(model1.getValueAt(hangdg, 0).toString()));//(3)
            dg.setTendg(nhaptendg.getText());
            dg.setDiachi(nhapdiachi.getText());
            dg.setEmaildg(nhapemail.getText());
            dg.setSdtdg(Integer.parseInt(nhapsdt.getText()));

            listdocgia.set(hangdg, dg);//sửa thông tin trong list
            ioFile.ghi(listdocgia, "docgia.txt");
            model1.setValueAt(dg.getMadg(), hangdg, 0);
            model1.setValueAt(dg.getTendg(), hangdg, 1);
            model1.setValueAt(dg.getDiachi(), hangdg, 2);
            model1.setValueAt(dg.getEmaildg(), hangdg, 3);
            model1.setValueAt(dg.getSdtdg(), hangdg, 4);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần nhập Tên sách!");
        }
    }//GEN-LAST:event_luudgActionPerformed

    private void nuthuytim1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuthuytim1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nuthuytim1ActionPerformed

    private void chontimsach1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chontimsach1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chontimsach1ActionPerformed

    private void nuttimsachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuttimsachActionPerformed
        

        model.fireTableDataChanged();
        
        TableRowSorter sorter = new TableRowSorter(model);
        banghienthisach.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter(nhaptukhoasach.getText()));
    }//GEN-LAST:event_nuttimsachActionPerformed

    private void nuttimdgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuttimdgActionPerformed
        

        model1.fireTableDataChanged();
        TableRowSorter sorter = new TableRowSorter(model1);
        banghienthidg.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter(nhaptukhoadg.getText()));
    }//GEN-LAST:event_nuttimdgActionPerformed

    private void nutthemkhachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutthemkhachActionPerformed
        if (nhapmadgpm.getText().length() != 0 && nhapmaspm.getText().length() != 0 && nhapngay.getText().length() != 0) {
            int mapm = 10000;//khởi tạo mã sách là 10000
            while (true) {
                if (khongtrungmapm(mapm)) {
                    break;
                }
                mapm++;
            }
            phieumuon pm = new phieumuon();
            pm.setMaphieumuon(mapm);
            pm.setNgaymuon(nhapngay.getText());
            pm.setMadausach(Integer.parseInt(nhapmaspm.getText()));
            pm.setMadocgia(Integer.parseInt(nhapmadgpm.getText()));
            listphieumuon.add(pm);
            ioFile.ghi(listphieumuon, "phieumuon.txt");//Ghi thông tin ra file
            model2.addRow(new Object[]{//Ghi thông tin ra bảng
                pm.getMaphieumuon(), pm.getMadocgia(), pm.getMadausach(), pm.getNgaymuon()});
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần nhập đầy đủ thông tin!");
        }
    }//GEN-LAST:event_nutthemkhachActionPerformed

    private void nútuakhachmuonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nútuakhachmuonActionPerformed
        int hangpm;
        hangpm = banghienthiphieumuon.getSelectedRow(); 
        if (hangpm != -1) {
            nhapmadgpm.setText(model2.getValueAt(hangpm, 1).toString());
            nhapmaspm.setText(model2.getValueAt(hangpm, 2).toString());
            nhapngay.setText(model2.getValueAt(hangpm, 3).toString());

        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần chọn phiếu mượn muốn sửa!");
        }
    }//GEN-LAST:event_nútuakhachmuonActionPerformed

    private void nutluukhachmuonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutluukhachmuonActionPerformed
        if (nhapmadgpm.getText().length() != 0 && nhapmaspm.getText().length() != 0 && nhapngay.getText().length() != 0) {
            int hangpm = banghienthiphieumuon.getSelectedRow();
            phieumuon pm = new phieumuon();
            pm.setMaphieumuon(Integer.parseInt(model2.getValueAt(hangpm, 0).toString()));
            pm.setMadausach(Integer.parseInt(nhapmaspm.getText()));
            pm.setMadocgia(Integer.parseInt(nhapmadgpm.getText()));
            pm.setNgaymuon(nhapngay.getText());

            listphieumuon.set(hangpm, pm);//sửa thông tin trong list
            ioFile.ghi(listphieumuon, "phieumuon.txt");//Ghi thông tin ra file
            model2.setValueAt(pm.getMadocgia(), hangpm, 1);//ghi thông tin ra từng cột trong hàng
            model2.setValueAt(pm.getMadausach(), hangpm, 2);
            model2.setValueAt(pm.getNgaymuon(), hangpm, 3);
            model2.setValueAt(pm.getMaphieumuon(), hangpm, 0);

        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần nhập đầy đủ thông tin!");

        }
    }//GEN-LAST:event_nutluukhachmuonActionPerformed

    private void nuttimpmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuttimpmActionPerformed
          model2.fireTableDataChanged();
        TableRowSorter sorter = new TableRowSorter(model2);
        banghienthiphieumuon.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter(nhaptukhoapm.getText()));
        
    }//GEN-LAST:event_nuttimpmActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int sosach = banghienthisach.getRowCount();
        int sodocgia = banghienthidg.getRowCount();
        int sopm = banghienthiphieumuon.getRowCount();
          tongsosach.setText  (""+sosach);
          tongsodg.setText  (""+sodocgia);
          tongsopm.setText  (""+sopm);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nhaptukhoasachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhaptukhoasachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nhaptukhoasachActionPerformed

    private void tongsosachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tongsosachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tongsosachActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Giaodien.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Giaodien.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Giaodien.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Giaodien.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Giaodien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NutThoat3;
    private javax.swing.JTable banghienthidg;
    private javax.swing.JTable banghienthiphieumuon;
    private javax.swing.JTable banghienthisach;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton luudg;
    private javax.swing.JButton luusach;
    private javax.swing.JTextField nhapdiachi;
    private javax.swing.JTextField nhapemail;
    private javax.swing.JTextField nhapmadgpm;
    private javax.swing.JTextField nhapmaspm;
    private javax.swing.JTextField nhapngay;
    private javax.swing.JTextField nhapsdt;
    private javax.swing.JTextField nhapsoluongsach;
    private javax.swing.JTextField nhaptacgia;
    private javax.swing.JTextField nhaptendg;
    private javax.swing.JTextField nhaptensach;
    private javax.swing.JTextField nhaptheloaisach;
    private javax.swing.JTextField nhaptukhoadg;
    private javax.swing.JTextField nhaptukhoapm;
    private javax.swing.JTextField nhaptukhoasach;
    private javax.swing.JButton nutThoat1;
    private javax.swing.JButton nutThoat2;
    private javax.swing.JButton nuthuy1;
    private javax.swing.JButton nuthuy2;
    private javax.swing.JButton nuthuy3;
    private javax.swing.JButton nutluukhachmuon;
    private javax.swing.JButton nutsuasach;
    private javax.swing.JButton nutthemkhach;
    private javax.swing.JButton nuttimdg;
    private javax.swing.JButton nuttimpm;
    private javax.swing.JButton nuttimsach;
    private javax.swing.JButton nutxoa;
    private javax.swing.JButton nutxoakhachmuon;
    private javax.swing.JButton nútuakhachmuon;
    private javax.swing.JButton suadg;
    private javax.swing.JButton themdg;
    private javax.swing.JButton themsach;
    private javax.swing.JComboBox<String> tinhtrangsach;
    private javax.swing.JTextField tongsodg;
    private javax.swing.JTextField tongsopm;
    private javax.swing.JTextField tongsosach;
    private javax.swing.JButton xoadg;
    // End of variables declaration//GEN-END:variables

    private Object getValueAt(int sosach) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}
