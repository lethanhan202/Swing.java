package view;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.LopHoc;
import java.util.*;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import model.GVDanhSach;

public class GVDanhSachForm extends javax.swing.JFrame {

    
    public GVDanhSachForm() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Danh sách nhóm");
        Load();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTim = new javax.swing.JTextField();
        txtsoTV = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txttendetai = new javax.swing.JTextField();
        btnTao = new javax.swing.JButton();
        txtngaybd = new javax.swing.JTextField();
        btnTim = new javax.swing.JButton();
        txtngaykt = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnXoaHet = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txttenNhom = new javax.swing.JTextField();
        btnSua = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnXoa = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDanhSach = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnXuatFile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtTim.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel2.setText("THÔNG TIN CÁC NHÓM");

        btnTao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnTao.setText("Tạo nhóm");
        btnTao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoActionPerformed(evt);
            }
        });

        btnTim.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnTim.setText("Tìm nhóm");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        btnBack.setText("Quay lại");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnXoaHet.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnXoaHet.setText("Xóa hết");
        btnXoaHet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaHetActionPerformed(evt);
            }
        });

        jLabel3.setText("Tên nhóm: ");

        btnSua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSua.setText("Sửa đề tài");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        jLabel4.setText("Số thành viên: ");

        btnXoa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnXoa.setText("Xóa nhóm");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        jLabel5.setText("Tên đề tài:");

        tbDanhSach.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tbDanhSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nhóm", "Thành viên", "Đề tài", "Bắt đầu", "Kết thúc"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        tbDanhSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDanhSachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbDanhSach);

        jLabel6.setText("Ngày bắt đầu: ");

        jLabel7.setText("Ngày kết thúc:");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(373, 373, 373)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnXoaHet, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnXuatFile, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(492, 492, 492)
                    .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(86, 86, 86))
                .addGroup(layout.createSequentialGroup()
                    .addGap(295, 295, 295)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(320, 320, 320))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7))
                            .addGap(28, 28, 28)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txttendetai, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtngaykt, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtngaybd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtsoTV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                    .addComponent(txttenNhom, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(67, 67, 67)
                            .addComponent(btnTao, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 338, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoaHet, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXuatFile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(22, 22, 22)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(txttenNhom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(txtsoTV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(txttendetai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel6))
                                .addComponent(txtngaybd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(txtngaykt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(38, 38, 38)
                            .addComponent(btnTao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(48, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public List<GVDanhSach> ds = new ArrayList<>();
    int pos = 0;
    GVDanhSach N;
    private void Load(){
        GVDanhSach g1 = new GVDanhSach(1, 2, "Website bán hàng", "10/10/2023", "25/12/2023");
        GVDanhSach g4 = new GVDanhSach(1, 5, "Website bán áo", "11/10/2023", "26/12/2023");
        GVDanhSach g2 = new GVDanhSach(2, 5, "Website bán sách", "10/10/2023", "25/12/2023");
        GVDanhSach g3 = new GVDanhSach(3, 3, "Website đọc truyện online", "10/10/2023", "25/12/2023");
        ds.add(g1);
        ds.add(g2);
        ds.add(g3);
        ds.add(g4);
        for (int i = 0; i < ds.size(); i++) 
        {
            for (int j = i + 1; j < ds.size(); j++) 
            {
                if (ds.get(i).hashCode() == ds.get(j).hashCode()) {
                    ds.remove(j);
                }
            }
        }
        DefaultTableModel model = (DefaultTableModel)tbDanhSach.getModel();
        for(GVDanhSach item : ds){
            model.addRow(new Object[] {item.getNhom(), item.getThanhVien(), 
                item.getDeTai(), item.getNgayBD(), item.getNgayKT()});
        }
    }
    
    private boolean isTrue(){
        //Bắt lỗi tên nhóm
        try{
            int nhom = Integer.parseInt(txttenNhom.getText());
            if(nhom <= 0){
                JOptionPane.showMessageDialog(null, 
                        "Tên nhóm phải là số lớn hơn 0",
                        "Thông báo",JOptionPane.ERROR_MESSAGE);
                txttenNhom.selectAll();
                txttenNhom.requestFocus();
                return false;
            }else if(txttenNhom.getText().isEmpty() || txttenNhom.getText().isBlank()){
                JOptionPane.showMessageDialog(null, 
                        "Tên nhóm không được bỏ trống",
                        "Thông báo",JOptionPane.ERROR_MESSAGE);
                txttenNhom.selectAll();
                txttenNhom.requestFocus();
                return false;
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, 
                    "Tên nhóm phải là một số nguyên lớn hơn 0",
                    "Thông báo",JOptionPane.ERROR_MESSAGE);
            txttenNhom.selectAll();
            txttenNhom.requestFocus();
            return false;
        }
        
        //Bắt lỗi số thành viên
        try{
            int thanhvien = Integer.parseInt(txtsoTV.getText());
            if(thanhvien > 5){
                JOptionPane.showMessageDialog(null, 
                        "Số thành viên phải nhỏ hơn hoặc bằng 5",
                        "Thông báo",JOptionPane.ERROR_MESSAGE);
                txtsoTV.selectAll();
                txtsoTV.requestFocus();
                return false;
            }else if(txtsoTV.getText().isBlank() || txtsoTV.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, 
                        "Số thành viên phải không thể bỏ trống",
                        "Thông báo",JOptionPane.ERROR_MESSAGE);
                txtsoTV.selectAll();
                txtsoTV.requestFocus();
                return false;
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, 
                    "Số thành viên phải là số nguyên lớn hơn 0 và nhỏ hơn hoặc bằng 5",
                    "Thông báo",JOptionPane.ERROR_MESSAGE);
            txtsoTV.selectAll();
            txtsoTV.requestFocus();
            return false;
        }
        //Bắt lỗi tên đề tài
        try{
            String ten = txttendetai.getText();
            if(ten.isEmpty() || ten.isBlank()){
                JOptionPane.showMessageDialog(null, 
                        "Tên đề tài không thể bỏ trống","Thông báo",JOptionPane.ERROR_MESSAGE);
                txttendetai.selectAll();
                txttendetai.requestFocus();
                return false;
            }    
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, 
                    "Tên đề tài phải là một chuỗi","Thông báo",JOptionPane.ERROR_MESSAGE);
            txttendetai.selectAll();
            txttendetai.requestFocus();
            return false;
        }
        
        //Bắt lỗi ngày tháng không bỏ trống
        try{
            String bd = txtngaybd.getText();
            String kt = txtngaykt.getText();
            if(bd.isBlank() || bd.isEmpty()){
                JOptionPane.showMessageDialog(null, 
                        "Không được bỏ trống ngày bắt đầu","Thông báo",JOptionPane.ERROR_MESSAGE);
                txtngaybd.selectAll();
                txtngaybd.requestFocus();
                return false;
            }
            if(kt.isBlank() || kt.isEmpty()){
                JOptionPane.showMessageDialog(null, 
                        "Không được bỏ trống ngày kết thúc","Thông báo",JOptionPane.ERROR_MESSAGE);
                txtngaykt.selectAll();
                txtngaykt.requestFocus();
                return false;
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Lỗi!",
                    "Thông báo",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        return true;
    }
   
    private boolean checkMaNhom(int nhom){
        int Nhom = Integer.parseInt(txttenNhom.getText());
        boolean isCheck = false;
        for(GVDanhSach i : ds){
            if( i.getNhom() == (Nhom))//i != ds.get(temp) &&
            {
                isCheck = true;
                break;
            }
        }
        return !isCheck;
    }
    
    private void btnTaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoActionPerformed
        GVDanhSach gv = new GVDanhSach(); 
            if(isTrue()){
                if(checkMaNhom(gv.getNhom()))
                {
                    gv.setNhom(Integer.parseInt(txttenNhom.getText()));
                    gv.setNhom(Integer.parseInt(txttenNhom.getText()));
                    try {
                        gv.setThanhVien(Integer.parseInt(txtsoTV.getText()));
                    } catch (Exception ex) {
                        Logger.getLogger(GVDanhSachForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    gv.setDeTai(txttendetai.getText());
                    gv.setNgayBD(txtngaybd.getText());
                    gv.setNgayKT(txtngaykt.getText());
                    ds.add(gv);
                    DefaultTableModel model = (DefaultTableModel) tbDanhSach.getModel();
                    model.setRowCount(0);
                    for (GVDanhSach i : ds) {
                        model.addRow(new Object[]{i.getNhom(), i.getThanhVien(), i.getDeTai(),
                            i.getNgayBD(), i.getNgayKT()});
                }
                JOptionPane.showMessageDialog(null, "Tạo nhóm thành công!");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Nhóm đã tồn tại!");
                }
            }
        
    }//GEN-LAST:event_btnTaoActionPerformed

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed

        DefaultTableModel model = (DefaultTableModel)tbDanhSach.getModel();
        model.setRowCount(0);

        //        int row = model.getRowCount();
        //        int col = model.getColumnCount();

        int tennhom = Integer.parseInt(txtTim.getText());

        for(GVDanhSach item : ds){
            if(item.getNhom()== tennhom){
                model.addRow(new Object[] {item.getNhom(), item.getThanhVien(), 
                    item.getDeTai(), item.getNgayBD(), item.getNgayKT()});
            }
        }
        if(model.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Không có thông tin nhóm");
        }
    }//GEN-LAST:event_btnTimActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        GVLopHocForm gv = null;
        try {
            gv = new GVLopHocForm();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GVDanhSachForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        gv.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnXoaHetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaHetActionPerformed
        DefaultTableModel model = (DefaultTableModel)tbDanhSach.getModel();
        int i = tbDanhSach.getRowCount();
        int result = JOptionPane.showConfirmDialog(null,
                "Bạn chắc chắn muốn xóa tất cả các nhóm!","Thông báo",JOptionPane.YES_NO_OPTION);
        if(result == JOptionPane.YES_OPTION){
            for(int j = 0; j < i;j++){
                model.removeRow(0);
            }
        }
    }//GEN-LAST:event_btnXoaHetActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed

        DefaultTableModel model = (DefaultTableModel)tbDanhSach.getModel();
        int row = tbDanhSach.getSelectedRow();
        int col = tbDanhSach.getSelectedColumn();
        String ten = (String)tbDanhSach.getValueAt(row, col);

        if(ten!= null){
            GVSuaForm sua = new GVSuaForm(this,true);
            sua.setVisible(true);
            sua.setSize(500,250);
            String str = sua.getTenMoi();
            for(int i = 0; i < tbDanhSach.getRowCount(); i++){
                String tenHienTai = (String)tbDanhSach.getValueAt(i, col);
                if(str.equals(tenHienTai)){
                    JOptionPane.showMessageDialog(null, "Tên đề tài đã tồn tại!",
                        "Thông báo",JOptionPane.ERROR_MESSAGE);
                    tbDanhSach.setValueAt(ten, row, col);
                    break;
                }else{
                    tbDanhSach.setValueAt(str,row, col);
                    break;
                }
            }
            N.setDeTai(str);
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        DefaultTableModel model = (DefaultTableModel)tbDanhSach.getModel();
        if(tbDanhSach.getRowCount() == 0){
          JOptionPane.showMessageDialog(null, "Không có nhóm nào để xóa","Thông báo",JOptionPane.ERROR_MESSAGE);
        }else{
            if (tbDanhSach.getSelectedRowCount() == 1) {
                model.removeRow(tbDanhSach.getSelectedRow());
            } else {
                JOptionPane.showMessageDialog(null, "Chọn một nhóm để xóa", "Thông báo", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void tbDanhSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDanhSachMouseClicked
       
        pos = this.tbDanhSach.getSelectedRow();
        N = ds.get(pos);
        this.txttenNhom.setText("" + N.getNhom());
        this.txtsoTV.setText("" + N.getThanhVien());
        this.txttendetai.setText(N.getDeTai());
        this.txtngaybd.setText(N.getNgayBD());
        this.txtngaykt.setText(N.getNgayKT());
    }//GEN-LAST:event_tbDanhSachMouseClicked

    private void btnXuatFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatFileActionPerformed
        Document doc = new Document();
        Paragraph title = new Paragraph("DANH SACH NHOM", FontFactory.getFont(FontFactory.TIMES_ROMAN,20));
        title.setAlignment(Element.ALIGN_CENTER);
        try {
              PdfWriter.getInstance(doc, new FileOutputStream("DanhSach.pdf"));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(GVDanhSachForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (DocumentException ex) {
                Logger.getLogger(GVDanhSachForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            doc.open();
            PdfPTable tbl = new PdfPTable(5);
            tbl.addCell("Nhom");
            tbl.addCell("Thanh vien");
            tbl.addCell("De tai");
            tbl.addCell("Ngay bat dau");
            tbl.addCell("Ngay ket thuc");

            for (int i = 0; i < tbDanhSach.getRowCount(); i++) {
                String nhom = (String) tbDanhSach.getValueAt(i, 0).toString();
                String thanhvien = (String) tbDanhSach.getValueAt(i, 1).toString();
                String detai = (String) tbDanhSach.getValueAt(i, 2).toString();
                String ngaybd = (String) tbDanhSach.getValueAt(i, 3).toString();
                String ngaykt = (String)tbDanhSach.getValueAt(i, 4).toString();
                
                tbl.addCell(nhom);
                tbl.addCell(thanhvien);
                tbl.addCell(detai);
                tbl.addCell(ngaybd);
                tbl.addCell(ngaykt);
            }
            try {
                doc.add(title);
                doc.add(new Paragraph("\n"));
                doc.add(tbl);
            } catch (DocumentException ex) {
                Logger.getLogger(GVDanhSachForm.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(GVDanhSachForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GVDanhSachForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GVDanhSachForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GVDanhSachForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GVDanhSachForm().setVisible(true);
            }
        });
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTao;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXoaHet;
    private javax.swing.JButton btnXuatFile;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbDanhSach;
    private javax.swing.JTextField txtTim;
    private javax.swing.JTextField txtngaybd;
    private javax.swing.JTextField txtngaykt;
    private javax.swing.JTextField txtsoTV;
    private javax.swing.JTextField txttenNhom;
    private javax.swing.JTextField txttendetai;
    // End of variables declaration//GEN-END:variables

}

