
package model;

public class DangNhap {
    private String taikhoan;
    private String matkhau;
    private String loaiTK;
    
    public DangNhap() {
    }

    public DangNhap(String taikhoan, String matkhau, String loaiTK) {
        this.taikhoan = taikhoan;
        this.matkhau = matkhau;
        this.loaiTK = loaiTK;
    }

    public String getTaikhoan() {
        return taikhoan;
    }

    public void setTaikhoan(String taikhoan) {
        this.taikhoan = taikhoan;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getLoaiTK() {
        return loaiTK;
    }

    public void setLoaiTK(String loaiTK) {
        this.loaiTK = loaiTK;
    }
    
}
