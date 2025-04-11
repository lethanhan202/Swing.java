package model;

import java.io.Serializable;


public class GVDanhSach implements Serializable{
    private int Nhom;
    private int ThanhVien;
    private String DeTai;
    private String NgayBD;
    private String NgayKT;

    public GVDanhSach() {
    }

    public GVDanhSach(int Nhom, int ThanhVien, String DeTai, String NgayBD, String NgayKT) {
        this.Nhom = Nhom;
        this.ThanhVien = ThanhVien;
        this.DeTai = DeTai;
        this.NgayBD = NgayBD;
        this.NgayKT = NgayKT;
    }

    public int getNhom() {
        return Nhom;
    }

    public void setNhom(int Nhom) {
        this.Nhom = Nhom;
    }

    public int getThanhVien() {
        return ThanhVien;
    }

    public void setThanhVien(int ThanhVien) throws Exception{
        if(ThanhVien<0||ThanhVien>5){
            throw new Exception("Số thành viên không hợp lệ");
        }
        this.ThanhVien = ThanhVien;
    }

    public String getDeTai() {
        return DeTai;
    }

    public void setDeTai(String DeTai) {
        this.DeTai = DeTai;
    }

    public String getNgayBD() {
        return NgayBD;
    }

    public void setNgayBD(String NgayBD) {
        this.NgayBD = NgayBD;
    }

    public String getNgayKT() {
        return NgayKT;
    }

    public void setNgayKT(String NgayKT) {
        this.NgayKT = NgayKT;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.Nhom;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final GVDanhSach other = (GVDanhSach) obj;
        return this.Nhom == other.Nhom;
    }
    
    
}
