package melinlab;

import java.util.HashMap;
import java.util.Map;

public class MapCast {
    public static void main(String[] args) {
        Map<String, String> a = new HashMap<>();
        a.put("a","a");
        System.out.println(a);
        Object b = (Object)a;
        System.out.println(b);
        Map<String, Object> c = (Map<String, Object>) b;
        System.out.println(c);


    }
}
