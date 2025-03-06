import java.util.ArrayList;
import java.util.List;

public class Cau1 {

    public static List<Integer> list(){

        List<Integer> ketQua = new ArrayList<>();
        for (int i = 2 ; i <= 50 ; i +=2){
            if( i % 8 != 0){
                ketQua.add(i);
            }
        }
        return ketQua;
    }
}
