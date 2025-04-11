package view;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.*;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.LopHoc;
import org.apache.commons.io.FileUtils;

public class GVLopHocForm extends javax.swing.JFrame {
    public GVLopHocForm() throws FileNotFoundException {
        initComponents();
        setTitle("Thông tin lớp học");
        setLocationRelativeTo(null);
        Load();        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnThem = new javax.swing.JButton();
        txtTim = new javax.swing.JTextField();
        btnSua = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnXem = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtmamon = new javax.swing.JTextField();
        btnTim = new javax.swing.JButton();
        txtmalop = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbLopHoc = new javax.swing.JTable();
        txttenmon = new javax.swing.JTextField();
        txtsosv = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnXuatFile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnThem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        txtTim.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnSua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnBack.setText("Quay lại");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Mã môn:");

        btnReset.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Tên môn:");

        btnXem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnXem.setText("Xem Lớp");
        btnXem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Mã lớp:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Số sinh viên:");

        txtmamon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnTim.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnTim.setText("Tìm kiếm");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        txtmalop.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tbLopHoc.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tbLopHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã môn", "Mã lớp", "Tên môn", "Số sinh viên"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
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
        tbLopHoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbLopHocMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbLopHoc);

        txttenmon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtsosv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtsosv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtsosvKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsosvKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel1.setText("THÔNG TIN LỚP HỌC");

        btnXuatFile.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnXuatFile.setText("Xuất File");
        btnXuatFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnBack)
                .addGap(246, 246, 246)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnXuatFile, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(20, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnXem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 26, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtmamon, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttenmon, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmalop, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsosv, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtmamon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtmalop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txttenmon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtsosv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXuatFile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public List<LopHoc> ds = new ArrayList<>();
    LopHoc lop = new LopHoc();
    int temp = 0;  
    private void Load() throws FileNotFoundException{
        
        DefaultTableModel model = (DefaultTableModel)tbLopHoc.getModel();
        LopHoc g1 = new LopHoc("IT6019", "IT6019.1", "Lập trình Java", 70);
        LopHoc g2 = new LopHoc("IT6019", "IT6019.2", "Lập trình Java", 69);
        LopHoc g3 = new LopHoc("IT6019", "IT6019.3", "Lập trình Java", 74);
        LopHoc g4 = new LopHoc("IT6020", "IT6020.1", "Lập trình C#", 73);
        LopHoc g5 = new LopHoc("IT6020", "IT6020.2", "Lập trình C#", 75);
        LopHoc g6 = new LopHoc("IT6020", "IT6020.3", "Lập trình C#", 70);
        LopHoc g7 = new LopHoc("IT6020", "IT6020.4", "Lập trình C#", 71);
        ds.add(g1);
        ds.add(g2);
        ds.add(g3);
        ds.add(g4);
        ds.add(g5);
        ds.add(g6);
        ds.add(g7);
        for(LopHoc item : ds){
            model.addRow(new Object[]{item.getMamon(), item.getMalop(), 
                item.getTenmon(), item.getSosinhvien()});
        }
    }
    
    private boolean checkMalop(String malop){
        String maLop = txtmalop.getText();
        boolean isCheck = false;
        for(LopHoc i : ds){
            if( i.getMalop().equals(maLop))//i != ds.get(temp) &&
            {
                isCheck = true;
                break;
            }
        }
        
        return !isCheck;
    }
    
    
    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        DefaultTableModel model = (DefaultTableModel)tbLopHoc.getModel();
        if(txtmalop.getText().equals("") || txtmamon.getText().equals("") 
                || txttenmon.getText().equals("") || txtsosv.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Không được để trống thông tin!");
        }
        else{
            if (checkMalop(lop.getMalop())) {
                lop.setMamon(txtmamon.getText());
                lop.setMalop(txtmalop.getText());
                lop.setTenmon(txttenmon.getText());
                lop.setSosinhvien(Integer.parseInt(txtsosv.getText()));
                ds.add(lop);
                model.addRow(new Object[]{lop.getMamon(), lop.getMalop(), lop.getTenmon(), lop.getSosinhvien()});
                JOptionPane.showMessageDialog(null, "Thêm lớp thành công!");
            }
            else{
                JOptionPane.showMessageDialog(null, "Mã lớp đã tồn tại!");
            }
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        int row = tbLopHoc.getSelectedRow();
        int col = tbLopHoc.getSelectedColumn();
        if(row >= 0)
        {
            LopHoc sua = new LopHoc();
            if (checkMalop(lop.getMalop())) {
                sua.setMamon(txtmamon.getText());
                sua.setMalop(txtmalop.getText());
                sua.setTenmon(txttenmon.getText());
                try {
                    sua.setSosinhvien(Integer.parseInt(txtsosv.getText()));
                } catch (Exception ex) {
                    Logger.getLogger(GVLopHocForm.class.getName()).log(Level.SEVERE, null, ex);
                }
                ds.set(temp, sua);
                DefaultTableModel model = (DefaultTableModel) tbLopHoc.getModel();
                model.setNumRows(0);
                for (LopHoc item : ds) {
                    model.addRow(new Object[]{item.getMamon(), item.getMalop(), item.getTenmon(), item.getSosinhvien()});
                }
                JOptionPane.showMessageDialog(null, "Sửa thành công!");
            } else {
                JOptionPane.showMessageDialog(null, "Mã lớp đã tồn tại!");
            }
        }else{
            JOptionPane.showMessageDialog(null,"Chọn một lớp để sửa!");
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        DangNhapForm dn = new DangNhapForm();
        dn.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
       DefaultTableModel model = (DefaultTableModel)tbLopHoc.getModel();
       int row = tbLopHoc.getSelectedRow();
       if(row >= 0){
           int result = JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa lớp này?",
                   "Thông báo",JOptionPane.YES_NO_OPTION);
           if(result == JOptionPane.YES_OPTION){
               model.removeRow(row);
               ds.remove(row);
               JOptionPane.showMessageDialog(null, "Xóa lớp thành công!");
           }
       }else{
           JOptionPane.showMessageDialog(null, "Vui lòng chọn một lớp để xóa!");
       }
       
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
       txtmalop.setText("");
       txtmamon.setText("");
       txtsosv.setText("");
       txttenmon.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnXemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemActionPerformed
        GVDanhSachForm danhSach = new GVDanhSachForm();
        int row = tbLopHoc.getSelectedRow();
        int col = tbLopHoc.getSelectedColumn();
        if(row >= 0)
        {
            String maLop = (String) tbLopHoc.getValueAt(row, col);
            String maMon = (String) tbLopHoc.getValueAt(row, col);
            String tenMon = (String) tbLopHoc.getValueAt(row, col);

            LopHoc lopHoc = null;
            for (LopHoc item : ds) {
                if (item.getMamon().equals(maMon) || item.getMalop().equals(maLop) || item.getTenmon().equals(tenMon)) {
                    lopHoc = item;
                    break;
                }
            }
            if (lopHoc != null) {
                danhSach.setVisible(true);
                setVisible(false);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn một lớp để xem thông tin!");
        }
    }//GEN-LAST:event_btnXemActionPerformed

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed

        DefaultTableModel model = (DefaultTableModel)tbLopHoc.getModel();
        model.setRowCount(0);

        String maLop = txtTim.getText();
        String tenMon = txtTim.getText();
        String maMon = txtTim.getText();
        for(LopHoc item : ds){
            if(item.getMalop().equals(maLop) || item.getTenmon().equals(tenMon) || item.getMamon().equals(maMon)){
                model.addRow(new Object[] {item.getMamon(), item.getMalop(), item.getTenmon(), item.getSosinhvien()});
            }
        }
        if(model.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Không có thông tin lớp học");
        }
    }//GEN-LAST:event_btnTimActionPerformed

    private void tbLopHocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbLopHocMouseClicked
        temp = tbLopHoc.getSelectedRow();
        lop = ds.get(temp);
        txtmamon.setText(lop.getMamon());
        txtmalop.setText(lop.getMalop());
        txttenmon.setText(lop.getTenmon());
        txtsosv.setText("" + lop.getSosinhvien()); 
      
    }//GEN-LAST:event_tbLopHocMouseClicked

    private void txtsosvKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsosvKeyPressed
       char c = evt.getKeyChar();
       String so = txtsosv.getText();
       if(!Character.isDigit(c) && !Character.isWhitespace(c)){
           JOptionPane.showMessageDialog(null, "Số sinh viên phải là một số nguyên lớn hơn 0",
                   "Thông báo",JOptionPane.ERROR_MESSAGE);
           txtsosv.requestFocus();
           txtsosv.selectAll();
           evt.consume();
       }
    }//GEN-LAST:event_txtsosvKeyPressed

    private void txtsosvKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsosvKeyReleased
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_BACK_SPACE){
        }
    }//GEN-LAST:event_txtsosvKeyReleased

    private void btnXuatFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatFileActionPerformed
        Document doc = new Document();
        Paragraph title = new Paragraph("DANH SACH LOP HOC PHAN", 
                FontFactory.getFont(FontFactory.TIMES_ROMAN,20));
        title.setAlignment(Element.ALIGN_CENTER);
            try {
                PdfWriter.getInstance(doc, new FileOutputStream("LopHoc.pdf"));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(GVLopHocForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (DocumentException ex) {
                Logger.getLogger(GVLopHocForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            doc.open();
            PdfPTable tbl = new PdfPTable(4);
            tbl.addCell("Ma mon");
            tbl.addCell("Ma lop");
            tbl.addCell("Ten mon");
            tbl.addCell("So sinh vien");
            for (int i = 0; i < tbLopHoc.getRowCount(); i++) {
                String maMon = (String) tbLopHoc.getValueAt(i, 0).toString();
                String maLop = (String) tbLopHoc.getValueAt(i, 1).toString();
                String tenMon = (String) tbLopHoc.getValueAt(i, 2).toString();
                String soSV = (String) tbLopHoc.getValueAt(i, 3).toString();
                tbl.addCell(maMon);
                tbl.addCell(maLop);
                tbl.addCell(tenMon);
                tbl.addCell(soSV);
            }
            try {
                doc.add(title);
                doc.add(new Paragraph("\n"));
                doc.add(tbl);
            } catch (DocumentException ex) {
                Logger.getLogger(GVLopHocForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        doc.close();
    }//GEN-LAST:event_btnXuatFileActionPerformed
   
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
            java.util.logging.Logger.getLogger(GVLopHocForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GVLopHocForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GVLopHocForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GVLopHocForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new GVLopHocForm().setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(GVLopHocForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXuatFile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbLopHoc;
    private javax.swing.JTextField txtTim;
    private javax.swing.JTextField txtmalop;
    private javax.swing.JTextField txtmamon;
    private javax.swing.JTextField txtsosv;
    private javax.swing.JTextField txttenmon;
    // End of variables declaration//GEN-END:variables
    
    
    
}
