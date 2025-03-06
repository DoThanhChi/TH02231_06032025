public class NhanVien {
    String MaNV;
    String ten;
    Integer tuoi;
    Float luong;
    Integer soNamLamViec;
    String phongBan;

    public NhanVien(String maNV, String ten, Integer tuoi, Float luong, Integer soNamLamViec, String phongBan) {
        MaNV = maNV;
        this.ten = ten;
        this.tuoi = tuoi;
        this.luong = luong;
        this.soNamLamViec = soNamLamViec;
        this.phongBan = phongBan;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String maNV) {
        MaNV = maNV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
    }

    public Float getLuong() {
        return luong;
    }

    public void setLuong(Float luong) {
        this.luong = luong;
    }

    public Integer getSoNamLamViec() {
        return soNamLamViec;
    }

    public void setSoNamLamViec(Integer soNamLamViec) {
        this.soNamLamViec = soNamLamViec;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }
}
