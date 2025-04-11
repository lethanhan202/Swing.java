package model;

import java.io.Serializable;
import java.util.Objects;

public class LopHoc implements Serializable{
    private String mamon;
    private String malop;
    private String tenmon;
    private int sosinhvien;

    public LopHoc() {
    }

    public LopHoc(String mamon, String malop, String tenmon, int sosinhvien) {
        this.mamon = mamon;
        this.malop = malop;
        this.tenmon = tenmon;
        this.sosinhvien = sosinhvien;
    }

    public String getMamon() {
        return mamon;
    }

    public void setMamon(String mamon) {
        this.mamon = mamon;
    }

    public String getMalop() {
        return malop;
    }

    public void setMalop(String malop) {
        this.malop = malop;
    }

    public String getTenmon() {
        return tenmon;
    }

    public void setTenmon(String tenmon) {
        this.tenmon = tenmon;
    }

    public int getSosinhvien() {
        return sosinhvien;
    }

    public void setSosinhvien(int sosinhvien) {
        this.sosinhvien = sosinhvien;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.malop);
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
        final LopHoc other = (LopHoc) obj;
        return Objects.equals(this.malop, other.malop);
    }
}
