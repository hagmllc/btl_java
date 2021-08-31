/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.text.PasswordView;

/**
 *
 * @author anhph
 */
public class LoginDialog extends javax.swing.JFrame {

    /**
     * Creates new form LoginDialog
     */
    public LoginDialog() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btndangnhap = new javax.swing.JButton();
        txttendangnhap = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtmatkhau = new javax.swing.JPasswordField();
        btn_hienthi = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng nhập");
        setLocation(new java.awt.Point(300, 100));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Đăng nhập");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Tên đăng nhập");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Mật khẩu");

        btndangnhap.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btndangnhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Login-icon-16.png"))); // NOI18N
        btndangnhap.setText("Đăng nhập");
        btndangnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndangnhapActionPerformed(evt);
            }
        });

        txttendangnhap.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txttendangnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttendangnhapActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout-icon-16.png"))); // NOI18N
        jButton1.setText("Thoát");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1w.png"))); // NOI18N

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/10207-man-student-light-skin-tone-icon-16.png"))); // NOI18N
        jButton2.setText("Đăng nhập quản trị");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Chưa có tài khoản, đăng kí ở đây");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txtmatkhau.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btn_hienthi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_hienthi.setText("Hiển thị mật khẩu");
        btn_hienthi.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                btn_hienthiItemStateChanged(evt);
            }
        });
        btn_hienthi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hienthiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(txttendangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addComponent(jLabel4)
                        .addContainerGap(33, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btndangnhap)
                        .addGap(46, 46, 46)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(btn_hienthi, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txttendangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(txtmatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4)))
                .addGap(30, 30, 30)
                .addComponent(btn_hienthi)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btndangnhap)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(26, 26, 26)
                .addComponent(jButton3)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btndangnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndangnhapActionPerformed

        StringBuilder sb = new StringBuilder();
        DataValidator.validateEmpty(txttendangnhap, sb, "Tên đăng nhập không được để trống");
        DataValidator.validateEmpty(txtmatkhau, sb, "Mật khẩu không được để trống");
        if (sb.length() > 0) {
            MessageDialogHelper.showErrorDialog(this, "Lỗi", sb.toString());
            return;
        }
        NguoiDungDao dao = new NguoiDungDao();

        try {
            NguoiDung nd = dao.checkLogin(txttendangnhap.getText(), new String(txtmatkhau.getPassword()));
            if (nd == null) {
                MessageDialogHelper.showErrorDialog(this, "Lỗi", "Tên đăng nhập hoặc mật khẩu sai");

            } else {
                JFrame frame = new JFrame("JOptionPane showMessageDialog example");
                JOptionPane.showMessageDialog(frame,
                        "Đăng nhập thành công!",
                        "Thông báo",
                        JOptionPane.INFORMATION_MESSAGE);
                this.setVisible(false);
                menu1 n = new menu1();
                n.setVisible(true);

            }
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(this, "Lỗi", e.getMessage());
        }

    }//GEN-LAST:event_btndangnhapActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txttendangnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttendangnhapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttendangnhapActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        StringBuilder sb1 = new StringBuilder();
        DataValidator.validateEmpty(txttendangnhap, sb1, "Tên đăng nhập không được để trống");
        DataValidator.validateEmpty(txtmatkhau, sb1, "Mật khẩu không được để trống");
        if (sb1.length() > 0) {
            MessageDialogHelper.showErrorDialog(this, "Lỗi", sb1.toString());
            return;
        }
        //NguoiDungDao dao = new NguoiDungDao();
        checkadmin ad = new checkadmin();

        try {
            //NguoiDung nd = dao.checkLogin(txttendangnhap.getText(), new String(txtmatkhau.getText()));
            NguoiDung check = ad.checkadmin(txttendangnhap.getText(), new String(txtmatkhau.getPassword()));
            if (check == null) {
                MessageDialogHelper.showErrorDialog(this, "Lỗi", "Tên đăng nhập, mật khẩu sai hoặc người dùng không có quyền quản trị");

            } else {
                JFrame frame = new JFrame("JOptionPane showMessageDialog example");
                JOptionPane.showMessageDialog(frame,
                        "Đăng nhập thành công!",
                        "Thông báo",
                        JOptionPane.INFORMATION_MESSAGE);
                this.setVisible(false);
                menu nm = new menu();
                nm.show();

            }
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(this, "Lỗi", e.getMessage());
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//        this.hide();
        dangki dk = new dangki();
//        dk.show();  
        this.dispose();  //Remove JFrame 1
        dk.setVisible(true); //Show other frame
        //Container con=getContentPane();

        //con.add(dk);
//setSize(300, 200);
//setLocationRelativeTo(null);// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btn_hienthiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hienthiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_hienthiActionPerformed

    private void btn_hienthiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_btn_hienthiItemStateChanged
        if (btn_hienthi.isSelected()) {
            txtmatkhau.setEchoChar((char) 0);
        }
        else{
            txtmatkhau.setEchoChar('*');
        }
// TODO add your handling code here:
    }//GEN-LAST:event_btn_hienthiItemStateChanged

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
            java.util.logging.Logger.getLogger(LoginDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginDialog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox btn_hienthi;
    private javax.swing.JButton btndangnhap;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txtmatkhau;
    private javax.swing.JTextField txttendangnhap;
    // End of variables declaration//GEN-END:variables
}
