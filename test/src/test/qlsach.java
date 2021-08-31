package test;

import com.sun.jdi.connect.spi.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.util.*;
import java.sql.*;

public class qlsach extends javax.swing.JPanel {

    public qlsach() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtmatailieu = new javax.swing.JTextField();
        txtnhaxuatban = new javax.swing.JTextField();
        txtsobanphathanh = new javax.swing.JTextField();
        txttacgia = new javax.swing.JTextField();
        btn_themsach = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        lblStatus = new javax.swing.JLabel();
        txtsotrang = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Quản lí sách");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Mã tài liệu");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Nhà xuất bản");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Số bản phát hành");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Tác giả");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Số trang");

        txtmatailieu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtnhaxuatban.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtsobanphathanh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txttacgia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btn_themsach.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_themsach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Add-icon.png"))); // NOI18N
        btn_themsach.setText("Thêm");
        btn_themsach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themsachActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Actions-document-edit-icon-16.png"))); // NOI18N
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
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Login-icon-16.png"))); // NOI18N
        jButton4.setText("Thoát");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        txtsotrang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtmatailieu)
                    .addComponent(txtnhaxuatban)
                    .addComponent(txtsobanphathanh)
                    .addComponent(txttacgia)
                    .addComponent(txtsotrang))
                .addGap(58, 58, 58))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addComponent(btn_themsach)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jButton4)
                .addGap(62, 62, 62))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(lblStatus))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtmatailieu)
                        .addGap(9, 9, 9)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtnhaxuatban)
                        .addGap(9, 9, 9)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtsobanphathanh)
                        .addGap(9, 9, 9)))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txttacgia)
                        .addGap(9, 9, 9)))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(txtsotrang))
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4)
                    .addComponent(btn_themsach))
                .addGap(42, 42, 42)
                .addComponent(lblStatus))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            suasach a = new suasach();
            a.show();
        } catch (Exception ex) {
            Logger.getLogger(qlsach.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btn_themsachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themsachActionPerformed
        // Nếu không nhập tiêu đề (Title)
        if (txtmatailieu.getText().isEmpty()) {
            MessageDialogHelper.showErrorDialog(this, "Lỗi", "Vui lòng điền mã tài liệu");
            txtmatailieu.requestFocus();
            return; // Thoát khỏi xử lý không thực hiện các lệnh tiếp theo
        }
        // Nếu không nhập tiêu đề (Title)
        if (txtnhaxuatban.getText().isEmpty()) {
            MessageDialogHelper.showErrorDialog(this, "Lỗi", "Vui lòng điền nhà xuất bản");
            txtnhaxuatban.requestFocus();
            return; // Thoát khỏi xử lý không thực hiện các lệnh tiếp theo
        }
        if (txtsobanphathanh.getText().isEmpty()) {
            MessageDialogHelper.showErrorDialog(this, "Lỗi", "Vui lòng điền số bản phát hành");
            txtsobanphathanh.requestFocus();
            return; // Thoát khỏi xử lý không thực hiện các lệnh tiếp theo
        }
        if (txttacgia.getText().isEmpty()) {
            MessageDialogHelper.showErrorDialog(this, "Lỗi", "Vui lòng điền tác giả");
            txttacgia.requestFocus();
            return; // Thoát khỏi xử lý không thực hiện các lệnh tiếp theo
        }
        if (txtsotrang.getText().isEmpty()) {
            MessageDialogHelper.showErrorDialog(this, "Lỗi", "Vui lòng điền số trang");
            txtsotrang.requestFocus();
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
            Sach a = new Sach();
            a.setMatailieu(txtmatailieu.getText());
            a.setNhaxuatban(txtnhaxuatban.getText());
            a.setSobanphathanh(Integer.parseInt(txtsobanphathanh.getText()));
            a.setTg(txttacgia.getText());
            a.setSt(Integer.parseInt(txtsotrang.getText()));

            sachdao dao = new sachdao();

            dao.insert(a);
            JOptionPane.showMessageDialog(this, "Thêm sách thành công!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Có lỗi " + e.getMessage());
            e.printStackTrace();
        }

    }//GEN-LAST:event_btn_themsachActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (txtmatailieu.getText().isEmpty()) {
            MessageDialogHelper.showErrorDialog(this, "Lỗi", "Vui lòng điền mã tài liệu");
            txtmatailieu.requestFocus();
            return; // Thoát khỏi xử lý không thực hiện các lệnh tiếp theo
        }
        int ret = JOptionPane.showConfirmDialog(this, "Bạn có muốn xoá?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        // Trường hợp không lưu
        if (ret != JOptionPane.YES_OPTION) {
            return; // Thoát khỏi phương thức
        }
        try {
            Sach a = new Sach();

            sachdao dao = new sachdao();

            dao.delete(txtmatailieu.getText());
            JOptionPane.showMessageDialog(this, "Xoá thành công sách có mã " + txtmatailieu.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Có lỗi " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private java.sql.Connection getConnection() throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://localhost;databaseName=quanlitv";
        java.sql.Connection con = DriverManager.getConnection(url, "sa", "sa");
        return con;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_themsach;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTextField txtmatailieu;
    private javax.swing.JTextField txtnhaxuatban;
    private javax.swing.JTextField txtsobanphathanh;
    private javax.swing.JTextField txtsotrang;
    private javax.swing.JTextField txttacgia;
    // End of variables declaration//GEN-END:variables
}
