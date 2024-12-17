package JavaPrograms;

import java.util.HashMap;
import java.util.TreeMap;

public class HastMapEx {
    public static void main(String[] args) {
        hashy();
    }
    static void hashy() {
        HashMap map = new HashMap<>();
        map.put("One", "1");
        map.put("Two", "2");
        map.put("Three", "3");
        map.put("Four", "4");
        System.out.println("print map: " + map);
        if (map.containsKey("Three")) {
            System.out.println(map.containsValue("Three"));
        }
        System.out.println("print map1: " + map);

        TreeMap map1 = new TreeMap();
        map1.put("One", "1");
        map1.put("Two", "2");
        map1.put("Three", "3");
        map1.put("Four", "4");

        System.out.println("print Tree map: " + map1);
        if (map.containsKey("N1")) {
            map1.put("NN1", "nn1");
        }
        System.out.println("print Tree map1: " + map1);

    }
}
