/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anhph
 */
public class quanliperson extends javax.swing.JFrame {

    /**
     * Creates new form quanliperson
     */
    public quanliperson() throws Exception {
        initComponents();
        LoadDBData2JTable();
    }
    private String header[] = {"Tên đăng nhập", "Mật khẩu", "Tuổi", "giới tính", "email", "Phân quyền", "Họ tên"};
    private DefaultTableModel tblModel = new DefaultTableModel(header, 0);

    public void LoadDBData2JTable() throws Exception {

        Connection con = getConnection();
        String sql = "Select * from person";
        ResultSet rs = con.createStatement().executeQuery(sql);
        Vector data = null;
        while (rs.next()) {
            data = new Vector();
            data.add(rs.getString("Tendangnhap"));
            data.add(rs.getString("pass"));
            data.add(rs.getInt("tuoi"));
            data.add(rs.getString("gioitinh"));
            data.add(rs.getString("email"));
            data.add(rs.getString("phanquyen"));
            data.add(rs.getString("name"));
            // Thêm một dòng vào table model
            tblModel.addRow(data);
        }
        tb1.setModel(tblModel);
        con.close();
    }

    /**
     * Tạo kết nối đền cơ sở dữ liệu
     *
     * @return Connection
     * @throws Exception
     */
    private Connection getConnection() throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://localhost;databaseName=quanlitv";
        Connection con = DriverManager.getConnection(url, "sa", "sa");
        return con;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txttendangnhap = new javax.swing.JTextField();
        txtmatkhau = new javax.swing.JTextField();
        txttuoi = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtphanquyen = new javax.swing.JTextField();
        txthoten = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        txtgioitinh = new javax.swing.JComboBox<>();

        jLabel1.setText("jLabel1");

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Quản lí người dùng");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Tên đăng nhập");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Mật khẩu");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Tuổi");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Giới tính");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Email");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Phân quyền");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Họ tên");

        txttendangnhap.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtmatkhau.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txttuoi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtemail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtphanquyen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txthoten.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Add-icon.png"))); // NOI18N
        jButton1.setText("Thêm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Save-icon.png"))); // NOI18N
        jButton2.setText("Cập nhật");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Actions-edit-delete-icon-16.png"))); // NOI18N
        jButton3.setText("Xoá");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 0, 0));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout-icon-16.png"))); // NOI18N
        jButton4.setText("Thoát");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb1);

        txtgioitinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addComponent(jLabel4))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtmatkhau)
                            .addComponent(txthoten)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtgioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                                .addComponent(txttuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txttendangnhap))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(295, 295, 295))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(jButton2)))
                        .addGap(104, 104, 104)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtemail, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                                    .addComponent(txtphanquyen))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4)
                                .addGap(103, 103, 103))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(txttendangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(txtmatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtphanquyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txthoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtgioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txttuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tb1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb1MouseClicked
        int row = tb1.getSelectedRow();
        if (row >= 0) {
            txttendangnhap.setText(tb1.getValueAt(row, 0).toString());
            txtmatkhau.setText(tb1.getValueAt(row, 1).toString());
            txttuoi.setText(tb1.getValueAt(row, 2).toString());
            txtgioitinh.setSelectedItem(tb1.getValueAt(row, 3).toString());
            txtemail.setText(tb1.getValueAt(row, 4).toString());
            txtphanquyen.setText(tb1.getValueAt(row, 5).toString());
            txthoten.setText(tb1.getValueAt(row, 6).toString());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_tb1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        JFrame frame = new JFrame("JOptionPane showMessageDialog example");
        int result = JOptionPane.showConfirmDialog(frame,
                "Bạn có chắc muốn thoát",
                "Xác nhận",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
//            this.hide();
            //this.hide();
//            ab.show();
//dangki dk = new dangki();
//        dk.show();  
            this.dispose();  //Remove JFrame 1
            //ab.setVisible(true); //Show other frame
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (txttendangnhap.getText().isEmpty()) {
            MessageDialogHelper.showErrorDialog(this, "Lỗi", "Vui lòng điền tên đăng nhập");
            txttendangnhap.requestFocus();
            return; // Thoát khỏi xử lý không thực hiện các lệnh tiếp theo
        }
        if (txtmatkhau.getText().isEmpty()) {
            MessageDialogHelper.showErrorDialog(this, "Lỗi", "Vui lòng điền mật khẩu");
            txtmatkhau.requestFocus();
            return; // Thoát khỏi xử lý không thực hiện các lệnh tiếp theo
        }
        if (txttuoi.getText().isEmpty()) {
            MessageDialogHelper.showErrorDialog(this, "Lỗi", "Vui lòng điền tuổi");
            txttuoi.requestFocus();
            return; // Thoát khỏi xử lý không thực hiện các lệnh tiếp theo
        }
        
        if (txtemail.getText().isEmpty()) {
            MessageDialogHelper.showErrorDialog(this, "Lỗi", "Vui lòng điền email");
            txtemail.requestFocus();
            return; // Thoát khỏi xử lý không thực hiện các lệnh tiếp theo
        }
        if (txtphanquyen.getText().isEmpty()) {
            MessageDialogHelper.showErrorDialog(this, "Lỗi", "Vui lòng điền phân quyền");
            txtphanquyen.requestFocus();
            return; // Thoát khỏi xử lý không thực hiện các lệnh tiếp theo
        }
        if (txthoten.getText().isEmpty()) {
            MessageDialogHelper.showErrorDialog(this, "Lỗi", "Vui lòng điền họ tên");
            txthoten.requestFocus();
            return; // Thoát khỏi xử lý không thực hiện các lệnh tiếp theo
        }
        // Hiển thị hộp thoại xác nhận có muốn lưu hay không?
        int ret = JOptionPane.showConfirmDialog(this, "Bạn có muốn thêm?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        // Trường hợp không lưu
        if (ret != JOptionPane.YES_OPTION) {
            return; // Thoát khỏi phương thức
        }
        // Câu lệnh insert
        try {
            Person a = new Person();
            a.setTendangnhap(txttendangnhap.getText());
            a.setPass(txtmatkhau.getText());
            a.setTuoi(Integer.parseInt(txttuoi.getText()));
            a.setGioitinh((String) txtgioitinh.getSelectedItem());
            a.setEmail(txtemail.getText());
            a.setPhanquyen(txtphanquyen.getText());
            a.setName(txthoten.getText());

            persondao dao = new persondao();

            dao.insert(a);
            JOptionPane.showMessageDialog(this, "Thêm người dùng thành công!");
            //làm mới bảng
            DefaultTableModel tableModel = (DefaultTableModel) tb1.getModel();
            tableModel.setRowCount(0);
            //hiển thị lại
            LoadDBData2JTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Có lỗi " + e.getMessage());
            e.printStackTrace();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (txttendangnhap.getText().isEmpty()) {
            MessageDialogHelper.showErrorDialog(this, "Lỗi", "Vui lòng điền tên đăng nhập");
            txttendangnhap.requestFocus();
            return; // Thoát khỏi xử lý không thực hiện các lệnh tiếp theo
        }
        int ret = JOptionPane.showConfirmDialog(this, "Bạn có muốn xoá?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        // Trường hợp không lưu
        if (ret != JOptionPane.YES_OPTION) {
            return; // Thoát khỏi phương thức
        }
        try {
            Person a = new Person();

            persondao dao = new persondao();

            dao.delete(txttendangnhap.getText());
            JOptionPane.showMessageDialog(this, "Xoá thành công " + txttendangnhap.getText());
            //làm mới bảng
            DefaultTableModel tableModel = (DefaultTableModel) tb1.getModel();
            tableModel.setRowCount(0);
            //hiển thị lại
            LoadDBData2JTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Có lỗi " + e.getMessage());
            e.printStackTrace();
        }            // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (txttendangnhap.getText().isEmpty()) {
            MessageDialogHelper.showErrorDialog(this, "Lỗi", "Vui lòng điền tên đăng nhập");
            txttendangnhap.requestFocus();
            return; // Thoát khỏi xử lý không thực hiện các lệnh tiếp theo
        }
        if (txtmatkhau.getText().isEmpty()) {
            MessageDialogHelper.showErrorDialog(this, "Lỗi", "Vui lòng điền mật khẩu");
            txtmatkhau.requestFocus();
            return; // Thoát khỏi xử lý không thực hiện các lệnh tiếp theo
        }
        if (txttuoi.getText().isEmpty()) {
            MessageDialogHelper.showErrorDialog(this, "Lỗi", "Vui lòng điền tuổi");
            txttuoi.requestFocus();
            return; // Thoát khỏi xử lý không thực hiện các lệnh tiếp theo
        }
        
        if (txtemail.getText().isEmpty()) {
            MessageDialogHelper.showErrorDialog(this, "Lỗi", "Vui lòng điền email");
            txtemail.requestFocus();
            return; // Thoát khỏi xử lý không thực hiện các lệnh tiếp theo
        }
        if (txtphanquyen.getText().isEmpty()) {
            MessageDialogHelper.showErrorDialog(this, "Lỗi", "Vui lòng điền phân quyền");
            txtphanquyen.requestFocus();
            return; // Thoát khỏi xử lý không thực hiện các lệnh tiếp theo
        }
        if (txthoten.getText().isEmpty()) {
            MessageDialogHelper.showErrorDialog(this, "Lỗi", "Vui lòng điền họ tên");
            txthoten.requestFocus();
            return; // Thoát khỏi xử lý không thực hiện các lệnh tiếp theo
        }
        // Hiển thị hộp thoại xác nhận có muốn lưu hay không?
        int ret = JOptionPane.showConfirmDialog(this, "Bạn có muốn cập nhật?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        // Trường hợp không lưu
        if (ret != JOptionPane.YES_OPTION) {
            return; // Thoát khỏi phương thức
        }
        // Câu lệnh insert
        try {
            Person a = new Person();
            a.setTendangnhap(txttendangnhap.getText());
            a.setPass(txtmatkhau.getText());
            a.setTuoi(Integer.parseInt(txttuoi.getText()));
            a.setGioitinh((String) txtgioitinh.getSelectedItem());
            a.setEmail(txtemail.getText());
            a.setPhanquyen(txtphanquyen.getText());
            a.setName(txthoten.getText());

            persondao dao = new persondao();

            dao.update(a);
            JOptionPane.showMessageDialog(this, "Cập nhật thành công cho " + txttendangnhap.getText());
            //làm mới bảng
            DefaultTableModel tableModel = (DefaultTableModel) tb1.getModel();
            tableModel.setRowCount(0);
            //hiển thị lại
            LoadDBData2JTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Có lỗi " + e.getMessage());
            e.printStackTrace();
        }         // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws Exception {

        new quanliperson().setVisible(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tb1;
    private javax.swing.JTextField txtemail;
    private javax.swing.JComboBox<String> txtgioitinh;
    private javax.swing.JTextField txthoten;
    private javax.swing.JTextField txtmatkhau;
    private javax.swing.JTextField txtphanquyen;
    private javax.swing.JTextField txttendangnhap;
    private javax.swing.JTextField txttuoi;
    // End of variables declaration//GEN-END:variables
}
