import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NhanVienServiceTest {

    private NhanVienService nhanVienService;

    private NhanVien nhanVien;

    @BeforeEach
    void setUp(){
        nhanVienService = new NhanVienService();
        nhanVien = new NhanVien("NV001" , "Nguyen Van A" , 20 , 7.5f, 3 , "CNTT");
    }

    @Test
    void ValidInput(){
        nhanVienService.suaNhanVien(nhanVien , "Nguyen Van B" , 25 , 8.0f, 6 , "TKDH");
        assertEquals("Nguyen Van B", nhanVien.ten);
        assertEquals(25, nhanVien.tuoi);
        assertEquals(8.0f, nhanVien.luong);
        assertEquals(6, nhanVien.soNamLamViec);
        assertEquals("TKDH", nhanVien.phongBan);
    }

    @Test
    void TenNganhRong(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            nhanVienService.suaNhanVien(nhanVien, "Nguyen Van C", 25, 8.0f, 6, "");
        });
        assertEquals("Thong tin ko hop le", exception.getMessage());
    }

    @Test
    void tuoiKoHople(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            nhanVienService.suaNhanVien(nhanVien, "Nguyen Van C", 100, 8.0f, 6, "TKDH");
        });
        assertEquals("Du lieu ko hop le", exception.getMessage());
    }

    @Test
    void luongKoHople(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            nhanVienService.suaNhanVien(nhanVien, "Nguyen Van C", 20, 200.0f, 6, "TKDH");
        });
        assertEquals("Du lieu ko hop le", exception.getMessage());
    }

    @Test
    void namlamViecKoHople(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            nhanVienService.suaNhanVien(nhanVien, "Nguyen Van C", 20, 80.0f, 100, "TKDH");
        });
        assertEquals("Du lieu ko hop le", exception.getMessage());
    }

}