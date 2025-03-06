import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class chiahetcho6Test {


    @Test
    public void Test_BTH(){
        assertEquals(3 , chiahetcho6.ccc6(new int[]{6 , 12 ,18 , 21 , 32}));
    }

    @Test
    public void Test_Rong(){
        assertEquals(0 , chiahetcho6.ccc6(new int[]{ }));
    }

    @Test
    public void Test_kocosochiahet(){
        assertEquals(0 , chiahetcho6.ccc6(new int[]{5 , 11 , 17 , 20 , 25}));
    }

    @Test
    public void Test_soam(){
        assertEquals(3 , chiahetcho6.ccc6(new int[]{-6 , -12 ,-18 , -21 , -32}));
    }

    @Test
    public void testTH_TatCaChiahet(){
        assertEquals(5,chiahetcho6.ccc6(new int[]{6 , 12 , 18 , 24 , 30 }));
    }

}