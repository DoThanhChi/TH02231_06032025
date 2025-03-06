public class NhanVienService {

    public void suaNhanVien(NhanVien nv , String tenMoi , int tuoiMoi , float luongMoi , int namLamViecMoi , String phongBanMoi){
        if (nv == null || tenMoi == null || tenMoi.isEmpty() || phongBanMoi.isEmpty()){
            throw new IllegalArgumentException("Thong tin ko hop le");
        }
        if (tuoiMoi < 18 || tuoiMoi > 30 || luongMoi < 0.0f || luongMoi > 100.0f || namLamViecMoi < 1 || namLamViecMoi >10){
            throw new IllegalArgumentException("Du lieu ko hop le");
        }


        nv.ten=tenMoi;
        nv.tuoi=tuoiMoi;
        nv.luong=luongMoi;
        nv.soNamLamViec=namLamViecMoi;
        nv.phongBan=phongBanMoi;
    }
}
