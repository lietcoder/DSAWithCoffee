package GFGCollections;

import java.util.HashMap;

public class HashMapExample {
    static void insertIntoMap(){HashMap<Integer, String> map = new HashMap<>();
       map.put(1,"one");
       map.put(2,"two");
       map.put(3,"thre3");
       map.put(3,"four");
       map.put(3,"four");
       map.put(3,"four");

       System.out.println("Print map: "+ map);
       System.out.println((map.containsKey(4)));
       System.out.println(map.containsValue("five"));

   }
}
