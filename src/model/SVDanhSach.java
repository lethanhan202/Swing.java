package model;
public class SVDanhSach {
    private int nhom;
    private int thanhvien;

    public SVDanhSach() {
    }

    public SVDanhSach( int nhom, int thanhvien) {
       
        this.nhom = nhom;
        this.thanhvien = thanhvien;
    }

    public int getNhom() {
        return nhom;
    }

    public void setNhom(int nhom) {
        this.nhom = nhom;
    }

    public int getThanhvien() {
        return thanhvien;
    }

    public void setThanhvien(int thanhvien) {
        this.thanhvien = thanhvien;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.nhom;
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
        final SVDanhSach other = (SVDanhSach) obj;
        return this.nhom == other.nhom;
    }
    
}
