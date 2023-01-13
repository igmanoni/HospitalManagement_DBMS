package Doctors;

import Admins.doctorManagement;
import Main.Connector;
import Main.Hospital;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Muhammad Ali
 */
public class searchDoctor extends javax.swing.JFrame {

    Connection connection = null;
    ResultSet rs = null;
    PreparedStatement ps = null;

    DefaultTableModel defaultTableModel = new DefaultTableModel();

    public searchDoctor() {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/Images/hospital.png"));
        this.setIconImage(ic.getImage());
        Object columns[] = {"Joining Date", "Id", "Name", "Age", "Gender", "Department", "Phone Number", "Email Address", "Status", "Address", "Room number"};
        defaultTableModel.setColumnIdentifiers(columns);
        dSearchjTable.setModel(defaultTableModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        rSearchField = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        dSearchbtn = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dSearchjTable = new javax.swing.JTable();
        DeletejPanel = new javax.swing.JPanel();
        dDeletebtn = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Search Doctor !");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(0, 153, 153));
        jPanel7.setOpaque(false);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 26)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Search Doctor");

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/shutdown.png"))); // NOI18N
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/back-arrow-48.png"))); // NOI18N
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(510, 510, 510)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 373, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel14)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 35, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Enter Name of Doctor");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        rSearchField.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rSearchField.setForeground(new java.awt.Color(0, 0, 0));
        rSearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSearchFieldActionPerformed(evt);
            }
        });
        rSearchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rSearchFieldKeyPressed(evt);
            }
        });
        getContentPane().add(rSearchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 470, 40));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        dSearchbtn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        dSearchbtn.setForeground(new java.awt.Color(255, 255, 255));
        dSearchbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dSearchbtn.setText("Search");
        dSearchbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dSearchbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dSearchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dSearchbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 110, 100, 40));

        dSearchjTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(dSearchjTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 162, 1144, 337));

        DeletejPanel.setBackground(new java.awt.Color(153, 153, 153));
        DeletejPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DeletejPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeletejPanelMouseClicked(evt);
            }
        });

        dDeletebtn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        dDeletebtn.setForeground(new java.awt.Color(255, 255, 255));
        dDeletebtn.setText("Delete");
        dDeletebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dDeletebtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout DeletejPanelLayout = new javax.swing.GroupLayout(DeletejPanel);
        DeletejPanel.setLayout(DeletejPanelLayout);
        DeletejPanelLayout.setHorizontalGroup(
            DeletejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DeletejPanelLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(dDeletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        DeletejPanelLayout.setVerticalGroup(
            DeletejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeletejPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dDeletebtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(DeletejPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(638, 511, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Hospital_Image.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, -1, 1260, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        Hospital hospital = new Hospital();
        hospital.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        doctorManagement dManagement = new doctorManagement();
        dManagement.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel21MouseClicked

    private void rSearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSearchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSearchFieldActionPerformed

    private void dSearchbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dSearchbtnMouseClicked
        connection = Connector.ConnectDb();
        defaultTableModel.getDataVector().removeAllElements();
        defaultTableModel.fireTableDataChanged();
        String docName = rSearchField.getText();
        String sql = "select doctor.id, doctor.name, doctor.dept, doctor.room, doctor.fees, info.date, info.age, info.gender, info.email, info.phone, info.status, info.address\n" +
        "from info \n" +
        "inner join doctor \n" +
        "on doctor.id = info.docId\n" +
        "where doctor.name = '" + docName + "'";
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            Object columnData[] = new Object[11];
            while (rs.next()) {
                columnData[0] = rs.getString("date");
                columnData[1] = rs.getString("id");
                columnData[2] = rs.getString("name");
                columnData[3] = rs.getInt("age");
                columnData[4] = rs.getString("gender");
                columnData[5] = rs.getString("dept");
                columnData[6] = rs.getString("phone");
                columnData[7] = rs.getString("email");
                columnData[8] = rs.getString("status");
                columnData[9] = rs.getString("address");
                columnData[10] = rs.getInt("room");
                defaultTableModel.addRow(columnData);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_dSearchbtnMouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        connection = Connector.ConnectDb();
        defaultTableModel.getDataVector().removeAllElements();
        defaultTableModel.fireTableDataChanged();
        String docName = rSearchField.getText();
        String sql = "select d.count, d.id, d.name, d.dept, d.room, d.fees, i.date, i.age, i.gender, i.email, i.phone, i.status, i.address\n" +
        "from info i\n" +
        "inner join doctor d\n" +
        "on d.id = i.docId\n" +
        "where d.name = '" + docName + "'";
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            Object columnData[] = new Object[11];
            while (rs.next()) {
                columnData[0] = rs.getString("date");
                columnData[1] = rs.getString("id");
                columnData[2] = rs.getString("name");
                columnData[3] = rs.getInt("age");
                columnData[4] = rs.getString("gender");
                columnData[5] = rs.getString("dept");
                columnData[6] = rs.getString("phone");
                columnData[7] = rs.getString("email");
                columnData[8] = rs.getString("status");
                columnData[9] = rs.getString("address");
                columnData[10] = rs.getInt("room");
                defaultTableModel.addRow(columnData);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jPanel1MouseClicked

    private void rSearchFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rSearchFieldKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSearchFieldKeyPressed

    private void dDeletebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dDeletebtnMouseClicked
        connection = Connector.ConnectDb();
        int row = dSearchjTable.getSelectedRow();
        if (row >= 0) {

            String docId = dSearchjTable.getModel().getValueAt(row, 1).toString();
            String docName = dSearchjTable.getModel().getValueAt(row, 2).toString();
            String sql = "Delete from doctor where id ='" + docId + "'";
            try {
                ps = connection.prepareStatement(sql);
                ps.execute();
                JOptionPane.showMessageDialog(null, "Doctor " + docName + " has been deleted");
                defaultTableModel.getDataVector().removeAllElements();
                defaultTableModel.fireTableDataChanged();
//            loadData();
                connection.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Doctor named " + docName + " not found");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select row to delete.");
        }
    }//GEN-LAST:event_dDeletebtnMouseClicked

    private void DeletejPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeletejPanelMouseClicked
        connection = Connector.ConnectDb();
        int row = dSearchjTable.getSelectedRow();
        String docId = dSearchjTable.getModel().getValueAt(row, 1).toString();
        String docName = dSearchjTable.getModel().getValueAt(row, 2).toString();
        System.out.println("Deleting dr"+docName);
        String sql = "Delete from doctor where id ='" + docId + "'";
        try {
            ps = connection.prepareStatement(sql);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Doctor " + docName + " has been deleted");
            defaultTableModel.getDataVector().removeAllElements();
            defaultTableModel.fireTableDataChanged();
            //loadData();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Doctor named " + docName + " not found");
        }
    }//GEN-LAST:event_DeletejPanelMouseClicked
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new searchDoctor().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DeletejPanel;
    private javax.swing.JLabel dDeletebtn;
    private javax.swing.JLabel dSearchbtn;
    private javax.swing.JTable dSearchjTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField rSearchField;
    // End of variables declaration//GEN-END:variables
}
