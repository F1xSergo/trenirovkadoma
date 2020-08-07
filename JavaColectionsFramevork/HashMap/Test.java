package trenirovkadoma.JavaColectionsFramevork.HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class Test {
    public static void main(String[] args) {
        //не гарантируется никакого порядка
        Map<Integer, String> hashMap = new HashMap<>();

        // в каком порядке пары (ключ, значение) были добавлены, в таком порядке они и вернутся
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        //пары (ключ, значение) сортируются по ключу( естественный порядок)
        Map<Integer, String> threeMap = new TreeMap<>();

        testMap(hashMap);
        System.out.println();

        testMap(linkedHashMap);
        System.out.println();

        testMap(threeMap);
        System.out.println();
    }


    public static void testMap(Map<Integer, String> map) {
        map.put(39, "Bob");
        map.put(12, "Mike");
        map.put(78, "Tom");
        map.put(0, "Tim");
        map.put(1500, "Lewis");
        map.put(7, "Bob");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

//        System.out.println(map);
//        map.put(3,"For" );
//        System.out.println(map);
//        System.out.println(map.get(1));
//        System.out.println(map.get(10));


