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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anhph
 */
public class hienthitapchi extends javax.swing.JPanel {

    /**
     * Creates new form hienthitapchi
     */
    public hienthitapchi() throws Exception {
        initComponents();
        //làm mới bảng
        DefaultTableModel tableModel = (DefaultTableModel) tb1.getModel();
        tableModel.setRowCount(0);
        //hiển thị lại
        LoadDBData2JTable();
    }
    private String header[] = {"Mã tài liệu", "Nhà xuất bản", "Số bản phát hành", "Tháng phát hành"};
    private DefaultTableModel tblModel = new DefaultTableModel(header, 0);

    public void LoadDBData2JTable() throws Exception {

        Connection con = getConnection();
        String sql = "Select * from tapchi";
        ResultSet rs = con.createStatement().executeQuery(sql);
        Vector data = null;
        while (rs.next()) {
            data = new Vector();
            data.add(rs.getString("matailieu"));
            data.add(rs.getString("nhaxuatban"));
            data.add(rs.getInt("sophathanh"));
            data.add(rs.getString("thangphathanh"));
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

    public static void main(String[] args) throws Exception {
        new hienthibao().setVisible(true);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Hiển thị tạp chí");

        tb1.setAutoCreateRowSorter(true);
        tb1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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
        tb1.setRowSorter(tb1.getRowSorter());
        jScrollPane1.setViewportView(tb1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 869, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb1;
    // End of variables declaration//GEN-END:variables
}
