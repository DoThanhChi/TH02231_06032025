import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Cau1Test {


    @Test
    public void MuoiChinSoChan(){
        List<Integer> integerList = Cau1.list();
        assertEquals(19 , integerList.size(), "danh sach phai chua 19 so chan ko chia het duoc cho 8");
    }


    @Test
    public void soChannhoNhat(){
        List<Integer> integerList = Cau1.list();
        assertTrue(integerList.contains(2),"danh sach phai co so 2");
    }

    @Test
    public void SoChanLonNhat() {
        List<Integer> integerList = Cau1.list();
        assertTrue(integerList.contains(50) , "Danh Sach Phai co so 50 " );
    }

    @Test
    public void THFAILED1() {
        List<Integer> integerList = Cau1.list();
        assertFalse(integerList.contains(40) , "Danh Sach khong duoc co so 40 " );
    }

    @Test
    public void THFAILED2() {
        List<Integer> integerList = Cau1.list();
        assertFalse(integerList.contains(48) , "Danh Sach khong duoc co so 48 " );
    }

}