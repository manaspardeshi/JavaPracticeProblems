import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman {

    public String integerToRoman(int num){
        Map<Integer, Character> map = new HashMap<>();
        map.put(1, 'I');
        map.put(5, 'V');
        map.put(10, 'X');
        map.put(50, 'L');
        map.put(100, 'C');
        map.put(500, 'D');
        map.put(1000,'M');



        return null;
    }
}
